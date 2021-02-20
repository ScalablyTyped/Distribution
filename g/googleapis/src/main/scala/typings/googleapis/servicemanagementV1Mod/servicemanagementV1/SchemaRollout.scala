package typings.googleapis.servicemanagementV1Mod.servicemanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A rollout resource that defines how service configuration versions are
  * pushed to control plane systems. Typically, you create a new version of the
  * service config, and then create a Rollout to push the service config.
  */
@js.native
trait SchemaRollout extends StObject {
  
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
  implicit class SchemaRolloutMutableBuilder[Self <: SchemaRollout] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    @scala.inline
    def setCreatedBy(value: String): Self = StObject.set(x, "createdBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedByUndefined: Self = StObject.set(x, "createdBy", js.undefined)
    
    @scala.inline
    def setDeleteServiceStrategy(value: SchemaDeleteServiceStrategy): Self = StObject.set(x, "deleteServiceStrategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteServiceStrategyUndefined: Self = StObject.set(x, "deleteServiceStrategy", js.undefined)
    
    @scala.inline
    def setRolloutId(value: String): Self = StObject.set(x, "rolloutId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRolloutIdUndefined: Self = StObject.set(x, "rolloutId", js.undefined)
    
    @scala.inline
    def setServiceName(value: String): Self = StObject.set(x, "serviceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceNameUndefined: Self = StObject.set(x, "serviceName", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setTrafficPercentStrategy(value: SchemaTrafficPercentStrategy): Self = StObject.set(x, "trafficPercentStrategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrafficPercentStrategyUndefined: Self = StObject.set(x, "trafficPercentStrategy", js.undefined)
  }
}
