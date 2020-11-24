package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EditRangePasswordNeededEventUIParam extends js.Object {
  
  /**
    * Gets a reference to the spreadsheet widget.
    */
  var owner: js.UndefOr[js.Any] = js.native
  
  /**
    * Get an array of [protected range](ig.excel.WorksheetProtectedRange) objects that should be unlocked.
    */
  var ranges: js.UndefOr[js.Array[_]] = js.native
  
  /**
    * Get a parameterless function that may be invoked to unlock the associated ranges.
    */
  var unprotect: js.UndefOr[js.Any] = js.native
}
object EditRangePasswordNeededEventUIParam {
  
  @scala.inline
  def apply(): EditRangePasswordNeededEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EditRangePasswordNeededEventUIParam]
  }
  
  @scala.inline
  implicit class EditRangePasswordNeededEventUIParamOps[Self <: EditRangePasswordNeededEventUIParam] (val x: Self) extends AnyVal {
    
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
    def setOwner(value: js.Any): Self = this.set("owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOwner: Self = this.set("owner", js.undefined)
    
    @scala.inline
    def setRangesVarargs(value: js.Any*): Self = this.set("ranges", js.Array(value :_*))
    
    @scala.inline
    def setRanges(value: js.Array[_]): Self = this.set("ranges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRanges: Self = this.set("ranges", js.undefined)
    
    @scala.inline
    def setUnprotect(value: js.Any): Self = this.set("unprotect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnprotect: Self = this.set("unprotect", js.undefined)
  }
}
