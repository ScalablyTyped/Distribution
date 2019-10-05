package typings.jsrsasign.jsrsasign.KJUR.asn1

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DateParam extends js.Object {
  var date: Date
  var withMillis: js.UndefOr[Boolean] = js.undefined
}

object DateParam {
  @scala.inline
  def apply(date: Date, withMillis: js.UndefOr[Boolean] = js.undefined): DateParam = {
    val __obj = js.Dynamic.literal(date = date)
    if (!js.isUndefined(withMillis)) __obj.updateDynamic("withMillis")(withMillis)
    __obj.asInstanceOf[DateParam]
  }
}

