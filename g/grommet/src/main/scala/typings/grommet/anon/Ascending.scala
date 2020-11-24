package typings.grommet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Ascending extends js.Object {
  
  var ascending: js.UndefOr[js.Any] = js.native
  
  var contract: js.UndefOr[js.Any] = js.native
  
  var descending: js.UndefOr[js.Any] = js.native
  
  var expand: js.UndefOr[js.Any] = js.native
  
  var sortable: js.UndefOr[js.Any] = js.native
}
object Ascending {
  
  @scala.inline
  def apply(): Ascending = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Ascending]
  }
  
  @scala.inline
  implicit class AscendingOps[Self <: Ascending] (val x: Self) extends AnyVal {
    
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
    def setAscending(value: js.Any): Self = this.set("ascending", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAscending: Self = this.set("ascending", js.undefined)
    
    @scala.inline
    def setContract(value: js.Any): Self = this.set("contract", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContract: Self = this.set("contract", js.undefined)
    
    @scala.inline
    def setDescending(value: js.Any): Self = this.set("descending", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescending: Self = this.set("descending", js.undefined)
    
    @scala.inline
    def setExpand(value: js.Any): Self = this.set("expand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpand: Self = this.set("expand", js.undefined)
    
    @scala.inline
    def setSortable(value: js.Any): Self = this.set("sortable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSortable: Self = this.set("sortable", js.undefined)
  }
}
