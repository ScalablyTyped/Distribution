package typings.googleapis.healthcareV1Mod.healthcareV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsDatasetsConsentstoresUserdatamappingsArchive
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The resource name of the User data mapping to archive.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaArchiveUserDataMappingRequest] = js.undefined
}
object ParamsResourceProjectsLocationsDatasetsConsentstoresUserdatamappingsArchive {
  
  inline def apply(): ParamsResourceProjectsLocationsDatasetsConsentstoresUserdatamappingsArchive = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsDatasetsConsentstoresUserdatamappingsArchive]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsDatasetsConsentstoresUserdatamappingsArchive](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRequestBody(value: SchemaArchiveUserDataMappingRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
