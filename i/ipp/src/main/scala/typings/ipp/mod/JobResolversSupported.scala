package typings.ipp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobResolversSupported extends js.Object {
  var `resolver-name`: js.UndefOr[String] = js.undefined
}

object JobResolversSupported {
  @scala.inline
  def apply(`resolver-name`: String = null): JobResolversSupported = {
    val __obj = js.Dynamic.literal()
    if (`resolver-name` != null) __obj.updateDynamic("resolver-name")(`resolver-name`.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobResolversSupported]
  }
}

