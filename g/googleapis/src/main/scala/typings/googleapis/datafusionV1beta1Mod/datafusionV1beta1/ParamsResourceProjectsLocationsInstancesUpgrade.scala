package typings.googleapis.datafusionV1beta1Mod.datafusionV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsInstancesUpgrade
  extends StObject
     with StandardParameters {
  
  /**
    * Required. Name of the Data Fusion instance which need to be upgraded in the form of projects/{project\}/locations/{location\}/instances/{instance\} Instance will be upgraded with the latest stable version of the Data Fusion.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaUpgradeInstanceRequest] = js.undefined
}
object ParamsResourceProjectsLocationsInstancesUpgrade {
  
  inline def apply(): ParamsResourceProjectsLocationsInstancesUpgrade = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsInstancesUpgrade]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsInstancesUpgrade](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRequestBody(value: SchemaUpgradeInstanceRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
