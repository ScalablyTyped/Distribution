package typings.ipp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FinishingBailing extends js.Object {
  var `baling-type`: js.UndefOr[BalingType] = js.undefined
  var `baling-when`: js.UndefOr[BalingWhen] = js.undefined
}

object FinishingBailing {
  @scala.inline
  def apply(`baling-type`: BalingType = null, `baling-when`: BalingWhen = null): FinishingBailing = {
    val __obj = js.Dynamic.literal()
    if (`baling-type` != null) __obj.updateDynamic("baling-type")(`baling-type`.asInstanceOf[js.Any])
    if (`baling-when` != null) __obj.updateDynamic("baling-when")(`baling-when`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FinishingBailing]
  }
}

