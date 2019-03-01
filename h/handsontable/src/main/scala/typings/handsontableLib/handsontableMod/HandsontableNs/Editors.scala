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
    /* TD */ stdLib.HTMLElement, 
    /* cellProperties */ GridSettings, 
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
  def getEditor(editorName: java.lang.String, hotInstance: handsontableLib.handsontableMod.Handsontable): js.Any
  def registerEditor(editorName: java.lang.String, editorClass: js.Any): scala.Unit
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
      /* TD */ stdLib.HTMLElement, 
      /* cellProperties */ GridSettings, 
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
    getEditor: js.Function2[java.lang.String, handsontableLib.handsontableMod.Handsontable, js.Any],
    registerEditor: js.Function2[java.lang.String, js.Any, scala.Unit]
  ): Editors = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("AutocompleteEditor")(AutocompleteEditor)
    __obj.updateDynamic("BaseEditor")(BaseEditor)
    __obj.updateDynamic("CheckboxEditor")(CheckboxEditor)
    __obj.updateDynamic("DateEditor")(DateEditor)
    __obj.updateDynamic("DropdownEditor")(DropdownEditor)
    __obj.updateDynamic("HandsontableEditor")(HandsontableEditor)
    __obj.updateDynamic("MobileEditor")(MobileEditor)
    __obj.updateDynamic("NumericEditor")(NumericEditor)
    __obj.updateDynamic("PasswordEditor")(PasswordEditor)
    __obj.updateDynamic("SelectEditor")(SelectEditor)
    __obj.updateDynamic("TextEditor")(TextEditor)
    __obj.updateDynamic("getEditor")(getEditor)
    __obj.updateDynamic("registerEditor")(registerEditor)
    __obj.asInstanceOf[Editors]
  }
}

