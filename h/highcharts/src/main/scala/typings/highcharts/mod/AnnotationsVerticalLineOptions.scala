package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnnotationsVerticalLineOptions extends StObject {
  
  /**
    * (Highstock) Options for annotation's labels. Each label inherits options
    * from the labelOptions object. An option from the labelOptions can be
    * overwritten by config for a specific label.
    */
  var labelOptions: js.UndefOr[AnnotationsVerticalLineLabelOptions] = js.native
  
  /**
    * (Highstock) Options for annotation's shapes. Each shape inherits options
    * from the shapeOptions object. An option from the shapeOptions can be
    * overwritten by config for a specific shape.
    */
  var shapeOptions: js.UndefOr[AnnotationsVerticalLineShapeOptions] = js.native
  
  /**
    * (Highstock) Additional options for an annotation with the type.
    */
  var typeOptions: js.UndefOr[AnnotationsVerticalLineTypeOptions] = js.native
}
object AnnotationsVerticalLineOptions {
  
  @scala.inline
  def apply(): AnnotationsVerticalLineOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnnotationsVerticalLineOptions]
  }
  
  @scala.inline
  implicit class AnnotationsVerticalLineOptionsMutableBuilder[Self <: AnnotationsVerticalLineOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLabelOptions(value: AnnotationsVerticalLineLabelOptions): Self = StObject.set(x, "labelOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelOptionsUndefined: Self = StObject.set(x, "labelOptions", js.undefined)
    
    @scala.inline
    def setShapeOptions(value: AnnotationsVerticalLineShapeOptions): Self = StObject.set(x, "shapeOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShapeOptionsUndefined: Self = StObject.set(x, "shapeOptions", js.undefined)
    
    @scala.inline
    def setTypeOptions(value: AnnotationsVerticalLineTypeOptions): Self = StObject.set(x, "typeOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeOptionsUndefined: Self = StObject.set(x, "typeOptions", js.undefined)
  }
}
