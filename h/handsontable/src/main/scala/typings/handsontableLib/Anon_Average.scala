package typings
package handsontableLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Average extends js.Object {
  var `type`: handsontableLib.handsontableLibStrings.sum | handsontableLib.handsontableLibStrings.min | handsontableLib.handsontableLibStrings.max | handsontableLib.handsontableLibStrings.count | handsontableLib.handsontableLibStrings.average
}

object Anon_Average {
  @scala.inline
  def apply(
    `type`: handsontableLib.handsontableLibStrings.sum | handsontableLib.handsontableLibStrings.min | handsontableLib.handsontableLibStrings.max | handsontableLib.handsontableLibStrings.count | handsontableLib.handsontableLibStrings.average
  ): Anon_Average = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Average]
  }
}

