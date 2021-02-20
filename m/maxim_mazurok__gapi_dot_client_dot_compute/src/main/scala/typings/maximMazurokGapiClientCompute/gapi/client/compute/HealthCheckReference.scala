package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HealthCheckReference extends StObject {
  
  var healthCheck: js.UndefOr[String] = js.native
}
object HealthCheckReference {
  
  @scala.inline
  def apply(): HealthCheckReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HealthCheckReference]
  }
  
  @scala.inline
  implicit class HealthCheckReferenceMutableBuilder[Self <: HealthCheckReference] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHealthCheck(value: String): Self = StObject.set(x, "healthCheck", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHealthCheckUndefined: Self = StObject.set(x, "healthCheck", js.undefined)
  }
}
