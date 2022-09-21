package typings.googleapis.vmmigrationV1alpha1Mod.vmmigrationV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsSourcesMigratingvmsCutoverjobsCancel
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The cutover job id
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaCancelCutoverJobRequest] = js.undefined
}
object ParamsResourceProjectsLocationsSourcesMigratingvmsCutoverjobsCancel {
  
  inline def apply(): ParamsResourceProjectsLocationsSourcesMigratingvmsCutoverjobsCancel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsSourcesMigratingvmsCutoverjobsCancel]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsSourcesMigratingvmsCutoverjobsCancel](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRequestBody(value: SchemaCancelCutoverJobRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
