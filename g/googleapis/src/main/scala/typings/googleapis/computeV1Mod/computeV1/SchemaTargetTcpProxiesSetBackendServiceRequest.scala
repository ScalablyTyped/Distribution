package typings.googleapis.computeV1Mod.computeV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaTargetTcpProxiesSetBackendServiceRequest extends StObject {
  
  /**
    * The URL of the new BackendService resource for the targetTcpProxy.
    */
  var service: js.UndefOr[String] = js.native
}
object SchemaTargetTcpProxiesSetBackendServiceRequest {
  
  @scala.inline
  def apply(): SchemaTargetTcpProxiesSetBackendServiceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTargetTcpProxiesSetBackendServiceRequest]
  }
  
  @scala.inline
  implicit class SchemaTargetTcpProxiesSetBackendServiceRequestMutableBuilder[Self <: SchemaTargetTcpProxiesSetBackendServiceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setService(value: String): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceUndefined: Self = StObject.set(x, "service", js.undefined)
  }
}
