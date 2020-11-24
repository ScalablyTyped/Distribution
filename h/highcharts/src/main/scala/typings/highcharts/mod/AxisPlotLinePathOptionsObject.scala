package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AxisPlotLinePathOptionsObject extends js.Object {
  
  /**
    * Used in Highstock. When `true`, plot paths (crosshair, plotLines,
    * gridLines) will be rendered on all axes when defined on the first axis.
    */
  var acrossPanes: js.UndefOr[Boolean] = js.native
  
  /**
    * If `false`, the function will return null when it falls outside the axis
    * bounds. If `true`, the function will return a path aligned to the plot
    * area sides if it falls outside. If `pass`, it will return a path outside.
    */
  var force: js.UndefOr[Boolean | String] = js.native
  
  /**
    * Line width used for calculation crisp line coordinates. Defaults to 1.
    */
  var lineWidth: js.UndefOr[Double] = js.native
  
  /**
    * Use old coordinates (for resizing and rescaling). If not set, defaults to
    * `false`.
    */
  var old: js.UndefOr[Boolean] = js.native
  
  /**
    * Used in Polar axes. Reverse the positions for concatenation of polygonal
    * plot bands
    */
  var reverse: js.UndefOr[Boolean] = js.native
  
  /**
    * If given, return the plot line path of a pixel position on the axis.
    */
  var translatedValue: js.UndefOr[Double] = js.native
  
  /**
    * Axis value.
    */
  var value: js.UndefOr[Double] = js.native
}
object AxisPlotLinePathOptionsObject {
  
  @scala.inline
  def apply(): AxisPlotLinePathOptionsObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AxisPlotLinePathOptionsObject]
  }
  
  @scala.inline
  implicit class AxisPlotLinePathOptionsObjectOps[Self <: AxisPlotLinePathOptionsObject] (val x: Self) extends AnyVal {
    
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
    def setAcrossPanes(value: Boolean): Self = this.set("acrossPanes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAcrossPanes: Self = this.set("acrossPanes", js.undefined)
    
    @scala.inline
    def setForce(value: Boolean | String): Self = this.set("force", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForce: Self = this.set("force", js.undefined)
    
    @scala.inline
    def setLineWidth(value: Double): Self = this.set("lineWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLineWidth: Self = this.set("lineWidth", js.undefined)
    
    @scala.inline
    def setOld(value: Boolean): Self = this.set("old", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOld: Self = this.set("old", js.undefined)
    
    @scala.inline
    def setReverse(value: Boolean): Self = this.set("reverse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReverse: Self = this.set("reverse", js.undefined)
    
    @scala.inline
    def setTranslatedValue(value: Double): Self = this.set("translatedValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTranslatedValue: Self = this.set("translatedValue", js.undefined)
    
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
