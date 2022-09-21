package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextField extends StObject {
  
  /** The initial set of auto complete items without any user input. */
  var autoComplete: js.UndefOr[AutoComplete] = js.undefined
  
  /**
    * The refresh function which returns AutoComplete based on the user's input text. If the callback is not specified, auto complete will be purely done in client side based on the
    * auto_complete items.
    */
  var autoCompleteCallback: js.UndefOr[FormAction] = js.undefined
  
  /** When set to true, a user can input multiple auto-complet items. */
  var autoCompleteMultipleSelections: js.UndefOr[Boolean] = js.undefined
  
  var hintText: js.UndefOr[String] = js.undefined
  
  /** One of label or hint_text is required to be specified by the developers. */
  var label: js.UndefOr[String] = js.undefined
  
  var maxLines: js.UndefOr[Double] = js.undefined
  
  /** The name of the text field which is will be used in FormInput. */
  var name: js.UndefOr[String] = js.undefined
  
  var onChange: js.UndefOr[FormAction] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
  
  /** The default value when no input from user. */
  var value: js.UndefOr[String] = js.undefined
}
object TextField {
  
  inline def apply(): TextField = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextField]
  }
  
  extension [Self <: TextField](x: Self) {
    
    inline def setAutoComplete(value: AutoComplete): Self = StObject.set(x, "autoComplete", value.asInstanceOf[js.Any])
    
    inline def setAutoCompleteCallback(value: FormAction): Self = StObject.set(x, "autoCompleteCallback", value.asInstanceOf[js.Any])
    
    inline def setAutoCompleteCallbackUndefined: Self = StObject.set(x, "autoCompleteCallback", js.undefined)
    
    inline def setAutoCompleteMultipleSelections(value: Boolean): Self = StObject.set(x, "autoCompleteMultipleSelections", value.asInstanceOf[js.Any])
    
    inline def setAutoCompleteMultipleSelectionsUndefined: Self = StObject.set(x, "autoCompleteMultipleSelections", js.undefined)
    
    inline def setAutoCompleteUndefined: Self = StObject.set(x, "autoComplete", js.undefined)
    
    inline def setHintText(value: String): Self = StObject.set(x, "hintText", value.asInstanceOf[js.Any])
    
    inline def setHintTextUndefined: Self = StObject.set(x, "hintText", js.undefined)
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setMaxLines(value: Double): Self = StObject.set(x, "maxLines", value.asInstanceOf[js.Any])
    
    inline def setMaxLinesUndefined: Self = StObject.set(x, "maxLines", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOnChange(value: FormAction): Self = StObject.set(x, "onChange", value.asInstanceOf[js.Any])
    
    inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
