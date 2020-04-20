package typings.intlMessageformat

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCurrency extends js.Object {
  var currency: AnonStyle
  var percent: AnonStyle
}

object AnonCurrency {
  @scala.inline
  def apply(currency: AnonStyle, percent: AnonStyle): AnonCurrency = {
    val __obj = js.Dynamic.literal(currency = currency.asInstanceOf[js.Any], percent = percent.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCurrency]
  }
}

