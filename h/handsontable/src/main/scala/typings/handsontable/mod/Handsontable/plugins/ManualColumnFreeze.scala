package typings.handsontable.mod.Handsontable.plugins

import typings.handsontable.mod._Handsontable.Core
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ManualColumnFreeze extends Base {
  
  def freezeColumn(column: Double): Unit = js.native
  
  def unfreezeColumn(column: Double): Unit = js.native
}
object ManualColumnFreeze {
  
  @scala.inline
  def apply(
    addHook: (String, js.Function1[/* repeated */ js.Any, _]) => Unit,
    callOnPluginsReady: js.Function0[Unit] => Unit,
    clearHooks: () => Unit,
    destroy: () => Unit,
    disablePlugin: () => Unit,
    enablePlugin: () => Unit,
    enabled: Boolean,
    freezeColumn: Double => Unit,
    hot: Core,
    init: () => Unit,
    initialized: Boolean,
    isPluginsReady: Boolean,
    pluginName: String,
    pluginsInitializedCallback: js.Array[_],
    removeHooks: String => Unit,
    unfreezeColumn: Double => Unit,
    updatePlugin: () => Unit
  ): ManualColumnFreeze = {
    val __obj = js.Dynamic.literal(addHook = js.Any.fromFunction2(addHook), callOnPluginsReady = js.Any.fromFunction1(callOnPluginsReady), clearHooks = js.Any.fromFunction0(clearHooks), destroy = js.Any.fromFunction0(destroy), disablePlugin = js.Any.fromFunction0(disablePlugin), enablePlugin = js.Any.fromFunction0(enablePlugin), enabled = enabled.asInstanceOf[js.Any], freezeColumn = js.Any.fromFunction1(freezeColumn), hot = hot.asInstanceOf[js.Any], init = js.Any.fromFunction0(init), initialized = initialized.asInstanceOf[js.Any], isPluginsReady = isPluginsReady.asInstanceOf[js.Any], pluginName = pluginName.asInstanceOf[js.Any], pluginsInitializedCallback = pluginsInitializedCallback.asInstanceOf[js.Any], removeHooks = js.Any.fromFunction1(removeHooks), unfreezeColumn = js.Any.fromFunction1(unfreezeColumn), updatePlugin = js.Any.fromFunction0(updatePlugin))
    __obj.asInstanceOf[ManualColumnFreeze]
  }
  
  @scala.inline
  implicit class ManualColumnFreezeMutableBuilder[Self <: ManualColumnFreeze] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFreezeColumn(value: Double => Unit): Self = StObject.set(x, "freezeColumn", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUnfreezeColumn(value: Double => Unit): Self = StObject.set(x, "unfreezeColumn", js.Any.fromFunction1(value))
  }
}
