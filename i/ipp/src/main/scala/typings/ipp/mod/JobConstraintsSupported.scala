package typings.ipp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobConstraintsSupported extends js.Object {
  var `resolver-name`: js.UndefOr[String] = js.undefined
}

object JobConstraintsSupported {
  @scala.inline
  def apply(`resolver-name`: String = null): JobConstraintsSupported = {
    val __obj = js.Dynamic.literal()
    if (`resolver-name` != null) __obj.updateDynamic("resolver-name")(`resolver-name`.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobConstraintsSupported]
  }
}

