package typings
package handsontableLib.handsontableMod.HandsontableNs.pluginsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NestedRows extends Base {
  var bindRowsWithHeadersPlugin: BindRowsWithHeaders | scala.Unit
  var dataManager: DataManager | scala.Unit
  var headersUI: js.Object | scala.Unit
  var sourceData: js.Object | scala.Unit
  var trimRowsPlugin: TrimRows | scala.Unit
}

object NestedRows {
  @scala.inline
  def apply(
    addHook: js.Function2[java.lang.String, js.Function0[scala.Unit], scala.Unit],
    bindRowsWithHeadersPlugin: BindRowsWithHeaders | scala.Unit,
    callOnPluginsReady: js.Function1[js.Function0[scala.Unit], scala.Unit],
    clearHooks: js.Function0[scala.Unit],
    dataManager: DataManager | scala.Unit,
    destroy: js.Function0[scala.Unit],
    disablePlugin: js.Function0[scala.Unit],
    enablePlugin: js.Function0[scala.Unit],
    enabled: scala.Boolean,
    headersUI: js.Object | scala.Unit,
    init: js.Function0[scala.Unit],
    initialized: scala.Boolean,
    isPluginsReady: scala.Boolean,
    pluginName: java.lang.String,
    pluginsInitializedCallback: js.Array[_],
    removeHook: js.Function1[java.lang.String, scala.Unit],
    sourceData: js.Object | scala.Unit,
    trimRowsPlugin: TrimRows | scala.Unit
  ): NestedRows = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addHook")(addHook)
    __obj.updateDynamic("bindRowsWithHeadersPlugin")(bindRowsWithHeadersPlugin.asInstanceOf[js.Any])
    __obj.updateDynamic("callOnPluginsReady")(callOnPluginsReady)
    __obj.updateDynamic("clearHooks")(clearHooks)
    __obj.updateDynamic("dataManager")(dataManager.asInstanceOf[js.Any])
    __obj.updateDynamic("destroy")(destroy)
    __obj.updateDynamic("disablePlugin")(disablePlugin)
    __obj.updateDynamic("enablePlugin")(enablePlugin)
    __obj.updateDynamic("enabled")(enabled)
    __obj.updateDynamic("headersUI")(headersUI.asInstanceOf[js.Any])
    __obj.updateDynamic("init")(init)
    __obj.updateDynamic("initialized")(initialized)
    __obj.updateDynamic("isPluginsReady")(isPluginsReady)
    __obj.updateDynamic("pluginName")(pluginName)
    __obj.updateDynamic("pluginsInitializedCallback")(pluginsInitializedCallback)
    __obj.updateDynamic("removeHook")(removeHook)
    __obj.updateDynamic("sourceData")(sourceData.asInstanceOf[js.Any])
    __obj.updateDynamic("trimRowsPlugin")(trimRowsPlugin.asInstanceOf[js.Any])
    __obj.asInstanceOf[NestedRows]
  }
}

