package typings
package handsontableLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Custom extends js.Object {
  var `type`: handsontableLib.handsontableLibStrings.custom
  def customFunction(
    `this`: handsontableLib.handsontableMod.HandsontableNs.pluginsNs.ColumnSummary,
    endpoint: handsontableLib.handsontableMod.HandsontableNs.pluginsNs.Endpoint
  ): scala.Double
}

object Anon_Custom {
  @scala.inline
  def apply(
    customFunction: js.Function2[
      handsontableLib.handsontableMod.HandsontableNs.pluginsNs.ColumnSummary, 
      handsontableLib.handsontableMod.HandsontableNs.pluginsNs.Endpoint, 
      scala.Double
    ],
    `type`: handsontableLib.handsontableLibStrings.custom
  ): Anon_Custom = {
    val __obj = js.Dynamic.literal(customFunction = customFunction)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_Custom]
  }
}

