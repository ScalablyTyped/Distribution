package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NavigatorHandlesOptions extends js.Object {
  
  /**
    * (Highstock, Gantt) The fill for the handle.
    */
  var backgroundColor: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.native
  
  /**
    * (Highstock, Gantt) The stroke for the handle border and the stripes
    * inside.
    */
  var borderColor: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.native
  
  /**
    * (Highstock, Gantt) Allows to enable/disable handles.
    */
  var enabled: js.UndefOr[Boolean] = js.native
  
  /**
    * (Highstock, Gantt) Height for handles.
    */
  var height: js.UndefOr[Double] = js.native
  
  /**
    * (Highstock, Gantt) The width for the handle border and the stripes
    * inside.
    */
  var lineWidth: js.UndefOr[js.Object] = js.native
  
  /**
    * (Highstock, Gantt) Array to define shapes of handles. 0-index for left,
    * 1-index for right.
    *
    * Additionally, the URL to a graphic can be given on this form:
    * `url(graphic.png)`. Note that for the image to be applied to exported
    * charts, its URL needs to be accessible by the export server.
    *
    * Custom callbacks for symbol path generation can also be added to
    * `Highcharts.SVGRenderer.prototype.symbols`. The callback is then used by
    * its method name, as shown in the demo.
    */
  var symbols: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * (Highstock, Gantt) Width for handles.
    */
  var width: js.UndefOr[Double] = js.native
}
object NavigatorHandlesOptions {
  
  @scala.inline
  def apply(): NavigatorHandlesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NavigatorHandlesOptions]
  }
  
  @scala.inline
  implicit class NavigatorHandlesOptionsOps[Self <: NavigatorHandlesOptions] (val x: Self) extends AnyVal {
    
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
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setLineWidth(value: js.Object): Self = this.set("lineWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLineWidth: Self = this.set("lineWidth", js.undefined)
    
    @scala.inline
    def setSymbolsVarargs(value: String*): Self = this.set("symbols", js.Array(value :_*))
    
    @scala.inline
    def setSymbols(value: js.Array[String]): Self = this.set("symbols", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSymbols: Self = this.set("symbols", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
