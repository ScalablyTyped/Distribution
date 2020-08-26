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

@js.native
trait Editors extends js.Object {
  var AutocompleteEditor: Instantiable0[Autocomplete] = js.native
  var BaseEditor: Instantiable6[
    /* hotInstance */ Core, 
    /* row */ Double, 
    /* col */ Double, 
    /* prop */ String | Double, 
    /* TD */ HTMLTableCellElement, 
    /* cellProperties */ CellProperties, 
    Base
  ] = js.native
  var CheckboxEditor: Instantiable0[Checkbox] = js.native
  var DateEditor: Instantiable0[Date] = js.native
  var DropdownEditor: Instantiable0[Dropdown] = js.native
  var HandsontableEditor: Instantiable0[typings.handsontable.mod.Handsontable._editors.Handsontable] = js.native
  var MobileEditor: Instantiable0[Mobile] = js.native
  var NumericEditor: Instantiable0[Numeric] = js.native
  var PasswordEditor: Instantiable0[Password] = js.native
  var SelectEditor: Instantiable0[Select] = js.native
  var TextEditor: Instantiable0[Text] = js.native
  var TimeEditor: Instantiable0[Text] = js.native
  def getEditor(editorName: String): Instantiable6[
    /* hotInstance */ Core, 
    /* row */ Double, 
    /* col */ Double, 
    /* prop */ String | Double, 
    /* TD */ HTMLTableCellElement, 
    /* cellProperties */ CellProperties, 
    Base
  ] = js.native
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
  ): Unit = js.native
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
  @scala.inline
  implicit class EditorsOps[Self <: Editors] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAutocompleteEditor(value: Instantiable0[Autocomplete]): Self = this.set("AutocompleteEditor", value.asInstanceOf[js.Any])
    @scala.inline
    def setBaseEditor(
      value: Instantiable6[
          /* hotInstance */ Core, 
          /* row */ Double, 
          /* col */ Double, 
          /* prop */ String | Double, 
          /* TD */ HTMLTableCellElement, 
          /* cellProperties */ CellProperties, 
          Base
        ]
    ): Self = this.set("BaseEditor", value.asInstanceOf[js.Any])
    @scala.inline
    def setCheckboxEditor(value: Instantiable0[Checkbox]): Self = this.set("CheckboxEditor", value.asInstanceOf[js.Any])
    @scala.inline
    def setDateEditor(value: Instantiable0[Date]): Self = this.set("DateEditor", value.asInstanceOf[js.Any])
    @scala.inline
    def setDropdownEditor(value: Instantiable0[Dropdown]): Self = this.set("DropdownEditor", value.asInstanceOf[js.Any])
    @scala.inline
    def setHandsontableEditor(value: Instantiable0[typings.handsontable.mod.Handsontable._editors.Handsontable]): Self = this.set("HandsontableEditor", value.asInstanceOf[js.Any])
    @scala.inline
    def setMobileEditor(value: Instantiable0[Mobile]): Self = this.set("MobileEditor", value.asInstanceOf[js.Any])
    @scala.inline
    def setNumericEditor(value: Instantiable0[Numeric]): Self = this.set("NumericEditor", value.asInstanceOf[js.Any])
    @scala.inline
    def setPasswordEditor(value: Instantiable0[Password]): Self = this.set("PasswordEditor", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelectEditor(value: Instantiable0[Select]): Self = this.set("SelectEditor", value.asInstanceOf[js.Any])
    @scala.inline
    def setTextEditor(value: Instantiable0[Text]): Self = this.set("TextEditor", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimeEditor(value: Instantiable0[Text]): Self = this.set("TimeEditor", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetEditor(
      value: String => Instantiable6[
          /* hotInstance */ Core, 
          /* row */ Double, 
          /* col */ Double, 
          /* prop */ String | Double, 
          /* TD */ HTMLTableCellElement, 
          /* cellProperties */ CellProperties, 
          Base
        ]
    ): Self = this.set("getEditor", js.Any.fromFunction1(value))
    @scala.inline
    def setRegisterEditor(
      value: (String, Instantiable6[
          /* hotInstance */ Core, 
          /* row */ Double, 
          /* col */ Double, 
          /* prop */ String | Double, 
          /* TD */ HTMLTableCellElement, 
          /* cellProperties */ CellProperties, 
          Base
        ]) => Unit
    ): Self = this.set("registerEditor", js.Any.fromFunction2(value))
  }
  
}

