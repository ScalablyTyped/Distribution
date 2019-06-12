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
    addHook: (java.lang.String, js.Function1[/* repeated */ js.Any, _]) => scala.Unit,
    callOnPluginsReady: js.Function0[scala.Unit] => scala.Unit,
    clearHooks: () => scala.Unit,
    close: () => scala.Unit,
    commandExecutor: CommandExecutor,
    destroy: () => scala.Unit,
    disablePlugin: () => scala.Unit,
    enablePlugin: () => scala.Unit,
    enabled: scala.Boolean,
    eventManager: EventManager,
    executeCommand: (java.lang.String, /* repeated */ js.Any) => scala.Unit,
    init: () => scala.Unit,
    initialized: scala.Boolean,
    isPluginsReady: scala.Boolean,
    itemsFactory: ItemsFactory | scala.Unit,
    menu: Menu | scala.Unit,
    open: stdLib.Event => scala.Unit,
    pluginName: java.lang.String,
    pluginsInitializedCallback: js.Array[_],
    removeHooks: java.lang.String => scala.Unit
  ): ContextMenu = {
    val __obj = js.Dynamic.literal(addHook = js.Any.fromFunction2(addHook), callOnPluginsReady = js.Any.fromFunction1(callOnPluginsReady), clearHooks = js.Any.fromFunction0(clearHooks), close = js.Any.fromFunction0(close), commandExecutor = commandExecutor, destroy = js.Any.fromFunction0(destroy), disablePlugin = js.Any.fromFunction0(disablePlugin), enablePlugin = js.Any.fromFunction0(enablePlugin), enabled = enabled, eventManager = eventManager, executeCommand = js.Any.fromFunction2(executeCommand), init = js.Any.fromFunction0(init), initialized = initialized, isPluginsReady = isPluginsReady, itemsFactory = itemsFactory.asInstanceOf[js.Any], menu = menu.asInstanceOf[js.Any], open = js.Any.fromFunction1(open), pluginName = pluginName, pluginsInitializedCallback = pluginsInitializedCallback, removeHooks = js.Any.fromFunction1(removeHooks))
  
    __obj.asInstanceOf[ContextMenu]
  }
}

