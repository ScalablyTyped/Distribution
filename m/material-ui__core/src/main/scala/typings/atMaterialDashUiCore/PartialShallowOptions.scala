package typings.atMaterialDashUiCore

import typings.enzyme.enzymeMod.EnzymeSelector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/test-utils/createShallow.ShallowOptions> */
@js.native
trait PartialShallowOptions extends js.Object {
  var dive: js.UndefOr[Boolean] = js.native
  var shallow: js.UndefOr[Fn_NodeOptionsPropsShallow] = js.native
  var untilSelector: js.UndefOr[EnzymeSelector] = js.native
}

object PartialShallowOptions {
  @scala.inline
  def apply(
    dive: js.UndefOr[Boolean] = js.undefined,
    shallow: Fn_NodeOptionsPropsShallow = null,
    untilSelector: EnzymeSelector = null
  ): PartialShallowOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(dive)) __obj.updateDynamic("dive")(dive.asInstanceOf[js.Any])
    if (shallow != null) __obj.updateDynamic("shallow")(shallow.asInstanceOf[js.Any])
    if (untilSelector != null) __obj.updateDynamic("untilSelector")(untilSelector.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialShallowOptions]
  }
}

