package typings
package handsontableLib.handsontableMod.HandsontableNs.cellTypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Handsontable extends js.Object {
  var editor: org.scalablytyped.runtime.Instantiable0[handsontableLib.handsontableMod.HandsontableNs.underscoreEditorsNs.Handsontable] = js.native
  @JSName("renderer")
  var renderer_Original: handsontableLib.handsontableMod.HandsontableNs.renderersNs.Autocomplete = js.native
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
}

