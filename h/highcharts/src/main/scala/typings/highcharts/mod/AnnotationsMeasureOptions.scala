package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnnotationsMeasureOptions extends StObject {
  
  var controlPointOptions: js.UndefOr[AnnotationsMeasureControlPointOptions] = js.undefined
  
  /**
    * (Highstock) Additional options for an annotation with the type.
    */
  var typeOptions: js.UndefOr[AnnotationsMeasureTypeOptions] = js.undefined
}
object AnnotationsMeasureOptions {
  
  inline def apply(): AnnotationsMeasureOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnnotationsMeasureOptions]
  }
  
  extension [Self <: AnnotationsMeasureOptions](x: Self) {
    
    inline def setControlPointOptions(value: AnnotationsMeasureControlPointOptions): Self = StObject.set(x, "controlPointOptions", value.asInstanceOf[js.Any])
    
    inline def setControlPointOptionsUndefined: Self = StObject.set(x, "controlPointOptions", js.undefined)
    
    inline def setTypeOptions(value: AnnotationsMeasureTypeOptions): Self = StObject.set(x, "typeOptions", value.asInstanceOf[js.Any])
    
    inline def setTypeOptionsUndefined: Self = StObject.set(x, "typeOptions", js.undefined)
  }
}
