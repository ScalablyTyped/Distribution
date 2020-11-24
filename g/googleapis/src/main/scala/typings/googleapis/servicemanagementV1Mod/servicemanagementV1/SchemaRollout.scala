package typings.googleapis.servicemanagementV1Mod.servicemanagementV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A rollout resource that defines how service configuration versions are
  * pushed to control plane systems. Typically, you create a new version of the
  * service config, and then create a Rollout to push the service config.
  */
@js.native
trait SchemaRollout extends js.Object {
  
  /**
    * Creation time of the rollout. Readonly.
    */
  var createTime: js.UndefOr[String] = js.native
  
  /**
    * The user who created the Rollout. Readonly.
    */
  var createdBy: js.UndefOr[String] = js.native
  
  /**
    * The strategy associated with a rollout to delete a `ManagedService`.
    * Readonly.
    */
  var deleteServiceStrategy: js.UndefOr[SchemaDeleteServiceStrategy] = js.native
  
  /**
    * Optional unique identifier of this Rollout. Only lower case letters,
    * digits  and &#39;-&#39; are allowed.  If not specified by client, the
    * server will generate one. The generated id will have the form of
    * &lt;date&gt;&lt;revision number&gt;, where &quot;date&quot; is the create
    * date in ISO 8601 format.  &quot;revision number&quot; is a monotonically
    * increasing positive number that is reset every day for each service. An
    * example of the generated rollout_id is &#39;2016-02-16r1&#39;
    */
  var rolloutId: js.UndefOr[String] = js.native
  
  /**
    * The name of the service associated with this Rollout.
    */
  var serviceName: js.UndefOr[String] = js.native
  
  /**
    * The status of this rollout. Readonly. In case of a failed rollout, the
    * system will automatically rollback to the current Rollout version.
    * Readonly.
    */
  var status: js.UndefOr[String] = js.native
  
  /**
    * Google Service Control selects service configurations based on traffic
    * percentage.
    */
  var trafficPercentStrategy: js.UndefOr[SchemaTrafficPercentStrategy] = js.native
}
object SchemaRollout {
  
  @scala.inline
  def apply(): SchemaRollout = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRollout]
  }
  
  @scala.inline
  implicit class SchemaRolloutOps[Self <: SchemaRollout] (val x: Self) extends AnyVal {
    
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
    def setCreateTime(value: String): Self = this.set("createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateTime: Self = this.set("createTime", js.undefined)
    
    @scala.inline
    def setCreatedBy(value: String): Self = this.set("createdBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedBy: Self = this.set("createdBy", js.undefined)
    
    @scala.inline
    def setDeleteServiceStrategy(value: SchemaDeleteServiceStrategy): Self = this.set("deleteServiceStrategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeleteServiceStrategy: Self = this.set("deleteServiceStrategy", js.undefined)
    
    @scala.inline
    def setRolloutId(value: String): Self = this.set("rolloutId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRolloutId: Self = this.set("rolloutId", js.undefined)
    
    @scala.inline
    def setServiceName(value: String): Self = this.set("serviceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServiceName: Self = this.set("serviceName", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
    @scala.inline
    def setTrafficPercentStrategy(value: SchemaTrafficPercentStrategy): Self = this.set("trafficPercentStrategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrafficPercentStrategy: Self = this.set("trafficPercentStrategy", js.undefined)
  }
}
