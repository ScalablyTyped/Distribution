package typings.googleapis.vmmigrationV1alpha1Mod.vmmigrationV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsSourcesMigratingvmsClonejobsCreate
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The clone job identifier.
    */
  var cloneJobId: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The Clone's parent.
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaCloneJob] = js.undefined
  
  /**
    * A request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. The server will guarantee that for at least 60 minutes since the first request. For example, consider a situation where you make an initial request and t he request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    */
  var requestId: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsSourcesMigratingvmsClonejobsCreate {
  
  inline def apply(): ParamsResourceProjectsLocationsSourcesMigratingvmsClonejobsCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsSourcesMigratingvmsClonejobsCreate]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsSourcesMigratingvmsClonejobsCreate](x: Self) {
    
    inline def setCloneJobId(value: String): Self = StObject.set(x, "cloneJobId", value.asInstanceOf[js.Any])
    
    inline def setCloneJobIdUndefined: Self = StObject.set(x, "cloneJobId", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRequestBody(value: SchemaCloneJob): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setRequestId(value: String): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
    
    inline def setRequestIdUndefined: Self = StObject.set(x, "requestId", js.undefined)
  }
}
