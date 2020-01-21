package typings.knockoutPreRendered

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMethod extends js.Object {
  var method: js.UndefOr[String] = js.undefined
  var timeout: Double
}

object AnonMethod {
  @scala.inline
  def apply(timeout: Double, method: String = null): AnonMethod = {
    val __obj = js.Dynamic.literal(timeout = timeout.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMethod]
  }
}

