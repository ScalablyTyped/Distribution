package typings.layuiSrc.layui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColorPicker extends js.Object {
  def render(option: ColorPickerOption): ColorPicker = js.native
}

object ColorPicker {
  @scala.inline
  def apply(render: ColorPickerOption => ColorPicker): ColorPicker = {
    val __obj = js.Dynamic.literal(render = js.Any.fromFunction1(render))
    __obj.asInstanceOf[ColorPicker]
  }
  @scala.inline
  implicit class ColorPickerOps[Self <: ColorPicker] (val x: Self) extends AnyVal {
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
    def setRender(value: ColorPickerOption => ColorPicker): Self = this.set("render", js.Any.fromFunction1(value))
  }
  
}

