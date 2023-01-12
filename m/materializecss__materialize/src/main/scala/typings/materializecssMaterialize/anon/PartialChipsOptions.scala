package typings.materializecssMaterialize.anon

import typings.materializecssMaterialize.M.ChipData
import typings.materializecssMaterialize.M.Chips
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@materializecss/materialize.M.ChipsOptions> */
trait PartialChipsOptions extends StObject {
  
  var autocompleteOnly: js.UndefOr[Boolean] = js.undefined
  
  var autocompleteOptions: js.UndefOr[PartialAutocompleteOption] = js.undefined
  
  var data: js.UndefOr[js.Array[ChipData]] = js.undefined
  
  var limit: js.UndefOr[Double] = js.undefined
  
  var onChipAdd: js.UndefOr[
    js.ThisFunction2[/* this */ Chips, /* element */ Element, /* chip */ Element, Unit]
  ] = js.undefined
  
  var onChipDelete: js.UndefOr[
    js.ThisFunction2[/* this */ Chips, /* element */ Element, /* chip */ Element, Unit]
  ] = js.undefined
  
  var onChipSelect: js.UndefOr[
    js.ThisFunction2[/* this */ Chips, /* element */ Element, /* chip */ Element, Unit]
  ] = js.undefined
  
  var placeholder: js.UndefOr[String] = js.undefined
  
  var secondaryPlaceholder: js.UndefOr[String] = js.undefined
}
object PartialChipsOptions {
  
  inline def apply(): PartialChipsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialChipsOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialChipsOptions] (val x: Self) extends AnyVal {
    
    inline def setAutocompleteOnly(value: Boolean): Self = StObject.set(x, "autocompleteOnly", value.asInstanceOf[js.Any])
    
    inline def setAutocompleteOnlyUndefined: Self = StObject.set(x, "autocompleteOnly", js.undefined)
    
    inline def setAutocompleteOptions(value: PartialAutocompleteOption): Self = StObject.set(x, "autocompleteOptions", value.asInstanceOf[js.Any])
    
    inline def setAutocompleteOptionsUndefined: Self = StObject.set(x, "autocompleteOptions", js.undefined)
    
    inline def setData(value: js.Array[ChipData]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setDataVarargs(value: ChipData*): Self = StObject.set(x, "data", js.Array(value*))
    
    inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    inline def setOnChipAdd(value: js.ThisFunction2[/* this */ Chips, /* element */ Element, /* chip */ Element, Unit]): Self = StObject.set(x, "onChipAdd", value.asInstanceOf[js.Any])
    
    inline def setOnChipAddUndefined: Self = StObject.set(x, "onChipAdd", js.undefined)
    
    inline def setOnChipDelete(value: js.ThisFunction2[/* this */ Chips, /* element */ Element, /* chip */ Element, Unit]): Self = StObject.set(x, "onChipDelete", value.asInstanceOf[js.Any])
    
    inline def setOnChipDeleteUndefined: Self = StObject.set(x, "onChipDelete", js.undefined)
    
    inline def setOnChipSelect(value: js.ThisFunction2[/* this */ Chips, /* element */ Element, /* chip */ Element, Unit]): Self = StObject.set(x, "onChipSelect", value.asInstanceOf[js.Any])
    
    inline def setOnChipSelectUndefined: Self = StObject.set(x, "onChipSelect", js.undefined)
    
    inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
    
    inline def setSecondaryPlaceholder(value: String): Self = StObject.set(x, "secondaryPlaceholder", value.asInstanceOf[js.Any])
    
    inline def setSecondaryPlaceholderUndefined: Self = StObject.set(x, "secondaryPlaceholder", js.undefined)
  }
}
