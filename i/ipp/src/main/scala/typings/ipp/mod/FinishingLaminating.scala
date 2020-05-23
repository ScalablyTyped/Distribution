package typings.ipp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FinishingLaminating extends js.Object {
  var `laminating-sides`: js.UndefOr[FinishingSides] = js.undefined
  var `laminating-type`: js.UndefOr[LaminatingType] = js.undefined
}

object FinishingLaminating {
  @scala.inline
  def apply(`laminating-sides`: FinishingSides = null, `laminating-type`: LaminatingType = null): FinishingLaminating = {
    val __obj = js.Dynamic.literal()
    if (`laminating-sides` != null) __obj.updateDynamic("laminating-sides")(`laminating-sides`.asInstanceOf[js.Any])
    if (`laminating-type` != null) __obj.updateDynamic("laminating-type")(`laminating-type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FinishingLaminating]
  }
}

