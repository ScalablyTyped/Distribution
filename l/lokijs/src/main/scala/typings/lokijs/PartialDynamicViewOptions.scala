package typings.lokijs

import typings.lokijs.lokijsStrings.active
import typings.lokijs.lokijsStrings.passive
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<lokijs.DynamicViewOptions> */
trait PartialDynamicViewOptions extends js.Object {
  var minRebuildInterval: js.UndefOr[Double] = js.undefined
  var persistent: js.UndefOr[Boolean] = js.undefined
  var sortPriority: js.UndefOr[active | passive] = js.undefined
}

object PartialDynamicViewOptions {
  @scala.inline
  def apply(
    minRebuildInterval: Int | Double = null,
    persistent: js.UndefOr[Boolean] = js.undefined,
    sortPriority: active | passive = null
  ): PartialDynamicViewOptions = {
    val __obj = js.Dynamic.literal()
    if (minRebuildInterval != null) __obj.updateDynamic("minRebuildInterval")(minRebuildInterval.asInstanceOf[js.Any])
    if (!js.isUndefined(persistent)) __obj.updateDynamic("persistent")(persistent.asInstanceOf[js.Any])
    if (sortPriority != null) __obj.updateDynamic("sortPriority")(sortPriority.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialDynamicViewOptions]
  }
}

