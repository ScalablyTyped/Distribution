package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NetworksRemovePeeringRequest extends StObject {
  
  /** Name of the peering, which should conform to RFC1035. */
  var name: js.UndefOr[String] = js.undefined
}
object NetworksRemovePeeringRequest {
  
  inline def apply(): NetworksRemovePeeringRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworksRemovePeeringRequest]
  }
  
  extension [Self <: NetworksRemovePeeringRequest](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
