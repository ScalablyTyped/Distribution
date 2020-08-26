package typings.handsontable.mod.Handsontable.plugins

import typings.handsontable.mod._Handsontable.Core
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ManualColumnFreeze extends Base {
  var frozenColumnsBasePositions: js.Array[_] = js.native
  var manualColumnMovePlugin: ManualColumnMove = js.native
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
  @scala.inline
  implicit class ManualColumnFreezeOps[Self <: ManualColumnFreeze] (val x: Self) extends AnyVal {
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
    def setFreezeColumn(value: Double => Unit): Self = this.set("freezeColumn", js.Any.fromFunction1(value))
    @scala.inline
    def setFrozenColumnsBasePositionsVarargs(value: js.Any*): Self = this.set("frozenColumnsBasePositions", js.Array(value :_*))
    @scala.inline
    def setFrozenColumnsBasePositions(value: js.Array[_]): Self = this.set("frozenColumnsBasePositions", value.asInstanceOf[js.Any])
    @scala.inline
    def setManualColumnMovePlugin(value: ManualColumnMove): Self = this.set("manualColumnMovePlugin", value.asInstanceOf[js.Any])
    @scala.inline
    def setUnfreezeColumn(value: Double => Unit): Self = this.set("unfreezeColumn", js.Any.fromFunction1(value))
  }
  
}

