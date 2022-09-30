package typings.listr2.anon

import typings.listr2.mod.ArrayPromptOptions
import typings.listr2.mod.BooleanPromptOptions
import typings.listr2.mod.NumberPromptOptions
import typings.listr2.mod.QuizPromptOptions
import typings.listr2.mod.ScalePromptOptions
import typings.listr2.mod.SnippetPromptOptions
import typings.listr2.mod.SortPromptOptions
import typings.listr2.mod.StringPromptOptions
import typings.listr2.mod.SurveyPromptOptions
import typings.listr2.mod.TogglePromptOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined listr2.listr2.PromptOptionsMap */
trait PromptOptionsMap extends StObject {
  
  var AutoComplete: ArrayPromptOptions
  
  var BasicAuth: StringPromptOptions
  
  var Confirm: BooleanPromptOptions
  
  var Editable: ArrayPromptOptions
  
  var Form: ArrayPromptOptions
  
  var Input: StringPromptOptions
  
  var Invisible: StringPromptOptions
  
  var List: ArrayPromptOptions
  
  var MultiSelect: ArrayPromptOptions
  
  var Numeral: NumberPromptOptions
  
  var Password: StringPromptOptions
  
  var Quiz: QuizPromptOptions
  
  var Scale: ScalePromptOptions
  
  var Select: ArrayPromptOptions
  
  var Snippet: SnippetPromptOptions
  
  var Sort: SortPromptOptions
  
  var Survey: SurveyPromptOptions
  
  var Text: StringPromptOptions
  
  var Toggle: TogglePromptOptions
}
object PromptOptionsMap {
  
  inline def apply(
    AutoComplete: ArrayPromptOptions,
    BasicAuth: StringPromptOptions,
    Confirm: BooleanPromptOptions,
    Editable: ArrayPromptOptions,
    Form: ArrayPromptOptions,
    Input: StringPromptOptions,
    Invisible: StringPromptOptions,
    List: ArrayPromptOptions,
    MultiSelect: ArrayPromptOptions,
    Numeral: NumberPromptOptions,
    Password: StringPromptOptions,
    Quiz: QuizPromptOptions,
    Scale: ScalePromptOptions,
    Select: ArrayPromptOptions,
    Snippet: SnippetPromptOptions,
    Sort: SortPromptOptions,
    Survey: SurveyPromptOptions,
    Text: StringPromptOptions,
    Toggle: TogglePromptOptions
  ): PromptOptionsMap = {
    val __obj = js.Dynamic.literal(AutoComplete = AutoComplete.asInstanceOf[js.Any], BasicAuth = BasicAuth.asInstanceOf[js.Any], Confirm = Confirm.asInstanceOf[js.Any], Editable = Editable.asInstanceOf[js.Any], Form = Form.asInstanceOf[js.Any], Input = Input.asInstanceOf[js.Any], Invisible = Invisible.asInstanceOf[js.Any], List = List.asInstanceOf[js.Any], MultiSelect = MultiSelect.asInstanceOf[js.Any], Numeral = Numeral.asInstanceOf[js.Any], Password = Password.asInstanceOf[js.Any], Quiz = Quiz.asInstanceOf[js.Any], Scale = Scale.asInstanceOf[js.Any], Select = Select.asInstanceOf[js.Any], Snippet = Snippet.asInstanceOf[js.Any], Sort = Sort.asInstanceOf[js.Any], Survey = Survey.asInstanceOf[js.Any], Text = Text.asInstanceOf[js.Any], Toggle = Toggle.asInstanceOf[js.Any])
    __obj.asInstanceOf[PromptOptionsMap]
  }
  
  extension [Self <: PromptOptionsMap](x: Self) {
    
    inline def setAutoComplete(value: ArrayPromptOptions): Self = StObject.set(x, "AutoComplete", value.asInstanceOf[js.Any])
    
    inline def setBasicAuth(value: StringPromptOptions): Self = StObject.set(x, "BasicAuth", value.asInstanceOf[js.Any])
    
    inline def setConfirm(value: BooleanPromptOptions): Self = StObject.set(x, "Confirm", value.asInstanceOf[js.Any])
    
    inline def setEditable(value: ArrayPromptOptions): Self = StObject.set(x, "Editable", value.asInstanceOf[js.Any])
    
    inline def setForm(value: ArrayPromptOptions): Self = StObject.set(x, "Form", value.asInstanceOf[js.Any])
    
    inline def setInput(value: StringPromptOptions): Self = StObject.set(x, "Input", value.asInstanceOf[js.Any])
    
    inline def setInvisible(value: StringPromptOptions): Self = StObject.set(x, "Invisible", value.asInstanceOf[js.Any])
    
    inline def setList(value: ArrayPromptOptions): Self = StObject.set(x, "List", value.asInstanceOf[js.Any])
    
    inline def setMultiSelect(value: ArrayPromptOptions): Self = StObject.set(x, "MultiSelect", value.asInstanceOf[js.Any])
    
    inline def setNumeral(value: NumberPromptOptions): Self = StObject.set(x, "Numeral", value.asInstanceOf[js.Any])
    
    inline def setPassword(value: StringPromptOptions): Self = StObject.set(x, "Password", value.asInstanceOf[js.Any])
    
    inline def setQuiz(value: QuizPromptOptions): Self = StObject.set(x, "Quiz", value.asInstanceOf[js.Any])
    
    inline def setScale(value: ScalePromptOptions): Self = StObject.set(x, "Scale", value.asInstanceOf[js.Any])
    
    inline def setSelect(value: ArrayPromptOptions): Self = StObject.set(x, "Select", value.asInstanceOf[js.Any])
    
    inline def setSnippet(value: SnippetPromptOptions): Self = StObject.set(x, "Snippet", value.asInstanceOf[js.Any])
    
    inline def setSort(value: SortPromptOptions): Self = StObject.set(x, "Sort", value.asInstanceOf[js.Any])
    
    inline def setSurvey(value: SurveyPromptOptions): Self = StObject.set(x, "Survey", value.asInstanceOf[js.Any])
    
    inline def setText(value: StringPromptOptions): Self = StObject.set(x, "Text", value.asInstanceOf[js.Any])
    
    inline def setToggle(value: TogglePromptOptions): Self = StObject.set(x, "Toggle", value.asInstanceOf[js.Any])
  }
}
