package typings.ionicCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object routeInterfaceMod {
  
  type NavigationHookCallback = js.Function0[NavigationHookResult | js.Promise[NavigationHookResult]]
  
  @js.native
  trait NavigationHookOptions extends StObject {
    
    var redirect: String = js.native
  }
  object NavigationHookOptions {
    
    @scala.inline
    def apply(redirect: String): NavigationHookOptions = {
      val __obj = js.Dynamic.literal(redirect = redirect.asInstanceOf[js.Any])
      __obj.asInstanceOf[NavigationHookOptions]
    }
    
    @scala.inline
    implicit class NavigationHookOptionsMutableBuilder[Self <: NavigationHookOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRedirect(value: String): Self = StObject.set(x, "redirect", value.asInstanceOf[js.Any])
    }
  }
  
  type NavigationHookResult = Boolean | NavigationHookOptions
}
