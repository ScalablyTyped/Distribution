package typings.handsontable.mod.Handsontable.plugins

import typings.handsontable.mod._Handsontable.Core
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DragToScroll extends Base {
  
  var boundaries: js.Object | Unit = js.native
  
  var callback: js.Function0[Unit] | Unit = js.native
  
  def check(x: Double, y: Double): Unit = js.native
  
  def setBoundaries(boundaries: js.Object): Unit = js.native
  
  def setCallback(callback: js.Function0[Unit]): Unit = js.native
}
object DragToScroll {
  
  @scala.inline
  def apply(
    addHook: (String, js.Function1[/* repeated */ js.Any, _]) => Unit,
    boundaries: js.Object | Unit,
    callOnPluginsReady: js.Function0[Unit] => Unit,
    callback: js.Function0[Unit] | Unit,
    check: (Double, Double) => Unit,
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
    setBoundaries: js.Object => Unit,
    setCallback: js.Function0[Unit] => Unit,
    updatePlugin: () => Unit
  ): DragToScroll = {
    val __obj = js.Dynamic.literal(addHook = js.Any.fromFunction2(addHook), boundaries = boundaries.asInstanceOf[js.Any], callOnPluginsReady = js.Any.fromFunction1(callOnPluginsReady), callback = callback.asInstanceOf[js.Any], check = js.Any.fromFunction2(check), clearHooks = js.Any.fromFunction0(clearHooks), destroy = js.Any.fromFunction0(destroy), disablePlugin = js.Any.fromFunction0(disablePlugin), enablePlugin = js.Any.fromFunction0(enablePlugin), enabled = enabled.asInstanceOf[js.Any], hot = hot.asInstanceOf[js.Any], init = js.Any.fromFunction0(init), initialized = initialized.asInstanceOf[js.Any], isPluginsReady = isPluginsReady.asInstanceOf[js.Any], pluginName = pluginName.asInstanceOf[js.Any], pluginsInitializedCallback = pluginsInitializedCallback.asInstanceOf[js.Any], removeHooks = js.Any.fromFunction1(removeHooks), setBoundaries = js.Any.fromFunction1(setBoundaries), setCallback = js.Any.fromFunction1(setCallback), updatePlugin = js.Any.fromFunction0(updatePlugin))
    __obj.asInstanceOf[DragToScroll]
  }
  
  @scala.inline
  implicit class DragToScrollOps[Self <: DragToScroll] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBoundaries(value: js.Object | Unit): Self = this.set("boundaries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCallbackFunction0(value: () => Unit): Self = this.set("callback", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCallback(value: js.Function0[Unit] | Unit): Self = this.set("callback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheck(value: (Double, Double) => Unit): Self = this.set("check", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetBoundaries(value: js.Object => Unit): Self = this.set("setBoundaries", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetCallback(value: js.Function0[Unit] => Unit): Self = this.set("setCallback", js.Any.fromFunction1(value))
  }
}
