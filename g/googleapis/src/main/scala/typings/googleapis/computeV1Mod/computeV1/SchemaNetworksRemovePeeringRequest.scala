package typings.googleapis.computeV1Mod.computeV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaNetworksRemovePeeringRequest extends StObject {
  
  /**
    * Name of the peering, which should conform to RFC1035.
    */
  var name: js.UndefOr[String] = js.undefined
}
object SchemaNetworksRemovePeeringRequest {
  
  @scala.inline
  def apply(): SchemaNetworksRemovePeeringRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNetworksRemovePeeringRequest]
  }
  
  @scala.inline
  implicit class SchemaNetworksRemovePeeringRequestMutableBuilder[Self <: SchemaNetworksRemovePeeringRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
