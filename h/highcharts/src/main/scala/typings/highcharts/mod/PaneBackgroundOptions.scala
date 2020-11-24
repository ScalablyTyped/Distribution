package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PaneBackgroundOptions extends js.Object {
  
  /**
    * (Highcharts) The background color or gradient for the pane.
    */
  var backgroundColor: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.native
  
  /**
    * (Highcharts) The pane background border color.
    */
  var borderColor: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.native
  
  /**
    * (Highcharts) The pixel border width of the pane background.
    */
  var borderWidth: js.UndefOr[Double] = js.native
  
  /**
    * (Highcharts) The class name for this background.
    */
  var className: js.UndefOr[String] = js.native
  
  /**
    * (Highcharts) The inner radius of the pane background. Can be either
    * numeric (pixels) or a percentage string.
    */
  var innerRadius: js.UndefOr[Double | String] = js.native
  
  /**
    * (Highcharts) The outer radius of the circular pane background. Can be
    * either numeric (pixels) or a percentage string.
    */
  var outerRadius: js.UndefOr[Double | String] = js.native
  
  /**
    * (Highcharts) The shape of the pane background. When `solid`, the
    * background is circular. When `arc`, the background extends only from the
    * min to the max of the value axis.
    */
  var shape: js.UndefOr[PaneBackgroundShapeValue] = js.native
}
object PaneBackgroundOptions {
  
  @scala.inline
  def apply(): PaneBackgroundOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PaneBackgroundOptions]
  }
  
  @scala.inline
  implicit class PaneBackgroundOptionsOps[Self <: PaneBackgroundOptions] (val x: Self) extends AnyVal {
    
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
    def setBackgroundColor(value: ColorString | GradientColorObject | PatternObject): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackgroundColor: Self = this.set("backgroundColor", js.undefined)
    
    @scala.inline
    def setBorderColor(value: ColorString | GradientColorObject | PatternObject): Self = this.set("borderColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderColor: Self = this.set("borderColor", js.undefined)
    
    @scala.inline
    def setBorderWidth(value: Double): Self = this.set("borderWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderWidth: Self = this.set("borderWidth", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setInnerRadius(value: Double | String): Self = this.set("innerRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInnerRadius: Self = this.set("innerRadius", js.undefined)
    
    @scala.inline
    def setOuterRadius(value: Double | String): Self = this.set("outerRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOuterRadius: Self = this.set("outerRadius", js.undefined)
    
    @scala.inline
    def setShape(value: PaneBackgroundShapeValue): Self = this.set("shape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShape: Self = this.set("shape", js.undefined)
  }
}
