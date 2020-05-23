package typings.iobroker.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<iobroker.iobroker.<global>.ioBroker.StateACL> */
trait PartialStateACL extends js.Object {
  var `object`: js.UndefOr[Double] = js.undefined
  var owner: js.UndefOr[String] = js.undefined
  var ownerGroup: js.UndefOr[String] = js.undefined
  var state: js.UndefOr[Double] = js.undefined
}

object PartialStateACL {
  @scala.inline
  def apply(
    `object`: js.UndefOr[Double] = js.undefined,
    owner: String = null,
    ownerGroup: String = null,
    state: js.UndefOr[Double] = js.undefined
  ): PartialStateACL = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(`object`)) __obj.updateDynamic("object")(`object`.get.asInstanceOf[js.Any])
    if (owner != null) __obj.updateDynamic("owner")(owner.asInstanceOf[js.Any])
    if (ownerGroup != null) __obj.updateDynamic("ownerGroup")(ownerGroup.asInstanceOf[js.Any])
    if (!js.isUndefined(state)) __obj.updateDynamic("state")(state.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialStateACL]
  }
}

