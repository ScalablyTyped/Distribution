package typings.googleapis.fileV1beta1Mod.fileV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsInstancesSharesCreate
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The Filestore Instance to create the share for, in the format `projects/{project_id\}/locations/{location\}/instances/{instance_id\}`
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaShare] = js.undefined
  
  /**
    * Required. The ID to use for the share. The ID must be unique within the specified instance. This value must start with a lowercase letter followed by up to 62 lowercase letters, numbers, or hyphens, and cannot end with a hyphen.
    */
  var shareId: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsInstancesSharesCreate {
  
  inline def apply(): ParamsResourceProjectsLocationsInstancesSharesCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsInstancesSharesCreate]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsInstancesSharesCreate](x: Self) {
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRequestBody(value: SchemaShare): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setShareId(value: String): Self = StObject.set(x, "shareId", value.asInstanceOf[js.Any])
    
    inline def setShareIdUndefined: Self = StObject.set(x, "shareId", js.undefined)
  }
}
