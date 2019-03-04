package typings
package handsontableLib.handsontableMod.HandsontableNs.cellTypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Checkbox extends js.Object {
  var editor: handsontableLib.handsontableMod.HandsontableNs.underscoreEditorsNs.Checkbox
  var renderer: handsontableLib.handsontableMod.HandsontableNs.renderersNs.Checkbox
}

object Checkbox {
  @scala.inline
  def apply(
    editor: handsontableLib.handsontableMod.HandsontableNs.underscoreEditorsNs.Checkbox,
    renderer: handsontableLib.handsontableMod.HandsontableNs.renderersNs.Checkbox
  ): Checkbox = {
    val __obj = js.Dynamic.literal(editor = editor, renderer = renderer)
  
    __obj.asInstanceOf[Checkbox]
  }
}

