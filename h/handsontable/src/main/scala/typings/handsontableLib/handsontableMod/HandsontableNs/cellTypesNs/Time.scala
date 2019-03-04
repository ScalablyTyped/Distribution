package typings
package handsontableLib.handsontableMod.HandsontableNs.cellTypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Time extends js.Object {
  var editor: handsontableLib.handsontableMod.HandsontableNs.underscoreEditorsNs.Text
  var renderer: handsontableLib.handsontableMod.HandsontableNs.renderersNs.Text
  def validator(value: js.Any, callback: js.Function1[/* valid */ scala.Boolean, scala.Unit]): scala.Unit
}

object Time {
  @scala.inline
  def apply(
    editor: handsontableLib.handsontableMod.HandsontableNs.underscoreEditorsNs.Text,
    renderer: handsontableLib.handsontableMod.HandsontableNs.renderersNs.Text,
    validator: js.Function2[js.Any, js.Function1[/* valid */ scala.Boolean, scala.Unit], scala.Unit]
  ): Time = {
    val __obj = js.Dynamic.literal(editor = editor, renderer = renderer, validator = validator)
  
    __obj.asInstanceOf[Time]
  }
}

