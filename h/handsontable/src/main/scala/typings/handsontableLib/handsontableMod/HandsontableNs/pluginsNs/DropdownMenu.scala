package typings
package handsontableLib.handsontableMod.HandsontableNs.pluginsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DropdownMenu extends Base {
  var SEPARATOR: SeparatorObject
  var commandExecutor: CommandExecutor
  var eventManager: EventManager
  var itemsFactory: ItemsFactory | scala.Unit
  var menu: Menu | scala.Unit
  def close(): scala.Unit
  def executeCommand(commandName: java.lang.String, params: js.Any*): scala.Unit
  def open(event: stdLib.Event): scala.Unit
}

object DropdownMenu {
  @scala.inline
  def apply(
    SEPARATOR: SeparatorObject,
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
  ): DropdownMenu = {
    val __obj = js.Dynamic.literal(SEPARATOR = SEPARATOR, addHook = addHook, callOnPluginsReady = callOnPluginsReady, clearHooks = clearHooks, close = close, commandExecutor = commandExecutor, destroy = destroy, disablePlugin = disablePlugin, enablePlugin = enablePlugin, enabled = enabled, eventManager = eventManager, executeCommand = executeCommand, init = init, initialized = initialized, isPluginsReady = isPluginsReady, itemsFactory = itemsFactory.asInstanceOf[js.Any], menu = menu.asInstanceOf[js.Any], open = open, pluginName = pluginName, pluginsInitializedCallback = pluginsInitializedCallback, removeHook = removeHook)
  
    __obj.asInstanceOf[DropdownMenu]
  }
}

