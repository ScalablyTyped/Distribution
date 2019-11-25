package typings.handsontable.handsontableMod.Handsontable.plugins

import typings.handsontable.handsontableMod._Handsontable.Core
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DragToScroll extends Base {
  var boundaries: js.Object | Unit
  var callback: js.Function0[Unit] | Unit
  def check(x: Double, y: Double): Unit
  def setBoundaries(boundaries: js.Object): Unit
  def setCallback(callback: js.Function0[Unit]): Unit
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
    t: RecordTranslator,
    updatePlugin: () => Unit
  ): DragToScroll = {
    val __obj = js.Dynamic.literal(addHook = js.Any.fromFunction2(addHook), boundaries = boundaries.asInstanceOf[js.Any], callOnPluginsReady = js.Any.fromFunction1(callOnPluginsReady), callback = callback.asInstanceOf[js.Any], check = js.Any.fromFunction2(check), clearHooks = js.Any.fromFunction0(clearHooks), destroy = js.Any.fromFunction0(destroy), disablePlugin = js.Any.fromFunction0(disablePlugin), enablePlugin = js.Any.fromFunction0(enablePlugin), enabled = enabled.asInstanceOf[js.Any], hot = hot.asInstanceOf[js.Any], init = js.Any.fromFunction0(init), initialized = initialized.asInstanceOf[js.Any], isPluginsReady = isPluginsReady.asInstanceOf[js.Any], pluginName = pluginName.asInstanceOf[js.Any], pluginsInitializedCallback = pluginsInitializedCallback.asInstanceOf[js.Any], removeHooks = js.Any.fromFunction1(removeHooks), setBoundaries = js.Any.fromFunction1(setBoundaries), setCallback = js.Any.fromFunction1(setCallback), t = t.asInstanceOf[js.Any], updatePlugin = js.Any.fromFunction0(updatePlugin))
  
    __obj.asInstanceOf[DragToScroll]
  }
}

