package typings.handsontable.mod.Handsontable

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable6
import typings.handsontable.mod.Handsontable._editors.Autocomplete
import typings.handsontable.mod.Handsontable._editors.Base
import typings.handsontable.mod.Handsontable._editors.Checkbox
import typings.handsontable.mod.Handsontable._editors.Date
import typings.handsontable.mod.Handsontable._editors.Dropdown
import typings.handsontable.mod.Handsontable._editors.Mobile
import typings.handsontable.mod.Handsontable._editors.Numeric
import typings.handsontable.mod.Handsontable._editors.Password
import typings.handsontable.mod.Handsontable._editors.Select
import typings.handsontable.mod.Handsontable._editors.Text
import typings.handsontable.mod._Handsontable.Core
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
  var HandsontableEditor: Instantiable0[typings.handsontable.mod.Handsontable._editors.Handsontable]
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
    HandsontableEditor: Instantiable0[typings.handsontable.mod.Handsontable._editors.Handsontable],
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
    val __obj = js.Dynamic.literal(AutocompleteEditor = AutocompleteEditor.asInstanceOf[js.Any], BaseEditor = BaseEditor.asInstanceOf[js.Any], CheckboxEditor = CheckboxEditor.asInstanceOf[js.Any], DateEditor = DateEditor.asInstanceOf[js.Any], DropdownEditor = DropdownEditor.asInstanceOf[js.Any], HandsontableEditor = HandsontableEditor.asInstanceOf[js.Any], MobileEditor = MobileEditor.asInstanceOf[js.Any], NumericEditor = NumericEditor.asInstanceOf[js.Any], PasswordEditor = PasswordEditor.asInstanceOf[js.Any], SelectEditor = SelectEditor.asInstanceOf[js.Any], TextEditor = TextEditor.asInstanceOf[js.Any], TimeEditor = TimeEditor.asInstanceOf[js.Any], getEditor = js.Any.fromFunction1(getEditor), registerEditor = js.Any.fromFunction2(registerEditor))
  
    __obj.asInstanceOf[Editors]
  }
}

