package typings.materializeCss.anon

import typings.materializeCss.M.AutocompleteData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<materialize-css.M.AutocompleteOptions> */
@js.native
trait PartialAutocompleteOption extends js.Object {
  
  var data: js.UndefOr[AutocompleteData] = js.native
  
  var limit: js.UndefOr[Double] = js.native
  
  var minLength: js.UndefOr[Double] = js.native
  
  var onAutocomplete: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* text */ String, Unit]] = js.native
  
  var sortFunction: js.UndefOr[js.Function3[/* a */ String, /* b */ String, /* inputText */ String, Double]] = js.native
}
object PartialAutocompleteOption {
  
  @scala.inline
  def apply(): PartialAutocompleteOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialAutocompleteOption]
  }
  
  @scala.inline
  implicit class PartialAutocompleteOptionOps[Self <: PartialAutocompleteOption] (val x: Self) extends AnyVal {
    
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
    def setData(value: AutocompleteData): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    
    @scala.inline
    def setLimit(value: Double): Self = this.set("limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLimit: Self = this.set("limit", js.undefined)
    
    @scala.inline
    def setMinLength(value: Double): Self = this.set("minLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinLength: Self = this.set("minLength", js.undefined)
    
    @scala.inline
    def setOnAutocomplete(value: js.ThisFunction1[PartialAutocompleteOption, /* text */ String, Unit]): Self = this.set("onAutocomplete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnAutocomplete: Self = this.set("onAutocomplete", js.undefined)
    
    @scala.inline
    def setSortFunction(value: (/* a */ String, /* b */ String, /* inputText */ String) => Double): Self = this.set("sortFunction", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteSortFunction: Self = this.set("sortFunction", js.undefined)
  }
}
