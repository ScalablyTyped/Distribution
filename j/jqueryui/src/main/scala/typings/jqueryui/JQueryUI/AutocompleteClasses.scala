package typings.jqueryui.JQueryUI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutocompleteClasses extends StObject {
  
  var `ui-autocomplete`: js.UndefOr[String] = js.undefined
  
  var `ui-autocomplete-input`: js.UndefOr[String] = js.undefined
}
object AutocompleteClasses {
  
  inline def apply(): AutocompleteClasses = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutocompleteClasses]
  }
  
  extension [Self <: AutocompleteClasses](x: Self) {
    
    inline def `setUi-autocomplete`(value: String): Self = StObject.set(x, "ui-autocomplete", value.asInstanceOf[js.Any])
    
    inline def `setUi-autocomplete-input`(value: String): Self = StObject.set(x, "ui-autocomplete-input", value.asInstanceOf[js.Any])
    
    inline def `setUi-autocomplete-inputUndefined`: Self = StObject.set(x, "ui-autocomplete-input", js.undefined)
    
    inline def `setUi-autocompleteUndefined`: Self = StObject.set(x, "ui-autocomplete", js.undefined)
  }
}
