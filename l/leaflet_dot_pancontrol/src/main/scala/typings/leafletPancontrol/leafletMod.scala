package typings.leafletPancontrol

import typings.leaflet.mod.ControlOptions
import typings.leafletPancontrol.leafletMod.Control_.Pan
import typings.leafletPancontrol.leafletMod.Control_.PanControlOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object leafletMod {
  
  object Control_ {
    
    @JSImport("leaflet", "Control.Pan")
    @js.native
    open class Pan ()
      extends typings.leaflet.mod.Control_ {
      def this(options: PanControlOptions) = this()
      
      @JSName("options")
      var options_Pan: PanControlOptions = js.native
    }
    
    trait PanControlOptions
      extends StObject
         with ControlOptions {
      
      var panOffset: js.UndefOr[Double] = js.undefined
    }
    object PanControlOptions {
      
      inline def apply(): PanControlOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[PanControlOptions]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: PanControlOptions] (val x: Self) extends AnyVal {
        
        inline def setPanOffset(value: Double): Self = StObject.set(x, "panOffset", value.asInstanceOf[js.Any])
        
        inline def setPanOffsetUndefined: Self = StObject.set(x, "panOffset", js.undefined)
      }
    }
  }
  
  object control {
    
    @JSImport("leaflet", "control")
    @js.native
    val ^ : js.Any = js.native
    
    inline def pan(): Pan = ^.asInstanceOf[js.Dynamic].applyDynamic("pan")().asInstanceOf[Pan]
    inline def pan(options: PanControlOptions): Pan = ^.asInstanceOf[js.Dynamic].applyDynamic("pan")(options.asInstanceOf[js.Any]).asInstanceOf[Pan]
  }
  
  trait MapOptions extends StObject {
    
    var panControl: js.UndefOr[Boolean] = js.undefined
  }
  object MapOptions {
    
    inline def apply(): MapOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MapOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MapOptions] (val x: Self) extends AnyVal {
      
      inline def setPanControl(value: Boolean): Self = StObject.set(x, "panControl", value.asInstanceOf[js.Any])
      
      inline def setPanControlUndefined: Self = StObject.set(x, "panControl", js.undefined)
    }
  }
}
