package typings.googleapis.healthcareV1beta1Mod.healthcareV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsDatasetsHl7v2storesExport
  extends StObject
     with StandardParameters {
  
  /**
    * The name of the source HL7v2 store, in the format `projects/{project_id\}/locations/{location_id\}/datasets/{dataset_id\}/hl7v2Stores/{hl7v2_store_id\}`
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaExportMessagesRequest] = js.undefined
}
object ParamsResourceProjectsLocationsDatasetsHl7v2storesExport {
  
  inline def apply(): ParamsResourceProjectsLocationsDatasetsHl7v2storesExport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsDatasetsHl7v2storesExport]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsDatasetsHl7v2storesExport](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRequestBody(value: SchemaExportMessagesRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
