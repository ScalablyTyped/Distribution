package typings.handsontable.mod.Handsontable.plugins

import typings.handsontable.mod._Handsontable.Core
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ManualColumnFreeze extends Base {
  var frozenColumnsBasePositions: js.Array[_]
  var manualColumnMovePlugin: ManualColumnMove
  def freezeColumn(column: Double): Unit
  def unfreezeColumn(column: Double): Unit
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
    frozenColumnsBasePositions: js.Array[_],
    hot: Core,
    init: () => Unit,
    initialized: Boolean,
    isPluginsReady: Boolean,
    manualColumnMovePlugin: ManualColumnMove,
    pluginName: String,
    pluginsInitializedCallback: js.Array[_],
    removeHooks: String => Unit,
    t: RecordTranslator,
    unfreezeColumn: Double => Unit,
    updatePlugin: () => Unit
  ): ManualColumnFreeze = {
    val __obj = js.Dynamic.literal(addHook = js.Any.fromFunction2(addHook), callOnPluginsReady = js.Any.fromFunction1(callOnPluginsReady), clearHooks = js.Any.fromFunction0(clearHooks), destroy = js.Any.fromFunction0(destroy), disablePlugin = js.Any.fromFunction0(disablePlugin), enablePlugin = js.Any.fromFunction0(enablePlugin), enabled = enabled.asInstanceOf[js.Any], freezeColumn = js.Any.fromFunction1(freezeColumn), frozenColumnsBasePositions = frozenColumnsBasePositions.asInstanceOf[js.Any], hot = hot.asInstanceOf[js.Any], init = js.Any.fromFunction0(init), initialized = initialized.asInstanceOf[js.Any], isPluginsReady = isPluginsReady.asInstanceOf[js.Any], manualColumnMovePlugin = manualColumnMovePlugin.asInstanceOf[js.Any], pluginName = pluginName.asInstanceOf[js.Any], pluginsInitializedCallback = pluginsInitializedCallback.asInstanceOf[js.Any], removeHooks = js.Any.fromFunction1(removeHooks), t = t.asInstanceOf[js.Any], unfreezeColumn = js.Any.fromFunction1(unfreezeColumn), updatePlugin = js.Any.fromFunction0(updatePlugin))
  
    __obj.asInstanceOf[ManualColumnFreeze]
  }
}

