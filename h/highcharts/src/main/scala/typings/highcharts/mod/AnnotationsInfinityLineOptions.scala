package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnnotationsInfinityLineOptions extends StObject {
  
  var controlPointOptions: js.UndefOr[AnnotationsInfinityLineControlPointOptions] = js.undefined
  
  /**
    * (Highstock) Options for annotation's labels. Each label inherits options
    * from the labelOptions object. An option from the labelOptions can be
    * overwritten by config for a specific label.
    */
  var labelOptions: js.UndefOr[AnnotationsInfinityLineLabelOptions] = js.undefined
  
  /**
    * (Highstock) Options for annotation's shapes. Each shape inherits options
    * from the shapeOptions object. An option from the shapeOptions can be
    * overwritten by config for a specific shape.
    */
  var shapeOptions: js.UndefOr[AnnotationsInfinityLineShapeOptions] = js.undefined
  
  /**
    * (Highstock) Additional options for an annotation with the type.
    */
  var typeOptions: js.UndefOr[AnnotationsInfinityLineTypeOptions] = js.undefined
}
object AnnotationsInfinityLineOptions {
  
  @scala.inline
  def apply(): AnnotationsInfinityLineOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnnotationsInfinityLineOptions]
  }
  
  @scala.inline
  implicit class AnnotationsInfinityLineOptionsMutableBuilder[Self <: AnnotationsInfinityLineOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setControlPointOptions(value: AnnotationsInfinityLineControlPointOptions): Self = StObject.set(x, "controlPointOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setControlPointOptionsUndefined: Self = StObject.set(x, "controlPointOptions", js.undefined)
    
    @scala.inline
    def setLabelOptions(value: AnnotationsInfinityLineLabelOptions): Self = StObject.set(x, "labelOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelOptionsUndefined: Self = StObject.set(x, "labelOptions", js.undefined)
    
    @scala.inline
    def setShapeOptions(value: AnnotationsInfinityLineShapeOptions): Self = StObject.set(x, "shapeOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShapeOptionsUndefined: Self = StObject.set(x, "shapeOptions", js.undefined)
    
    @scala.inline
    def setTypeOptions(value: AnnotationsInfinityLineTypeOptions): Self = StObject.set(x, "typeOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeOptionsUndefined: Self = StObject.set(x, "typeOptions", js.undefined)
  }
}
