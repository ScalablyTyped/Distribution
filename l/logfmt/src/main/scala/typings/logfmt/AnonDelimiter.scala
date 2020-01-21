package typings.logfmt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDelimiter extends js.Object {
  var delimiter: js.UndefOr[String] = js.undefined
}

object AnonDelimiter {
  @scala.inline
  def apply(delimiter: String = null): AnonDelimiter = {
    val __obj = js.Dynamic.literal()
    if (delimiter != null) __obj.updateDynamic("delimiter")(delimiter.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDelimiter]
  }
}

