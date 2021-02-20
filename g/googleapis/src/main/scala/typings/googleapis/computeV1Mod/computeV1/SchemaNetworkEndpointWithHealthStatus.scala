package typings.googleapis.computeV1Mod.computeV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaNetworkEndpointWithHealthStatus extends StObject {
  
  /**
    * [Output only] The health status of network endpoint;
    */
  var healths: js.UndefOr[js.Array[SchemaHealthStatusForNetworkEndpoint]] = js.native
  
  /**
    * [Output only] The network endpoint;
    */
  var networkEndpoint: js.UndefOr[SchemaNetworkEndpoint] = js.native
}
object SchemaNetworkEndpointWithHealthStatus {
  
  @scala.inline
  def apply(): SchemaNetworkEndpointWithHealthStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNetworkEndpointWithHealthStatus]
  }
  
  @scala.inline
  implicit class SchemaNetworkEndpointWithHealthStatusMutableBuilder[Self <: SchemaNetworkEndpointWithHealthStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHealths(value: js.Array[SchemaHealthStatusForNetworkEndpoint]): Self = StObject.set(x, "healths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHealthsUndefined: Self = StObject.set(x, "healths", js.undefined)
    
    @scala.inline
    def setHealthsVarargs(value: SchemaHealthStatusForNetworkEndpoint*): Self = StObject.set(x, "healths", js.Array(value :_*))
    
    @scala.inline
    def setNetworkEndpoint(value: SchemaNetworkEndpoint): Self = StObject.set(x, "networkEndpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkEndpointUndefined: Self = StObject.set(x, "networkEndpoint", js.undefined)
  }
}
