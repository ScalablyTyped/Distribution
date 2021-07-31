package typings.googleapis.servicebrokerV1alpha1Mod.servicebrokerV1alpha1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsBrokersV2ServiceInstancesServiceBindingsDelete
  extends StObject
     with StandardParameters {
  
  /**
    * See CreateServiceInstanceRequest for details.
    */
  var acceptsIncomplete: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * The id of the binding to delete.
    */
  var bindingId: js.UndefOr[String] = js.undefined
  
  /**
    * The service instance id that deleted binding is bound to.
    */
  var instanceId: js.UndefOr[String] = js.undefined
  
  /**
    * Parent must match `projects/[PROJECT_ID]/brokers/[BROKER_ID]`.
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * The plan id of the service instance.
    */
  var planId: js.UndefOr[String] = js.undefined
  
  /**
    * Additional query parameter hints. The service id of the service instance.
    */
  var serviceId: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsBrokersV2ServiceInstancesServiceBindingsDelete {
  
  @scala.inline
  def apply(): ParamsResourceProjectsBrokersV2ServiceInstancesServiceBindingsDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsBrokersV2ServiceInstancesServiceBindingsDelete]
  }
  
  @scala.inline
  implicit class ParamsResourceProjectsBrokersV2ServiceInstancesServiceBindingsDeleteMutableBuilder[Self <: ParamsResourceProjectsBrokersV2ServiceInstancesServiceBindingsDelete] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAcceptsIncomplete(value: Boolean): Self = StObject.set(x, "acceptsIncomplete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAcceptsIncompleteUndefined: Self = StObject.set(x, "acceptsIncomplete", js.undefined)
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setBindingId(value: String): Self = StObject.set(x, "bindingId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBindingIdUndefined: Self = StObject.set(x, "bindingId", js.undefined)
    
    @scala.inline
    def setInstanceId(value: String): Self = StObject.set(x, "instanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceIdUndefined: Self = StObject.set(x, "instanceId", js.undefined)
    
    @scala.inline
    def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    @scala.inline
    def setPlanId(value: String): Self = StObject.set(x, "planId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlanIdUndefined: Self = StObject.set(x, "planId", js.undefined)
    
    @scala.inline
    def setServiceId(value: String): Self = StObject.set(x, "serviceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceIdUndefined: Self = StObject.set(x, "serviceId", js.undefined)
  }
}
