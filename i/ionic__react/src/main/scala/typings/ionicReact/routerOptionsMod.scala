package typings.ionicReact

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object routerOptionsMod {
  
  @js.native
  trait RouterOptions extends StObject {
    
    var as: js.UndefOr[String] = js.native
    
    var unmount: js.UndefOr[Boolean] = js.native
  }
  object RouterOptions {
    
    @scala.inline
    def apply(): RouterOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RouterOptions]
    }
    
    @scala.inline
    implicit class RouterOptionsMutableBuilder[Self <: RouterOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAs(value: String): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      @scala.inline
      def setUnmount(value: Boolean): Self = StObject.set(x, "unmount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnmountUndefined: Self = StObject.set(x, "unmount", js.undefined)
    }
  }
}
