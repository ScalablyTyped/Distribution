package typings.handsontable.handsontableMod.Handsontable.plugins

import typings.handsontable.handsontableMod.Handsontable.plugins.moveUI.BacklightUI
import typings.handsontable.handsontableMod.Handsontable.plugins.moveUI.GuidelineUI
import typings.handsontable.handsontableMod._Handsontable.Core
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ManualRowMove extends BasePlugin {
  var backlight: BacklightUI
  var eventManager: typings.handsontable.handsontableMod.Handsontable.plugins.EventManager
  var guideline: GuidelineUI
  var removedRows: js.Array[_]
  var rowsMapper: MoveRowsMapper
  def moveRow(row: Double, target: Double): Unit
  def moveRows(rows: js.Array[Double], target: Double): Unit
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
    eventManager: typings.handsontable.handsontableMod.Handsontable.plugins.EventManager,
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
    val __obj = js.Dynamic.literal(addHook = js.Any.fromFunction2(addHook), backlight = backlight, callOnPluginsReady = js.Any.fromFunction1(callOnPluginsReady), clearHooks = js.Any.fromFunction0(clearHooks), destroy = js.Any.fromFunction0(destroy), disablePlugin = js.Any.fromFunction0(disablePlugin), enablePlugin = js.Any.fromFunction0(enablePlugin), enabled = enabled, eventManager = eventManager, guideline = guideline, hot = hot, init = js.Any.fromFunction0(init), initialized = initialized, isPluginsReady = isPluginsReady, moveRow = js.Any.fromFunction2(moveRow), moveRows = js.Any.fromFunction2(moveRows), pluginName = pluginName, pluginsInitializedCallback = pluginsInitializedCallback, removeHooks = js.Any.fromFunction1(removeHooks), removedRows = removedRows, rowsMapper = rowsMapper, t = t, updatePlugin = js.Any.fromFunction0(updatePlugin))
  
    __obj.asInstanceOf[ManualRowMove]
  }
}

