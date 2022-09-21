package typings.googleapis.runV1Mod.runV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsServicesReplaceservice
  extends StObject
     with StandardParameters {
  
  /**
    * Indicates that the server should validate the request and populate default values without persisting the request. Supported values: `all`
    */
  var dryRun: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the service being replaced. For Cloud Run (fully managed), replace {namespace\} with the project ID or number. It takes the form namespaces/{namespace\}. For example: namespaces/PROJECT_ID
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaService] = js.undefined
}
object ParamsResourceProjectsLocationsServicesReplaceservice {
  
  inline def apply(): ParamsResourceProjectsLocationsServicesReplaceservice = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsServicesReplaceservice]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsServicesReplaceservice](x: Self) {
    
    inline def setDryRun(value: String): Self = StObject.set(x, "dryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "dryRun", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRequestBody(value: SchemaService): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
