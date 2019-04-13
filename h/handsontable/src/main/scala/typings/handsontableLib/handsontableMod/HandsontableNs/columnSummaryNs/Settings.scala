package typings
package handsontableLib.handsontableMod.HandsontableNs.columnSummaryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Settings extends js.Object {
  var customFunction: js.UndefOr[
    js.ThisFunction1[
      /* this */ handsontableLib.handsontableMod.HandsontableNs.pluginsNs.ColumnSummary, 
      /* endpoint */ handsontableLib.handsontableMod.HandsontableNs.pluginsNs.Endpoint, 
      scala.Double
    ]
  ] = js.native
  var destinationColumn: scala.Double = js.native
  var destinationRow: scala.Double = js.native
  var forceNumeric: js.UndefOr[scala.Boolean] = js.native
  var ranges: js.UndefOr[js.Array[js.Array[scala.Double]]] = js.native
  var readOnly: js.UndefOr[scala.Boolean] = js.native
  var reversedRowCoords: js.UndefOr[scala.Boolean] = js.native
  var roundFloat: js.UndefOr[scala.Boolean] = js.native
  var sourceColumn: js.UndefOr[scala.Double] = js.native
  var suppressDataTypeErrors: js.UndefOr[scala.Boolean] = js.native
  var `type`: js.UndefOr[
    handsontableLib.handsontableLibStrings.average | handsontableLib.handsontableLibStrings.count | handsontableLib.handsontableLibStrings.custom | handsontableLib.handsontableLibStrings.max | handsontableLib.handsontableLibStrings.min | handsontableLib.handsontableLibStrings.sum
  ] = js.native
}

