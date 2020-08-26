package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShadowOptionsObject extends js.Object {
  /**
    * The shadow color.
    */
  var color: js.UndefOr[ColorString] = js.native
  /**
    * The horizontal offset from the element.
    */
  var offsetX: js.UndefOr[Double] = js.native
  /**
    * The vertical offset from the element.
    */
  var offsetY: js.UndefOr[Double] = js.native
  /**
    * The shadow opacity.
    */
  var opacity: js.UndefOr[Double] = js.native
  /**
    * The shadow width or distance from the element.
    */
  var width: js.UndefOr[Double] = js.native
}

object ShadowOptionsObject {
  @scala.inline
  def apply(): ShadowOptionsObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShadowOptionsObject]
  }
  @scala.inline
  implicit class ShadowOptionsObjectOps[Self <: ShadowOptionsObject] (val x: Self) extends AnyVal {
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
    def setColor(value: ColorString): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setOffsetX(value: Double): Self = this.set("offsetX", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffsetX: Self = this.set("offsetX", js.undefined)
    @scala.inline
    def setOffsetY(value: Double): Self = this.set("offsetY", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffsetY: Self = this.set("offsetY", js.undefined)
    @scala.inline
    def setOpacity(value: Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

