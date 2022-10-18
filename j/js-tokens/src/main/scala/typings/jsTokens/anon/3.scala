package typings.jsTokens.anon

import typings.jsTokens.jsTokensStrings.PrivateIdentifier
import typings.jsTokens.mod.Token
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `3`
  extends StObject
     with Token {
  
  var `type`: PrivateIdentifier
  
  var value: String
}
object `3` {
  
  inline def apply(value: String): `3` = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("PrivateIdentifier")
    __obj.asInstanceOf[`3`]
  }
  
  extension [Self <: `3`](x: Self) {
    
    inline def setType(value: PrivateIdentifier): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
