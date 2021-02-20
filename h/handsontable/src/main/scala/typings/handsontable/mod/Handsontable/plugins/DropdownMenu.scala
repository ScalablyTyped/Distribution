package typings.handsontable.mod.Handsontable.plugins

import typings.handsontable.mod._Handsontable.Core
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DropdownMenu extends Base {
  
  var SEPARATOR: SeparatorObject = js.native
  
  def close(): Unit = js.native
  
  var commandExecutor: CommandExecutor = js.native
  
  var eventManager: EventManager = js.native
  
  def executeCommand(commandName: String, params: js.Any*): Unit = js.native
  
  var itemsFactory: ItemsFactory | Unit = js.native
  
  var menu: Menu | Unit = js.native
  
  def open(event: Event): Unit = js.native
}
object DropdownMenu {
  
  @scala.inline
  def apply(
    SEPARATOR: SeparatorObject,
    addHook: (String, js.Function1[/* repeated */ js.Any, _]) => Unit,
    callOnPluginsReady: js.Function0[Unit] => Unit,
    clearHooks: () => Unit,
    close: () => Unit,
    commandExecutor: CommandExecutor,
    destroy: () => Unit,
    disablePlugin: () => Unit,
    enablePlugin: () => Unit,
    enabled: Boolean,
    eventManager: EventManager,
    executeCommand: (String, /* repeated */ js.Any) => Unit,
    hot: Core,
    init: () => Unit,
    initialized: Boolean,
    isPluginsReady: Boolean,
    itemsFactory: ItemsFactory | Unit,
    menu: Menu | Unit,
    open: Event => Unit,
    pluginName: String,
    pluginsInitializedCallback: js.Array[_],
    removeHooks: String => Unit,
    updatePlugin: () => Unit
  ): DropdownMenu = {
    val __obj = js.Dynamic.literal(SEPARATOR = SEPARATOR.asInstanceOf[js.Any], addHook = js.Any.fromFunction2(addHook), callOnPluginsReady = js.Any.fromFunction1(callOnPluginsReady), clearHooks = js.Any.fromFunction0(clearHooks), close = js.Any.fromFunction0(close), commandExecutor = commandExecutor.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), disablePlugin = js.Any.fromFunction0(disablePlugin), enablePlugin = js.Any.fromFunction0(enablePlugin), enabled = enabled.asInstanceOf[js.Any], eventManager = eventManager.asInstanceOf[js.Any], executeCommand = js.Any.fromFunction2(executeCommand), hot = hot.asInstanceOf[js.Any], init = js.Any.fromFunction0(init), initialized = initialized.asInstanceOf[js.Any], isPluginsReady = isPluginsReady.asInstanceOf[js.Any], itemsFactory = itemsFactory.asInstanceOf[js.Any], menu = menu.asInstanceOf[js.Any], open = js.Any.fromFunction1(open), pluginName = pluginName.asInstanceOf[js.Any], pluginsInitializedCallback = pluginsInitializedCallback.asInstanceOf[js.Any], removeHooks = js.Any.fromFunction1(removeHooks), updatePlugin = js.Any.fromFunction0(updatePlugin))
    __obj.asInstanceOf[DropdownMenu]
  }
  
  @scala.inline
  implicit class DropdownMenuMutableBuilder[Self <: DropdownMenu] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCommandExecutor(value: CommandExecutor): Self = StObject.set(x, "commandExecutor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventManager(value: EventManager): Self = StObject.set(x, "eventManager", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecuteCommand(value: (String, /* repeated */ js.Any) => Unit): Self = StObject.set(x, "executeCommand", js.Any.fromFunction2(value))
    
    @scala.inline
    def setItemsFactory(value: ItemsFactory | Unit): Self = StObject.set(x, "itemsFactory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMenu(value: Menu | Unit): Self = StObject.set(x, "menu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpen(value: Event => Unit): Self = StObject.set(x, "open", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSEPARATOR(value: SeparatorObject): Self = StObject.set(x, "SEPARATOR", value.asInstanceOf[js.Any])
  }
}
