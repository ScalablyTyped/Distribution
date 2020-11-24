package typings.materializeCss.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<materialize-css.M.Autocomplete, 'updateData'> */
@js.native
trait PickAutocompleteupdateDat extends js.Object {
  
  var updateData: js.UndefOr[js.Any] = js.native
}
object PickAutocompleteupdateDat {
  
  @scala.inline
  def apply(): PickAutocompleteupdateDat = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickAutocompleteupdateDat]
  }
  
  @scala.inline
  implicit class PickAutocompleteupdateDatOps[Self <: PickAutocompleteupdateDat] (val x: Self) extends AnyVal {
    
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
    def setUpdateData(value: js.Any): Self = this.set("updateData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateData: Self = this.set("updateData", js.undefined)
  }
}
