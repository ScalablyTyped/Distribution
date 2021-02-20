package typings.karmaViewport

import typings.karmaViewport.viewportMod.Viewport
import typings.karmaViewport.viewportMod.ViewportConfiguration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object adapterMod {
  
  /**
    * Extend window element with custom options and viewport instance
    */
  object global {
    
    @js.native
    trait Window extends StObject {
      
      var __viewport__ : ViewportConfiguration = js.native
      
      var viewport: Viewport = js.native
    }
    object Window {
      
      @scala.inline
      def apply(__viewport__ : ViewportConfiguration, viewport: Viewport): Window = {
        val __obj = js.Dynamic.literal(__viewport__ = __viewport__.asInstanceOf[js.Any], viewport = viewport.asInstanceOf[js.Any])
        __obj.asInstanceOf[Window]
      }
      
      @scala.inline
      implicit class WindowMutableBuilder[Self <: Window] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setViewport(value: Viewport): Self = StObject.set(x, "viewport", value.asInstanceOf[js.Any])
        
        @scala.inline
        def set__viewport__(value: ViewportConfiguration): Self = StObject.set(x, "__viewport__", value.asInstanceOf[js.Any])
      }
    }
  }
}
