package typings.handsontable

import org.scalablytyped.runtime.Instantiable1
import typings.handsontable.anon.TypeofAutocompleteEditor
import typings.handsontable.coreMod.default
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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object editorsMod {
  
  @JSImport("handsontable/editors", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("handsontable/editors", "AUTOCOMPLETE_EDITOR")
  @js.native
  val AUTOCOMPLETE_EDITOR: autocomplete = js.native
  
  @JSImport("handsontable/editors", "AutocompleteEditor")
  @js.native
  open class AutocompleteEditor protected ()
    extends typings.handsontable.autocompleteEditorMod.AutocompleteEditor {
    def this(instance: default) = this()
  }
  object AutocompleteEditor {
    
    @JSImport("handsontable/editors", "AutocompleteEditor")
    @js.native
    val ^ : js.Any = js.native
    
    inline def sortByRelevance(value: Any, choices: js.Array[String], caseSensitive: Boolean): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("sortByRelevance")(value.asInstanceOf[js.Any], choices.asInstanceOf[js.Any], caseSensitive.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  }
  
  @JSImport("handsontable/editors", "BASE_EDITOR")
  @js.native
  val BASE_EDITOR: base = js.native
  
  @JSImport("handsontable/editors", "BaseEditor")
  @js.native
  abstract class BaseEditor protected ()
    extends typings.handsontable.baseEditorMod.BaseEditor {
    def this(instance: default) = this()
  }
  
  @JSImport("handsontable/editors", "CHECKBOX_EDITOR")
  @js.native
  val CHECKBOX_EDITOR: checkbox = js.native
  
  @JSImport("handsontable/editors", "CheckboxEditor")
  @js.native
  open class CheckboxEditor protected ()
    extends typings.handsontable.checkboxEditorMod.CheckboxEditor {
    def this(instance: default) = this()
  }
  
  @JSImport("handsontable/editors", "DATE_EDITOR")
  @js.native
  val DATE_EDITOR: date = js.native
  
  @JSImport("handsontable/editors", "DROPDOWN_EDITOR")
  @js.native
  val DROPDOWN_EDITOR: dropdown = js.native
  
  @JSImport("handsontable/editors", "DateEditor")
  @js.native
  open class DateEditor protected ()
    extends typings.handsontable.dateEditorMod.DateEditor {
    def this(instance: default) = this()
  }
  
  @JSImport("handsontable/editors", "DropdownEditor")
  @js.native
  open class DropdownEditor protected ()
    extends typings.handsontable.dropdownEditorMod.DropdownEditor {
    def this(instance: default) = this()
  }
  
  @JSImport("handsontable/editors", "HANDSONTABLE_EDITOR")
  @js.native
  val HANDSONTABLE_EDITOR: typings.handsontable.handsontableStrings.handsontable = js.native
  
  @JSImport("handsontable/editors", "HandsontableEditor")
  @js.native
  open class HandsontableEditor protected ()
    extends typings.handsontable.handsontableEditorMod.HandsontableEditor {
    def this(instance: default) = this()
  }
  
  @JSImport("handsontable/editors", "NUMERIC_EDITOR")
  @js.native
  val NUMERIC_EDITOR: numeric = js.native
  
  @JSImport("handsontable/editors", "NumericEditor")
  @js.native
  open class NumericEditor protected ()
    extends typings.handsontable.numericEditorMod.NumericEditor {
    def this(instance: default) = this()
  }
  
  @JSImport("handsontable/editors", "PASSWORD_EDITOR")
  @js.native
  val PASSWORD_EDITOR: password = js.native
  
  @JSImport("handsontable/editors", "PasswordEditor")
  @js.native
  open class PasswordEditor protected ()
    extends typings.handsontable.passwordEditorMod.PasswordEditor {
    def this(instance: default) = this()
  }
  
  @JSImport("handsontable/editors", "RegisteredEditor")
  @js.native
  open class RegisteredEditor protected ()
    extends typings.handsontable.editorsRegistryMod.RegisteredEditor {
    def this(editorClass: typings.handsontable.baseEditorMod.BaseEditor) = this()
  }
  object RegisteredEditor {
    
    @JSImport("handsontable/editors", "RegisteredEditor")
    @js.native
    def apply(editorClass: typings.handsontable.baseEditorMod.BaseEditor): Unit = js.native
  }
  
  @JSImport("handsontable/editors", "SELECT_EDITOR")
  @js.native
  val SELECT_EDITOR: select = js.native
  
  @JSImport("handsontable/editors", "SelectEditor")
  @js.native
  open class SelectEditor protected ()
    extends typings.handsontable.selectEditorMod.SelectEditor {
    def this(instance: default) = this()
  }
  
  @JSImport("handsontable/editors", "TEXT_EDITOR")
  @js.native
  val TEXT_EDITOR: text = js.native
  
  @JSImport("handsontable/editors", "TIME_EDITOR")
  @js.native
  val TIME_EDITOR: time = js.native
  
  @JSImport("handsontable/editors", "TextEditor")
  @js.native
  open class TextEditor protected ()
    extends typings.handsontable.textEditorMod.TextEditor {
    def this(instance: default) = this()
  }
  
  @JSImport("handsontable/editors", "TimeEditor")
  @js.native
  open class TimeEditor protected ()
    extends typings.handsontable.timeEditorMod.TimeEditor {
    def this(instance: default) = this()
  }
  
  inline def getEditorInstance(name: String, hotInstance: default): Instantiable1[/* instance */ default, typings.handsontable.baseEditorMod.BaseEditor] = (^.asInstanceOf[js.Dynamic].applyDynamic("_getEditorInstance")(name.asInstanceOf[js.Any], hotInstance.asInstanceOf[js.Any])).asInstanceOf[Instantiable1[/* instance */ default, typings.handsontable.baseEditorMod.BaseEditor]]
  
  inline def registerAllEditors(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerAllEditors")().asInstanceOf[Unit]
  
  /* Rewritten from type alias, can be one of: 
    - typings.handsontable.handsontableStrings.autocomplete
    - typings.handsontable.handsontableStrings.base
    - typings.handsontable.handsontableStrings.checkbox
    - typings.handsontable.handsontableStrings.date
    - typings.handsontable.handsontableStrings.dropdown
    - typings.handsontable.handsontableStrings.handsontable
    - typings.handsontable.handsontableStrings.numeric
    - typings.handsontable.handsontableStrings.password
    - typings.handsontable.handsontableStrings.select
    - typings.handsontable.handsontableStrings.text
    - typings.handsontable.handsontableStrings.time
  */
  trait EditorType extends StObject
  
  trait Editors extends StObject {
    
    var autocomplete: (Instantiable1[
        /* instance */ default, 
        typings.handsontable.autocompleteEditorMod.AutocompleteEditor
      ]) & TypeofAutocompleteEditor
    
    var base: Instantiable1[/* instance */ default, typings.handsontable.baseEditorMod.BaseEditor]
    
    var checkbox: Instantiable1[/* instance */ default, typings.handsontable.checkboxEditorMod.CheckboxEditor]
    
    var date: Instantiable1[/* instance */ default, typings.handsontable.dateEditorMod.DateEditor]
    
    var dropdown: Instantiable1[/* instance */ default, typings.handsontable.dropdownEditorMod.DropdownEditor]
    
    var handsontable: Instantiable1[
        /* instance */ default, 
        typings.handsontable.handsontableEditorMod.HandsontableEditor
      ]
    
    var numeric: Instantiable1[/* instance */ default, typings.handsontable.numericEditorMod.NumericEditor]
    
    var password: Instantiable1[/* instance */ default, typings.handsontable.passwordEditorMod.PasswordEditor]
    
    var select: Instantiable1[/* instance */ default, typings.handsontable.selectEditorMod.SelectEditor]
    
    var text: Instantiable1[/* instance */ default, typings.handsontable.textEditorMod.TextEditor]
    
    var time: Instantiable1[/* instance */ default, typings.handsontable.timeEditorMod.TimeEditor]
  }
  object Editors {
    
    inline def apply(
      autocomplete: (Instantiable1[
          /* instance */ default, 
          typings.handsontable.autocompleteEditorMod.AutocompleteEditor
        ]) & TypeofAutocompleteEditor,
      base: Instantiable1[/* instance */ default, typings.handsontable.baseEditorMod.BaseEditor],
      checkbox: Instantiable1[/* instance */ default, typings.handsontable.checkboxEditorMod.CheckboxEditor],
      date: Instantiable1[/* instance */ default, typings.handsontable.dateEditorMod.DateEditor],
      dropdown: Instantiable1[/* instance */ default, typings.handsontable.dropdownEditorMod.DropdownEditor],
      handsontable: Instantiable1[
          /* instance */ default, 
          typings.handsontable.handsontableEditorMod.HandsontableEditor
        ],
      numeric: Instantiable1[/* instance */ default, typings.handsontable.numericEditorMod.NumericEditor],
      password: Instantiable1[/* instance */ default, typings.handsontable.passwordEditorMod.PasswordEditor],
      select: Instantiable1[/* instance */ default, typings.handsontable.selectEditorMod.SelectEditor],
      text: Instantiable1[/* instance */ default, typings.handsontable.textEditorMod.TextEditor],
      time: Instantiable1[/* instance */ default, typings.handsontable.timeEditorMod.TimeEditor]
    ): Editors = {
      val __obj = js.Dynamic.literal(autocomplete = autocomplete.asInstanceOf[js.Any], base = base.asInstanceOf[js.Any], checkbox = checkbox.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], dropdown = dropdown.asInstanceOf[js.Any], handsontable = handsontable.asInstanceOf[js.Any], numeric = numeric.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], select = select.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
      __obj.asInstanceOf[Editors]
    }
    
    extension [Self <: Editors](x: Self) {
      
      inline def setAutocomplete(
        value: (Instantiable1[
              /* instance */ default, 
              typings.handsontable.autocompleteEditorMod.AutocompleteEditor
            ]) & TypeofAutocompleteEditor
      ): Self = StObject.set(x, "autocomplete", value.asInstanceOf[js.Any])
      
      inline def setBase(value: Instantiable1[/* instance */ default, typings.handsontable.baseEditorMod.BaseEditor]): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
      
      inline def setCheckbox(
        value: Instantiable1[/* instance */ default, typings.handsontable.checkboxEditorMod.CheckboxEditor]
      ): Self = StObject.set(x, "checkbox", value.asInstanceOf[js.Any])
      
      inline def setDate(value: Instantiable1[/* instance */ default, typings.handsontable.dateEditorMod.DateEditor]): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      inline def setDropdown(
        value: Instantiable1[/* instance */ default, typings.handsontable.dropdownEditorMod.DropdownEditor]
      ): Self = StObject.set(x, "dropdown", value.asInstanceOf[js.Any])
      
      inline def setHandsontable(
        value: Instantiable1[
              /* instance */ default, 
              typings.handsontable.handsontableEditorMod.HandsontableEditor
            ]
      ): Self = StObject.set(x, "handsontable", value.asInstanceOf[js.Any])
      
      inline def setNumeric(value: Instantiable1[/* instance */ default, typings.handsontable.numericEditorMod.NumericEditor]): Self = StObject.set(x, "numeric", value.asInstanceOf[js.Any])
      
      inline def setPassword(
        value: Instantiable1[/* instance */ default, typings.handsontable.passwordEditorMod.PasswordEditor]
      ): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      inline def setSelect(value: Instantiable1[/* instance */ default, typings.handsontable.selectEditorMod.SelectEditor]): Self = StObject.set(x, "select", value.asInstanceOf[js.Any])
      
      inline def setText(value: Instantiable1[/* instance */ default, typings.handsontable.textEditorMod.TextEditor]): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTime(value: Instantiable1[/* instance */ default, typings.handsontable.timeEditorMod.TimeEditor]): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    }
  }
}
