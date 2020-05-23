package typings.ipp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FinishingCovering extends js.Object {
  var `covering-name`: js.UndefOr[String] = js.undefined
}

object FinishingCovering {
  @scala.inline
  def apply(`covering-name`: String = null): FinishingCovering = {
    val __obj = js.Dynamic.literal()
    if (`covering-name` != null) __obj.updateDynamic("covering-name")(`covering-name`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FinishingCovering]
  }
}

