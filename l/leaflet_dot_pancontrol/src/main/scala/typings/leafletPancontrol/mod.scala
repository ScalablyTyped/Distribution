package typings.leafletPancontrol

import typings.leaflet.mod.ControlOptions
import typings.leafletPancontrol.mod.Control_.Pan
import typings.leafletPancontrol.mod.Control_.PanControlOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object mod {
  
  object Control_ {
    
    @JSImport("leaflet", "Control.Pan")
    @js.native
    class Pan ()
      extends typings.leaflet.mod.Control_ {
      def this(options: PanControlOptions) = this()
      
      @JSName("options")
      var options_Pan: PanControlOptions = js.native
    }
    
    @js.native
    trait PanControlOptions extends ControlOptions {
      
      var panOffset: js.UndefOr[Double] = js.native
    }
    object PanControlOptions {
      
      @scala.inline
      def apply(): PanControlOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[PanControlOptions]
      }
      
      @scala.inline
      implicit class PanControlOptionsMutableBuilder[Self <: PanControlOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setPanOffset(value: Double): Self = StObject.set(x, "panOffset", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPanOffsetUndefined: Self = StObject.set(x, "panOffset", js.undefined)
      }
    }
  }
  
  object control {
    
    @JSImport("leaflet", "control.pan")
    @js.native
    def pan(): Pan = js.native
    @JSImport("leaflet", "control.pan")
    @js.native
    def pan(options: PanControlOptions): Pan = js.native
  }
  
  @js.native
  trait MapOptions extends StObject {
    
    var panControl: js.UndefOr[Boolean] = js.native
  }
  object MapOptions {
    
    @scala.inline
    def apply(): MapOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MapOptions]
    }
    
    @scala.inline
    implicit class MapOptionsMutableBuilder[Self <: MapOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPanControl(value: Boolean): Self = StObject.set(x, "panControl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPanControlUndefined: Self = StObject.set(x, "panControl", js.undefined)
    }
  }
}
