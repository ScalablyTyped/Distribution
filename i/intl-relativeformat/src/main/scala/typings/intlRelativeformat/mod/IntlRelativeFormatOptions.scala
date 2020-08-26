package typings.intlRelativeformat.mod

import typings.intlRelativeformat.typesMod.STYLE
import typings.intlRelativeformat.typesMod.SUPPORTED_FIELD
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IntlRelativeFormatOptions extends js.Object {
  var style: js.UndefOr[STYLE] = js.native
  var units: js.UndefOr[SUPPORTED_FIELD] = js.native
}

object IntlRelativeFormatOptions {
  @scala.inline
  def apply(): IntlRelativeFormatOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IntlRelativeFormatOptions]
  }
  @scala.inline
  implicit class IntlRelativeFormatOptionsOps[Self <: IntlRelativeFormatOptions] (val x: Self) extends AnyVal {
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
    def setStyle(value: STYLE): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setUnits(value: SUPPORTED_FIELD): Self = this.set("units", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnits: Self = this.set("units", js.undefined)
  }
  
}

