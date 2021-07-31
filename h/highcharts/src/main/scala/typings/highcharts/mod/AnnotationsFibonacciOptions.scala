package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnnotationsFibonacciOptions extends StObject {
  
  var controlPointOptions: js.UndefOr[AnnotationsFibonacciControlPointOptions] = js.undefined
  
  /**
    * (Highstock) Options for annotation's labels. Each label inherits options
    * from the labelOptions object. An option from the labelOptions can be
    * overwritten by config for a specific label.
    */
  var labelOptions: js.UndefOr[AnnotationsFibonacciLabelOptions] = js.undefined
  
  /**
    * (Highstock) Options for annotation's shapes. Each shape inherits options
    * from the shapeOptions object. An option from the shapeOptions can be
    * overwritten by config for a specific shape.
    */
  var shapeOptions: js.UndefOr[AnnotationsFibonacciShapeOptions] = js.undefined
  
  /**
    * (Highstock) Additional options for an annotation with the type.
    */
  var typeOptions: js.UndefOr[AnnotationsFibonacciTypeOptions] = js.undefined
}
object AnnotationsFibonacciOptions {
  
  @scala.inline
  def apply(): AnnotationsFibonacciOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnnotationsFibonacciOptions]
  }
  
  @scala.inline
  implicit class AnnotationsFibonacciOptionsMutableBuilder[Self <: AnnotationsFibonacciOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setControlPointOptions(value: AnnotationsFibonacciControlPointOptions): Self = StObject.set(x, "controlPointOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setControlPointOptionsUndefined: Self = StObject.set(x, "controlPointOptions", js.undefined)
    
    @scala.inline
    def setLabelOptions(value: AnnotationsFibonacciLabelOptions): Self = StObject.set(x, "labelOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelOptionsUndefined: Self = StObject.set(x, "labelOptions", js.undefined)
    
    @scala.inline
    def setShapeOptions(value: AnnotationsFibonacciShapeOptions): Self = StObject.set(x, "shapeOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShapeOptionsUndefined: Self = StObject.set(x, "shapeOptions", js.undefined)
    
    @scala.inline
    def setTypeOptions(value: AnnotationsFibonacciTypeOptions): Self = StObject.set(x, "typeOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeOptionsUndefined: Self = StObject.set(x, "typeOptions", js.undefined)
  }
}
