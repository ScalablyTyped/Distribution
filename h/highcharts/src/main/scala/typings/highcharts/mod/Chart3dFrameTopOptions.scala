package typings.highcharts.mod

import typings.highcharts.highchartsStrings.auto
import typings.highcharts.highchartsStrings.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Chart3dFrameTopOptions extends js.Object {
  /**
    * (Highcharts) The color of the panel.
    */
  var color: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.native
  /**
    * (Highcharts) The thickness of the panel.
    */
  var size: js.UndefOr[Double] = js.native
  /**
    * (Highcharts) Whether to display the frame. Possible values are `true`,
    * `false`, `"auto"` to display only the frames behind the data, and
    * `"default"` to display faces behind the data based on the axis layout,
    * ignoring the point of view.
    */
  var visible: js.UndefOr[auto | default | Boolean] = js.native
}

object Chart3dFrameTopOptions {
  @scala.inline
  def apply(): Chart3dFrameTopOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Chart3dFrameTopOptions]
  }
  @scala.inline
  implicit class Chart3dFrameTopOptionsOps[Self <: Chart3dFrameTopOptions] (val x: Self) extends AnyVal {
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
    def setColor(value: ColorString | GradientColorObject | PatternObject): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    @scala.inline
    def setVisible(value: auto | default | Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
  }
  
}

