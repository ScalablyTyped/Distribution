package typings
package handsontableLib.handsontableMod.HandsontableNs.cellTypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Date extends js.Object {
  var editor: handsontableLib.handsontableMod.HandsontableNs.underscoreEditorsNs.Date
  var renderer: handsontableLib.handsontableMod.HandsontableNs.renderersNs.Autocomplete
  def validator(value: js.Any, callback: js.Function1[/* valid */ scala.Boolean, scala.Unit]): scala.Unit
}

object Date {
  @scala.inline
  def apply(
    editor: handsontableLib.handsontableMod.HandsontableNs.underscoreEditorsNs.Date,
    renderer: handsontableLib.handsontableMod.HandsontableNs.renderersNs.Autocomplete,
    validator: js.Function2[js.Any, js.Function1[/* valid */ scala.Boolean, scala.Unit], scala.Unit]
  ): Date = {
    val __obj = js.Dynamic.literal(editor = editor, renderer = renderer, validator = validator)
  
    __obj.asInstanceOf[Date]
  }
}

