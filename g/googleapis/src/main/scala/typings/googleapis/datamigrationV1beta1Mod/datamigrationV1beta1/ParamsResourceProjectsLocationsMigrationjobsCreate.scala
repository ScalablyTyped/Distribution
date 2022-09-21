package typings.googleapis.datamigrationV1beta1Mod.datamigrationV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsMigrationjobsCreate
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The ID of the instance to create.
    */
  var migrationJobId: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The parent, which owns this collection of migration jobs.
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaMigrationJob] = js.undefined
  
  /**
    * A unique id used to identify the request. If the server receives two requests with the same id, then the second request will be ignored. It is recommended to always set this value to a UUID. The id must contain only letters (a-z, A-Z), numbers (0-9), underscores (_), and hyphens (-). The maximum length is 40 characters.
    */
  var requestId: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsMigrationjobsCreate {
  
  inline def apply(): ParamsResourceProjectsLocationsMigrationjobsCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsMigrationjobsCreate]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsMigrationjobsCreate](x: Self) {
    
    inline def setMigrationJobId(value: String): Self = StObject.set(x, "migrationJobId", value.asInstanceOf[js.Any])
    
    inline def setMigrationJobIdUndefined: Self = StObject.set(x, "migrationJobId", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRequestBody(value: SchemaMigrationJob): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setRequestId(value: String): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
    
    inline def setRequestIdUndefined: Self = StObject.set(x, "requestId", js.undefined)
  }
}
