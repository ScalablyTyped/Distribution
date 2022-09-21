package typings.googleapis.mlV1Mod.mlV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsStudiesCreate
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The project and location that the study belongs to. Format: projects/{project\}/locations/{location\}
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaGoogleCloudMlV1Study] = js.undefined
  
  /**
    * Required. The ID to use for the study, which will become the final component of the study's resource name.
    */
  var studyId: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsStudiesCreate {
  
  inline def apply(): ParamsResourceProjectsLocationsStudiesCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsStudiesCreate]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsStudiesCreate](x: Self) {
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRequestBody(value: SchemaGoogleCloudMlV1Study): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setStudyId(value: String): Self = StObject.set(x, "studyId", value.asInstanceOf[js.Any])
    
    inline def setStudyIdUndefined: Self = StObject.set(x, "studyId", js.undefined)
  }
}
