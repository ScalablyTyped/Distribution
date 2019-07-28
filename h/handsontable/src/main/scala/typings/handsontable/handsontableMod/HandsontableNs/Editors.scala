package typings.handsontable.handsontableMod.HandsontableNs

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable6
import typings.handsontable.handsontableMod.HandsontableNs.underscoreEditorsNs.Autocomplete
import typings.handsontable.handsontableMod.HandsontableNs.underscoreEditorsNs.Base
import typings.handsontable.handsontableMod.HandsontableNs.underscoreEditorsNs.Checkbox
import typings.handsontable.handsontableMod.HandsontableNs.underscoreEditorsNs.Date
import typings.handsontable.handsontableMod.HandsontableNs.underscoreEditorsNs.Dropdown
import typings.handsontable.handsontableMod.HandsontableNs.underscoreEditorsNs.Mobile
import typings.handsontable.handsontableMod.HandsontableNs.underscoreEditorsNs.Numeric
import typings.handsontable.handsontableMod.HandsontableNs.underscoreEditorsNs.Password
import typings.handsontable.handsontableMod.HandsontableNs.underscoreEditorsNs.Select
import typings.handsontable.handsontableMod.HandsontableNs.underscoreEditorsNs.Text
import typings.handsontable.handsontableMod.underscoreHandsontableNs.Core
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
    Base
  ]
  var CheckboxEditor: Instantiable0[Checkbox]
  var DateEditor: Instantiable0[Date]
  var DropdownEditor: Instantiable0[Dropdown]
  var HandsontableEditor: Instantiable0[
    typings.handsontable.handsontableMod.HandsontableNs.underscoreEditorsNs.Handsontable
  ]
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
    Base
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
      Base
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
      Base
    ],
    CheckboxEditor: Instantiable0[Checkbox],
    DateEditor: Instantiable0[Date],
    DropdownEditor: Instantiable0[Dropdown],
    HandsontableEditor: Instantiable0[
      typings.handsontable.handsontableMod.HandsontableNs.underscoreEditorsNs.Handsontable
    ],
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
      Base
    ],
    registerEditor: (String, Instantiable6[
      /* hotInstance */ Core, 
      /* row */ Double, 
      /* col */ Double, 
      /* prop */ String | Double, 
      /* TD */ HTMLTableCellElement, 
      /* cellProperties */ CellProperties, 
      Base
    ]) => Unit
  ): Editors = {
    val __obj = js.Dynamic.literal(AutocompleteEditor = AutocompleteEditor, BaseEditor = BaseEditor, CheckboxEditor = CheckboxEditor, DateEditor = DateEditor, DropdownEditor = DropdownEditor, HandsontableEditor = HandsontableEditor, MobileEditor = MobileEditor, NumericEditor = NumericEditor, PasswordEditor = PasswordEditor, SelectEditor = SelectEditor, TextEditor = TextEditor, TimeEditor = TimeEditor, getEditor = js.Any.fromFunction1(getEditor), registerEditor = js.Any.fromFunction2(registerEditor))
  
    __obj.asInstanceOf[Editors]
  }
}

