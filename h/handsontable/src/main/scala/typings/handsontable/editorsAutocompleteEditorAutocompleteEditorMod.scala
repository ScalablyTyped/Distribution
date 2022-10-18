package typings.handsontable

import typings.handsontable.coreMod.default
import typings.handsontable.editorsHandsontableEditorMod.HandsontableEditor
import typings.handsontable.handsontableStrings.autocomplete
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object editorsAutocompleteEditorAutocompleteEditorMod {
  
  @JSImport("handsontable/editors/autocompleteEditor/autocompleteEditor", "AutocompleteEditor")
  @js.native
  open class AutocompleteEditor protected () extends HandsontableEditor {
    def this(instance: default) = this()
    
    def flipDropdown(dropdownHeight: Double): Unit = js.native
    
    def flipDropdownIfNeeded(): Boolean = js.native
    
    def getDropdownHeight(): Double = js.native
    
    def highlightBestMatchingChoice(): Unit = js.native
    def highlightBestMatchingChoice(index: Double): Unit = js.native
    
    def limitDropdownIfNeeded(spaceAvailable: Double, dropdownHeight: Double): Unit = js.native
    
    var query: String = js.native
    
    def queryChoices(query: String): Unit = js.native
    
    var rawChoices: js.Array[String] = js.native
    
    def setDropdownHeight(height: Double): Unit = js.native
    
    def stripValueIfNeeded(value: String): String = js.native
    
    def stripValuesIfNeeded(values: js.Array[String]): js.Array[String] = js.native
    
    var strippedChoices: js.Array[String] = js.native
    
    def unflipDropdown(): Unit = js.native
    
    def updateChoicesList(choicesList: js.Array[String]): Unit = js.native
    
    def updateDropdownHeight(): Unit = js.native
  }
  object AutocompleteEditor {
    
    @JSImport("handsontable/editors/autocompleteEditor/autocompleteEditor", "AutocompleteEditor")
    @js.native
    val ^ : js.Any = js.native
    
    inline def sortByRelevance(value: Any, choices: js.Array[String], caseSensitive: Boolean): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("sortByRelevance")(value.asInstanceOf[js.Any], choices.asInstanceOf[js.Any], caseSensitive.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  }
  
  @JSImport("handsontable/editors/autocompleteEditor/autocompleteEditor", "EDITOR_TYPE")
  @js.native
  val EDITOR_TYPE: autocomplete = js.native
}
