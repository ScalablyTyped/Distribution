package typings.handsontable.mod.Handsontable.plugins

import typings.handsontable.mod._Handsontable.Core
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Base extends js.Object {
  var enabled: Boolean = js.native
  var hot: Core = js.native
  var initialized: Boolean = js.native
  var isPluginsReady: Boolean = js.native
  var pluginName: String = js.native
  var pluginsInitializedCallback: js.Array[_] = js.native
  var t: RecordTranslator = js.native
  def addHook(name: String, callback: js.Function1[/* repeated */ js.Any, _]): Unit = js.native
  def callOnPluginsReady(callback: js.Function0[Unit]): Unit = js.native
  def clearHooks(): Unit = js.native
  def destroy(): Unit = js.native
  def disablePlugin(): Unit = js.native
  def enablePlugin(): Unit = js.native
  def init(): Unit = js.native
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
    t: RecordTranslator,
    updatePlugin: () => Unit
  ): Base = {
    val __obj = js.Dynamic.literal(addHook = js.Any.fromFunction2(addHook), callOnPluginsReady = js.Any.fromFunction1(callOnPluginsReady), clearHooks = js.Any.fromFunction0(clearHooks), destroy = js.Any.fromFunction0(destroy), disablePlugin = js.Any.fromFunction0(disablePlugin), enablePlugin = js.Any.fromFunction0(enablePlugin), enabled = enabled.asInstanceOf[js.Any], hot = hot.asInstanceOf[js.Any], init = js.Any.fromFunction0(init), initialized = initialized.asInstanceOf[js.Any], isPluginsReady = isPluginsReady.asInstanceOf[js.Any], pluginName = pluginName.asInstanceOf[js.Any], pluginsInitializedCallback = pluginsInitializedCallback.asInstanceOf[js.Any], removeHooks = js.Any.fromFunction1(removeHooks), t = t.asInstanceOf[js.Any], updatePlugin = js.Any.fromFunction0(updatePlugin))
    __obj.asInstanceOf[Base]
  }
  @scala.inline
  implicit class BaseOps[Self <: Base] (val x: Self) extends AnyVal {
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
    def setAddHook(value: (String, js.Function1[/* repeated */ js.Any, _]) => Unit): Self = this.set("addHook", js.Any.fromFunction2(value))
    @scala.inline
    def setCallOnPluginsReady(value: js.Function0[Unit] => Unit): Self = this.set("callOnPluginsReady", js.Any.fromFunction1(value))
    @scala.inline
    def setClearHooks(value: () => Unit): Self = this.set("clearHooks", js.Any.fromFunction0(value))
    @scala.inline
    def setDestroy(value: () => Unit): Self = this.set("destroy", js.Any.fromFunction0(value))
    @scala.inline
    def setDisablePlugin(value: () => Unit): Self = this.set("disablePlugin", js.Any.fromFunction0(value))
    @scala.inline
    def setEnablePlugin(value: () => Unit): Self = this.set("enablePlugin", js.Any.fromFunction0(value))
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setHot(value: Core): Self = this.set("hot", value.asInstanceOf[js.Any])
    @scala.inline
    def setInit(value: () => Unit): Self = this.set("init", js.Any.fromFunction0(value))
    @scala.inline
    def setInitialized(value: Boolean): Self = this.set("initialized", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsPluginsReady(value: Boolean): Self = this.set("isPluginsReady", value.asInstanceOf[js.Any])
    @scala.inline
    def setPluginName(value: String): Self = this.set("pluginName", value.asInstanceOf[js.Any])
    @scala.inline
    def setPluginsInitializedCallbackVarargs(value: js.Any*): Self = this.set("pluginsInitializedCallback", js.Array(value :_*))
    @scala.inline
    def setPluginsInitializedCallback(value: js.Array[_]): Self = this.set("pluginsInitializedCallback", value.asInstanceOf[js.Any])
    @scala.inline
    def setRemoveHooks(value: String => Unit): Self = this.set("removeHooks", js.Any.fromFunction1(value))
    @scala.inline
    def setT(value: RecordTranslator): Self = this.set("t", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpdatePlugin(value: () => Unit): Self = this.set("updatePlugin", js.Any.fromFunction0(value))
  }
  
}

