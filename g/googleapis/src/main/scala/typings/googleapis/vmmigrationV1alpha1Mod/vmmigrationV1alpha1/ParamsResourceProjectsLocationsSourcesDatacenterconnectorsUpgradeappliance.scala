package typings.googleapis.vmmigrationV1alpha1Mod.vmmigrationV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsSourcesDatacenterconnectorsUpgradeappliance
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The DatacenterConnector name.
    */
  var datacenterConnector: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaUpgradeApplianceRequest] = js.undefined
}
object ParamsResourceProjectsLocationsSourcesDatacenterconnectorsUpgradeappliance {
  
  inline def apply(): ParamsResourceProjectsLocationsSourcesDatacenterconnectorsUpgradeappliance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsSourcesDatacenterconnectorsUpgradeappliance]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsSourcesDatacenterconnectorsUpgradeappliance](x: Self) {
    
    inline def setDatacenterConnector(value: String): Self = StObject.set(x, "datacenterConnector", value.asInstanceOf[js.Any])
    
    inline def setDatacenterConnectorUndefined: Self = StObject.set(x, "datacenterConnector", js.undefined)
    
    inline def setRequestBody(value: SchemaUpgradeApplianceRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
