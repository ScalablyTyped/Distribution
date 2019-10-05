package typings.handsontable.handsontableMod.default

import typings.handsontable.handsontableMod.Handsontable.CellProperties
import typings.handsontable.handsontableMod._Handsontable.Core
import typings.std.HTMLTableCellElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The "_editor" namespace is named to avoid circular reference conflict with "Handsontable.editors" namespace.
  * The other namespaces (renderers, validators, etc) don't need this because they don't expose values (classes), just types (interfaces).
  * Note that TS will think it can use the values defined here, ex `new Handsontable._editors.Base()` compiles, but this is wrong.
  * TODO: This would be better solved by moving all types outside the exported namespaces. (Separate type definition from type publication.)
  */
@JSImport("handsontable", "_editors")
@js.native
object _editors extends js.Object {
  @js.native
  class Autocomplete ()
    extends typings.handsontable.handsontableMod.Handsontable._editors.Autocomplete
  
  @js.native
  abstract class Base protected ()
    extends typings.handsontable.handsontableMod.Handsontable._editors.Base {
    def this(
      hotInstance: Core,
      row: Double,
      col: Double,
      prop: String,
      TD: HTMLTableCellElement,
      cellProperties: CellProperties
    ) = this()
    def this(
      hotInstance: Core,
      row: Double,
      col: Double,
      prop: Double,
      TD: HTMLTableCellElement,
      cellProperties: CellProperties
    ) = this()
  }
  
  @js.native
  class Checkbox ()
    extends typings.handsontable.handsontableMod.Handsontable._editors.Checkbox
  
  @js.native
  class Date ()
    extends typings.handsontable.handsontableMod.Handsontable._editors.Date
  
  @js.native
  class Dropdown ()
    extends typings.handsontable.handsontableMod.Handsontable._editors.Dropdown
  
  @js.native
  class Handsontable ()
    extends typings.handsontable.handsontableMod.Handsontable._editors.Handsontable
  
  @js.native
  class Mobile ()
    extends typings.handsontable.handsontableMod.Handsontable._editors.Mobile
  
  @js.native
  class Numeric ()
    extends typings.handsontable.handsontableMod.Handsontable._editors.Numeric
  
  @js.native
  class Password ()
    extends typings.handsontable.handsontableMod.Handsontable._editors.Password
  
  @js.native
  class Select ()
    extends typings.handsontable.handsontableMod.Handsontable._editors.Select
  
  @js.native
  class Text ()
    extends typings.handsontable.handsontableMod.Handsontable._editors.Text
  
}

