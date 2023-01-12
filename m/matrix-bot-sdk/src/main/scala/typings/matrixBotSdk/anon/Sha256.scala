package typings.matrixBotSdk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Sha256 extends StObject {
  
  var sha256: String
}
object Sha256 {
  
  inline def apply(sha256: String): Sha256 = {
    val __obj = js.Dynamic.literal(sha256 = sha256.asInstanceOf[js.Any])
    __obj.asInstanceOf[Sha256]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Sha256] (val x: Self) extends AnyVal {
    
    inline def setSha256(value: String): Self = StObject.set(x, "sha256", value.asInstanceOf[js.Any])
  }
}
