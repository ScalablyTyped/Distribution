package typings.googleapis.mirrorV1Mod.mirrorV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A list of timeline items. This is the response from the server to GET
  * requests on the timeline collection.
  */
trait SchemaTimelineListResponse extends StObject {
  
  /**
    * Items in the timeline.
    */
  var items: js.UndefOr[js.Array[SchemaTimelineItem]] = js.undefined
  
  /**
    * The type of resource. This is always mirror#timeline.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * The next page token. Provide this as the pageToken parameter in the
    * request to retrieve the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object SchemaTimelineListResponse {
  
  @scala.inline
  def apply(): SchemaTimelineListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTimelineListResponse]
  }
  
  @scala.inline
  implicit class SchemaTimelineListResponseMutableBuilder[Self <: SchemaTimelineListResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[SchemaTimelineItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: SchemaTimelineItem*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
