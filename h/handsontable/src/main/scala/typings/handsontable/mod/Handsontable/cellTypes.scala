package typings.handsontable.mod.Handsontable

import org.scalablytyped.runtime.Instantiable0
import typings.handsontable.mod._Handsontable.Core
import typings.std.HTMLTableCellElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("handsontable", "Handsontable.cellTypes")
@js.native
object cellTypes extends js.Object {
  @js.native
  trait Autocomplete extends js.Object {
    var editor: Instantiable0[typings.handsontable.mod.Handsontable._editors.Autocomplete] = js.native
    @JSName("renderer")
    var renderer_Original: typings.handsontable.mod.Handsontable.renderers.Autocomplete = js.native
    @JSName("validator")
    var validator_Original: typings.handsontable.mod.Handsontable.validators.Autocomplete = js.native
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
    var editor: Instantiable0[typings.handsontable.mod.Handsontable._editors.Checkbox] = js.native
    @JSName("renderer")
    var renderer_Original: typings.handsontable.mod.Handsontable.renderers.Checkbox = js.native
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
    var editor: Instantiable0[typings.handsontable.mod.Handsontable._editors.Date] = js.native
    @JSName("renderer")
    var renderer_Original: typings.handsontable.mod.Handsontable.renderers.Autocomplete = js.native
    @JSName("validator")
    var validator_Original: typings.handsontable.mod.Handsontable.validators.Date = js.native
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
    var editor: Instantiable0[typings.handsontable.mod.Handsontable._editors.Dropdown] = js.native
    @JSName("renderer")
    var renderer_Original: typings.handsontable.mod.Handsontable.renderers.Autocomplete = js.native
    @JSName("validator")
    var validator_Original: typings.handsontable.mod.Handsontable.validators.Autocomplete = js.native
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
    var editor: Instantiable0[typings.handsontable.mod.Handsontable._editors.Handsontable] = js.native
    @JSName("renderer")
    var renderer_Original: typings.handsontable.mod.Handsontable.renderers.Autocomplete = js.native
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
    var editor: Instantiable0[typings.handsontable.mod.Handsontable._editors.Numeric] = js.native
    @JSName("renderer")
    var renderer_Original: typings.handsontable.mod.Handsontable.renderers.Numeric = js.native
    @JSName("validator")
    var validator_Original: typings.handsontable.mod.Handsontable.validators.Numeric = js.native
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
    var editor: Instantiable0[typings.handsontable.mod.Handsontable._editors.Password] = js.native
    @JSName("renderer")
    var renderer_Original: typings.handsontable.mod.Handsontable.renderers.Password = js.native
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
    var editor: Instantiable0[typings.handsontable.mod.Handsontable._editors.Text] = js.native
    @JSName("renderer")
    var renderer_Original: typings.handsontable.mod.Handsontable.renderers.Text = js.native
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
    var editor: Instantiable0[typings.handsontable.mod.Handsontable._editors.Text] = js.native
    @JSName("renderer")
    var renderer_Original: typings.handsontable.mod.Handsontable.renderers.Text = js.native
    @JSName("validator")
    var validator_Original: typings.handsontable.mod.Handsontable.validators.Time = js.native
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

