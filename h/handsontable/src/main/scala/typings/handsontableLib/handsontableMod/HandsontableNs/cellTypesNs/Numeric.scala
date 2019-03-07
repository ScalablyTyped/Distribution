package typings
package handsontableLib.handsontableMod.HandsontableNs.cellTypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Numeric extends js.Object {
  var dataType: java.lang.String
  var editor: org.scalablytyped.runtime.Instantiable0[handsontableLib.handsontableMod.HandsontableNs.underscoreEditorsNs.Numeric]
  var renderer: handsontableLib.handsontableMod.HandsontableNs.renderersNs.Numeric
  var validator: handsontableLib.handsontableMod.HandsontableNs.validatorsNs.Numeric
}

object Numeric {
  @scala.inline
  def apply(
    dataType: java.lang.String,
    editor: org.scalablytyped.runtime.Instantiable0[handsontableLib.handsontableMod.HandsontableNs.underscoreEditorsNs.Numeric],
    renderer: handsontableLib.handsontableMod.HandsontableNs.renderersNs.Numeric,
    validator: handsontableLib.handsontableMod.HandsontableNs.validatorsNs.Numeric
  ): Numeric = {
    val __obj = js.Dynamic.literal(dataType = dataType, editor = editor, renderer = renderer, validator = validator)
  
    __obj.asInstanceOf[Numeric]
  }
}

