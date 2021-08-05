package typings.googleapis.tagmanagerV2Mod.tagmanagerV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * List Tags Response.
  */
trait SchemaListTagsResponse extends StObject {
  
  /**
    * Continuation token for fetching the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /**
    * All GTM Tags of a GTM Container.
    */
  var tag: js.UndefOr[js.Array[SchemaTag]] = js.undefined
}
object SchemaListTagsResponse {
  
  inline def apply(): SchemaListTagsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListTagsResponse]
  }
  
  extension [Self <: SchemaListTagsResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setTag(value: js.Array[SchemaTag]): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    inline def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
    
    inline def setTagVarargs(value: SchemaTag*): Self = StObject.set(x, "tag", js.Array(value :_*))
  }
}
