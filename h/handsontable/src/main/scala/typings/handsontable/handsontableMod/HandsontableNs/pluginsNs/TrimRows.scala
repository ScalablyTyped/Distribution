package typings.handsontable.handsontableMod.HandsontableNs.pluginsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TrimRows extends Base {
  var removedRows: js.Array[_]
  var rowsMapper: TrimRowsMapper
  var trimmedRows: js.Array[_]
  def isTrimmed(row: Double): Boolean
  def trimRow(row: Double): Unit
  def trimRows(rows: js.Array[Double]): Unit
  def untrimAll(): Unit
  def untrimRow(row: Double): Unit
  def untrimRows(rows: js.Array[Double]): Unit
}

object TrimRows {
  @scala.inline
  def apply(
    addHook: (String, js.Function1[/* repeated */ js.Any, _]) => Unit,
    callOnPluginsReady: js.Function0[Unit] => Unit,
    clearHooks: () => Unit,
    destroy: () => Unit,
    disablePlugin: () => Unit,
    enablePlugin: () => Unit,
    enabled: Boolean,
    init: () => Unit,
    initialized: Boolean,
    isPluginsReady: Boolean,
    isTrimmed: Double => Boolean,
    pluginName: String,
    pluginsInitializedCallback: js.Array[_],
    removeHooks: String => Unit,
    removedRows: js.Array[_],
    rowsMapper: TrimRowsMapper,
    trimRow: Double => Unit,
    trimRows: js.Array[Double] => Unit,
    trimmedRows: js.Array[_],
    untrimAll: () => Unit,
    untrimRow: Double => Unit,
    untrimRows: js.Array[Double] => Unit
  ): TrimRows = {
    val __obj = js.Dynamic.literal(addHook = js.Any.fromFunction2(addHook), callOnPluginsReady = js.Any.fromFunction1(callOnPluginsReady), clearHooks = js.Any.fromFunction0(clearHooks), destroy = js.Any.fromFunction0(destroy), disablePlugin = js.Any.fromFunction0(disablePlugin), enablePlugin = js.Any.fromFunction0(enablePlugin), enabled = enabled, init = js.Any.fromFunction0(init), initialized = initialized, isPluginsReady = isPluginsReady, isTrimmed = js.Any.fromFunction1(isTrimmed), pluginName = pluginName, pluginsInitializedCallback = pluginsInitializedCallback, removeHooks = js.Any.fromFunction1(removeHooks), removedRows = removedRows, rowsMapper = rowsMapper, trimRow = js.Any.fromFunction1(trimRow), trimRows = js.Any.fromFunction1(trimRows), trimmedRows = trimmedRows, untrimAll = js.Any.fromFunction0(untrimAll), untrimRow = js.Any.fromFunction1(untrimRow), untrimRows = js.Any.fromFunction1(untrimRows))
  
    __obj.asInstanceOf[TrimRows]
  }
}

