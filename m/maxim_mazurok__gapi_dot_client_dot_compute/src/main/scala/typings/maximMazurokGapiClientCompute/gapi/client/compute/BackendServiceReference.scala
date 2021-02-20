package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BackendServiceReference extends StObject {
  
  var backendService: js.UndefOr[String] = js.native
}
object BackendServiceReference {
  
  @scala.inline
  def apply(): BackendServiceReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BackendServiceReference]
  }
  
  @scala.inline
  implicit class BackendServiceReferenceMutableBuilder[Self <: BackendServiceReference] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackendService(value: String): Self = StObject.set(x, "backendService", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackendServiceUndefined: Self = StObject.set(x, "backendService", js.undefined)
  }
}
