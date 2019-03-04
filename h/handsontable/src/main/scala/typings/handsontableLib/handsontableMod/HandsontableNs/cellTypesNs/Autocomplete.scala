package typings
package handsontableLib.handsontableMod.HandsontableNs.cellTypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Autocomplete extends js.Object {
  var editor: handsontableLib.handsontableMod.HandsontableNs.underscoreEditorsNs.Autocomplete
  var renderer: handsontableLib.handsontableMod.HandsontableNs.renderersNs.Autocomplete
  def validator(value: js.Any, callback: js.Function1[/* valid */ scala.Boolean, scala.Unit]): scala.Unit
}

object Autocomplete {
  @scala.inline
  def apply(
    editor: handsontableLib.handsontableMod.HandsontableNs.underscoreEditorsNs.Autocomplete,
    renderer: handsontableLib.handsontableMod.HandsontableNs.renderersNs.Autocomplete,
    validator: js.Function2[js.Any, js.Function1[/* valid */ scala.Boolean, scala.Unit], scala.Unit]
  ): Autocomplete = {
    val __obj = js.Dynamic.literal(editor = editor, renderer = renderer, validator = validator)
  
    __obj.asInstanceOf[Autocomplete]
  }
}

