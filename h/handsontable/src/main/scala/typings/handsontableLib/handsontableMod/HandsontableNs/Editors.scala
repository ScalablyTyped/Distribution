package typings
package handsontableLib.handsontableMod.HandsontableNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Editors extends js.Object {
  var AutocompleteEditor: ScalablyTyped.runtime.Instantiable0[handsontableLib.handsontableMod.HandsontableNs.underscoreEditorsNs.Autocomplete]
  var BaseEditor: ScalablyTyped.runtime.Instantiable6[
    /* hotInstance */ handsontableLib.handsontableMod.underscoreHandsontableNs.Core, 
    /* row */ scala.Double, 
    /* col */ scala.Double, 
    /* prop */ java.lang.String | scala.Double, 
    /* TD */ stdLib.HTMLElement, 
    /* cellProperties */ GridSettings, 
    handsontableLib.handsontableMod.HandsontableNs.underscoreEditorsNs.Base
  ]
  var CheckboxEditor: ScalablyTyped.runtime.Instantiable0[handsontableLib.handsontableMod.HandsontableNs.underscoreEditorsNs.Checkbox]
  var DateEditor: ScalablyTyped.runtime.Instantiable0[handsontableLib.handsontableMod.HandsontableNs.underscoreEditorsNs.Date]
  var DropdownEditor: ScalablyTyped.runtime.Instantiable0[handsontableLib.handsontableMod.HandsontableNs.underscoreEditorsNs.Dropdown]
  var HandsontableEditor: ScalablyTyped.runtime.Instantiable0[handsontableLib.handsontableMod.HandsontableNs.underscoreEditorsNs.Handsontable]
  var MobileEditor: ScalablyTyped.runtime.Instantiable0[handsontableLib.handsontableMod.HandsontableNs.underscoreEditorsNs.Mobile]
  var NumericEditor: ScalablyTyped.runtime.Instantiable0[handsontableLib.handsontableMod.HandsontableNs.underscoreEditorsNs.Numeric]
  var PasswordEditor: ScalablyTyped.runtime.Instantiable0[handsontableLib.handsontableMod.HandsontableNs.underscoreEditorsNs.Password]
  var SelectEditor: ScalablyTyped.runtime.Instantiable0[handsontableLib.handsontableMod.HandsontableNs.underscoreEditorsNs.Select]
  var TextEditor: ScalablyTyped.runtime.Instantiable0[handsontableLib.handsontableMod.HandsontableNs.underscoreEditorsNs.Text]
  def getEditor(editorName: java.lang.String, hotInstance: handsontableLib.handsontableMod.Handsontable): js.Any
  def registerEditor(editorName: java.lang.String, editorClass: js.Any): scala.Unit
}

