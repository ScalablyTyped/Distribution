package typings
package handsontableLib.handsontableMod.HandsontableNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Editors extends js.Object {
  var AutocompleteEditor: org.scalablytyped.runtime.Instantiable0[handsontableLib.handsontableMod.HandsontableNs.underscoreEditorsNs.Autocomplete]
  var BaseEditor: org.scalablytyped.runtime.Instantiable6[
    /* hotInstance */ handsontableLib.handsontableMod.underscoreHandsontableNs.Core, 
    /* row */ scala.Double, 
    /* col */ scala.Double, 
    /* prop */ java.lang.String | scala.Double, 
    /* TD */ stdLib.HTMLTableCellElement, 
    /* cellProperties */ CellProperties, 
    handsontableLib.handsontableMod.HandsontableNs.underscoreEditorsNs.Base
  ]
  var CheckboxEditor: org.scalablytyped.runtime.Instantiable0[handsontableLib.handsontableMod.HandsontableNs.underscoreEditorsNs.Checkbox]
  var DateEditor: org.scalablytyped.runtime.Instantiable0[handsontableLib.handsontableMod.HandsontableNs.underscoreEditorsNs.Date]
  var DropdownEditor: org.scalablytyped.runtime.Instantiable0[handsontableLib.handsontableMod.HandsontableNs.underscoreEditorsNs.Dropdown]
  var HandsontableEditor: org.scalablytyped.runtime.Instantiable0[handsontableLib.handsontableMod.HandsontableNs.underscoreEditorsNs.Handsontable]
  var MobileEditor: org.scalablytyped.runtime.Instantiable0[handsontableLib.handsontableMod.HandsontableNs.underscoreEditorsNs.Mobile]
  var NumericEditor: org.scalablytyped.runtime.Instantiable0[handsontableLib.handsontableMod.HandsontableNs.underscoreEditorsNs.Numeric]
  var PasswordEditor: org.scalablytyped.runtime.Instantiable0[handsontableLib.handsontableMod.HandsontableNs.underscoreEditorsNs.Password]
  var SelectEditor: org.scalablytyped.runtime.Instantiable0[handsontableLib.handsontableMod.HandsontableNs.underscoreEditorsNs.Select]
  var TextEditor: org.scalablytyped.runtime.Instantiable0[handsontableLib.handsontableMod.HandsontableNs.underscoreEditorsNs.Text]
  var TimeEditor: org.scalablytyped.runtime.Instantiable0[handsontableLib.handsontableMod.HandsontableNs.underscoreEditorsNs.Text]
  def getEditor(editorName: java.lang.String): org.scalablytyped.runtime.Instantiable6[
    /* hotInstance */ handsontableLib.handsontableMod.underscoreHandsontableNs.Core, 
    /* row */ scala.Double, 
    /* col */ scala.Double, 
    /* prop */ java.lang.String | scala.Double, 
    /* TD */ stdLib.HTMLTableCellElement, 
    /* cellProperties */ CellProperties, 
    handsontableLib.handsontableMod.HandsontableNs.underscoreEditorsNs.Base
  ]
  def registerEditor(
    editorName: java.lang.String,
    editorClass: org.scalablytyped.runtime.Instantiable6[
      /* hotInstance */ handsontableLib.handsontableMod.underscoreHandsontableNs.Core, 
      /* row */ scala.Double, 
      /* col */ scala.Double, 
      /* prop */ java.lang.String | scala.Double, 
      /* TD */ stdLib.HTMLTableCellElement, 
      /* cellProperties */ CellProperties, 
      handsontableLib.handsontableMod.HandsontableNs.underscoreEditorsNs.Base
    ]
  ): scala.Unit
}

