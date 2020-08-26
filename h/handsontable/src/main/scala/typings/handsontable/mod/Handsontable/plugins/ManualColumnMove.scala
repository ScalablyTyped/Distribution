package typings.handsontable.mod.Handsontable.plugins

import typings.handsontable.mod.Handsontable.plugins.moveUI.BacklightUI
import typings.handsontable.mod.Handsontable.plugins.moveUI.GuidelineUI
import typings.handsontable.mod._Handsontable.Core
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ManualColumnMove extends Base {
  var backlight: BacklightUI = js.native
  var columnsMapper: MoveColumnsMapper = js.native
  var eventManager: EventManager = js.native
  var guideline: GuidelineUI = js.native
  var removedColumns: js.Array[_] = js.native
  def moveColumn(column: Double, target: Double): Unit = js.native
  def moveColumns(columns: js.Array[Double], target: Double): Unit = js.native
  def persistentStateLoad(): Unit = js.native
  def persistentStateSave(): Unit = js.native
}

object ManualColumnMove {
  @scala.inline
  def apply(
    addHook: (String, js.Function1[/* repeated */ js.Any, _]) => Unit,
    backlight: BacklightUI,
    callOnPluginsReady: js.Function0[Unit] => Unit,
    clearHooks: () => Unit,
    columnsMapper: MoveColumnsMapper,
    destroy: () => Unit,
    disablePlugin: () => Unit,
    enablePlugin: () => Unit,
    enabled: Boolean,
    eventManager: EventManager,
    guideline: GuidelineUI,
    hot: Core,
    init: () => Unit,
    initialized: Boolean,
    isPluginsReady: Boolean,
    moveColumn: (Double, Double) => Unit,
    moveColumns: (js.Array[Double], Double) => Unit,
    persistentStateLoad: () => Unit,
    persistentStateSave: () => Unit,
    pluginName: String,
    pluginsInitializedCallback: js.Array[_],
    removeHooks: String => Unit,
    removedColumns: js.Array[_],
    t: RecordTranslator,
    updatePlugin: () => Unit
  ): ManualColumnMove = {
    val __obj = js.Dynamic.literal(addHook = js.Any.fromFunction2(addHook), backlight = backlight.asInstanceOf[js.Any], callOnPluginsReady = js.Any.fromFunction1(callOnPluginsReady), clearHooks = js.Any.fromFunction0(clearHooks), columnsMapper = columnsMapper.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), disablePlugin = js.Any.fromFunction0(disablePlugin), enablePlugin = js.Any.fromFunction0(enablePlugin), enabled = enabled.asInstanceOf[js.Any], eventManager = eventManager.asInstanceOf[js.Any], guideline = guideline.asInstanceOf[js.Any], hot = hot.asInstanceOf[js.Any], init = js.Any.fromFunction0(init), initialized = initialized.asInstanceOf[js.Any], isPluginsReady = isPluginsReady.asInstanceOf[js.Any], moveColumn = js.Any.fromFunction2(moveColumn), moveColumns = js.Any.fromFunction2(moveColumns), persistentStateLoad = js.Any.fromFunction0(persistentStateLoad), persistentStateSave = js.Any.fromFunction0(persistentStateSave), pluginName = pluginName.asInstanceOf[js.Any], pluginsInitializedCallback = pluginsInitializedCallback.asInstanceOf[js.Any], removeHooks = js.Any.fromFunction1(removeHooks), removedColumns = removedColumns.asInstanceOf[js.Any], t = t.asInstanceOf[js.Any], updatePlugin = js.Any.fromFunction0(updatePlugin))
    __obj.asInstanceOf[ManualColumnMove]
  }
  @scala.inline
  implicit class ManualColumnMoveOps[Self <: ManualColumnMove] (val x: Self) extends AnyVal {
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
    def setBacklight(value: BacklightUI): Self = this.set("backlight", value.asInstanceOf[js.Any])
    @scala.inline
    def setColumnsMapper(value: MoveColumnsMapper): Self = this.set("columnsMapper", value.asInstanceOf[js.Any])
    @scala.inline
    def setEventManager(value: EventManager): Self = this.set("eventManager", value.asInstanceOf[js.Any])
    @scala.inline
    def setGuideline(value: GuidelineUI): Self = this.set("guideline", value.asInstanceOf[js.Any])
    @scala.inline
    def setMoveColumn(value: (Double, Double) => Unit): Self = this.set("moveColumn", js.Any.fromFunction2(value))
    @scala.inline
    def setMoveColumns(value: (js.Array[Double], Double) => Unit): Self = this.set("moveColumns", js.Any.fromFunction2(value))
    @scala.inline
    def setPersistentStateLoad(value: () => Unit): Self = this.set("persistentStateLoad", js.Any.fromFunction0(value))
    @scala.inline
    def setPersistentStateSave(value: () => Unit): Self = this.set("persistentStateSave", js.Any.fromFunction0(value))
    @scala.inline
    def setRemovedColumnsVarargs(value: js.Any*): Self = this.set("removedColumns", js.Array(value :_*))
    @scala.inline
    def setRemovedColumns(value: js.Array[_]): Self = this.set("removedColumns", value.asInstanceOf[js.Any])
  }
  
}

