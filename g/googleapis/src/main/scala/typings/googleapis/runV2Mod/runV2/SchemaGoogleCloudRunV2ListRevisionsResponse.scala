package typings.googleapis.runV2Mod.runV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRunV2ListRevisionsResponse extends StObject {
  
  /**
    * A token indicating there are more items than page_size. Use it in the next ListRevisions request to continue.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The resulting list of Revisions.
    */
  var revisions: js.UndefOr[js.Array[SchemaGoogleCloudRunV2Revision]] = js.undefined
}
object SchemaGoogleCloudRunV2ListRevisionsResponse {
  
  inline def apply(): SchemaGoogleCloudRunV2ListRevisionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRunV2ListRevisionsResponse]
  }
  
  extension [Self <: SchemaGoogleCloudRunV2ListRevisionsResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setRevisions(value: js.Array[SchemaGoogleCloudRunV2Revision]): Self = StObject.set(x, "revisions", value.asInstanceOf[js.Any])
    
    inline def setRevisionsUndefined: Self = StObject.set(x, "revisions", js.undefined)
    
    inline def setRevisionsVarargs(value: SchemaGoogleCloudRunV2Revision*): Self = StObject.set(x, "revisions", js.Array(value*))
  }
}
