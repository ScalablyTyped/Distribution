package typings.jsforce.salesforceObjectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeletedRecordsInfo extends js.Object {
  
  var deletedRecords: js.Array[DeletedRecord] = js.native
  
  var earliestDateAvailable: String = js.native
  
  var latestDateCovered: String = js.native
}
object DeletedRecordsInfo {
  
  @scala.inline
  def apply(deletedRecords: js.Array[DeletedRecord], earliestDateAvailable: String, latestDateCovered: String): DeletedRecordsInfo = {
    val __obj = js.Dynamic.literal(deletedRecords = deletedRecords.asInstanceOf[js.Any], earliestDateAvailable = earliestDateAvailable.asInstanceOf[js.Any], latestDateCovered = latestDateCovered.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeletedRecordsInfo]
  }
  
  @scala.inline
  implicit class DeletedRecordsInfoOps[Self <: DeletedRecordsInfo] (val x: Self) extends AnyVal {
    
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
    def setDeletedRecordsVarargs(value: DeletedRecord*): Self = this.set("deletedRecords", js.Array(value :_*))
    
    @scala.inline
    def setDeletedRecords(value: js.Array[DeletedRecord]): Self = this.set("deletedRecords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEarliestDateAvailable(value: String): Self = this.set("earliestDateAvailable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLatestDateCovered(value: String): Self = this.set("latestDateCovered", value.asInstanceOf[js.Any])
  }
}
