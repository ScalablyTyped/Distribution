package typings
package handsontableLib.handsontableMod.HandsontableNs.cellTypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Handsontable extends js.Object {
  var editor: handsontableLib.handsontableMod.HandsontableNs.underscoreEditorsNs.Handsontable
  var renderer: handsontableLib.handsontableMod.HandsontableNs.renderersNs.Autocomplete
}

object Handsontable {
  @scala.inline
  def apply(
    editor: handsontableLib.handsontableMod.HandsontableNs.underscoreEditorsNs.Handsontable,
    renderer: handsontableLib.handsontableMod.HandsontableNs.renderersNs.Autocomplete
  ): Handsontable = {
    val __obj = js.Dynamic.literal(editor = editor, renderer = renderer)
  
    __obj.asInstanceOf[Handsontable]
  }
}

