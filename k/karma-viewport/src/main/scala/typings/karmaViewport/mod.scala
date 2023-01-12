package typings.karmaViewport

import typings.karmaViewport.anon.PartialViewportConfigurat
import typings.karmaViewport.distAdapterViewportMod.Viewport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Declare ambient viewport instance
    */
  object global {
    
    @JSGlobal("viewport")
    @js.native
    val viewport: Viewport = js.native
  }
  
  /**
    * Augment Karma configuration type
    *
    * This is the exported configuration type for usage within Karma, because the
    * context selector and breakpoints are optional (merged with defaults).
    */
  /* augmented module */
  object karmaAugmentingMod {
    
    trait ConfigOptions extends StObject {
      
      var viewport: js.UndefOr[PartialViewportConfigurat] = js.undefined
    }
    object ConfigOptions {
      
      inline def apply(): ConfigOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ConfigOptions]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: ConfigOptions] (val x: Self) extends AnyVal {
        
        inline def setViewport(value: PartialViewportConfigurat): Self = StObject.set(x, "viewport", value.asInstanceOf[js.Any])
        
        inline def setViewportUndefined: Self = StObject.set(x, "viewport", js.undefined)
      }
    }
  }
}
