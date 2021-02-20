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
import typings.std.HTMLTableCellElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Editors extends StObject {
  
  var AutocompleteEditor: Instantiable0[Autocomplete] = js.native
  
  var BaseEditor: Instantiable6[
    /* hotInstance */ typings.handsontable.mod._Handsontable.Core, 
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
    /* hotInstance */ typings.handsontable.mod._Handsontable.Core, 
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
      /* hotInstance */ typings.handsontable.mod._Handsontable.Core, 
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
      /* hotInstance */ typings.handsontable.mod._Handsontable.Core, 
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
      /* hotInstance */ typings.handsontable.mod._Handsontable.Core, 
      /* row */ Double, 
      /* col */ Double, 
      /* prop */ String | Double, 
      /* TD */ HTMLTableCellElement, 
      /* cellProperties */ CellProperties, 
      Base
    ],
    registerEditor: (String, Instantiable6[
      /* hotInstance */ typings.handsontable.mod._Handsontable.Core, 
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
  implicit class EditorsMutableBuilder[Self <: Editors] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutocompleteEditor(value: Instantiable0[Autocomplete]): Self = StObject.set(x, "AutocompleteEditor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaseEditor(
      value: Instantiable6[
          /* hotInstance */ typings.handsontable.mod._Handsontable.Core, 
          /* row */ Double, 
          /* col */ Double, 
          /* prop */ String | Double, 
          /* TD */ HTMLTableCellElement, 
          /* cellProperties */ CellProperties, 
          Base
        ]
    ): Self = StObject.set(x, "BaseEditor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckboxEditor(value: Instantiable0[Checkbox]): Self = StObject.set(x, "CheckboxEditor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateEditor(value: Instantiable0[Date]): Self = StObject.set(x, "DateEditor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDropdownEditor(value: Instantiable0[Dropdown]): Self = StObject.set(x, "DropdownEditor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetEditor(
      value: String => Instantiable6[
          /* hotInstance */ typings.handsontable.mod._Handsontable.Core, 
          /* row */ Double, 
          /* col */ Double, 
          /* prop */ String | Double, 
          /* TD */ HTMLTableCellElement, 
          /* cellProperties */ CellProperties, 
          Base
        ]
    ): Self = StObject.set(x, "getEditor", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHandsontableEditor(value: Instantiable0[typings.handsontable.mod.Handsontable._editors.Handsontable]): Self = StObject.set(x, "HandsontableEditor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMobileEditor(value: Instantiable0[Mobile]): Self = StObject.set(x, "MobileEditor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumericEditor(value: Instantiable0[Numeric]): Self = StObject.set(x, "NumericEditor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasswordEditor(value: Instantiable0[Password]): Self = StObject.set(x, "PasswordEditor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegisterEditor(
      value: (String, Instantiable6[
          /* hotInstance */ typings.handsontable.mod._Handsontable.Core, 
          /* row */ Double, 
          /* col */ Double, 
          /* prop */ String | Double, 
          /* TD */ HTMLTableCellElement, 
          /* cellProperties */ CellProperties, 
          Base
        ]) => Unit
    ): Self = StObject.set(x, "registerEditor", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSelectEditor(value: Instantiable0[Select]): Self = StObject.set(x, "SelectEditor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextEditor(value: Instantiable0[Text]): Self = StObject.set(x, "TextEditor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeEditor(value: Instantiable0[Text]): Self = StObject.set(x, "TimeEditor", value.asInstanceOf[js.Any])
  }
}
