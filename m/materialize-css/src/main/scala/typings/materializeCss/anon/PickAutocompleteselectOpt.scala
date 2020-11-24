package typings.materializeCss.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<materialize-css.M.Autocomplete, 'selectOption'> */
@js.native
trait PickAutocompleteselectOpt extends js.Object {
  
  var selectOption: js.UndefOr[js.Any] = js.native
}
object PickAutocompleteselectOpt {
  
  @scala.inline
  def apply(): PickAutocompleteselectOpt = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickAutocompleteselectOpt]
  }
  
  @scala.inline
  implicit class PickAutocompleteselectOptOps[Self <: PickAutocompleteselectOpt] (val x: Self) extends AnyVal {
    
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
    def setSelectOption(value: js.Any): Self = this.set("selectOption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectOption: Self = this.set("selectOption", js.undefined)
  }
}
