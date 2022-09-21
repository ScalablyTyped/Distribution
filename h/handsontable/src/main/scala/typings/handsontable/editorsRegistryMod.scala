package typings.handsontable

import org.scalablytyped.runtime.Instantiable1
import typings.handsontable.anon.TypeofAutocompleteEditor
import typings.handsontable.autocompleteEditorMod.AutocompleteEditor
import typings.handsontable.baseEditorMod.BaseEditor
import typings.handsontable.checkboxEditorMod.CheckboxEditor
import typings.handsontable.coreMod.default
import typings.handsontable.dateEditorMod.DateEditor
import typings.handsontable.dropdownEditorMod.DropdownEditor
import typings.handsontable.handsontableEditorMod.HandsontableEditor
import typings.handsontable.handsontableStrings.autocomplete
import typings.handsontable.handsontableStrings.base
import typings.handsontable.handsontableStrings.checkbox
import typings.handsontable.handsontableStrings.date
import typings.handsontable.handsontableStrings.dropdown
import typings.handsontable.handsontableStrings.numeric
import typings.handsontable.handsontableStrings.password
import typings.handsontable.handsontableStrings.select
import typings.handsontable.handsontableStrings.text
import typings.handsontable.handsontableStrings.time
import typings.handsontable.numericEditorMod.NumericEditor
import typings.handsontable.passwordEditorMod.PasswordEditor
import typings.handsontable.selectEditorMod.SelectEditor
import typings.handsontable.textEditorMod.TextEditor
import typings.handsontable.timeEditorMod.TimeEditor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object editorsRegistryMod {
  
  @JSImport("handsontable/editors/registry", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("handsontable/editors/registry", "RegisteredEditor")
  @js.native
  open class RegisteredEditor protected () extends StObject {
    def this(editorClass: BaseEditor) = this()
    
    def getConstructor(): BaseEditor = js.native
    
    def getInstance(hotInstance: default): Instantiable1[/* instance */ default, BaseEditor] = js.native
  }
  object RegisteredEditor {
    
    @JSImport("handsontable/editors/registry", "RegisteredEditor")
    @js.native
    def apply(editorClass: BaseEditor): Unit = js.native
  }
  
  inline def _getEditorInstance(name: String, hotInstance: default): Instantiable1[/* instance */ default, BaseEditor] = (^.asInstanceOf[js.Dynamic].applyDynamic("_getEditorInstance")(name.asInstanceOf[js.Any], hotInstance.asInstanceOf[js.Any])).asInstanceOf[Instantiable1[/* instance */ default, BaseEditor]]
  
  inline def getEditor(name: String): Instantiable1[/* instance */ default, BaseEditor] = ^.asInstanceOf[js.Dynamic].applyDynamic("getEditor")(name.asInstanceOf[js.Any]).asInstanceOf[Instantiable1[/* instance */ default, BaseEditor]]
  
  inline def getEditorInstance(name: String, hotInstance: default): Instantiable1[/* instance */ default, BaseEditor] = (^.asInstanceOf[js.Dynamic].applyDynamic("getEditorInstance")(name.asInstanceOf[js.Any], hotInstance.asInstanceOf[js.Any])).asInstanceOf[Instantiable1[/* instance */ default, BaseEditor]]
  
  inline def getEditor_autocomplete(name: autocomplete): (Instantiable1[/* instance */ default, AutocompleteEditor]) & TypeofAutocompleteEditor = ^.asInstanceOf[js.Dynamic].applyDynamic("getEditor")(name.asInstanceOf[js.Any]).asInstanceOf[(Instantiable1[/* instance */ default, AutocompleteEditor]) & TypeofAutocompleteEditor]
  
  inline def getEditor_base(name: base): Instantiable1[/* instance */ default, BaseEditor] = ^.asInstanceOf[js.Dynamic].applyDynamic("getEditor")(name.asInstanceOf[js.Any]).asInstanceOf[Instantiable1[/* instance */ default, BaseEditor]]
  
  inline def getEditor_checkbox(name: checkbox): Instantiable1[/* instance */ default, CheckboxEditor] = ^.asInstanceOf[js.Dynamic].applyDynamic("getEditor")(name.asInstanceOf[js.Any]).asInstanceOf[Instantiable1[/* instance */ default, CheckboxEditor]]
  
  inline def getEditor_date(name: date): Instantiable1[/* instance */ default, DateEditor] = ^.asInstanceOf[js.Dynamic].applyDynamic("getEditor")(name.asInstanceOf[js.Any]).asInstanceOf[Instantiable1[/* instance */ default, DateEditor]]
  
  inline def getEditor_dropdown(name: dropdown): Instantiable1[/* instance */ default, DropdownEditor] = ^.asInstanceOf[js.Dynamic].applyDynamic("getEditor")(name.asInstanceOf[js.Any]).asInstanceOf[Instantiable1[/* instance */ default, DropdownEditor]]
  
  inline def getEditor_handsontable(name: typings.handsontable.handsontableStrings.handsontable): Instantiable1[/* instance */ default, HandsontableEditor] = ^.asInstanceOf[js.Dynamic].applyDynamic("getEditor")(name.asInstanceOf[js.Any]).asInstanceOf[Instantiable1[/* instance */ default, HandsontableEditor]]
  
  inline def getEditor_numeric(name: numeric): Instantiable1[/* instance */ default, NumericEditor] = ^.asInstanceOf[js.Dynamic].applyDynamic("getEditor")(name.asInstanceOf[js.Any]).asInstanceOf[Instantiable1[/* instance */ default, NumericEditor]]
  
  inline def getEditor_password(name: password): Instantiable1[/* instance */ default, PasswordEditor] = ^.asInstanceOf[js.Dynamic].applyDynamic("getEditor")(name.asInstanceOf[js.Any]).asInstanceOf[Instantiable1[/* instance */ default, PasswordEditor]]
  
  inline def getEditor_select(name: select): Instantiable1[/* instance */ default, SelectEditor] = ^.asInstanceOf[js.Dynamic].applyDynamic("getEditor")(name.asInstanceOf[js.Any]).asInstanceOf[Instantiable1[/* instance */ default, SelectEditor]]
  
  inline def getEditor_text(name: text): Instantiable1[/* instance */ default, TextEditor] = ^.asInstanceOf[js.Dynamic].applyDynamic("getEditor")(name.asInstanceOf[js.Any]).asInstanceOf[Instantiable1[/* instance */ default, TextEditor]]
  
  inline def getEditor_time(name: time): Instantiable1[/* instance */ default, TimeEditor] = ^.asInstanceOf[js.Dynamic].applyDynamic("getEditor")(name.asInstanceOf[js.Any]).asInstanceOf[Instantiable1[/* instance */ default, TimeEditor]]
  
  inline def getRegisteredEditorNames(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getRegisteredEditorNames")().asInstanceOf[js.Array[String]]
  
  inline def getRegisteredEditors(): js.Array[BaseEditor] = ^.asInstanceOf[js.Dynamic].applyDynamic("getRegisteredEditors")().asInstanceOf[js.Array[BaseEditor]]
  
  inline def hasEditor(name: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasEditor")(name.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def registerEditor(editorClass: Instantiable1[/* instance */ default, BaseEditor]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerEditor")(editorClass.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def registerEditor(name: String, editorClass: Instantiable1[/* instance */ default, BaseEditor]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerEditor")(name.asInstanceOf[js.Any], editorClass.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
