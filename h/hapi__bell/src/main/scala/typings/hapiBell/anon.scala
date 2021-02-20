package typings.hapiBell

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait ExtendedProfile extends StObject {
    
    var extendedProfile: js.UndefOr[Boolean] = js.native
    
    var getMethod: js.UndefOr[String] = js.native
  }
  object ExtendedProfile {
    
    @scala.inline
    def apply(): ExtendedProfile = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExtendedProfile]
    }
    
    @scala.inline
    implicit class ExtendedProfileMutableBuilder[Self <: ExtendedProfile] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExtendedProfile(value: Boolean): Self = StObject.set(x, "extendedProfile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtendedProfileUndefined: Self = StObject.set(x, "extendedProfile", js.undefined)
      
      @scala.inline
      def setGetMethod(value: String): Self = StObject.set(x, "getMethod", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGetMethodUndefined: Self = StObject.set(x, "getMethod", js.undefined)
    }
  }
  
  @js.native
  trait Uri extends StObject {
    
    var uri: js.UndefOr[String] = js.native
  }
  object Uri {
    
    @scala.inline
    def apply(): Uri = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Uri]
    }
    
    @scala.inline
    implicit class UriMutableBuilder[Self <: Uri] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
    }
  }
}
