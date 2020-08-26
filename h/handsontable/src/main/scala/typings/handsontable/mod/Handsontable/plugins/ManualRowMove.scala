package typings.handsontable.mod.Handsontable.plugins

import typings.handsontable.mod.Handsontable.plugins.moveUI.BacklightUI
import typings.handsontable.mod.Handsontable.plugins.moveUI.GuidelineUI
import typings.handsontable.mod._Handsontable.Core
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ManualRowMove extends Base {
  var backlight: BacklightUI = js.native
  var eventManager: EventManager = js.native
  var guideline: GuidelineUI = js.native
  var removedRows: js.Array[_] = js.native
  var rowsMapper: MoveRowsMapper = js.native
  def moveRow(row: Double, target: Double): Unit = js.native
  def moveRows(rows: js.Array[Double], target: Double): Unit = js.native
}

object ManualRowMove {
  @scala.inline
  def apply(
    addHook: (String, js.Function1[/* repeated */ js.Any, _]) => Unit,
    backlight: BacklightUI,
    callOnPluginsReady: js.Function0[Unit] => Unit,
    clearHooks: () => Unit,
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
    moveRow: (Double, Double) => Unit,
    moveRows: (js.Array[Double], Double) => Unit,
    pluginName: String,
    pluginsInitializedCallback: js.Array[_],
    removeHooks: String => Unit,
    removedRows: js.Array[_],
    rowsMapper: MoveRowsMapper,
    t: RecordTranslator,
    updatePlugin: () => Unit
  ): ManualRowMove = {
    val __obj = js.Dynamic.literal(addHook = js.Any.fromFunction2(addHook), backlight = backlight.asInstanceOf[js.Any], callOnPluginsReady = js.Any.fromFunction1(callOnPluginsReady), clearHooks = js.Any.fromFunction0(clearHooks), destroy = js.Any.fromFunction0(destroy), disablePlugin = js.Any.fromFunction0(disablePlugin), enablePlugin = js.Any.fromFunction0(enablePlugin), enabled = enabled.asInstanceOf[js.Any], eventManager = eventManager.asInstanceOf[js.Any], guideline = guideline.asInstanceOf[js.Any], hot = hot.asInstanceOf[js.Any], init = js.Any.fromFunction0(init), initialized = initialized.asInstanceOf[js.Any], isPluginsReady = isPluginsReady.asInstanceOf[js.Any], moveRow = js.Any.fromFunction2(moveRow), moveRows = js.Any.fromFunction2(moveRows), pluginName = pluginName.asInstanceOf[js.Any], pluginsInitializedCallback = pluginsInitializedCallback.asInstanceOf[js.Any], removeHooks = js.Any.fromFunction1(removeHooks), removedRows = removedRows.asInstanceOf[js.Any], rowsMapper = rowsMapper.asInstanceOf[js.Any], t = t.asInstanceOf[js.Any], updatePlugin = js.Any.fromFunction0(updatePlugin))
    __obj.asInstanceOf[ManualRowMove]
  }
  @scala.inline
  implicit class ManualRowMoveOps[Self <: ManualRowMove] (val x: Self) extends AnyVal {
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
    def setEventManager(value: EventManager): Self = this.set("eventManager", value.asInstanceOf[js.Any])
    @scala.inline
    def setGuideline(value: GuidelineUI): Self = this.set("guideline", value.asInstanceOf[js.Any])
    @scala.inline
    def setMoveRow(value: (Double, Double) => Unit): Self = this.set("moveRow", js.Any.fromFunction2(value))
    @scala.inline
    def setMoveRows(value: (js.Array[Double], Double) => Unit): Self = this.set("moveRows", js.Any.fromFunction2(value))
    @scala.inline
    def setRemovedRowsVarargs(value: js.Any*): Self = this.set("removedRows", js.Array(value :_*))
    @scala.inline
    def setRemovedRows(value: js.Array[_]): Self = this.set("removedRows", value.asInstanceOf[js.Any])
    @scala.inline
    def setRowsMapper(value: MoveRowsMapper): Self = this.set("rowsMapper", value.asInstanceOf[js.Any])
  }
  
}

