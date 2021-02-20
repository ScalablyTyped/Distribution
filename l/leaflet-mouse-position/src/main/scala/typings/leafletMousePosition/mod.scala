package typings.leafletMousePosition

import typings.leaflet.mod.ControlOptions
import typings.leafletMousePosition.mod.Control_.MousePosition
import typings.leafletMousePosition.mod.Control_.MousePositionControlOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object mod {
  
  object Control_ {
    
    @JSImport("leaflet", "Control.MousePosition")
    @js.native
    class MousePosition ()
      extends typings.leaflet.mod.Control_ {
      def this(options: MousePositionControlOptions) = this()
      
      @JSName("options")
      var options_MousePosition: MousePositionControlOptions = js.native
    }
    
    @js.native
    trait MousePositionControlOptions extends ControlOptions {
      
      var emptyString: js.UndefOr[String] = js.native
      
      var formatter: js.UndefOr[js.Function2[/* lng */ Double, /* lat */ Double, String]] = js.native
      
      var latFormatter: js.UndefOr[js.Function1[/* lat */ Double, String]] = js.native
      
      var lngFirst: js.UndefOr[Boolean] = js.native
      
      var lngFormatter: js.UndefOr[js.Function1[/* lng */ Double, String]] = js.native
      
      var numDigits: js.UndefOr[Double] = js.native
      
      var prefix: js.UndefOr[String] = js.native
      
      var separator: js.UndefOr[String] = js.native
      
      var wrapLng: js.UndefOr[Boolean] = js.native
    }
    object MousePositionControlOptions {
      
      @scala.inline
      def apply(): MousePositionControlOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[MousePositionControlOptions]
      }
      
      @scala.inline
      implicit class MousePositionControlOptionsMutableBuilder[Self <: MousePositionControlOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setEmptyString(value: String): Self = StObject.set(x, "emptyString", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEmptyStringUndefined: Self = StObject.set(x, "emptyString", js.undefined)
        
        @scala.inline
        def setFormatter(value: (/* lng */ Double, /* lat */ Double) => String): Self = StObject.set(x, "formatter", js.Any.fromFunction2(value))
        
        @scala.inline
        def setFormatterUndefined: Self = StObject.set(x, "formatter", js.undefined)
        
        @scala.inline
        def setLatFormatter(value: /* lat */ Double => String): Self = StObject.set(x, "latFormatter", js.Any.fromFunction1(value))
        
        @scala.inline
        def setLatFormatterUndefined: Self = StObject.set(x, "latFormatter", js.undefined)
        
        @scala.inline
        def setLngFirst(value: Boolean): Self = StObject.set(x, "lngFirst", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLngFirstUndefined: Self = StObject.set(x, "lngFirst", js.undefined)
        
        @scala.inline
        def setLngFormatter(value: /* lng */ Double => String): Self = StObject.set(x, "lngFormatter", js.Any.fromFunction1(value))
        
        @scala.inline
        def setLngFormatterUndefined: Self = StObject.set(x, "lngFormatter", js.undefined)
        
        @scala.inline
        def setNumDigits(value: Double): Self = StObject.set(x, "numDigits", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNumDigitsUndefined: Self = StObject.set(x, "numDigits", js.undefined)
        
        @scala.inline
        def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
        
        @scala.inline
        def setSeparator(value: String): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSeparatorUndefined: Self = StObject.set(x, "separator", js.undefined)
        
        @scala.inline
        def setWrapLng(value: Boolean): Self = StObject.set(x, "wrapLng", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setWrapLngUndefined: Self = StObject.set(x, "wrapLng", js.undefined)
      }
    }
  }
  
  object control {
    
    @JSImport("leaflet", "control.mousePosition")
    @js.native
    def mousePosition(): MousePosition = js.native
    @JSImport("leaflet", "control.mousePosition")
    @js.native
    def mousePosition(options: MousePositionControlOptions): MousePosition = js.native
  }
  
  @js.native
  trait MapOptions extends StObject {
    
    var positionControl: js.UndefOr[Boolean] = js.native
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
      def setPositionControl(value: Boolean): Self = StObject.set(x, "positionControl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositionControlUndefined: Self = StObject.set(x, "positionControl", js.undefined)
    }
  }
}
