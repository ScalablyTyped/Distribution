package typings.googleapis.datamigrationV1beta1Mod.datamigrationV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsMigrationjobsResume
  extends StObject
     with StandardParameters {
  
  /**
    * Name of the migration job resource to resume.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaResumeMigrationJobRequest] = js.undefined
}
object ParamsResourceProjectsLocationsMigrationjobsResume {
  
  inline def apply(): ParamsResourceProjectsLocationsMigrationjobsResume = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsMigrationjobsResume]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsMigrationjobsResume](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRequestBody(value: SchemaResumeMigrationJobRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
