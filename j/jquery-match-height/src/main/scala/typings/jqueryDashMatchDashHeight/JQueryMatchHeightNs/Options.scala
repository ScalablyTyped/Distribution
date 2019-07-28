package typings.jqueryDashMatchDashHeight.JQueryMatchHeightNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var byRow: js.UndefOr[Boolean] = js.undefined
  var property: js.UndefOr[String] = js.undefined
  var remove: js.UndefOr[Boolean] = js.undefined
  var target: js.UndefOr[String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    byRow: js.UndefOr[Boolean] = js.undefined,
    property: String = null,
    remove: js.UndefOr[Boolean] = js.undefined,
    target: String = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(byRow)) __obj.updateDynamic("byRow")(byRow)
    if (property != null) __obj.updateDynamic("property")(property)
    if (!js.isUndefined(remove)) __obj.updateDynamic("remove")(remove)
    if (target != null) __obj.updateDynamic("target")(target)
    __obj.asInstanceOf[Options]
  }
}

