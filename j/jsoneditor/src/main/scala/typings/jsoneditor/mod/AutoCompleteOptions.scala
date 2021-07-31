package typings.jsoneditor.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutoCompleteOptions extends StObject {
  
  /**
    * Indicate if the autocomplete is going to be strict case-sensitive to match the options.
    */
  var caseSensitive: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicate the KeyCodes for trigger confirm completion, by default those keys are: `[39, 35, 9]` which are the code for `[right, end, tab]`.
    * @default [39, 35, 9]
    */
  var confirmKeys: js.UndefOr[js.Array[Double]] = js.undefined
  
  /**
    * Pick one of the two strategies, or define a custom filter function.
    *
    * 'start': Match your input from the start, e.g. 'ap' matches 'apple' but 'pl' does not.
    *
    * 'contain': Contains the user's input or not, e.g. 'pl' matches 'apple' too.
    */
  var filter: js.UndefOr[AutoCompleteMatchingStrategy | (js.Function1[/* query */ String, Boolean])] = js.undefined
  
  /**
    * This function will return your possible options for create the autocomplete selection,
    * you can control dynamically which options you want to display according to the current active editing node.
    * @param text The text in the current node part (basically the text that the user is editing).
    * @param path The path of the node that is being edited as an array.
    * @param input Can be 'field' or 'value' depending if the user is editing a field name or a value of a node.
    * @param editor The editor instance object that is being edited.
    */
  var getOptions: js.UndefOr[
    js.Function4[
      /* text */ String, 
      /* path */ JSONPath, 
      /* input */ AutoCompleteElementType, 
      /* editor */ JSONEditor, 
      AutoCompleteCompletion | js.Promise[AutoCompleteCompletion]
    ]
  ] = js.undefined
  
  /**
    * Indicate the way to trigger autocomplete menu.
    *
    * 'keydown': When you type something in the field or value, it will trigger autocomplete immediately.
    *
    * 'focus': When you focus in the field or value, it will trigger the autocomplete.
    * @default 'keydown'
    */
  var trigger: js.UndefOr[AutoCompleteTrigger] = js.undefined
}
object AutoCompleteOptions {
  
  @scala.inline
  def apply(): AutoCompleteOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoCompleteOptions]
  }
  
  @scala.inline
  implicit class AutoCompleteOptionsMutableBuilder[Self <: AutoCompleteOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCaseSensitive(value: Boolean): Self = StObject.set(x, "caseSensitive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaseSensitiveUndefined: Self = StObject.set(x, "caseSensitive", js.undefined)
    
    @scala.inline
    def setConfirmKeys(value: js.Array[Double]): Self = StObject.set(x, "confirmKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfirmKeysUndefined: Self = StObject.set(x, "confirmKeys", js.undefined)
    
    @scala.inline
    def setConfirmKeysVarargs(value: Double*): Self = StObject.set(x, "confirmKeys", js.Array(value :_*))
    
    @scala.inline
    def setFilter(value: AutoCompleteMatchingStrategy | (js.Function1[/* query */ String, Boolean])): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterFunction1(value: /* query */ String => Boolean): Self = StObject.set(x, "filter", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    @scala.inline
    def setGetOptions(
      value: (/* text */ String, /* path */ JSONPath, /* input */ AutoCompleteElementType, /* editor */ JSONEditor) => AutoCompleteCompletion | js.Promise[AutoCompleteCompletion]
    ): Self = StObject.set(x, "getOptions", js.Any.fromFunction4(value))
    
    @scala.inline
    def setGetOptionsUndefined: Self = StObject.set(x, "getOptions", js.undefined)
    
    @scala.inline
    def setTrigger(value: AutoCompleteTrigger): Self = StObject.set(x, "trigger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTriggerUndefined: Self = StObject.set(x, "trigger", js.undefined)
  }
}
