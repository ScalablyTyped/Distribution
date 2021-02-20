package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HealthCheckServiceReference extends StObject {
  
  var healthCheckService: js.UndefOr[String] = js.native
}
object HealthCheckServiceReference {
  
  @scala.inline
  def apply(): HealthCheckServiceReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HealthCheckServiceReference]
  }
  
  @scala.inline
  implicit class HealthCheckServiceReferenceMutableBuilder[Self <: HealthCheckServiceReference] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHealthCheckService(value: String): Self = StObject.set(x, "healthCheckService", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHealthCheckServiceUndefined: Self = StObject.set(x, "healthCheckService", js.undefined)
  }
}
