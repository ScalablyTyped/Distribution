package typings.lesgo.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomClaims extends StObject {
  
  var customClaims: Boolean
  
  var iss: Boolean
}
object CustomClaims {
  
  inline def apply(customClaims: Boolean, iss: Boolean): CustomClaims = {
    val __obj = js.Dynamic.literal(customClaims = customClaims.asInstanceOf[js.Any], iss = iss.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomClaims]
  }
  
  extension [Self <: CustomClaims](x: Self) {
    
    inline def setCustomClaims(value: Boolean): Self = StObject.set(x, "customClaims", value.asInstanceOf[js.Any])
    
    inline def setIss(value: Boolean): Self = StObject.set(x, "iss", value.asInstanceOf[js.Any])
  }
}
