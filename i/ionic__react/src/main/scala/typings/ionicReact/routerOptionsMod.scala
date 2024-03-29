package typings.ionicReact

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object routerOptionsMod {
  
  trait RouterOptions extends StObject {
    
    var as: js.UndefOr[String] = js.undefined
    
    var unmount: js.UndefOr[Boolean] = js.undefined
  }
  object RouterOptions {
    
    inline def apply(): RouterOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RouterOptions]
    }
    
    extension [Self <: RouterOptions](x: Self) {
      
      inline def setAs(value: String): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      inline def setUnmount(value: Boolean): Self = StObject.set(x, "unmount", value.asInstanceOf[js.Any])
      
      inline def setUnmountUndefined: Self = StObject.set(x, "unmount", js.undefined)
    }
  }
}
