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
  var HtmlRenderer: handsontableLib.handsontableMod.HandsontableNs.renderersNs.Html = js.native
  var NumericRenderer: handsontableLib.handsontableMod.HandsontableNs.renderersNs.Numeric = js.native
  var PasswordRenderer: handsontableLib.handsontableMod.HandsontableNs.renderersNs.Password = js.native
  var TextRenderer: handsontableLib.handsontableMod.HandsontableNs.renderersNs.Text = js.native
  def BaseRenderer(
    instance: handsontableLib.handsontableMod.underscoreHandsontableNs.Core,
    TD: stdLib.HTMLElement,
    row: scala.Double,
    col: scala.Double,
    prop: java.lang.String,
    value: js.Any,
    cellProperties: GridSettings
  ): stdLib.HTMLElement = js.native
  def BaseRenderer(
    instance: handsontableLib.handsontableMod.underscoreHandsontableNs.Core,
    TD: stdLib.HTMLElement,
    row: scala.Double,
    col: scala.Double,
    prop: scala.Double,
    value: js.Any,
    cellProperties: GridSettings
  ): stdLib.HTMLElement = js.native
}

