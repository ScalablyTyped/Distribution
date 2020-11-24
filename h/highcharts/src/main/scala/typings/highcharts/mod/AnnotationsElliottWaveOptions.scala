package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnnotationsElliottWaveOptions extends js.Object {
  
  var controlPointOptions: js.UndefOr[AnnotationsElliottWaveControlPointOptions] = js.native
  
  /**
    * (Highstock) Options for annotation's labels. Each label inherits options
    * from the labelOptions object. An option from the labelOptions can be
    * overwritten by config for a specific label.
    */
  var labelOptions: js.UndefOr[AnnotationsElliottWaveLabelOptions] = js.native
  
  /**
    * (Highstock) Options for annotation's shapes. Each shape inherits options
    * from the shapeOptions object. An option from the shapeOptions can be
    * overwritten by config for a specific shape.
    */
  var shapeOptions: js.UndefOr[AnnotationsElliottWaveShapeOptions] = js.native
  
  /**
    * (Highstock) Additional options for an annotation with the type.
    */
  var typeOptions: js.UndefOr[AnnotationsElliottWaveTypeOptions] = js.native
}
object AnnotationsElliottWaveOptions {
  
  @scala.inline
  def apply(): AnnotationsElliottWaveOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnnotationsElliottWaveOptions]
  }
  
  @scala.inline
  implicit class AnnotationsElliottWaveOptionsOps[Self <: AnnotationsElliottWaveOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setControlPointOptions(value: AnnotationsElliottWaveControlPointOptions): Self = this.set("controlPointOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteControlPointOptions: Self = this.set("controlPointOptions", js.undefined)
    
    @scala.inline
    def setLabelOptions(value: AnnotationsElliottWaveLabelOptions): Self = this.set("labelOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelOptions: Self = this.set("labelOptions", js.undefined)
    
    @scala.inline
    def setShapeOptions(value: AnnotationsElliottWaveShapeOptions): Self = this.set("shapeOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShapeOptions: Self = this.set("shapeOptions", js.undefined)
    
    @scala.inline
    def setTypeOptions(value: AnnotationsElliottWaveTypeOptions): Self = this.set("typeOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTypeOptions: Self = this.set("typeOptions", js.undefined)
  }
}