object Editors {
  @scala.inline
  def apply(
    AutocompleteEditor: org.scalablytyped.runtime.Instantiable0[handsontableLib.handsontableMod.HandsontableNs.underscoreEditorsNs.Autocomplete],
    BaseEditor: org.scalablytyped.runtime.Instantiable6[
      /* hotInstance */ handsontableLib.handsontableMod.underscoreHandsontableNs.Core, 
      /* row */ scala.Double, 
      /* col */ scala.Double, 
      /* prop */ java.lang.String | scala.Double, 
      /* TD */ stdLib.HTMLTableCellElement, 
      /* cellProperties */ CellProperties, 
      handsontableLib.handsontableMod.HandsontableNs.underscoreEditorsNs.Base
    ],
    CheckboxEditor: org.scalablytyped.runtime.Instantiable0[handsontableLib.handsontableMod.HandsontableNs.underscoreEditorsNs.Checkbox],
    DateEditor: org.scalablytyped.runtime.Instantiable0[handsontableLib.handsontableMod.HandsontableNs.underscoreEditorsNs.Date],
    DropdownEditor: org.scalablytyped.runtime.Instantiable0[handsontableLib.handsontableMod.HandsontableNs.underscoreEditorsNs.Dropdown],
    HandsontableEditor: org.scalablytyped.runtime.Instantiable0[handsontableLib.handsontableMod.HandsontableNs.underscoreEditorsNs.Handsontable],
    MobileEditor: org.scalablytyped.runtime.Instantiable0[handsontableLib.handsontableMod.HandsontableNs.underscoreEditorsNs.Mobile],
    NumericEditor: org.scalablytyped.runtime.Instantiable0[handsontableLib.handsontableMod.HandsontableNs.underscoreEditorsNs.Numeric],
    PasswordEditor: org.scalablytyped.runtime.Instantiable0[handsontableLib.handsontableMod.HandsontableNs.underscoreEditorsNs.Password],
    SelectEditor: org.scalablytyped.runtime.Instantiable0[handsontableLib.handsontableMod.HandsontableNs.underscoreEditorsNs.Select],
    TextEditor: org.scalablytyped.runtime.Instantiable0[handsontableLib.handsontableMod.HandsontableNs.underscoreEditorsNs.Text],
    TimeEditor: org.scalablytyped.runtime.Instantiable0[handsontableLib.handsontableMod.HandsontableNs.underscoreEditorsNs.Text],
    getEditor: java.lang.String => org.scalablytyped.runtime.Instantiable6[
      /* hotInstance */ handsontableLib.handsontableMod.underscoreHandsontableNs.Core, 
      /* row */ scala.Double, 
      /* col */ scala.Double, 
      /* prop */ java.lang.String | scala.Double, 
      /* TD */ stdLib.HTMLTableCellElement, 
      /* cellProperties */ CellProperties, 
      handsontableLib.handsontableMod.HandsontableNs.underscoreEditorsNs.Base
    ],
    registerEditor: (java.lang.String, org.scalablytyped.runtime.Instantiable6[
      /* hotInstance */ handsontableLib.handsontableMod.underscoreHandsontableNs.Core, 
      /* row */ scala.Double, 
      /* col */ scala.Double, 
      /* prop */ java.lang.String | scala.Double, 
      /* TD */ stdLib.HTMLTableCellElement, 
      /* cellProperties */ CellProperties, 
      handsontableLib.handsontableMod.HandsontableNs.underscoreEditorsNs.Base
    ]) => scala.Unit
  ): Editors = {
    val __obj = js.Dynamic.literal(AutocompleteEditor = AutocompleteEditor, BaseEditor = BaseEditor, CheckboxEditor = CheckboxEditor, DateEditor = DateEditor, DropdownEditor = DropdownEditor, HandsontableEditor = HandsontableEditor, MobileEditor = MobileEditor, NumericEditor = NumericEditor, PasswordEditor = PasswordEditor, SelectEditor = SelectEditor, TextEditor = TextEditor, TimeEditor = TimeEditor, getEditor = js.Any.fromFunction1(getEditor), registerEditor = js.Any.fromFunction2(registerEditor))
  
    __obj.asInstanceOf[Editors]
  }
}

