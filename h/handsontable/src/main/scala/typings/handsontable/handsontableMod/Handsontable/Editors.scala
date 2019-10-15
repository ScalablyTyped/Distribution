package typings.handsontable.handsontableMod.Handsontable

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable6
import typings.handsontable.handsontableMod.Handsontable._editors.Autocomplete
import typings.handsontable.handsontableMod.Handsontable._editors.BaseEditor
import typings.handsontable.handsontableMod.Handsontable._editors.Checkbox
import typings.handsontable.handsontableMod.Handsontable._editors.Date
import typings.handsontable.handsontableMod.Handsontable._editors.Dropdown
import typings.handsontable.handsontableMod.Handsontable._editors.Mobile
import typings.handsontable.handsontableMod.Handsontable._editors.Numeric
import typings.handsontable.handsontableMod.Handsontable._editors.Password
import typings.handsontable.handsontableMod.Handsontable._editors.Select
import typings.handsontable.handsontableMod.Handsontable._editors.Text
import typings.handsontable.handsontableMod._Handsontable.Core
import typings.std.HTMLTableCellElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Editors extends js.Object {
  var AutocompleteEditor: Instantiable0[Autocomplete]
  var BaseEditor: Instantiable6[
    /* hotInstance */ Core, 
    /* row */ Double, 
    /* col */ Double, 
    /* prop */ String | Double, 
    /* TD */ HTMLTableCellElement, 
    /* cellProperties */ CellProperties, 
    typings.handsontable.handsontableMod.Handsontable._editors.BaseEditor
  ]
  var CheckboxEditor: Instantiable0[Checkbox]
  var DateEditor: Instantiable0[Date]
  var DropdownEditor: Instantiable0[Dropdown]
  var HandsontableEditor: Instantiable0[typings.handsontable.handsontableMod.Handsontable._editors.Handsontable]
  var MobileEditor: Instantiable0[Mobile]
  var NumericEditor: Instantiable0[Numeric]
  var PasswordEditor: Instantiable0[Password]
  var SelectEditor: Instantiable0[Select]
  var TextEditor: Instantiable0[Text]
  var TimeEditor: Instantiable0[Text]
  def getEditor(editorName: String): Instantiable6[
    /* hotInstance */ Core, 
    /* row */ Double, 
    /* col */ Double, 
    /* prop */ String | Double, 
    /* TD */ HTMLTableCellElement, 
    /* cellProperties */ CellProperties, 
    BaseEditor
  ]
  def registerEditor(
    editorName: String,
    editorClass: Instantiable6[
      /* hotInstance */ Core, 
      /* row */ Double, 
      /* col */ Double, 
      /* prop */ String | Double, 
      /* TD */ HTMLTableCellElement, 
      /* cellProperties */ CellProperties, 
      BaseEditor
    ]
  ): Unit
}

object Editors {
  @scala.inline
  def apply(
    AutocompleteEditor: Instantiable0[Autocomplete],
    BaseEditor: Instantiable6[
      /* hotInstance */ Core, 
      /* row */ Double, 
      /* col */ Double, 
      /* prop */ String | Double, 
      /* TD */ HTMLTableCellElement, 
      /* cellProperties */ CellProperties, 
      BaseEditor
    ],
    CheckboxEditor: Instantiable0[Checkbox],
    DateEditor: Instantiable0[Date],
    DropdownEditor: Instantiable0[Dropdown],
    HandsontableEditor: Instantiable0[typings.handsontable.handsontableMod.Handsontable._editors.Handsontable],
    MobileEditor: Instantiable0[Mobile],
    NumericEditor: Instantiable0[Numeric],
    PasswordEditor: Instantiable0[Password],
    SelectEditor: Instantiable0[Select],
    TextEditor: Instantiable0[Text],
    TimeEditor: Instantiable0[Text],
    getEditor: String => Instantiable6[
      /* hotInstance */ Core, 
      /* row */ Double, 
      /* col */ Double, 
      /* prop */ String | Double, 
      /* TD */ HTMLTableCellElement, 
      /* cellProperties */ CellProperties, 
      BaseEditor
    ],
    registerEditor: (String, Instantiable6[
      /* hotInstance */ Core, 
      /* row */ Double, 
      /* col */ Double, 
      /* prop */ String | Double, 
      /* TD */ HTMLTableCellElement, 
      /* cellProperties */ CellProperties, 
      BaseEditor
    ]) => Unit
  ): Editors = {
    val __obj = js.Dynamic.literal(AutocompleteEditor = AutocompleteEditor, BaseEditor = BaseEditor, CheckboxEditor = CheckboxEditor, DateEditor = DateEditor, DropdownEditor = DropdownEditor, HandsontableEditor = HandsontableEditor, MobileEditor = MobileEditor, NumericEditor = NumericEditor, PasswordEditor = PasswordEditor, SelectEditor = SelectEditor, TextEditor = TextEditor, TimeEditor = TimeEditor, getEditor = js.Any.fromFunction1(getEditor), registerEditor = js.Any.fromFunction2(registerEditor))
  
    __obj.asInstanceOf[Editors]
  }
}

