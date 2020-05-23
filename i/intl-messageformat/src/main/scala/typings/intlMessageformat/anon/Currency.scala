package typings.intlMessageformat.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Currency extends js.Object {
  var currency: Style
  var percent: Style
}

object Currency {
  @scala.inline
  def apply(currency: Style, percent: Style): Currency = {
    val __obj = js.Dynamic.literal(currency = currency.asInstanceOf[js.Any], percent = percent.asInstanceOf[js.Any])
    __obj.asInstanceOf[Currency]
  }
}

