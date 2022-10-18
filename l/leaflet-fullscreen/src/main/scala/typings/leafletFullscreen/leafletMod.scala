package typings.leafletFullscreen

import typings.leaflet.mod.ControlOptions
import typings.leafletFullscreen.anon.False
import typings.leafletFullscreen.leafletFullscreenBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object leafletMod {
  
  trait FullscreenControlOptions
    extends StObject
       with ControlOptions {
    
    var pseudoFullscreen: js.UndefOr[Boolean] = js.undefined
    
    var title: js.UndefOr[False] = js.undefined
  }
  object FullscreenControlOptions {
    
    inline def apply(): FullscreenControlOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FullscreenControlOptions]
    }
    
    extension [Self <: FullscreenControlOptions](x: Self) {
      
      inline def setPseudoFullscreen(value: Boolean): Self = StObject.set(x, "pseudoFullscreen", value.asInstanceOf[js.Any])
      
      inline def setPseudoFullscreenUndefined: Self = StObject.set(x, "pseudoFullscreen", js.undefined)
      
      inline def setTitle(value: False): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  @js.native
  trait Map extends StObject {
    
    def isFullscreen(): Boolean = js.native
    
    def toggleFullscreen(): Unit = js.native
    def toggleFullscreen(options: FullscreenControlOptions): Unit = js.native
  }
  
  trait MapOptions extends StObject {
    
    var fullscreenControl: js.UndefOr[`true` | FullscreenControlOptions] = js.undefined
  }
  object MapOptions {
    
    inline def apply(): MapOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MapOptions]
    }
    
    extension [Self <: MapOptions](x: Self) {
      
      inline def setFullscreenControl(value: `true` | FullscreenControlOptions): Self = StObject.set(x, "fullscreenControl", value.asInstanceOf[js.Any])
      
      inline def setFullscreenControlUndefined: Self = StObject.set(x, "fullscreenControl", js.undefined)
    }
  }
}
