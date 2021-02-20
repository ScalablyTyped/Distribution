package typings.leafletPolylinemeasure

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.leafletPolylinemeasure.mod.Control_.PolylineMeasure
import typings.leafletPolylinemeasure.mod.Control_.PolylineMeasureOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object mod {
  
  object control {
    
    @JSImport("leaflet", "control.polylineMeasure")
    @js.native
    def polylineMeasure(): PolylineMeasure = js.native
    @JSImport("leaflet", "control.polylineMeasure")
    @js.native
    def polylineMeasure(options: PolylineMeasureOptions): PolylineMeasure = js.native
  }
  
  object Control_ {
    
    @js.native
    trait PolylineMeasure
      extends typings.leaflet.mod.Control_
         with Instantiable0[js.Any]
         with Instantiable1[/* options */ PolylineMeasureOptions, js.Any]
    
    @js.native
    trait PolylineMeasureOptions extends StObject {
      
      var backgroundColor: js.UndefOr[String] = js.native
      
      var clearControlClasses: js.UndefOr[js.Array[_]] = js.native
      
      var clearControlLabel: js.UndefOr[String] = js.native
      
      var clearControlTitle: js.UndefOr[String] = js.native
      
      var clearMeasurementsOnStop: js.UndefOr[Boolean] = js.native
      
      var currentCircle: js.UndefOr[js.Any] = js.native
      
      var cursor: js.UndefOr[String] = js.native
      
      var endCircle: js.UndefOr[js.Any] = js.native
      
      var fixedLine: js.UndefOr[js.Any] = js.native
      
      var intermedCircle: js.UndefOr[js.Any] = js.native
      
      var measureControlClasses: js.UndefOr[js.Array[_]] = js.native
      
      var measureControlLabel: js.UndefOr[String] = js.native
      
      var measureControlTitleOff: js.UndefOr[String] = js.native
      
      var measureControlTitleOn: js.UndefOr[String] = js.native
      
      var position: js.UndefOr[String] = js.native
      
      var showMeasurementsClearControl: js.UndefOr[Boolean] = js.native
      
      var showUnitControl: js.UndefOr[Boolean] = js.native
      
      var startCircle: js.UndefOr[js.Any] = js.native
      
      var tempLine: js.UndefOr[js.Any] = js.native
      
      var unit: js.UndefOr[String] = js.native
    }
    object PolylineMeasureOptions {
      
      @scala.inline
      def apply(): PolylineMeasureOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[PolylineMeasureOptions]
      }
      
      @scala.inline
      implicit class PolylineMeasureOptionsMutableBuilder[Self <: PolylineMeasureOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
        
        @scala.inline
        def setClearControlClasses(value: js.Array[_]): Self = StObject.set(x, "clearControlClasses", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setClearControlClassesUndefined: Self = StObject.set(x, "clearControlClasses", js.undefined)
        
        @scala.inline
        def setClearControlClassesVarargs(value: js.Any*): Self = StObject.set(x, "clearControlClasses", js.Array(value :_*))
        
        @scala.inline
        def setClearControlLabel(value: String): Self = StObject.set(x, "clearControlLabel", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setClearControlLabelUndefined: Self = StObject.set(x, "clearControlLabel", js.undefined)
        
        @scala.inline
        def setClearControlTitle(value: String): Self = StObject.set(x, "clearControlTitle", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setClearControlTitleUndefined: Self = StObject.set(x, "clearControlTitle", js.undefined)
        
        @scala.inline
        def setClearMeasurementsOnStop(value: Boolean): Self = StObject.set(x, "clearMeasurementsOnStop", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setClearMeasurementsOnStopUndefined: Self = StObject.set(x, "clearMeasurementsOnStop", js.undefined)
        
        @scala.inline
        def setCurrentCircle(value: js.Any): Self = StObject.set(x, "currentCircle", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCurrentCircleUndefined: Self = StObject.set(x, "currentCircle", js.undefined)
        
        @scala.inline
        def setCursor(value: String): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCursorUndefined: Self = StObject.set(x, "cursor", js.undefined)
        
        @scala.inline
        def setEndCircle(value: js.Any): Self = StObject.set(x, "endCircle", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEndCircleUndefined: Self = StObject.set(x, "endCircle", js.undefined)
        
        @scala.inline
        def setFixedLine(value: js.Any): Self = StObject.set(x, "fixedLine", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFixedLineUndefined: Self = StObject.set(x, "fixedLine", js.undefined)
        
        @scala.inline
        def setIntermedCircle(value: js.Any): Self = StObject.set(x, "intermedCircle", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIntermedCircleUndefined: Self = StObject.set(x, "intermedCircle", js.undefined)
        
        @scala.inline
        def setMeasureControlClasses(value: js.Array[_]): Self = StObject.set(x, "measureControlClasses", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMeasureControlClassesUndefined: Self = StObject.set(x, "measureControlClasses", js.undefined)
        
        @scala.inline
        def setMeasureControlClassesVarargs(value: js.Any*): Self = StObject.set(x, "measureControlClasses", js.Array(value :_*))
        
        @scala.inline
        def setMeasureControlLabel(value: String): Self = StObject.set(x, "measureControlLabel", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMeasureControlLabelUndefined: Self = StObject.set(x, "measureControlLabel", js.undefined)
        
        @scala.inline
        def setMeasureControlTitleOff(value: String): Self = StObject.set(x, "measureControlTitleOff", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMeasureControlTitleOffUndefined: Self = StObject.set(x, "measureControlTitleOff", js.undefined)
        
        @scala.inline
        def setMeasureControlTitleOn(value: String): Self = StObject.set(x, "measureControlTitleOn", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMeasureControlTitleOnUndefined: Self = StObject.set(x, "measureControlTitleOn", js.undefined)
        
        @scala.inline
        def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
        
        @scala.inline
        def setShowMeasurementsClearControl(value: Boolean): Self = StObject.set(x, "showMeasurementsClearControl", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setShowMeasurementsClearControlUndefined: Self = StObject.set(x, "showMeasurementsClearControl", js.undefined)
        
        @scala.inline
        def setShowUnitControl(value: Boolean): Self = StObject.set(x, "showUnitControl", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setShowUnitControlUndefined: Self = StObject.set(x, "showUnitControl", js.undefined)
        
        @scala.inline
        def setStartCircle(value: js.Any): Self = StObject.set(x, "startCircle", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStartCircleUndefined: Self = StObject.set(x, "startCircle", js.undefined)
        
        @scala.inline
        def setTempLine(value: js.Any): Self = StObject.set(x, "tempLine", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTempLineUndefined: Self = StObject.set(x, "tempLine", js.undefined)
        
        @scala.inline
        def setUnit(value: String): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
      }
    }
  }
}
