package typings.leafletMousePosition

import typings.leaflet.mod.ControlOptions
import typings.leafletMousePosition.leafletMod.Control_.MousePosition
import typings.leafletMousePosition.leafletMod.Control_.MousePositionControlOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object leafletMod {
  
  object Control_ {
    
    @JSImport("leaflet", "Control.MousePosition")
    @js.native
    open class MousePosition ()
      extends typings.leaflet.mod.Control_ {
      def this(options: MousePositionControlOptions) = this()
      
      @JSName("options")
      var options_MousePosition: MousePositionControlOptions = js.native
    }
    
    trait MousePositionControlOptions
      extends StObject
         with ControlOptions {
      
      var emptyString: js.UndefOr[String] = js.undefined
      
      var formatter: js.UndefOr[js.Function2[/* lng */ Double, /* lat */ Double, String]] = js.undefined
      
      var latFormatter: js.UndefOr[js.Function1[/* lat */ Double, String]] = js.undefined
      
      var lngFirst: js.UndefOr[Boolean] = js.undefined
      
      var lngFormatter: js.UndefOr[js.Function1[/* lng */ Double, String]] = js.undefined
      
      var numDigits: js.UndefOr[Double] = js.undefined
      
      var prefix: js.UndefOr[String] = js.undefined
      
      var separator: js.UndefOr[String] = js.undefined
      
      var wrapLng: js.UndefOr[Boolean] = js.undefined
    }
    object MousePositionControlOptions {
      
      inline def apply(): MousePositionControlOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[MousePositionControlOptions]
      }
      
      extension [Self <: MousePositionControlOptions](x: Self) {
        
        inline def setEmptyString(value: String): Self = StObject.set(x, "emptyString", value.asInstanceOf[js.Any])
        
        inline def setEmptyStringUndefined: Self = StObject.set(x, "emptyString", js.undefined)
        
        inline def setFormatter(value: (/* lng */ Double, /* lat */ Double) => String): Self = StObject.set(x, "formatter", js.Any.fromFunction2(value))
        
        inline def setFormatterUndefined: Self = StObject.set(x, "formatter", js.undefined)
        
        inline def setLatFormatter(value: /* lat */ Double => String): Self = StObject.set(x, "latFormatter", js.Any.fromFunction1(value))
        
        inline def setLatFormatterUndefined: Self = StObject.set(x, "latFormatter", js.undefined)
        
        inline def setLngFirst(value: Boolean): Self = StObject.set(x, "lngFirst", value.asInstanceOf[js.Any])
        
        inline def setLngFirstUndefined: Self = StObject.set(x, "lngFirst", js.undefined)
        
        inline def setLngFormatter(value: /* lng */ Double => String): Self = StObject.set(x, "lngFormatter", js.Any.fromFunction1(value))
        
        inline def setLngFormatterUndefined: Self = StObject.set(x, "lngFormatter", js.undefined)
        
        inline def setNumDigits(value: Double): Self = StObject.set(x, "numDigits", value.asInstanceOf[js.Any])
        
        inline def setNumDigitsUndefined: Self = StObject.set(x, "numDigits", js.undefined)
        
        inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
        
        inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
        
        inline def setSeparator(value: String): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
        
        inline def setSeparatorUndefined: Self = StObject.set(x, "separator", js.undefined)
        
        inline def setWrapLng(value: Boolean): Self = StObject.set(x, "wrapLng", value.asInstanceOf[js.Any])
        
        inline def setWrapLngUndefined: Self = StObject.set(x, "wrapLng", js.undefined)
      }
    }
  }
  
  object control {
    
    @JSImport("leaflet", "control")
    @js.native
    val ^ : js.Any = js.native
    
    inline def mousePosition(): MousePosition = ^.asInstanceOf[js.Dynamic].applyDynamic("mousePosition")().asInstanceOf[MousePosition]
    inline def mousePosition(options: MousePositionControlOptions): MousePosition = ^.asInstanceOf[js.Dynamic].applyDynamic("mousePosition")(options.asInstanceOf[js.Any]).asInstanceOf[MousePosition]
  }
  
  trait MapOptions extends StObject {
    
    var positionControl: js.UndefOr[Boolean] = js.undefined
  }
  object MapOptions {
    
    inline def apply(): MapOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MapOptions]
    }
    
    extension [Self <: MapOptions](x: Self) {
      
      inline def setPositionControl(value: Boolean): Self = StObject.set(x, "positionControl", value.asInstanceOf[js.Any])
      
      inline def setPositionControlUndefined: Self = StObject.set(x, "positionControl", js.undefined)
    }
  }
}
