package typings.jsforce.salesforceObjectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdatedRecordsInfo extends js.Object {
  
  var ids: js.Array[String] = js.native
  
  var latestDateCovered: String = js.native
}
object UpdatedRecordsInfo {
  
  @scala.inline
  def apply(ids: js.Array[String], latestDateCovered: String): UpdatedRecordsInfo = {
    val __obj = js.Dynamic.literal(ids = ids.asInstanceOf[js.Any], latestDateCovered = latestDateCovered.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdatedRecordsInfo]
  }
  
  @scala.inline
  implicit class UpdatedRecordsInfoOps[Self <: UpdatedRecordsInfo] (val x: Self) extends AnyVal {
    
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
    def setIdsVarargs(value: String*): Self = this.set("ids", js.Array(value :_*))
    
    @scala.inline
    def setIds(value: js.Array[String]): Self = this.set("ids", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLatestDateCovered(value: String): Self = this.set("latestDateCovered", value.asInstanceOf[js.Any])
  }
}
