package typings
package handsontableLib.handsontableMod.HandsontableNs.cellTypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Numeric extends js.Object {
  var dataType: java.lang.String = js.native
  var editor: org.scalablytyped.runtime.Instantiable0[handsontableLib.handsontableMod.HandsontableNs.underscoreEditorsNs.Numeric] = js.native
  @JSName("renderer")
  var renderer_Original: handsontableLib.handsontableMod.HandsontableNs.renderersNs.Numeric = js.native
  @JSName("validator")
  var validator_Original: handsontableLib.handsontableMod.HandsontableNs.validatorsNs.Numeric = js.native
  def renderer(
    instance: handsontableLib.handsontableMod.underscoreHandsontableNs.Core,
    TD: stdLib.HTMLTableCellElement,
    row: scala.Double,
    col: scala.Double,
    prop: java.lang.String,
    value: handsontableLib.handsontableMod.HandsontableNs.CellValue,
    cellProperties: handsontableLib.handsontableMod.HandsontableNs.CellProperties
  ): stdLib.HTMLTableCellElement | scala.Unit = js.native
  def renderer(
    instance: handsontableLib.handsontableMod.underscoreHandsontableNs.Core,
    TD: stdLib.HTMLTableCellElement,
    row: scala.Double,
    col: scala.Double,
    prop: scala.Double,
    value: handsontableLib.handsontableMod.HandsontableNs.CellValue,
    cellProperties: handsontableLib.handsontableMod.HandsontableNs.CellProperties
  ): stdLib.HTMLTableCellElement | scala.Unit = js.native
  def validator(
    `this`: handsontableLib.handsontableMod.HandsontableNs.CellProperties,
    value: handsontableLib.handsontableMod.HandsontableNs.CellValue,
    callback: js.Function1[/* valid */ scala.Boolean, scala.Unit]
  ): scala.Unit = js.native
}

