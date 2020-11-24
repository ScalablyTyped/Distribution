package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlotBulletTargetOptions extends js.Object {
  
  /**
    * (Highcharts) The border color of the rectangle representing the target.
    * When not set, the point's border color is used.
    *
    * In styled mode, use class `highcharts-bullet-target` instead.
    */
  var borderColor: js.UndefOr[ColorString] = js.native
  
  /**
    * (Highcharts) The border width of the rectangle representing the target.
    *
    * In styled mode, use class `highcharts-bullet-target` instead.
    */
  var borderWidth: js.UndefOr[Double] = js.native
  
  /**
    * (Highcharts) The color of the rectangle representing the target. When not
    * set, point's color (if set in point's options - `color`) or zone of the
    * target value (if `zones` or `negativeColor` are set) or the same color as
    * the point has is used.
    *
    * In styled mode, use class `highcharts-bullet-target` instead.
    */
  var color: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.native
  
  /**
    * (Highcharts) The height of the rectangle representing the target.
    */
  var height: js.UndefOr[Double] = js.native
  
  /**
    * (Highcharts) The width of the rectangle representing the target. Could be
    * set as a pixel value or as a percentage of a column width.
    */
  var width: js.UndefOr[Double | String] = js.native
}
object PlotBulletTargetOptions {
  
  @scala.inline
  def apply(): PlotBulletTargetOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotBulletTargetOptions]
  }
  
  @scala.inline
  implicit class PlotBulletTargetOptionsOps[Self <: PlotBulletTargetOptions] (val x: Self) extends AnyVal {
    
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
    def setBorderColor(value: ColorString): Self = this.set("borderColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderColor: Self = this.set("borderColor", js.undefined)
    
    @scala.inline
    def setBorderWidth(value: Double): Self = this.set("borderWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderWidth: Self = this.set("borderWidth", js.undefined)
    
    @scala.inline
    def setColor(value: ColorString | GradientColorObject | PatternObject): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setWidth(value: Double | String): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
