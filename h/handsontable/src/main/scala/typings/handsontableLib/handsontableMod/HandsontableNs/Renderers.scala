package typings
package handsontableLib.handsontableMod.HandsontableNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Renderers extends js.Object {
  var AutocompleteRenderer: handsontableLib.handsontableMod.HandsontableNs.renderersNs.Autocomplete = js.native
  @JSName("BaseRenderer")
  var BaseRenderer_Original: handsontableLib.handsontableMod.HandsontableNs.renderersNs.Base = js.native
  var CheckboxRenderer: handsontableLib.handsontableMod.HandsontableNs.renderersNs.Checkbox = js.native
  var DateRenderer: handsontableLib.handsontableMod.HandsontableNs.renderersNs.Autocomplete = js.native
  var DropdownRenderer: handsontableLib.handsontableMod.HandsontableNs.renderersNs.Autocomplete = js.native
  var HandsontableRenderer: handsontableLib.handsontableMod.HandsontableNs.renderersNs.Autocomplete = js.native
  var HtmlRenderer: handsontableLib.handsontableMod.HandsontableNs.renderersNs.Html = js.native
  var NumericRenderer: handsontableLib.handsontableMod.HandsontableNs.renderersNs.Numeric = js.native
  var PasswordRenderer: handsontableLib.handsontableMod.HandsontableNs.renderersNs.Password = js.native
  var TextRenderer: handsontableLib.handsontableMod.HandsontableNs.renderersNs.Text = js.native
  var TimeRenderer: handsontableLib.handsontableMod.HandsontableNs.renderersNs.Text = js.native
  def BaseRenderer(
    instance: handsontableLib.handsontableMod.underscoreHandsontableNs.Core,
    TD: stdLib.HTMLTableCellElement,
    row: scala.Double,
    col: scala.Double,
    prop: java.lang.String,
    value: CellValue,
    cellProperties: CellProperties
  ): stdLib.HTMLTableCellElement | scala.Unit = js.native
  def BaseRenderer(
    instance: handsontableLib.handsontableMod.underscoreHandsontableNs.Core,
    TD: stdLib.HTMLTableCellElement,
    row: scala.Double,
    col: scala.Double,
    prop: scala.Double,
    value: CellValue,
    cellProperties: CellProperties
  ): stdLib.HTMLTableCellElement | scala.Unit = js.native
  def getRenderer(name: java.lang.String): handsontableLib.handsontableMod.HandsontableNs.renderersNs.Base = js.native
  def registerRenderer(name: java.lang.String, renderer: handsontableLib.handsontableMod.HandsontableNs.renderersNs.Base): scala.Unit = js.native
}

