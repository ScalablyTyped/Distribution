package typings.googleapis.vmmigrationV1Mod.vmmigrationV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListCloneJobsResponse extends StObject {
  
  /**
    * Output only. The list of clone jobs response.
    */
  var cloneJobs: js.UndefOr[js.Array[SchemaCloneJob]] = js.undefined
  
  /**
    * Output only. A token, which can be sent as `page_token` to retrieve the next page. If this field is omitted, there are no subsequent pages.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Locations that could not be reached.
    */
  var unreachable: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaListCloneJobsResponse {
  
  inline def apply(): SchemaListCloneJobsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListCloneJobsResponse]
  }
  
  extension [Self <: SchemaListCloneJobsResponse](x: Self) {
    
    inline def setCloneJobs(value: js.Array[SchemaCloneJob]): Self = StObject.set(x, "cloneJobs", value.asInstanceOf[js.Any])
    
    inline def setCloneJobsUndefined: Self = StObject.set(x, "cloneJobs", js.undefined)
    
    inline def setCloneJobsVarargs(value: SchemaCloneJob*): Self = StObject.set(x, "cloneJobs", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setUnreachable(value: js.Array[String]): Self = StObject.set(x, "unreachable", value.asInstanceOf[js.Any])
    
    inline def setUnreachableNull: Self = StObject.set(x, "unreachable", null)
    
    inline def setUnreachableUndefined: Self = StObject.set(x, "unreachable", js.undefined)
    
    inline def setUnreachableVarargs(value: String*): Self = StObject.set(x, "unreachable", js.Array(value*))
  }
}
