package typings.handsontable.handsontableMod.Handsontable

import org.scalablytyped.runtime.Instantiable0
import typings.handsontable.handsontableMod.Handsontable.cellTypes.Autocomplete
import typings.handsontable.handsontableMod.Handsontable.cellTypes.Checkbox
import typings.handsontable.handsontableMod.Handsontable.cellTypes.Date
import typings.handsontable.handsontableMod.Handsontable.cellTypes.Dropdown
import typings.handsontable.handsontableMod.Handsontable.cellTypes.Numeric
import typings.handsontable.handsontableMod.Handsontable.cellTypes.Password
import typings.handsontable.handsontableMod.Handsontable.cellTypes.Text
import typings.handsontable.handsontableMod.Handsontable.cellTypes.Time
import typings.handsontable.handsontableMod._Handsontable.Core
import typings.std.HTMLTableCellElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CellTypes extends js.Object {
  var autocomplete: Autocomplete
  var checkbox: Checkbox
  var date: Date
  var dropdown: Dropdown
  var handsontable: typings.handsontable.handsontableMod.Handsontable.cellTypes.Handsontable
  var numeric: Numeric
  var password: Password
  var text: Text
  var time: Time
  def getCellType(name: String): CellTypeObject
  def registerCellType(name: String, `type`: CellTypeObject): Unit
}

object CellTypes {
  @scala.inline
  def apply(
    autocomplete: Autocomplete,
    checkbox: Checkbox,
    date: Date,
    dropdown: Dropdown,
    getCellType: String => CellTypeObject,
    handsontable: typings.handsontable.handsontableMod.Handsontable.cellTypes.Handsontable,
    numeric: Numeric,
    password: Password,
    registerCellType: (String, CellTypeObject) => Unit,
    text: Text,
    time: Time
  ): CellTypes = {
    val __obj = js.Dynamic.literal(autocomplete = autocomplete.asInstanceOf[js.Any], checkbox = checkbox.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], dropdown = dropdown.asInstanceOf[js.Any], getCellType = js.Any.fromFunction1(getCellType), handsontable = handsontable.asInstanceOf[js.Any], numeric = numeric.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], registerCellType = js.Any.fromFunction2(registerCellType), text = text.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CellTypes]
  }
}

@JSImport("handsontable", "Handsontable.cellTypes")
@js.native
object cellTypes extends js.Object {
  @js.native
  trait Autocomplete extends js.Object {
    var editor: Instantiable0[typings.handsontable.handsontableMod.Handsontable._editors.Autocomplete] = js.native
    @JSName("renderer")
    var renderer_Original: typings.handsontable.handsontableMod.Handsontable.renderers.Autocomplete = js.native
    @JSName("validator")
    var validator_Original: typings.handsontable.handsontableMod.Handsontable.validators.Autocomplete = js.native
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
    def validator(value: CellValue, callback: js.Function1[/* valid */ Boolean, Unit]): Unit = js.native
  }
  
  @js.native
  trait Checkbox extends js.Object {
    var editor: Instantiable0[typings.handsontable.handsontableMod.Handsontable._editors.Checkbox] = js.native
    @JSName("renderer")
    var renderer_Original: typings.handsontable.handsontableMod.Handsontable.renderers.Checkbox = js.native
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
  }
  
  @js.native
  trait Date extends js.Object {
    var editor: Instantiable0[typings.handsontable.handsontableMod.Handsontable._editors.Date] = js.native
    @JSName("renderer")
    var renderer_Original: typings.handsontable.handsontableMod.Handsontable.renderers.Autocomplete = js.native
    @JSName("validator")
    var validator_Original: typings.handsontable.handsontableMod.Handsontable.validators.Date = js.native
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
    def validator(value: CellValue, callback: js.Function1[/* valid */ Boolean, Unit]): Unit = js.native
  }
  
  @js.native
  trait Dropdown extends js.Object {
    var editor: Instantiable0[typings.handsontable.handsontableMod.Handsontable._editors.Dropdown] = js.native
    @JSName("renderer")
    var renderer_Original: typings.handsontable.handsontableMod.Handsontable.renderers.Autocomplete = js.native
    @JSName("validator")
    var validator_Original: typings.handsontable.handsontableMod.Handsontable.validators.Autocomplete = js.native
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
    def validator(value: CellValue, callback: js.Function1[/* valid */ Boolean, Unit]): Unit = js.native
  }
  
  @js.native
  trait Handsontable extends js.Object {
    var editor: Instantiable0[typings.handsontable.handsontableMod.Handsontable._editors.Handsontable] = js.native
    @JSName("renderer")
    var renderer_Original: typings.handsontable.handsontableMod.Handsontable.renderers.Autocomplete = js.native
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
  }
  
  @js.native
  trait Numeric extends js.Object {
    var dataType: String = js.native
    var editor: Instantiable0[typings.handsontable.handsontableMod.Handsontable._editors.Numeric] = js.native
    @JSName("renderer")
    var renderer_Original: typings.handsontable.handsontableMod.Handsontable.renderers.Numeric = js.native
    @JSName("validator")
    var validator_Original: typings.handsontable.handsontableMod.Handsontable.validators.Numeric = js.native
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
    def validator(value: CellValue, callback: js.Function1[/* valid */ Boolean, Unit]): Unit = js.native
  }
  
  @js.native
  trait Password extends js.Object {
    var copyable: Boolean = js.native
    var editor: Instantiable0[typings.handsontable.handsontableMod.Handsontable._editors.Password] = js.native
    @JSName("renderer")
    var renderer_Original: typings.handsontable.handsontableMod.Handsontable.renderers.Password = js.native
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
  }
  
  @js.native
  trait Text extends js.Object {
    var editor: Instantiable0[typings.handsontable.handsontableMod.Handsontable._editors.Text] = js.native
    @JSName("renderer")
    var renderer_Original: typings.handsontable.handsontableMod.Handsontable.renderers.Text = js.native
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
  }
  
  @js.native
  trait Time extends js.Object {
    var editor: Instantiable0[typings.handsontable.handsontableMod.Handsontable._editors.Text] = js.native
    @JSName("renderer")
    var renderer_Original: typings.handsontable.handsontableMod.Handsontable.renderers.Text = js.native
    @JSName("validator")
    var validator_Original: typings.handsontable.handsontableMod.Handsontable.validators.Time = js.native
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
    def validator(value: CellValue, callback: js.Function1[/* valid */ Boolean, Unit]): Unit = js.native
  }
  
}

