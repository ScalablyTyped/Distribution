package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RequestMirrorPolicy extends StObject {
  
  /** The full or partial URL to the BackendService resource being mirrored to. */
  var backendService: js.UndefOr[String] = js.native
}
object RequestMirrorPolicy {
  
  @scala.inline
  def apply(): RequestMirrorPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RequestMirrorPolicy]
  }
  
  @scala.inline
  implicit class RequestMirrorPolicyMutableBuilder[Self <: RequestMirrorPolicy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackendService(value: String): Self = StObject.set(x, "backendService", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackendServiceUndefined: Self = StObject.set(x, "backendService", js.undefined)
  }
}
