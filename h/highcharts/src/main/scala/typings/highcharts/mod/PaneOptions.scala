package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PaneOptions extends js.Object {
  
  /**
    * (Highcharts) An array of background items for the pane.
    */
  var background: js.UndefOr[js.Array[PaneBackgroundOptions]] = js.native
  
  /**
    * (Highcharts) The center of a polar chart or angular gauge, given as an
    * array of [x, y] positions. Positions can be given as integers that
    * transform to pixels, or as percentages of the plot area size.
    */
  var center: js.UndefOr[js.Array[String | Double]] = js.native
  
  /**
    * (Highcharts) The end angle of the polar X axis or gauge value axis, given
    * in degrees where 0 is north. Defaults to startAngle
    *
    * + 360.
    */
  var endAngle: js.UndefOr[Double] = js.native
  
  /**
    * (Highcharts) The inner size of the pane, either as a number defining
    * pixels, or a percentage defining a percentage of the pane's size.
    */
  var innerSize: js.UndefOr[Double | String] = js.native
  
  /**
    * (Highcharts) The size of the pane, either as a number defining pixels, or
    * a percentage defining a percentage of the available plot area (the
    * smallest of the plot height or plot width).
    */
  var size: js.UndefOr[Double | String] = js.native
  
  /**
    * (Highcharts) The start angle of the polar X axis or gauge axis, given in
    * degrees where 0 is north. Defaults to 0.
    */
  var startAngle: js.UndefOr[Double] = js.native
}
object PaneOptions {
  
  @scala.inline
  def apply(): PaneOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PaneOptions]
  }
  
  @scala.inline
  implicit class PaneOptionsOps[Self <: PaneOptions] (val x: Self) extends AnyVal {
    
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
    def setBackgroundVarargs(value: PaneBackgroundOptions*): Self = this.set("background", js.Array(value :_*))
    
    @scala.inline
    def setBackground(value: js.Array[PaneBackgroundOptions]): Self = this.set("background", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackground: Self = this.set("background", js.undefined)
    
    @scala.inline
    def setCenterVarargs(value: (String | Double)*): Self = this.set("center", js.Array(value :_*))
    
    @scala.inline
    def setCenter(value: js.Array[String | Double]): Self = this.set("center", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCenter: Self = this.set("center", js.undefined)
    
    @scala.inline
    def setEndAngle(value: Double): Self = this.set("endAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndAngle: Self = this.set("endAngle", js.undefined)
    
    @scala.inline
    def setInnerSize(value: Double | String): Self = this.set("innerSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInnerSize: Self = this.set("innerSize", js.undefined)
    
    @scala.inline
    def setSize(value: Double | String): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    
    @scala.inline
    def setStartAngle(value: Double): Self = this.set("startAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartAngle: Self = this.set("startAngle", js.undefined)
  }
}
