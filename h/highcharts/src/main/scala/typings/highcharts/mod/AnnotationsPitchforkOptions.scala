package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnnotationsPitchforkOptions extends StObject {
  
  var controlPointOptions: js.UndefOr[AnnotationsPitchforkControlPointOptions] = js.undefined
  
  /**
    * (Highstock) Options for annotation's labels. Each label inherits options
    * from the labelOptions object. An option from the labelOptions can be
    * overwritten by config for a specific label.
    */
  var labelOptions: js.UndefOr[AnnotationsPitchforkLabelOptions] = js.undefined
  
  /**
    * (Highstock) Options for annotation's shapes. Each shape inherits options
    * from the shapeOptions object. An option from the shapeOptions can be
    * overwritten by config for a specific shape.
    */
  var shapeOptions: js.UndefOr[AnnotationsPitchforkShapeOptions] = js.undefined
  
  /**
    * (Highstock) Additional options for an annotation with the type.
    */
  var typeOptions: js.UndefOr[AnnotationsPitchforkTypeOptions] = js.undefined
}
object AnnotationsPitchforkOptions {
  
  @scala.inline
  def apply(): AnnotationsPitchforkOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnnotationsPitchforkOptions]
  }
  
  @scala.inline
  implicit class AnnotationsPitchforkOptionsMutableBuilder[Self <: AnnotationsPitchforkOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setControlPointOptions(value: AnnotationsPitchforkControlPointOptions): Self = StObject.set(x, "controlPointOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setControlPointOptionsUndefined: Self = StObject.set(x, "controlPointOptions", js.undefined)
    
    @scala.inline
    def setLabelOptions(value: AnnotationsPitchforkLabelOptions): Self = StObject.set(x, "labelOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelOptionsUndefined: Self = StObject.set(x, "labelOptions", js.undefined)
    
    @scala.inline
    def setShapeOptions(value: AnnotationsPitchforkShapeOptions): Self = StObject.set(x, "shapeOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShapeOptionsUndefined: Self = StObject.set(x, "shapeOptions", js.undefined)
    
    @scala.inline
    def setTypeOptions(value: AnnotationsPitchforkTypeOptions): Self = StObject.set(x, "typeOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeOptionsUndefined: Self = StObject.set(x, "typeOptions", js.undefined)
  }
}
