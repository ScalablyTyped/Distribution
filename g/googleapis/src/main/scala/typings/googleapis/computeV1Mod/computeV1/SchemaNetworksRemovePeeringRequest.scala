package typings.googleapis.computeV1Mod.computeV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaNetworksRemovePeeringRequest extends StObject {
  
  /**
    * Name of the peering, which should conform to RFC1035.
    */
  var name: js.UndefOr[String | Null] = js.undefined
}
object SchemaNetworksRemovePeeringRequest {
  
  inline def apply(): SchemaNetworksRemovePeeringRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNetworksRemovePeeringRequest]
  }
  
  extension [Self <: SchemaNetworksRemovePeeringRequest](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
