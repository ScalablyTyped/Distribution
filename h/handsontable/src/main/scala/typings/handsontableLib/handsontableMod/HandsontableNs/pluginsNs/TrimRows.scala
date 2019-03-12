package typings
package handsontableLib.handsontableMod.HandsontableNs.pluginsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TrimRows extends Base {
  var removedRows: js.Array[_]
  var rowsMapper: TrimRowsMapper
  var trimmedRows: js.Array[_]
  def isTrimmed(row: scala.Double): scala.Boolean
  def trimRow(row: scala.Double): scala.Unit
  def trimRows(rows: js.Array[scala.Double]): scala.Unit
  def untrimAll(): scala.Unit
  def untrimRow(row: scala.Double): scala.Unit
  def untrimRows(rows: js.Array[scala.Double]): scala.Unit
}

object TrimRows {
  @scala.inline
  def apply(
    addHook: (java.lang.String, js.Function0[scala.Unit]) => scala.Unit,
    callOnPluginsReady: js.Function0[scala.Unit] => scala.Unit,
    clearHooks: () => scala.Unit,
    destroy: () => scala.Unit,
    disablePlugin: () => scala.Unit,
    enablePlugin: () => scala.Unit,
    enabled: scala.Boolean,
    init: () => scala.Unit,
    initialized: scala.Boolean,
    isPluginsReady: scala.Boolean,
    isTrimmed: scala.Double => scala.Boolean,
    pluginName: java.lang.String,
    pluginsInitializedCallback: js.Array[_],
    removeHook: java.lang.String => scala.Unit,
    removedRows: js.Array[_],
    rowsMapper: TrimRowsMapper,
    trimRow: scala.Double => scala.Unit,
    trimRows: js.Array[scala.Double] => scala.Unit,
    trimmedRows: js.Array[_],
    untrimAll: () => scala.Unit,
    untrimRow: scala.Double => scala.Unit,
    untrimRows: js.Array[scala.Double] => scala.Unit
  ): TrimRows = {
    val __obj = js.Dynamic.literal(addHook = js.Any.fromFunction2(addHook), callOnPluginsReady = js.Any.fromFunction1(callOnPluginsReady), clearHooks = js.Any.fromFunction0(clearHooks), destroy = js.Any.fromFunction0(destroy), disablePlugin = js.Any.fromFunction0(disablePlugin), enablePlugin = js.Any.fromFunction0(enablePlugin), enabled = enabled, init = js.Any.fromFunction0(init), initialized = initialized, isPluginsReady = isPluginsReady, isTrimmed = js.Any.fromFunction1(isTrimmed), pluginName = pluginName, pluginsInitializedCallback = pluginsInitializedCallback, removeHook = js.Any.fromFunction1(removeHook), removedRows = removedRows, rowsMapper = rowsMapper, trimRow = js.Any.fromFunction1(trimRow), trimRows = js.Any.fromFunction1(trimRows), trimmedRows = trimmedRows, untrimAll = js.Any.fromFunction0(untrimAll), untrimRow = js.Any.fromFunction1(untrimRow), untrimRows = js.Any.fromFunction1(untrimRows))
  
    __obj.asInstanceOf[TrimRows]
  }
}

