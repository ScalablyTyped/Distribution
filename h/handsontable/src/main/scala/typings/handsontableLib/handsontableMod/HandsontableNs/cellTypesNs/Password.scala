package typings
package handsontableLib.handsontableMod.HandsontableNs.cellTypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Password extends js.Object {
  var copyable: scala.Boolean
  var editor: handsontableLib.handsontableMod.HandsontableNs.underscoreEditorsNs.Password
  var renderer: handsontableLib.handsontableMod.HandsontableNs.renderersNs.Password
}

object Password {
  @scala.inline
  def apply(
    copyable: scala.Boolean,
    editor: handsontableLib.handsontableMod.HandsontableNs.underscoreEditorsNs.Password,
    renderer: handsontableLib.handsontableMod.HandsontableNs.renderersNs.Password
  ): Password = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("copyable")(copyable)
    __obj.updateDynamic("editor")(editor)
    __obj.updateDynamic("renderer")(renderer)
    __obj.asInstanceOf[Password]
  }
}

