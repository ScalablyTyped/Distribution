package typings.materializecssMaterialize.anon

import typings.materializecssMaterialize.M.Autocomplete
import typings.materializecssMaterialize.M.AutocompleteData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@materializecss/materialize.M.AutocompleteOptions> */
trait PartialAutocompleteOption extends StObject {
  
  var allowUnsafeHTML: js.UndefOr[Boolean] = js.undefined
  
  var data: js.UndefOr[AutocompleteData] = js.undefined
  
  var limit: js.UndefOr[Double] = js.undefined
  
  var minLength: js.UndefOr[Double] = js.undefined
  
  var onAutocomplete: js.UndefOr[js.ThisFunction1[/* this */ Autocomplete, /* text */ String, Unit]] = js.undefined
  
  var sortFunction: js.UndefOr[js.Function3[/* a */ String, /* b */ String, /* inputText */ String, Double]] = js.undefined
}
object PartialAutocompleteOption {
  
  inline def apply(): PartialAutocompleteOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialAutocompleteOption]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialAutocompleteOption] (val x: Self) extends AnyVal {
    
    inline def setAllowUnsafeHTML(value: Boolean): Self = StObject.set(x, "allowUnsafeHTML", value.asInstanceOf[js.Any])
    
    inline def setAllowUnsafeHTMLUndefined: Self = StObject.set(x, "allowUnsafeHTML", js.undefined)
    
    inline def setData(value: AutocompleteData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    inline def setMinLength(value: Double): Self = StObject.set(x, "minLength", value.asInstanceOf[js.Any])
    
    inline def setMinLengthUndefined: Self = StObject.set(x, "minLength", js.undefined)
    
    inline def setOnAutocomplete(value: js.ThisFunction1[/* this */ Autocomplete, /* text */ String, Unit]): Self = StObject.set(x, "onAutocomplete", value.asInstanceOf[js.Any])
    
    inline def setOnAutocompleteUndefined: Self = StObject.set(x, "onAutocomplete", js.undefined)
    
    inline def setSortFunction(value: (/* a */ String, /* b */ String, /* inputText */ String) => Double): Self = StObject.set(x, "sortFunction", js.Any.fromFunction3(value))
    
    inline def setSortFunctionUndefined: Self = StObject.set(x, "sortFunction", js.undefined)
  }
}
