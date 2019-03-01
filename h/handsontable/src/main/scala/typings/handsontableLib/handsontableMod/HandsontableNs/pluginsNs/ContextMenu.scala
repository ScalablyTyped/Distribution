package typings
package handsontableLib.handsontableMod.HandsontableNs.pluginsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContextMenu extends Base {
  var commandExecutor: CommandExecutor
  var eventManager: EventManager
  var itemsFactory: ItemsFactory | scala.Unit
  var menu: Menu | scala.Unit
  def close(): scala.Unit
  def executeCommand(commandName: java.lang.String, params: js.Any*): scala.Unit
  def open(event: stdLib.Event): scala.Unit
}

object ContextMenu {
  @scala.inline
  def apply(
    addHook: js.Function2[java.lang.String, js.Function0[scala.Unit], scala.Unit],
    callOnPluginsReady: js.Function1[js.Function0[scala.Unit], scala.Unit],
    clearHooks: js.Function0[scala.Unit],
    close: js.Function0[scala.Unit],
    commandExecutor: CommandExecutor,
    destroy: js.Function0[scala.Unit],
    disablePlugin: js.Function0[scala.Unit],
    enablePlugin: js.Function0[scala.Unit],
    enabled: scala.Boolean,
    eventManager: EventManager,
    executeCommand: js.Function2[java.lang.String, /* repeated */ js.Any, scala.Unit],
    init: js.Function0[scala.Unit],
    initialized: scala.Boolean,
    isPluginsReady: scala.Boolean,
    itemsFactory: ItemsFactory | scala.Unit,
    menu: Menu | scala.Unit,
    open: js.Function1[stdLib.Event, scala.Unit],
    pluginName: java.lang.String,
    pluginsInitializedCallback: js.Array[_],
    removeHook: js.Function1[java.lang.String, scala.Unit]
  ): ContextMenu = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addHook")(addHook)
    __obj.updateDynamic("callOnPluginsReady")(callOnPluginsReady)
    __obj.updateDynamic("clearHooks")(clearHooks)
    __obj.updateDynamic("close")(close)
    __obj.updateDynamic("commandExecutor")(commandExecutor)
    __obj.updateDynamic("destroy")(destroy)
    __obj.updateDynamic("disablePlugin")(disablePlugin)
    __obj.updateDynamic("enablePlugin")(enablePlugin)
    __obj.updateDynamic("enabled")(enabled)
    __obj.updateDynamic("eventManager")(eventManager)
    __obj.updateDynamic("executeCommand")(executeCommand)
    __obj.updateDynamic("init")(init)
    __obj.updateDynamic("initialized")(initialized)
    __obj.updateDynamic("isPluginsReady")(isPluginsReady)
    __obj.updateDynamic("itemsFactory")(itemsFactory.asInstanceOf[js.Any])
    __obj.updateDynamic("menu")(menu.asInstanceOf[js.Any])
    __obj.updateDynamic("open")(open)
    __obj.updateDynamic("pluginName")(pluginName)
    __obj.updateDynamic("pluginsInitializedCallback")(pluginsInitializedCallback)
    __obj.updateDynamic("removeHook")(removeHook)
    __obj.asInstanceOf[ContextMenu]
  }
}

