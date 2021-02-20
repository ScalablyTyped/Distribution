package typings.handsontable.mod.Handsontable

import org.scalablytyped.runtime.Instantiable0
import typings.std.HTMLTableCellElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cellTypes {
  
  @js.native
  trait Autocomplete extends StObject {
    
    var editor: Instantiable0[typings.handsontable.mod.Handsontable._editors.Autocomplete] = js.native
    
    def renderer(
      instance: typings.handsontable.mod._Handsontable.Core,
      TD: HTMLTableCellElement,
      row: Double,
      col: Double,
      prop: String,
      value: CellValue,
      cellProperties: CellProperties
    ): HTMLTableCellElement | Unit = js.native
    def renderer(
      instance: typings.handsontable.mod._Handsontable.Core,
      TD: HTMLTableCellElement,
      row: Double,
      col: Double,
      prop: Double,
      value: CellValue,
      cellProperties: CellProperties
    ): HTMLTableCellElement | Unit = js.native
    @JSName("renderer")
    var renderer_Original: typings.handsontable.mod.Handsontable.renderers.Autocomplete = js.native
    
    def validator(value: CellValue, callback: js.Function1[/* valid */ Boolean, Unit]): Unit = js.native
    @JSName("validator")
    var validator_Original: typings.handsontable.mod.Handsontable.validators.Autocomplete = js.native
  }
  
  @js.native
  trait Checkbox extends StObject {
    
    var editor: Instantiable0[typings.handsontable.mod.Handsontable._editors.Checkbox] = js.native
    
    def renderer(
      instance: typings.handsontable.mod._Handsontable.Core,
      TD: HTMLTableCellElement,
      row: Double,
      col: Double,
      prop: String,
      value: CellValue,
      cellProperties: CellProperties
    ): HTMLTableCellElement | Unit = js.native
    def renderer(
      instance: typings.handsontable.mod._Handsontable.Core,
      TD: HTMLTableCellElement,
      row: Double,
      col: Double,
      prop: Double,
      value: CellValue,
      cellProperties: CellProperties
    ): HTMLTableCellElement | Unit = js.native
    @JSName("renderer")
    var renderer_Original: typings.handsontable.mod.Handsontable.renderers.Checkbox = js.native
  }
  
  @js.native
  trait Date extends StObject {
    
    var editor: Instantiable0[typings.handsontable.mod.Handsontable._editors.Date] = js.native
    
    def renderer(
      instance: typings.handsontable.mod._Handsontable.Core,
      TD: HTMLTableCellElement,
      row: Double,
      col: Double,
      prop: String,
      value: CellValue,
      cellProperties: CellProperties
    ): HTMLTableCellElement | Unit = js.native
    def renderer(
      instance: typings.handsontable.mod._Handsontable.Core,
      TD: HTMLTableCellElement,
      row: Double,
      col: Double,
      prop: Double,
      value: CellValue,
      cellProperties: CellProperties
    ): HTMLTableCellElement | Unit = js.native
    @JSName("renderer")
    var renderer_Original: typings.handsontable.mod.Handsontable.renderers.Autocomplete = js.native
    
    def validator(value: CellValue, callback: js.Function1[/* valid */ Boolean, Unit]): Unit = js.native
    @JSName("validator")
    var validator_Original: typings.handsontable.mod.Handsontable.validators.Date = js.native
  }
  
  @js.native
  trait Dropdown extends StObject {
    
    var editor: Instantiable0[typings.handsontable.mod.Handsontable._editors.Dropdown] = js.native
    
    def renderer(
      instance: typings.handsontable.mod._Handsontable.Core,
      TD: HTMLTableCellElement,
      row: Double,
      col: Double,
      prop: String,
      value: CellValue,
      cellProperties: CellProperties
    ): HTMLTableCellElement | Unit = js.native
    def renderer(
      instance: typings.handsontable.mod._Handsontable.Core,
      TD: HTMLTableCellElement,
      row: Double,
      col: Double,
      prop: Double,
      value: CellValue,
      cellProperties: CellProperties
    ): HTMLTableCellElement | Unit = js.native
    @JSName("renderer")
    var renderer_Original: typings.handsontable.mod.Handsontable.renderers.Autocomplete = js.native
    
    def validator(value: CellValue, callback: js.Function1[/* valid */ Boolean, Unit]): Unit = js.native
    @JSName("validator")
    var validator_Original: typings.handsontable.mod.Handsontable.validators.Autocomplete = js.native
  }
  
  @js.native
  trait Handsontable extends StObject {
    
    var editor: Instantiable0[typings.handsontable.mod.Handsontable._editors.Handsontable] = js.native
    
    def renderer(
      instance: typings.handsontable.mod._Handsontable.Core,
      TD: HTMLTableCellElement,
      row: Double,
      col: Double,
      prop: String,
      value: CellValue,
      cellProperties: CellProperties
    ): HTMLTableCellElement | Unit = js.native
    def renderer(
      instance: typings.handsontable.mod._Handsontable.Core,
      TD: HTMLTableCellElement,
      row: Double,
      col: Double,
      prop: Double,
      value: CellValue,
      cellProperties: CellProperties
    ): HTMLTableCellElement | Unit = js.native
    @JSName("renderer")
    var renderer_Original: typings.handsontable.mod.Handsontable.renderers.Autocomplete = js.native
  }
  
  @js.native
  trait Numeric extends StObject {
    
    var dataType: String = js.native
    
    var editor: Instantiable0[typings.handsontable.mod.Handsontable._editors.Numeric] = js.native
    
    def renderer(
      instance: typings.handsontable.mod._Handsontable.Core,
      TD: HTMLTableCellElement,
      row: Double,
      col: Double,
      prop: String,
      value: CellValue,
      cellProperties: CellProperties
    ): HTMLTableCellElement | Unit = js.native
    def renderer(
      instance: typings.handsontable.mod._Handsontable.Core,
      TD: HTMLTableCellElement,
      row: Double,
      col: Double,
      prop: Double,
      value: CellValue,
      cellProperties: CellProperties
    ): HTMLTableCellElement | Unit = js.native
    @JSName("renderer")
    var renderer_Original: typings.handsontable.mod.Handsontable.renderers.Numeric = js.native
    
    def validator(value: CellValue, callback: js.Function1[/* valid */ Boolean, Unit]): Unit = js.native
    @JSName("validator")
    var validator_Original: typings.handsontable.mod.Handsontable.validators.Numeric = js.native
  }
  
  @js.native
  trait Password extends StObject {
    
    var copyable: Boolean = js.native
    
    var editor: Instantiable0[typings.handsontable.mod.Handsontable._editors.Password] = js.native
    
    def renderer(
      instance: typings.handsontable.mod._Handsontable.Core,
      TD: HTMLTableCellElement,
      row: Double,
      col: Double,
      prop: String,
      value: CellValue,
      cellProperties: CellProperties
    ): HTMLTableCellElement | Unit = js.native
    def renderer(
      instance: typings.handsontable.mod._Handsontable.Core,
      TD: HTMLTableCellElement,
      row: Double,
      col: Double,
      prop: Double,
      value: CellValue,
      cellProperties: CellProperties
    ): HTMLTableCellElement | Unit = js.native
    @JSName("renderer")
    var renderer_Original: typings.handsontable.mod.Handsontable.renderers.Password = js.native
  }
  
  @js.native
  trait Text extends StObject {
    
    var editor: Instantiable0[typings.handsontable.mod.Handsontable._editors.Text] = js.native
    
    def renderer(
      instance: typings.handsontable.mod._Handsontable.Core,
      TD: HTMLTableCellElement,
      row: Double,
      col: Double,
      prop: String,
      value: CellValue,
      cellProperties: CellProperties
    ): HTMLTableCellElement | Unit = js.native
    def renderer(
      instance: typings.handsontable.mod._Handsontable.Core,
      TD: HTMLTableCellElement,
      row: Double,
      col: Double,
      prop: Double,
      value: CellValue,
      cellProperties: CellProperties
    ): HTMLTableCellElement | Unit = js.native
    @JSName("renderer")
    var renderer_Original: typings.handsontable.mod.Handsontable.renderers.Text = js.native
  }
  
  @js.native
  trait Time extends StObject {
    
    var editor: Instantiable0[typings.handsontable.mod.Handsontable._editors.Text] = js.native
    
    def renderer(
      instance: typings.handsontable.mod._Handsontable.Core,
      TD: HTMLTableCellElement,
      row: Double,
      col: Double,
      prop: String,
      value: CellValue,
      cellProperties: CellProperties
    ): HTMLTableCellElement | Unit = js.native
    def renderer(
      instance: typings.handsontable.mod._Handsontable.Core,
      TD: HTMLTableCellElement,
      row: Double,
      col: Double,
      prop: Double,
      value: CellValue,
      cellProperties: CellProperties
    ): HTMLTableCellElement | Unit = js.native
    @JSName("renderer")
    var renderer_Original: typings.handsontable.mod.Handsontable.renderers.Text = js.native
    
    def validator(value: CellValue, callback: js.Function1[/* valid */ Boolean, Unit]): Unit = js.native
    @JSName("validator")
    var validator_Original: typings.handsontable.mod.Handsontable.validators.Time = js.native
  }
}
