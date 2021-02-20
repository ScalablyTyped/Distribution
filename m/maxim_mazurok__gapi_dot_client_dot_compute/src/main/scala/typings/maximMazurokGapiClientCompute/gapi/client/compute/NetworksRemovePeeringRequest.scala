package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NetworksRemovePeeringRequest extends StObject {
  
  /** Name of the peering, which should conform to RFC1035. */
  var name: js.UndefOr[String] = js.native
}
object NetworksRemovePeeringRequest {
  
  @scala.inline
  def apply(): NetworksRemovePeeringRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworksRemovePeeringRequest]
  }
  
  @scala.inline
  implicit class NetworksRemovePeeringRequestMutableBuilder[Self <: NetworksRemovePeeringRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
