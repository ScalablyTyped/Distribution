package typings.googleapis.tagmanagerV2Mod.tagmanagerV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * List Tags Response.
  */
@js.native
trait SchemaListTagsResponse extends StObject {
  
  /**
    * Continuation token for fetching the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /**
    * All GTM Tags of a GTM Container.
    */
  var tag: js.UndefOr[js.Array[SchemaTag]] = js.native
}
object SchemaListTagsResponse {
  
  @scala.inline
  def apply(): SchemaListTagsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListTagsResponse]
  }
  
  @scala.inline
  implicit class SchemaListTagsResponseMutableBuilder[Self <: SchemaListTagsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setTag(value: js.Array[SchemaTag]): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
    
    @scala.inline
    def setTagVarargs(value: SchemaTag*): Self = StObject.set(x, "tag", js.Array(value :_*))
  }
}
