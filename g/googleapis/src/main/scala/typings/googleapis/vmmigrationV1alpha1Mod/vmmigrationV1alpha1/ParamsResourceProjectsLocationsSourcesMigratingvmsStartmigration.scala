package typings.googleapis.vmmigrationV1alpha1Mod.vmmigrationV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsSourcesMigratingvmsStartmigration
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The name of the MigratingVm.
    */
  var migratingVm: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaStartMigrationRequest] = js.undefined
}
object ParamsResourceProjectsLocationsSourcesMigratingvmsStartmigration {
  
  inline def apply(): ParamsResourceProjectsLocationsSourcesMigratingvmsStartmigration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsSourcesMigratingvmsStartmigration]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsSourcesMigratingvmsStartmigration](x: Self) {
    
    inline def setMigratingVm(value: String): Self = StObject.set(x, "migratingVm", value.asInstanceOf[js.Any])
    
    inline def setMigratingVmUndefined: Self = StObject.set(x, "migratingVm", js.undefined)
    
    inline def setRequestBody(value: SchemaStartMigrationRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
