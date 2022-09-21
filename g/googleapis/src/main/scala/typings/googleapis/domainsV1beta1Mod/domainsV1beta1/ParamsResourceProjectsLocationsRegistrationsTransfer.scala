package typings.googleapis.domainsV1beta1Mod.domainsV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsRegistrationsTransfer
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The parent resource of the `Registration`. Must be in the format `projects/x/locations/x`.
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaTransferDomainRequest] = js.undefined
}
object ParamsResourceProjectsLocationsRegistrationsTransfer {
  
  inline def apply(): ParamsResourceProjectsLocationsRegistrationsTransfer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsRegistrationsTransfer]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsRegistrationsTransfer](x: Self) {
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRequestBody(value: SchemaTransferDomainRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
