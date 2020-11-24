package typings.googleapis.jobsV2Mod.jobsV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Deprecated. Use BatchDeleteJobsRequest instead.  Input only.  Filter for
  * jobs to be deleted.
  */
@js.native
trait SchemaFilter extends js.Object {
  
  /**
    * Required.  The requisition ID (or posting ID) assigned by the client to
    * identify a job. This is intended for client identification and tracking
    * of listings. name takes precedence over this field The maximum number of
    * allowed characters is 225.
    */
  var requisitionId: js.UndefOr[String] = js.native
}
object SchemaFilter {
  
  @scala.inline
  def apply(): SchemaFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFilter]
  }
  
  @scala.inline
  implicit class SchemaFilterOps[Self <: SchemaFilter] (val x: Self) extends AnyVal {
    
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
    def setRequisitionId(value: String): Self = this.set("requisitionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequisitionId: Self = this.set("requisitionId", js.undefined)
  }
}
