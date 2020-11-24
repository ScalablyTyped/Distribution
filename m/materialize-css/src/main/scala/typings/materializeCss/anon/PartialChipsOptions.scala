package typings.materializeCss.anon

import typings.materializeCss.M.ChipData
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<materialize-css.M.ChipsOptions> */
@js.native
trait PartialChipsOptions extends js.Object {
  
  var autocompleteOptions: js.UndefOr[PartialAutocompleteOptionData] = js.native
  
  var data: js.UndefOr[js.Array[ChipData]] = js.native
  
  var limit: js.UndefOr[Double] = js.native
  
  var onChipAdd: js.UndefOr[
    js.ThisFunction2[/* this */ this.type, /* element */ Element, /* chip */ Element, Unit]
  ] = js.native
  
  var onChipDelete: js.UndefOr[
    js.ThisFunction2[/* this */ this.type, /* element */ Element, /* chip */ Element, Unit]
  ] = js.native
  
  var onChipSelect: js.UndefOr[
    js.ThisFunction2[/* this */ this.type, /* element */ Element, /* chip */ Element, Unit]
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
  implicit class PartialChipsOptionsOps[Self <: PartialChipsOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAutocompleteOptions(value: PartialAutocompleteOptionData): Self = this.set("autocompleteOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutocompleteOptions: Self = this.set("autocompleteOptions", js.undefined)
    
    @scala.inline
    def setDataVarargs(value: ChipData*): Self = this.set("data", js.Array(value :_*))
    
    @scala.inline
    def setData(value: js.Array[ChipData]): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    
    @scala.inline
    def setLimit(value: Double): Self = this.set("limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLimit: Self = this.set("limit", js.undefined)
    
    @scala.inline
    def setOnChipAdd(value: js.ThisFunction2[PartialChipsOptions, /* element */ Element, /* chip */ Element, Unit]): Self = this.set("onChipAdd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnChipAdd: Self = this.set("onChipAdd", js.undefined)
    
    @scala.inline
    def setOnChipDelete(value: js.ThisFunction2[PartialChipsOptions, /* element */ Element, /* chip */ Element, Unit]): Self = this.set("onChipDelete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnChipDelete: Self = this.set("onChipDelete", js.undefined)
    
    @scala.inline
    def setOnChipSelect(value: js.ThisFunction2[PartialChipsOptions, /* element */ Element, /* chip */ Element, Unit]): Self = this.set("onChipSelect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnChipSelect: Self = this.set("onChipSelect", js.undefined)
    
    @scala.inline
    def setPlaceholder(value: String): Self = this.set("placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlaceholder: Self = this.set("placeholder", js.undefined)
    
    @scala.inline
    def setSecondaryPlaceholder(value: String): Self = this.set("secondaryPlaceholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecondaryPlaceholder: Self = this.set("secondaryPlaceholder", js.undefined)
  }
}
