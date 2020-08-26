package typings.intlMessageformat.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Currency extends js.Object {
  var currency: Style = js.native
  var percent: Style = js.native
}

object Currency {
  @scala.inline
  def apply(currency: Style, percent: Style): Currency = {
    val __obj = js.Dynamic.literal(currency = currency.asInstanceOf[js.Any], percent = percent.asInstanceOf[js.Any])
    __obj.asInstanceOf[Currency]
  }
  @scala.inline
  implicit class CurrencyOps[Self <: Currency] (val x: Self) extends AnyVal {
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
    def setCurrency(value: Style): Self = this.set("currency", value.asInstanceOf[js.Any])
    @scala.inline
    def setPercent(value: Style): Self = this.set("percent", value.asInstanceOf[js.Any])
  }
  
}

