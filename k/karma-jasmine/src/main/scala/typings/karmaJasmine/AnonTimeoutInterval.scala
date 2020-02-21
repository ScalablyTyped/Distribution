package typings.karmaJasmine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTimeoutInterval extends js.Object {
  /** @deprecated undocumented to be removed */
  var timeoutInterval: js.UndefOr[Double] = js.undefined
}

object AnonTimeoutInterval {
  @scala.inline
  def apply(timeoutInterval: Int | Double = null): AnonTimeoutInterval = {
    val __obj = js.Dynamic.literal()
    if (timeoutInterval != null) __obj.updateDynamic("timeoutInterval")(timeoutInterval.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTimeoutInterval]
  }
}

