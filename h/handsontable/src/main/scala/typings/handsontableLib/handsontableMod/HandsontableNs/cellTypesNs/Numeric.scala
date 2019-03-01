package typings
package handsontableLib.handsontableMod.HandsontableNs.cellTypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Numeric extends js.Object {
  var dataType: java.lang.String
  var editor: handsontableLib.handsontableMod.HandsontableNs.underscoreEditorsNs.Numeric
  var renderer: handsontableLib.handsontableMod.HandsontableNs.renderersNs.Numeric
  def validator(value: js.Any, callback: js.Function1[/* valid */ scala.Boolean, scala.Unit]): scala.Unit
}

object Numeric {
  @scala.inline
  def apply(
    dataType: java.lang.String,
    editor: handsontableLib.handsontableMod.HandsontableNs.underscoreEditorsNs.Numeric,
    renderer: handsontableLib.handsontableMod.HandsontableNs.renderersNs.Numeric,
    validator: js.Function2[js.Any, js.Function1[/* valid */ scala.Boolean, scala.Unit], scala.Unit]
  ): Numeric = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("dataType")(dataType)
    __obj.updateDynamic("editor")(editor)
    __obj.updateDynamic("renderer")(renderer)
    __obj.updateDynamic("validator")(validator)
    __obj.asInstanceOf[Numeric]
  }
}

