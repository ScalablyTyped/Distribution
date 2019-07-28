package typings.handsontable.handsontableMod.HandsontableNs.pluginsNs

import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContextMenu extends Base {
  var commandExecutor: CommandExecutor
  var eventManager: typings.handsontable.handsontableMod.HandsontableNs.pluginsNs.EventManager
  var itemsFactory: ItemsFactory | Unit
  var menu: Menu | Unit
  def close(): Unit
  def executeCommand(commandName: String, params: js.Any*): Unit
  def open(event: Event): Unit
}

object ContextMenu {
  @scala.inline
  def apply(
    addHook: (String, js.Function1[/* repeated */ js.Any, _]) => Unit,
    callOnPluginsReady: js.Function0[Unit] => Unit,
    clearHooks: () => Unit,
    close: () => Unit,
    commandExecutor: CommandExecutor,
    destroy: () => Unit,
    disablePlugin: () => Unit,
    enablePlugin: () => Unit,
    enabled: Boolean,
    eventManager: typings.handsontable.handsontableMod.HandsontableNs.pluginsNs.EventManager,
    executeCommand: (String, /* repeated */ js.Any) => Unit,
    init: () => Unit,
    initialized: Boolean,
    isPluginsReady: Boolean,
    itemsFactory: ItemsFactory | Unit,
    menu: Menu | Unit,
    open: Event => Unit,
    pluginName: String,
    pluginsInitializedCallback: js.Array[_],
    removeHooks: String => Unit
  ): ContextMenu = {
    val __obj = js.Dynamic.literal(addHook = js.Any.fromFunction2(addHook), callOnPluginsReady = js.Any.fromFunction1(callOnPluginsReady), clearHooks = js.Any.fromFunction0(clearHooks), close = js.Any.fromFunction0(close), commandExecutor = commandExecutor, destroy = js.Any.fromFunction0(destroy), disablePlugin = js.Any.fromFunction0(disablePlugin), enablePlugin = js.Any.fromFunction0(enablePlugin), enabled = enabled, eventManager = eventManager, executeCommand = js.Any.fromFunction2(executeCommand), init = js.Any.fromFunction0(init), initialized = initialized, isPluginsReady = isPluginsReady, itemsFactory = itemsFactory.asInstanceOf[js.Any], menu = menu.asInstanceOf[js.Any], open = js.Any.fromFunction1(open), pluginName = pluginName, pluginsInitializedCallback = pluginsInitializedCallback, removeHooks = js.Any.fromFunction1(removeHooks))
  
    __obj.asInstanceOf[ContextMenu]
  }
}

