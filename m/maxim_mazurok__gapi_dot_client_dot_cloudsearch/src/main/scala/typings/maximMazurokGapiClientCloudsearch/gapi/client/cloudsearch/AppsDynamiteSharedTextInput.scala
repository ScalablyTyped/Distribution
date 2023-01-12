package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppsDynamiteSharedTextInput extends StObject {
  
  /**
    * The refresh function that returns suggestions based on the user's input text. If the callback is not specified, autocomplete is done in client side based on the initial suggestion
    * items.
    */
  var autoCompleteAction: js.UndefOr[AppsDynamiteSharedAction] = js.undefined
  
  /** The hint text. */
  var hintText: js.UndefOr[String] = js.undefined
  
  /** The initial suggestions made before any user input. */
  var initialSuggestions: js.UndefOr[AppsDynamiteSharedSuggestions] = js.undefined
  
  /** At least one of label and hintText must be specified. */
  var label: js.UndefOr[String] = js.undefined
  
  /** The name of the text input which is used in formInput. */
  var name: js.UndefOr[String] = js.undefined
  
  /** The onChange action, for example, invoke a function. */
  var onChangeAction: js.UndefOr[AppsDynamiteSharedAction] = js.undefined
  
  /** The style of the text, for example, a single line or multiple lines. */
  var `type`: js.UndefOr[String] = js.undefined
  
  /** The default value when there is no input from the user. */
  var value: js.UndefOr[String] = js.undefined
}
object AppsDynamiteSharedTextInput {
  
  inline def apply(): AppsDynamiteSharedTextInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppsDynamiteSharedTextInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AppsDynamiteSharedTextInput] (val x: Self) extends AnyVal {
    
    inline def setAutoCompleteAction(value: AppsDynamiteSharedAction): Self = StObject.set(x, "autoCompleteAction", value.asInstanceOf[js.Any])
    
    inline def setAutoCompleteActionUndefined: Self = StObject.set(x, "autoCompleteAction", js.undefined)
    
    inline def setHintText(value: String): Self = StObject.set(x, "hintText", value.asInstanceOf[js.Any])
    
    inline def setHintTextUndefined: Self = StObject.set(x, "hintText", js.undefined)
    
    inline def setInitialSuggestions(value: AppsDynamiteSharedSuggestions): Self = StObject.set(x, "initialSuggestions", value.asInstanceOf[js.Any])
    
    inline def setInitialSuggestionsUndefined: Self = StObject.set(x, "initialSuggestions", js.undefined)
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOnChangeAction(value: AppsDynamiteSharedAction): Self = StObject.set(x, "onChangeAction", value.asInstanceOf[js.Any])
    
    inline def setOnChangeActionUndefined: Self = StObject.set(x, "onChangeAction", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
