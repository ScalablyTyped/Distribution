package typings.leafletPolylinemeasure

import typings.leafletPolylinemeasure.mod.Control_.PolylineMeasure
import typings.leafletPolylinemeasure.mod.Control_.PolylineMeasureOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object mod {
  
  object control {
    
    @JSImport("leaflet", "control")
    @js.native
    val ^ : js.Any = js.native
    
    inline def polylineMeasure(): PolylineMeasure = ^.asInstanceOf[js.Dynamic].applyDynamic("polylineMeasure")().asInstanceOf[PolylineMeasure]
    inline def polylineMeasure(options: PolylineMeasureOptions): PolylineMeasure = ^.asInstanceOf[js.Dynamic].applyDynamic("polylineMeasure")(options.asInstanceOf[js.Any]).asInstanceOf[PolylineMeasure]
  }
  
  object Control_ {
    
    /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
    - scala.Any because Inheritance from two classes. Inlined 
    - scala.AnyRef because Inheritance from two classes. Inlined 
    - scala.Any because Inheritance from two classes. Inlined getClass, hashCode, eq, equals, toString, ne, notify, notifyAll, wait, wait, wait, clone, finalize
    - js.Any because Inheritance from two classes. Inlined 
    - scala.AnyRef because Inheritance from two classes. Inlined 
    - js.Object because Inheritance from two classes. Inlined 
    - js.Any because Inheritance from two classes. Inlined 
    - org.scalablytyped.runtime.StObject because Inheritance from two classes. Inlined 
    - js.Object because Inheritance from two classes. Inlined hasOwnProperty, propertyIsEnumerable, valueOf, toLocaleString, isPrototypeOf
    - org.scalablytyped.runtime.Instantiable1 because Inheritance from two classes. Inlined 
    - org.scalablytyped.runtime.Instantiable0 because Inheritance from two classes. Inlined  */ @js.native
    trait PolylineMeasure
      extends typings.leaflet.mod.Control_
    
    trait PolylineMeasureOptions extends StObject {
      
      var backgroundColor: js.UndefOr[String] = js.undefined
      
      var clearControlClasses: js.UndefOr[js.Array[Any]] = js.undefined
      
      var clearControlLabel: js.UndefOr[String] = js.undefined
      
      var clearControlTitle: js.UndefOr[String] = js.undefined
      
      var clearMeasurementsOnStop: js.UndefOr[Boolean] = js.undefined
      
      var currentCircle: js.UndefOr[Any] = js.undefined
      
      var cursor: js.UndefOr[String] = js.undefined
      
      var endCircle: js.UndefOr[Any] = js.undefined
      
      var fixedLine: js.UndefOr[Any] = js.undefined
      
      var intermedCircle: js.UndefOr[Any] = js.undefined
      
      var measureControlClasses: js.UndefOr[js.Array[Any]] = js.undefined
      
      var measureControlLabel: js.UndefOr[String] = js.undefined
      
      var measureControlTitleOff: js.UndefOr[String] = js.undefined
      
      var measureControlTitleOn: js.UndefOr[String] = js.undefined
      
      var position: js.UndefOr[String] = js.undefined
      
      var showMeasurementsClearControl: js.UndefOr[Boolean] = js.undefined
      
      var showUnitControl: js.UndefOr[Boolean] = js.undefined
      
      var startCircle: js.UndefOr[Any] = js.undefined
      
      var tempLine: js.UndefOr[Any] = js.undefined
      
      var unit: js.UndefOr[String] = js.undefined
    }
    object PolylineMeasureOptions {
      
      inline def apply(): PolylineMeasureOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[PolylineMeasureOptions]
      }
      
      extension [Self <: PolylineMeasureOptions](x: Self) {
        
        inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
        
        inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
        
        inline def setClearControlClasses(value: js.Array[Any]): Self = StObject.set(x, "clearControlClasses", value.asInstanceOf[js.Any])
        
        inline def setClearControlClassesUndefined: Self = StObject.set(x, "clearControlClasses", js.undefined)
        
        inline def setClearControlClassesVarargs(value: Any*): Self = StObject.set(x, "clearControlClasses", js.Array(value*))
        
        inline def setClearControlLabel(value: String): Self = StObject.set(x, "clearControlLabel", value.asInstanceOf[js.Any])
        
        inline def setClearControlLabelUndefined: Self = StObject.set(x, "clearControlLabel", js.undefined)
        
        inline def setClearControlTitle(value: String): Self = StObject.set(x, "clearControlTitle", value.asInstanceOf[js.Any])
        
        inline def setClearControlTitleUndefined: Self = StObject.set(x, "clearControlTitle", js.undefined)
        
        inline def setClearMeasurementsOnStop(value: Boolean): Self = StObject.set(x, "clearMeasurementsOnStop", value.asInstanceOf[js.Any])
        
        inline def setClearMeasurementsOnStopUndefined: Self = StObject.set(x, "clearMeasurementsOnStop", js.undefined)
        
        inline def setCurrentCircle(value: Any): Self = StObject.set(x, "currentCircle", value.asInstanceOf[js.Any])
        
        inline def setCurrentCircleUndefined: Self = StObject.set(x, "currentCircle", js.undefined)
        
        inline def setCursor(value: String): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
        
        inline def setCursorUndefined: Self = StObject.set(x, "cursor", js.undefined)
        
        inline def setEndCircle(value: Any): Self = StObject.set(x, "endCircle", value.asInstanceOf[js.Any])
        
        inline def setEndCircleUndefined: Self = StObject.set(x, "endCircle", js.undefined)
        
        inline def setFixedLine(value: Any): Self = StObject.set(x, "fixedLine", value.asInstanceOf[js.Any])
        
        inline def setFixedLineUndefined: Self = StObject.set(x, "fixedLine", js.undefined)
        
        inline def setIntermedCircle(value: Any): Self = StObject.set(x, "intermedCircle", value.asInstanceOf[js.Any])
        
        inline def setIntermedCircleUndefined: Self = StObject.set(x, "intermedCircle", js.undefined)
        
        inline def setMeasureControlClasses(value: js.Array[Any]): Self = StObject.set(x, "measureControlClasses", value.asInstanceOf[js.Any])
        
        inline def setMeasureControlClassesUndefined: Self = StObject.set(x, "measureControlClasses", js.undefined)
        
        inline def setMeasureControlClassesVarargs(value: Any*): Self = StObject.set(x, "measureControlClasses", js.Array(value*))
        
        inline def setMeasureControlLabel(value: String): Self = StObject.set(x, "measureControlLabel", value.asInstanceOf[js.Any])
        
        inline def setMeasureControlLabelUndefined: Self = StObject.set(x, "measureControlLabel", js.undefined)
        
        inline def setMeasureControlTitleOff(value: String): Self = StObject.set(x, "measureControlTitleOff", value.asInstanceOf[js.Any])
        
        inline def setMeasureControlTitleOffUndefined: Self = StObject.set(x, "measureControlTitleOff", js.undefined)
        
        inline def setMeasureControlTitleOn(value: String): Self = StObject.set(x, "measureControlTitleOn", value.asInstanceOf[js.Any])
        
        inline def setMeasureControlTitleOnUndefined: Self = StObject.set(x, "measureControlTitleOn", js.undefined)
        
        inline def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
        
        inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
        
        inline def setShowMeasurementsClearControl(value: Boolean): Self = StObject.set(x, "showMeasurementsClearControl", value.asInstanceOf[js.Any])
        
        inline def setShowMeasurementsClearControlUndefined: Self = StObject.set(x, "showMeasurementsClearControl", js.undefined)
        
        inline def setShowUnitControl(value: Boolean): Self = StObject.set(x, "showUnitControl", value.asInstanceOf[js.Any])
        
        inline def setShowUnitControlUndefined: Self = StObject.set(x, "showUnitControl", js.undefined)
        
        inline def setStartCircle(value: Any): Self = StObject.set(x, "startCircle", value.asInstanceOf[js.Any])
        
        inline def setStartCircleUndefined: Self = StObject.set(x, "startCircle", js.undefined)
        
        inline def setTempLine(value: Any): Self = StObject.set(x, "tempLine", value.asInstanceOf[js.Any])
        
        inline def setTempLineUndefined: Self = StObject.set(x, "tempLine", js.undefined)
        
        inline def setUnit(value: String): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
        
        inline def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
      }
    }
  }
}
