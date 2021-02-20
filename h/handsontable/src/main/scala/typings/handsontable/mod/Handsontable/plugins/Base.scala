package typings.handsontable.mod.Handsontable.plugins

import typings.handsontable.mod._Handsontable.Core
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Base extends StObject {
  
  def addHook(name: String, callback: js.Function1[/* repeated */ js.Any, _]): Unit = js.native
  
  def callOnPluginsReady(callback: js.Function0[Unit]): Unit = js.native
  
  def clearHooks(): Unit = js.native
  
  def destroy(): Unit = js.native
  
  def disablePlugin(): Unit = js.native
  
  def enablePlugin(): Unit = js.native
  
  var enabled: Boolean = js.native
  
  var hot: Core = js.native
  
  def init(): Unit = js.native
  
  var initialized: Boolean = js.native
  
  var isPluginsReady: Boolean = js.native
  
  var pluginName: String = js.native
  
  var pluginsInitializedCallback: js.Array[_] = js.native
  
  def removeHooks(name: String): Unit = js.native
  
  def updatePlugin(): Unit = js.native
}
object Base {
  
  @scala.inline
  def apply(
    addHook: (String, js.Function1[/* repeated */ js.Any, _]) => Unit,
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
    updatePlugin: () => Unit
  ): Base = {
    val __obj = js.Dynamic.literal(addHook = js.Any.fromFunction2(addHook), callOnPluginsReady = js.Any.fromFunction1(callOnPluginsReady), clearHooks = js.Any.fromFunction0(clearHooks), destroy = js.Any.fromFunction0(destroy), disablePlugin = js.Any.fromFunction0(disablePlugin), enablePlugin = js.Any.fromFunction0(enablePlugin), enabled = enabled.asInstanceOf[js.Any], hot = hot.asInstanceOf[js.Any], init = js.Any.fromFunction0(init), initialized = initialized.asInstanceOf[js.Any], isPluginsReady = isPluginsReady.asInstanceOf[js.Any], pluginName = pluginName.asInstanceOf[js.Any], pluginsInitializedCallback = pluginsInitializedCallback.asInstanceOf[js.Any], removeHooks = js.Any.fromFunction1(removeHooks), updatePlugin = js.Any.fromFunction0(updatePlugin))
    __obj.asInstanceOf[Base]
  }
  
  @scala.inline
  implicit class BaseMutableBuilder[Self <: Base] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddHook(value: (String, js.Function1[/* repeated */ js.Any, _]) => Unit): Self = StObject.set(x, "addHook", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCallOnPluginsReady(value: js.Function0[Unit] => Unit): Self = StObject.set(x, "callOnPluginsReady", js.Any.fromFunction1(value))
    
    @scala.inline
    def setClearHooks(value: () => Unit): Self = StObject.set(x, "clearHooks", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDisablePlugin(value: () => Unit): Self = StObject.set(x, "disablePlugin", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEnablePlugin(value: () => Unit): Self = StObject.set(x, "enablePlugin", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHot(value: Core): Self = StObject.set(x, "hot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInit(value: () => Unit): Self = StObject.set(x, "init", js.Any.fromFunction0(value))
    
    @scala.inline
    def setInitialized(value: Boolean): Self = StObject.set(x, "initialized", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsPluginsReady(value: Boolean): Self = StObject.set(x, "isPluginsReady", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPluginName(value: String): Self = StObject.set(x, "pluginName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPluginsInitializedCallback(value: js.Array[_]): Self = StObject.set(x, "pluginsInitializedCallback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPluginsInitializedCallbackVarargs(value: js.Any*): Self = StObject.set(x, "pluginsInitializedCallback", js.Array(value :_*))
    
    @scala.inline
    def setRemoveHooks(value: String => Unit): Self = StObject.set(x, "removeHooks", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUpdatePlugin(value: () => Unit): Self = StObject.set(x, "updatePlugin", js.Any.fromFunction0(value))
  }
}
