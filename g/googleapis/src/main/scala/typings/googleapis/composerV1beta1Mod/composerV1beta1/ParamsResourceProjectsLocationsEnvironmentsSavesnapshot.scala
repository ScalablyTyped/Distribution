package typings.googleapis.composerV1beta1Mod.composerV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsEnvironmentsSavesnapshot
  extends StObject
     with StandardParameters {
  
  /**
    * The resource name of the source environment in the form: "projects/{projectId\}/locations/{locationId\}/environments/{environmentId\}"
    */
  var environment: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaSaveSnapshotRequest] = js.undefined
}
object ParamsResourceProjectsLocationsEnvironmentsSavesnapshot {
  
  inline def apply(): ParamsResourceProjectsLocationsEnvironmentsSavesnapshot = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsEnvironmentsSavesnapshot]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsEnvironmentsSavesnapshot](x: Self) {
    
    inline def setEnvironment(value: String): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentUndefined: Self = StObject.set(x, "environment", js.undefined)
    
    inline def setRequestBody(value: SchemaSaveSnapshotRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
