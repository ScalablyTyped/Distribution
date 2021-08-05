package typings.hapiBell

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait ExtendedProfile extends StObject {
    
    var extendedProfile: js.UndefOr[Boolean] = js.undefined
    
    var getMethod: js.UndefOr[String] = js.undefined
  }
  object ExtendedProfile {
    
    inline def apply(): ExtendedProfile = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExtendedProfile]
    }
    
    extension [Self <: ExtendedProfile](x: Self) {
      
      inline def setExtendedProfile(value: Boolean): Self = StObject.set(x, "extendedProfile", value.asInstanceOf[js.Any])
      
      inline def setExtendedProfileUndefined: Self = StObject.set(x, "extendedProfile", js.undefined)
      
      inline def setGetMethod(value: String): Self = StObject.set(x, "getMethod", value.asInstanceOf[js.Any])
      
      inline def setGetMethodUndefined: Self = StObject.set(x, "getMethod", js.undefined)
    }
  }
  
  trait Uri extends StObject {
    
    var uri: js.UndefOr[String] = js.undefined
  }
  object Uri {
    
    inline def apply(): Uri = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Uri]
    }
    
    extension [Self <: Uri](x: Self) {
      
      inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
      
      inline def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
    }
  }
}
