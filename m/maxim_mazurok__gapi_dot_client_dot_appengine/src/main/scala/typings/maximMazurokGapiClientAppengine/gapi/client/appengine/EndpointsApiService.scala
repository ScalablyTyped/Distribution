package typings.maximMazurokGapiClientAppengine.gapi.client.appengine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EndpointsApiService extends js.Object {
  
  /**
    * Endpoints service configuration ID as specified by the Service Management API. For example "2016-09-19r1".By default, the rollout strategy for Endpoints is RolloutStrategy.FIXED.
    * This means that Endpoints starts up with a particular configuration ID. When a new configuration is rolled out, Endpoints must be given the new configuration ID. The config_id field
    * is used to give the configuration ID and is required in this case.Endpoints also has a rollout strategy called RolloutStrategy.MANAGED. When using this, Endpoints fetches the latest
    * configuration and does not need the configuration ID. In this case, config_id must be omitted.
    */
  var configId: js.UndefOr[String] = js.native
  
  /** Enable or disable trace sampling. By default, this is set to false for enabled. */
  var disableTraceSampling: js.UndefOr[Boolean] = js.native
  
  /** Endpoints service name which is the name of the "service" resource in the Service Management API. For example "myapi.endpoints.myproject.cloud.goog" */
  var name: js.UndefOr[String] = js.native
  
  /** Endpoints rollout strategy. If FIXED, config_id must be specified. If MANAGED, config_id must be omitted. */
  var rolloutStrategy: js.UndefOr[String] = js.native
}
object EndpointsApiService {
  
  @scala.inline
  def apply(): EndpointsApiService = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EndpointsApiService]
  }
  
  @scala.inline
  implicit class EndpointsApiServiceOps[Self <: EndpointsApiService] (val x: Self) extends AnyVal {
    
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
    def setConfigId(value: String): Self = this.set("configId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfigId: Self = this.set("configId", js.undefined)
    
    @scala.inline
    def setDisableTraceSampling(value: Boolean): Self = this.set("disableTraceSampling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableTraceSampling: Self = this.set("disableTraceSampling", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setRolloutStrategy(value: String): Self = this.set("rolloutStrategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRolloutStrategy: Self = this.set("rolloutStrategy", js.undefined)
  }
}
