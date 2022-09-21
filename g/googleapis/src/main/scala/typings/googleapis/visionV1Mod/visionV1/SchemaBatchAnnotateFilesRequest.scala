package typings.googleapis.visionV1Mod.visionV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBatchAnnotateFilesRequest extends StObject {
  
  /**
    * Optional. Target project and location to make a call. Format: `projects/{project-id\}/locations/{location-id\}`. If no parent is specified, a region will be chosen automatically. Supported location-ids: `us`: USA country only, `asia`: East asia areas, like Japan, Taiwan, `eu`: The European Union. Example: `projects/project-A/locations/eu`.
    */
  var parent: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The list of file annotation requests. Right now we support only one AnnotateFileRequest in BatchAnnotateFilesRequest.
    */
  var requests: js.UndefOr[js.Array[SchemaAnnotateFileRequest]] = js.undefined
}
object SchemaBatchAnnotateFilesRequest {
  
  inline def apply(): SchemaBatchAnnotateFilesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBatchAnnotateFilesRequest]
  }
  
  extension [Self <: SchemaBatchAnnotateFilesRequest](x: Self) {
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentNull: Self = StObject.set(x, "parent", null)
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRequests(value: js.Array[SchemaAnnotateFileRequest]): Self = StObject.set(x, "requests", value.asInstanceOf[js.Any])
    
    inline def setRequestsUndefined: Self = StObject.set(x, "requests", js.undefined)
    
    inline def setRequestsVarargs(value: SchemaAnnotateFileRequest*): Self = StObject.set(x, "requests", js.Array(value*))
  }
}
