package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnnotationsTimeCyclesOptions extends StObject {
  
  var controlPointOptions: js.UndefOr[AnnotationsTimeCyclesControlPointOptions] = js.undefined
  
  /**
    * (Highstock) Options for annotation's shapes. Each shape inherits options
    * from the shapeOptions object. An option from the shapeOptions can be
    * overwritten by config for a specific shape.
    */
  var shapeOptions: js.UndefOr[AnnotationsTimeCyclesShapeOptions] = js.undefined
  
  /**
    * (Highstock) Additional options for an annotation with the type.
    */
  var typeOptions: js.UndefOr[AnnotationsTimeCyclesTypeOptions] = js.undefined
}
object AnnotationsTimeCyclesOptions {
  
  inline def apply(): AnnotationsTimeCyclesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnnotationsTimeCyclesOptions]
  }
  
  extension [Self <: AnnotationsTimeCyclesOptions](x: Self) {
    
    inline def setControlPointOptions(value: AnnotationsTimeCyclesControlPointOptions): Self = StObject.set(x, "controlPointOptions", value.asInstanceOf[js.Any])
    
    inline def setControlPointOptionsUndefined: Self = StObject.set(x, "controlPointOptions", js.undefined)
    
    inline def setShapeOptions(value: AnnotationsTimeCyclesShapeOptions): Self = StObject.set(x, "shapeOptions", value.asInstanceOf[js.Any])
    
    inline def setShapeOptionsUndefined: Self = StObject.set(x, "shapeOptions", js.undefined)
    
    inline def setTypeOptions(value: AnnotationsTimeCyclesTypeOptions): Self = StObject.set(x, "typeOptions", value.asInstanceOf[js.Any])
    
    inline def setTypeOptionsUndefined: Self = StObject.set(x, "typeOptions", js.undefined)
  }
}
