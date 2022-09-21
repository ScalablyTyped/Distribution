package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NavigationAnnotationsTimeCyclesOptions extends StObject {
  
  var controlPointOptions: js.UndefOr[NavigationAnnotationsTimeCyclesControlPointOptions] = js.undefined
  
  /**
    * (Highstock) Options for annotation's shapes. Each shape inherits options
    * from the shapeOptions object. An option from the shapeOptions can be
    * overwritten by config for a specific shape.
    */
  var shapeOptions: js.UndefOr[NavigationAnnotationsTimeCyclesShapeOptions] = js.undefined
  
  /**
    * (Highstock) Additional options for an annotation with the type.
    */
  var typeOptions: js.UndefOr[NavigationAnnotationsTimeCyclesTypeOptions] = js.undefined
}
object NavigationAnnotationsTimeCyclesOptions {
  
  inline def apply(): NavigationAnnotationsTimeCyclesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NavigationAnnotationsTimeCyclesOptions]
  }
  
  extension [Self <: NavigationAnnotationsTimeCyclesOptions](x: Self) {
    
    inline def setControlPointOptions(value: NavigationAnnotationsTimeCyclesControlPointOptions): Self = StObject.set(x, "controlPointOptions", value.asInstanceOf[js.Any])
    
    inline def setControlPointOptionsUndefined: Self = StObject.set(x, "controlPointOptions", js.undefined)
    
    inline def setShapeOptions(value: NavigationAnnotationsTimeCyclesShapeOptions): Self = StObject.set(x, "shapeOptions", value.asInstanceOf[js.Any])
    
    inline def setShapeOptionsUndefined: Self = StObject.set(x, "shapeOptions", js.undefined)
    
    inline def setTypeOptions(value: NavigationAnnotationsTimeCyclesTypeOptions): Self = StObject.set(x, "typeOptions", value.asInstanceOf[js.Any])
    
    inline def setTypeOptionsUndefined: Self = StObject.set(x, "typeOptions", js.undefined)
  }
}
