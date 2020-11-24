package typings.materialUiLab.useAutocompleteUseAutocompleteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FilterOptionsState[T] extends js.Object {
  
  def getOptionLabel(option: T): String = js.native
  
  var inputValue: String = js.native
}
object FilterOptionsState {
  
  @scala.inline
  def apply[T](getOptionLabel: T => String, inputValue: String): FilterOptionsState[T] = {
    val __obj = js.Dynamic.literal(getOptionLabel = js.Any.fromFunction1(getOptionLabel), inputValue = inputValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterOptionsState[T]]
  }
  
  @scala.inline
  implicit class FilterOptionsStateOps[Self <: FilterOptionsState[_], T] (val x: Self with FilterOptionsState[T]) extends AnyVal {
    
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
    def setGetOptionLabel(value: T => String): Self = this.set("getOptionLabel", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInputValue(value: String): Self = this.set("inputValue", value.asInstanceOf[js.Any])
  }
}
