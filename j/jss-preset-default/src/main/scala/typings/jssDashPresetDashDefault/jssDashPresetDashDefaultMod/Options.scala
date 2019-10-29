package typings.jssDashPresetDashDefault.jssDashPresetDashDefaultMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var defaultUnit: js.UndefOr[
    typings.jssDashPluginDashDefaultDashUnit.jssDashPluginDashDefaultDashUnitMod.Options
  ] = js.undefined
  var observable: js.UndefOr[
    typings.jssDashPluginDashRuleDashValueDashObservable.jssDashPluginDashRuleDashValueDashObservableMod.Options
  ] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    defaultUnit: typings.jssDashPluginDashDefaultDashUnit.jssDashPluginDashDefaultDashUnitMod.Options = null,
    observable: typings.jssDashPluginDashRuleDashValueDashObservable.jssDashPluginDashRuleDashValueDashObservableMod.Options = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (defaultUnit != null) __obj.updateDynamic("defaultUnit")(defaultUnit)
    if (observable != null) __obj.updateDynamic("observable")(observable)
    __obj.asInstanceOf[Options]
  }
}

