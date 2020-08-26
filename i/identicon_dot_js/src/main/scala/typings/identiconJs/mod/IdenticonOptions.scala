package typings.identiconJs.mod

import typings.identiconJs.identiconJsStrings.png
import typings.identiconJs.identiconJsStrings.svg
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IdenticonOptions extends js.Object {
  var background: js.UndefOr[Color] = js.native
  var foreground: js.UndefOr[Color] = js.native
  var format: js.UndefOr[svg | png] = js.native
  var margin: js.UndefOr[Double] = js.native
  var size: js.UndefOr[Double] = js.native
}

object IdenticonOptions {
  @scala.inline
  def apply(): IdenticonOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IdenticonOptions]
  }
  @scala.inline
  implicit class IdenticonOptionsOps[Self <: IdenticonOptions] (val x: Self) extends AnyVal {
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
    def setBackground(value: Color): Self = this.set("background", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackground: Self = this.set("background", js.undefined)
    @scala.inline
    def setForeground(value: Color): Self = this.set("foreground", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForeground: Self = this.set("foreground", js.undefined)
    @scala.inline
    def setFormat(value: svg | png): Self = this.set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    @scala.inline
    def setMargin(value: Double): Self = this.set("margin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMargin: Self = this.set("margin", js.undefined)
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
  }
  
}

