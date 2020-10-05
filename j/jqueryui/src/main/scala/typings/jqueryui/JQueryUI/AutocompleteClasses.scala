package typings.jqueryui.JQueryUI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AutocompleteClasses extends js.Object {
  var `ui-autocomplete`: js.UndefOr[String] = js.native
  var `ui-autocomplete-input`: js.UndefOr[String] = js.native
}

object AutocompleteClasses {
  @scala.inline
  def apply(): AutocompleteClasses = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutocompleteClasses]
  }
  @scala.inline
  implicit class AutocompleteClassesOps[Self <: AutocompleteClasses] (val x: Self) extends AnyVal {
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
    def `setUi-autocomplete`(value: String): Self = this.set("ui-autocomplete", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteUi-autocomplete`: Self = this.set("ui-autocomplete", js.undefined)
    @scala.inline
    def `setUi-autocomplete-input`(value: String): Self = this.set("ui-autocomplete-input", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteUi-autocomplete-input`: Self = this.set("ui-autocomplete-input", js.undefined)
  }
  
}

