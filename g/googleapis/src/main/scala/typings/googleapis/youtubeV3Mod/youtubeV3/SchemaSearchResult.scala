package typings.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A search result contains information about a YouTube video, channel, or
  * playlist that matches the search parameters specified in an API request.
  * While a search result points to a uniquely identifiable resource, like a
  * video, it does not have its own persistent data.
  */
@js.native
trait SchemaSearchResult extends StObject {
  
  /**
    * Etag of this resource.
    */
  var etag: js.UndefOr[String] = js.native
  
  /**
    * The id object contains information that can be used to uniquely identify
    * the resource that matches the search request.
    */
  var id: js.UndefOr[SchemaResourceId] = js.native
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;youtube#searchResult&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * The snippet object contains basic details about a search result, such as
    * its title or description. For example, if the search result is a video,
    * then the title will be the video&#39;s title and the description will be
    * the video&#39;s description.
    */
  var snippet: js.UndefOr[SchemaSearchResultSnippet] = js.native
}
object SchemaSearchResult {
  
  @scala.inline
  def apply(): SchemaSearchResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSearchResult]
  }
  
  @scala.inline
  implicit class SchemaSearchResultMutableBuilder[Self <: SchemaSearchResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    @scala.inline
    def setId(value: SchemaResourceId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setSnippet(value: SchemaSearchResultSnippet): Self = StObject.set(x, "snippet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnippetUndefined: Self = StObject.set(x, "snippet", js.undefined)
  }
}
