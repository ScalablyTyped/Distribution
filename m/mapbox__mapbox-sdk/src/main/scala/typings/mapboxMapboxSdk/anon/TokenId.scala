package typings.mapboxMapboxSdk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TokenId extends StObject {
  
  var tokenId: String
}
object TokenId {
  
  inline def apply(tokenId: String): TokenId = {
    val __obj = js.Dynamic.literal(tokenId = tokenId.asInstanceOf[js.Any])
    __obj.asInstanceOf[TokenId]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TokenId] (val x: Self) extends AnyVal {
    
    inline def setTokenId(value: String): Self = StObject.set(x, "tokenId", value.asInstanceOf[js.Any])
  }
}
