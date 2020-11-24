package typings.materialUiLab.useAutocompleteUseAutocompleteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AutocompleteChangeDetails[T] extends js.Object {
  
  var option: T = js.native
}
object AutocompleteChangeDetails {
  
  @scala.inline
  def apply[T](option: T): AutocompleteChangeDetails[T] = {
    val __obj = js.Dynamic.literal(option = option.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutocompleteChangeDetails[T]]
  }
  
  @scala.inline
  implicit class AutocompleteChangeDetailsOps[Self <: AutocompleteChangeDetails[_], T] (val x: Self with AutocompleteChangeDetails[T]) extends AnyVal {
    
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
    def setOption(value: T): Self = this.set("option", value.asInstanceOf[js.Any])
  }
}
