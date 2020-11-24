package typings.materializeCss.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<materialize-css.M.Datepicker, 'setDate'> */
@js.native
trait PickDatepickersetDate extends js.Object {
  
  var setDate: js.UndefOr[js.Any] = js.native
}
object PickDatepickersetDate {
  
  @scala.inline
  def apply(): PickDatepickersetDate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickDatepickersetDate]
  }
  
  @scala.inline
  implicit class PickDatepickersetDateOps[Self <: PickDatepickersetDate] (val x: Self) extends AnyVal {
    
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
    def setSetDate(value: js.Any): Self = this.set("setDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSetDate: Self = this.set("setDate", js.undefined)
  }
}
