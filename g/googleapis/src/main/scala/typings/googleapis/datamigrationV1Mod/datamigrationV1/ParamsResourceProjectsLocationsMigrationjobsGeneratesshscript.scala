package typings.googleapis.datamigrationV1Mod.datamigrationV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsMigrationjobsGeneratesshscript
  extends StObject
     with StandardParameters {
  
  /**
    * Name of the migration job resource to generate the SSH script.
    */
  var migrationJob: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaGenerateSshScriptRequest] = js.undefined
}
object ParamsResourceProjectsLocationsMigrationjobsGeneratesshscript {
  
  inline def apply(): ParamsResourceProjectsLocationsMigrationjobsGeneratesshscript = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsMigrationjobsGeneratesshscript]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsMigrationjobsGeneratesshscript](x: Self) {
    
    inline def setMigrationJob(value: String): Self = StObject.set(x, "migrationJob", value.asInstanceOf[js.Any])
    
    inline def setMigrationJobUndefined: Self = StObject.set(x, "migrationJob", js.undefined)
    
    inline def setRequestBody(value: SchemaGenerateSshScriptRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
