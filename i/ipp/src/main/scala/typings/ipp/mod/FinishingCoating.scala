package typings.ipp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FinishingCoating extends js.Object {
  var `coating-sides`: js.UndefOr[FinishingSides] = js.undefined
  var `coating-type`: js.UndefOr[CoatingType] = js.undefined
}

object FinishingCoating {
  @scala.inline
  def apply(`coating-sides`: FinishingSides = null, `coating-type`: CoatingType = null): FinishingCoating = {
    val __obj = js.Dynamic.literal()
    if (`coating-sides` != null) __obj.updateDynamic("coating-sides")(`coating-sides`.asInstanceOf[js.Any])
    if (`coating-type` != null) __obj.updateDynamic("coating-type")(`coating-type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FinishingCoating]
  }
}

