package typings.googleapis.transcoderV1beta1Mod.transcoderV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsJobtemplatesCreate
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The ID to use for the job template, which will become the final component of the job template's resource name. This value should be 4-63 characters, and valid characters must match the regular expression `a-zA-Z*`.
    */
  var jobTemplateId: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The parent location to create this job template. Format: `projects/{project\}/locations/{location\}`
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaJobTemplate] = js.undefined
}
object ParamsResourceProjectsLocationsJobtemplatesCreate {
  
  inline def apply(): ParamsResourceProjectsLocationsJobtemplatesCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsJobtemplatesCreate]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsJobtemplatesCreate](x: Self) {
    
    inline def setJobTemplateId(value: String): Self = StObject.set(x, "jobTemplateId", value.asInstanceOf[js.Any])
    
    inline def setJobTemplateIdUndefined: Self = StObject.set(x, "jobTemplateId", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRequestBody(value: SchemaJobTemplate): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
