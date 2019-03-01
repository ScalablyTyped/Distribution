package typings
package handsontableLib.handsontableMod.HandsontableNs.cellTypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Text extends js.Object {
  var editor: handsontableLib.handsontableMod.HandsontableNs.underscoreEditorsNs.Text
  var renderer: handsontableLib.handsontableMod.HandsontableNs.renderersNs.Text
}

object Text {
  @scala.inline
  def apply(
    editor: handsontableLib.handsontableMod.HandsontableNs.underscoreEditorsNs.Text,
    renderer: handsontableLib.handsontableMod.HandsontableNs.renderersNs.Text
  ): Text = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("editor")(editor)
    __obj.updateDynamic("renderer")(renderer)
    __obj.asInstanceOf[Text]
  }
}

