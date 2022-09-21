package typings.googleapis.metastoreV1betaMod.metastoreV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsServicesMetadataimportsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The relative resource name of the metadata import to retrieve, in the following form:projects/{project_number\}/locations/{location_id\}/services/{service_id\}/metadataImports/{import_id\}.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsServicesMetadataimportsGet {
  
  inline def apply(): ParamsResourceProjectsLocationsServicesMetadataimportsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsServicesMetadataimportsGet]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsServicesMetadataimportsGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
