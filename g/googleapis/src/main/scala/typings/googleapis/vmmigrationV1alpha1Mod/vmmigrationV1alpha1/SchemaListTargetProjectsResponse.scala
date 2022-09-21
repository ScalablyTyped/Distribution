package typings.googleapis.vmmigrationV1alpha1Mod.vmmigrationV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListTargetProjectsResponse extends StObject {
  
  /**
    * Output only. A token, which can be sent as `page_token` to retrieve the next page. If this field is omitted, there are no subsequent pages.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The list of target response.
    */
  var targetProjects: js.UndefOr[js.Array[SchemaTargetProject]] = js.undefined
  
  /**
    * Output only. Locations that could not be reached.
    */
  var unreachable: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaListTargetProjectsResponse {
  
  inline def apply(): SchemaListTargetProjectsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListTargetProjectsResponse]
  }
  
  extension [Self <: SchemaListTargetProjectsResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setTargetProjects(value: js.Array[SchemaTargetProject]): Self = StObject.set(x, "targetProjects", value.asInstanceOf[js.Any])
    
    inline def setTargetProjectsUndefined: Self = StObject.set(x, "targetProjects", js.undefined)
    
    inline def setTargetProjectsVarargs(value: SchemaTargetProject*): Self = StObject.set(x, "targetProjects", js.Array(value*))
    
    inline def setUnreachable(value: js.Array[String]): Self = StObject.set(x, "unreachable", value.asInstanceOf[js.Any])
    
    inline def setUnreachableNull: Self = StObject.set(x, "unreachable", null)
    
    inline def setUnreachableUndefined: Self = StObject.set(x, "unreachable", js.undefined)
    
    inline def setUnreachableVarargs(value: String*): Self = StObject.set(x, "unreachable", js.Array(value*))
  }
}
