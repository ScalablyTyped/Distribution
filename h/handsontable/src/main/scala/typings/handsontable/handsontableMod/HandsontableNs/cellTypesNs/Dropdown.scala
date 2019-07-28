package typings.handsontable.handsontableMod.HandsontableNs.cellTypesNs

import org.scalablytyped.runtime.Instantiable0
import typings.handsontable.handsontableMod.HandsontableNs.CellProperties
import typings.handsontable.handsontableMod.HandsontableNs.CellValue
import typings.handsontable.handsontableMod.underscoreHandsontableNs.Core
import typings.std.HTMLTableCellElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Dropdown extends js.Object {
  var editor: Instantiable0[typings.handsontable.handsontableMod.HandsontableNs.underscoreEditorsNs.Dropdown] = js.native
  @JSName("renderer")
  var renderer_Original: typings.handsontable.handsontableMod.HandsontableNs.renderersNs.Autocomplete = js.native
  @JSName("validator")
  var validator_Original: typings.handsontable.handsontableMod.HandsontableNs.validatorsNs.Autocomplete = js.native
  def renderer(
    instance: Core,
    TD: HTMLTableCellElement,
    row: Double,
    col: Double,
    prop: String,
    value: CellValue,
    cellProperties: CellProperties
  ): HTMLTableCellElement | Unit = js.native
  def renderer(
    instance: Core,
    TD: HTMLTableCellElement,
    row: Double,
    col: Double,
    prop: Double,
    value: CellValue,
    cellProperties: CellProperties
  ): HTMLTableCellElement | Unit = js.native
  def validator(`this`: CellProperties, value: CellValue, callback: js.Function1[/* valid */ Boolean, Unit]): Unit = js.native
}

