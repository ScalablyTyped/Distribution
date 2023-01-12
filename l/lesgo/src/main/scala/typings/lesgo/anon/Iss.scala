package typings.lesgo.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Iss[TDecoded /* <: js.Object | String */] extends StObject {
  
  var customClaims: js.Array[/* keyof TDecoded */ String]
  
  var iss: js.Array[String]
}
object Iss {
  
  inline def apply[TDecoded /* <: js.Object | String */](customClaims: js.Array[/* keyof TDecoded */ String], iss: js.Array[String]): Iss[TDecoded] = {
    val __obj = js.Dynamic.literal(customClaims = customClaims.asInstanceOf[js.Any], iss = iss.asInstanceOf[js.Any])
    __obj.asInstanceOf[Iss[TDecoded]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Iss[?], TDecoded /* <: js.Object | String */] (val x: Self & Iss[TDecoded]) extends AnyVal {
    
    inline def setCustomClaims(value: js.Array[/* keyof TDecoded */ String]): Self = StObject.set(x, "customClaims", value.asInstanceOf[js.Any])
    
    inline def setCustomClaimsVarargs(value: (/* keyof TDecoded */ String)*): Self = StObject.set(x, "customClaims", js.Array(value*))
    
    inline def setIss(value: js.Array[String]): Self = StObject.set(x, "iss", value.asInstanceOf[js.Any])
    
    inline def setIssVarargs(value: String*): Self = StObject.set(x, "iss", js.Array(value*))
  }
}
