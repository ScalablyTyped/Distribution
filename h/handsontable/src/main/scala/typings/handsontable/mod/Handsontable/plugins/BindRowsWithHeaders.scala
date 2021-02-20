package typings.handsontable.mod.Handsontable.plugins

import typings.handsontable.mod._Handsontable.Core
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BindRowsWithHeaders extends Base {
  
  var bindStrategy: BindStrategy = js.native
  
  var removeRows: js.Array[_] = js.native
}
object BindRowsWithHeaders {
  
  @scala.inline
  def apply(
    addHook: (String, js.Function1[/* repeated */ js.Any, _]) => Unit,
    bindStrategy: BindStrategy,
    callOnPluginsReady: js.Function0[Unit] => Unit,
    clearHooks: () => Unit,
    destroy: () => Unit,
    disablePlugin: () => Unit,
    enablePlugin: () => Unit,
    enabled: Boolean,
    hot: Core,
    init: () => Unit,
    initialized: Boolean,
    isPluginsReady: Boolean,
    pluginName: String,
    pluginsInitializedCallback: js.Array[_],
    removeHooks: String => Unit,
    removeRows: js.Array[_],
    updatePlugin: () => Unit
  ): BindRowsWithHeaders = {
    val __obj = js.Dynamic.literal(addHook = js.Any.fromFunction2(addHook), bindStrategy = bindStrategy.asInstanceOf[js.Any], callOnPluginsReady = js.Any.fromFunction1(callOnPluginsReady), clearHooks = js.Any.fromFunction0(clearHooks), destroy = js.Any.fromFunction0(destroy), disablePlugin = js.Any.fromFunction0(disablePlugin), enablePlugin = js.Any.fromFunction0(enablePlugin), enabled = enabled.asInstanceOf[js.Any], hot = hot.asInstanceOf[js.Any], init = js.Any.fromFunction0(init), initialized = initialized.asInstanceOf[js.Any], isPluginsReady = isPluginsReady.asInstanceOf[js.Any], pluginName = pluginName.asInstanceOf[js.Any], pluginsInitializedCallback = pluginsInitializedCallback.asInstanceOf[js.Any], removeHooks = js.Any.fromFunction1(removeHooks), removeRows = removeRows.asInstanceOf[js.Any], updatePlugin = js.Any.fromFunction0(updatePlugin))
    __obj.asInstanceOf[BindRowsWithHeaders]
  }
  
  @scala.inline
  implicit class BindRowsWithHeadersMutableBuilder[Self <: BindRowsWithHeaders] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBindStrategy(value: BindStrategy): Self = StObject.set(x, "bindStrategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveRows(value: js.Array[_]): Self = StObject.set(x, "removeRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveRowsVarargs(value: js.Any*): Self = StObject.set(x, "removeRows", js.Array(value :_*))
  }
}
