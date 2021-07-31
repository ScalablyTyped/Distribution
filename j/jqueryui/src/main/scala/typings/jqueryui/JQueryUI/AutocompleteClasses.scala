package typings.jqueryui.JQueryUI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutocompleteClasses extends StObject {
  
  var `ui-autocomplete`: js.UndefOr[String] = js.undefined
  
  var `ui-autocomplete-input`: js.UndefOr[String] = js.undefined
}
object AutocompleteClasses {
  
  @scala.inline
  def apply(): AutocompleteClasses = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutocompleteClasses]
  }
  
  @scala.inline
  implicit class AutocompleteClassesMutableBuilder[Self <: AutocompleteClasses] (val x: Self) extends AnyVal {
    
    @scala.inline
    def `setUi-autocomplete`(value: String): Self = StObject.set(x, "ui-autocomplete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setUi-autocomplete-input`(value: String): Self = StObject.set(x, "ui-autocomplete-input", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setUi-autocomplete-inputUndefined`: Self = StObject.set(x, "ui-autocomplete-input", js.undefined)
    
    @scala.inline
    def `setUi-autocompleteUndefined`: Self = StObject.set(x, "ui-autocomplete", js.undefined)
  }
}
