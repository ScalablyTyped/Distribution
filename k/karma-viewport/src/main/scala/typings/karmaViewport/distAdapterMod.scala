package typings.karmaViewport

import typings.karmaViewport.distAdapterViewportMod.Viewport
import typings.karmaViewport.distAdapterViewportMod.ViewportConfiguration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distAdapterMod {
  
  /**
    * Extend window element with custom options and viewport instance
    */
  object global {
    
    trait Window extends StObject {
      
      var __viewport__ : ViewportConfiguration
      
      var viewport: Viewport
    }
    object Window {
      
      inline def apply(__viewport__ : ViewportConfiguration, viewport: Viewport): Window = {
        val __obj = js.Dynamic.literal(__viewport__ = __viewport__.asInstanceOf[js.Any], viewport = viewport.asInstanceOf[js.Any])
        __obj.asInstanceOf[Window]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Window] (val x: Self) extends AnyVal {
        
        inline def setViewport(value: Viewport): Self = StObject.set(x, "viewport", value.asInstanceOf[js.Any])
        
        inline def set__viewport__(value: ViewportConfiguration): Self = StObject.set(x, "__viewport__", value.asInstanceOf[js.Any])
      }
    }
  }
}
