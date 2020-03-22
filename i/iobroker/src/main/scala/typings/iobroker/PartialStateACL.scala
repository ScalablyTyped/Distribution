package typings.iobroker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<iobroker.iobroker._Global_.ioBroker.StateACL> */
trait PartialStateACL extends js.Object {
  var `object`: js.UndefOr[Double] = js.undefined
  var owner: js.UndefOr[String] = js.undefined
  var ownerGroup: js.UndefOr[String] = js.undefined
  var state: js.UndefOr[Double] = js.undefined
}

object PartialStateACL {
  @scala.inline
  def apply(
    `object`: Int | Double = null,
    owner: String = null,
    ownerGroup: String = null,
    state: Int | Double = null
  ): PartialStateACL = {
    val __obj = js.Dynamic.literal()
    if (`object` != null) __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    if (owner != null) __obj.updateDynamic("owner")(owner.asInstanceOf[js.Any])
    if (ownerGroup != null) __obj.updateDynamic("ownerGroup")(ownerGroup.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialStateACL]
  }
}

