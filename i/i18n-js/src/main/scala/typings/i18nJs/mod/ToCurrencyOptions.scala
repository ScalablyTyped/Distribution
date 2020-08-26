package typings.i18nJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ToCurrencyOptions extends ToNumberOptions {
  var format: js.UndefOr[String] = js.native
  var sign_first: js.UndefOr[Boolean] = js.native
  var unit: js.UndefOr[String] = js.native
}

object ToCurrencyOptions {
  @scala.inline
  def apply(): ToCurrencyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ToCurrencyOptions]
  }
  @scala.inline
  implicit class ToCurrencyOptionsOps[Self <: ToCurrencyOptions] (val x: Self) extends AnyVal {
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
    def setFormat(value: String): Self = this.set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    @scala.inline
    def setSign_first(value: Boolean): Self = this.set("sign_first", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSign_first: Self = this.set("sign_first", js.undefined)
    @scala.inline
    def setUnit(value: String): Self = this.set("unit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnit: Self = this.set("unit", js.undefined)
  }
  
}

