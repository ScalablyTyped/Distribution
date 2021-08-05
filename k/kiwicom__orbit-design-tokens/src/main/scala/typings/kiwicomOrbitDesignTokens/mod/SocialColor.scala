package typings.kiwicomOrbitDesignTokens.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SocialColor extends StObject {
  
  var facebook: String
  
  var facebookActive: String
  
  var facebookHover: String
}
object SocialColor {
  
  inline def apply(facebook: String, facebookActive: String, facebookHover: String): SocialColor = {
    val __obj = js.Dynamic.literal(facebook = facebook.asInstanceOf[js.Any], facebookActive = facebookActive.asInstanceOf[js.Any], facebookHover = facebookHover.asInstanceOf[js.Any])
    __obj.asInstanceOf[SocialColor]
  }
  
  extension [Self <: SocialColor](x: Self) {
    
    inline def setFacebook(value: String): Self = StObject.set(x, "facebook", value.asInstanceOf[js.Any])
    
    inline def setFacebookActive(value: String): Self = StObject.set(x, "facebookActive", value.asInstanceOf[js.Any])
    
    inline def setFacebookHover(value: String): Self = StObject.set(x, "facebookHover", value.asInstanceOf[js.Any])
  }
}
