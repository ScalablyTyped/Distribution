package typings.materializeCss.anon

import typings.materializeCss.M.ChipData
import typings.materializeCss.M.Chips
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<materialize-css.M.ChipsOptions> */
@js.native
trait PartialChipsOptions extends StObject {
  
  var autocompleteOptions: js.UndefOr[PartialAutocompleteOption] = js.native
  
  var data: js.UndefOr[js.Array[ChipData]] = js.native
  
  var limit: js.UndefOr[Double] = js.native
  
  var onChipAdd: js.UndefOr[
    js.ThisFunction2[/* this */ Chips, /* element */ Element, /* chip */ Element, Unit]
  ] = js.native
  
  var onChipDelete: js.UndefOr[
    js.ThisFunction2[/* this */ Chips, /* element */ Element, /* chip */ Element, Unit]
  ] = js.native
  
  var onChipSelect: js.UndefOr[
    js.ThisFunction2[/* this */ Chips, /* element */ Element, /* chip */ Element, Unit]
  ] = js.native
  
  var placeholder: js.UndefOr[String] = js.native
  
  var secondaryPlaceholder: js.UndefOr[String] = js.native
}
object PartialChipsOptions {
  
  @scala.inline
  def apply(): PartialChipsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialChipsOptions]
  }
  
  @scala.inline
  implicit class PartialChipsOptionsMutableBuilder[Self <: PartialChipsOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutocompleteOptions(value: PartialAutocompleteOption): Self = StObject.set(x, "autocompleteOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutocompleteOptionsUndefined: Self = StObject.set(x, "autocompleteOptions", js.undefined)
    
    @scala.inline
    def setData(value: js.Array[ChipData]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setDataVarargs(value: ChipData*): Self = StObject.set(x, "data", js.Array(value :_*))
    
    @scala.inline
    def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    @scala.inline
    def setOnChipAdd(value: js.ThisFunction2[/* this */ Chips, /* element */ Element, /* chip */ Element, Unit]): Self = StObject.set(x, "onChipAdd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnChipAddUndefined: Self = StObject.set(x, "onChipAdd", js.undefined)
    
    @scala.inline
    def setOnChipDelete(value: js.ThisFunction2[/* this */ Chips, /* element */ Element, /* chip */ Element, Unit]): Self = StObject.set(x, "onChipDelete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnChipDeleteUndefined: Self = StObject.set(x, "onChipDelete", js.undefined)
    
    @scala.inline
    def setOnChipSelect(value: js.ThisFunction2[/* this */ Chips, /* element */ Element, /* chip */ Element, Unit]): Self = StObject.set(x, "onChipSelect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnChipSelectUndefined: Self = StObject.set(x, "onChipSelect", js.undefined)
    
    @scala.inline
    def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
    
    @scala.inline
    def setSecondaryPlaceholder(value: String): Self = StObject.set(x, "secondaryPlaceholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecondaryPlaceholderUndefined: Self = StObject.set(x, "secondaryPlaceholder", js.undefined)
  }
}
