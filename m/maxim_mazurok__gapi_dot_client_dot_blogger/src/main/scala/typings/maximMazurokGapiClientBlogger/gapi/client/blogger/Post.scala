package typings.maximMazurokGapiClientBlogger.gapi.client.blogger

import typings.maximMazurokGapiClientBlogger.anon.DisplayName
import typings.maximMazurokGapiClientBlogger.anon.Id
import typings.maximMazurokGapiClientBlogger.anon.Lat
import typings.maximMazurokGapiClientBlogger.anon.TotalItems
import typings.maximMazurokGapiClientBlogger.anon.Url
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Post extends StObject {
  
  /** The author of this Post. */
  var author: js.UndefOr[DisplayName] = js.native
  
  /** Data about the blog containing this Post. */
  var blog: js.UndefOr[Id] = js.native
  
  /** The content of the Post. May contain HTML markup. */
  var content: js.UndefOr[String] = js.native
  
  /** The JSON meta-data for the Post. */
  var customMetaData: js.UndefOr[String] = js.native
  
  /** Etag of the resource. */
  var etag: js.UndefOr[String] = js.native
  
  /** The identifier of this Post. */
  var id: js.UndefOr[String] = js.native
  
  /** Display image for the Post. */
  var images: js.UndefOr[js.Array[Url]] = js.native
  
  /** The kind of this entity. Always blogger#post. */
  var kind: js.UndefOr[String] = js.native
  
  /** The list of labels this Post was tagged with. */
  var labels: js.UndefOr[js.Array[String]] = js.native
  
  /** The location for geotagged posts. */
  var location: js.UndefOr[Lat] = js.native
  
  /** RFC 3339 date-time when this Post was published. */
  var published: js.UndefOr[String] = js.native
  
  /** Comment control and display setting for readers of this post. */
  var readerComments: js.UndefOr[String] = js.native
  
  /** The container of comments on this Post. */
  var replies: js.UndefOr[TotalItems] = js.native
  
  /** The API REST URL to fetch this resource from. */
  var selfLink: js.UndefOr[String] = js.native
  
  /** Status of the post. Only set for admin-level requests. */
  var status: js.UndefOr[String] = js.native
  
  /** The title of the Post. */
  var title: js.UndefOr[String] = js.native
  
  /** The title link URL, similar to atom's related link. */
  var titleLink: js.UndefOr[String] = js.native
  
  /** RFC 3339 date-time when this Post was last updated. */
  var updated: js.UndefOr[String] = js.native
  
  /** The URL where this Post is displayed. */
  var url: js.UndefOr[String] = js.native
}
object Post {
  
  @scala.inline
  def apply(): Post = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Post]
  }
  
  @scala.inline
  implicit class PostMutableBuilder[Self <: Post] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthor(value: DisplayName): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthorUndefined: Self = StObject.set(x, "author", js.undefined)
    
    @scala.inline
    def setBlog(value: Id): Self = StObject.set(x, "blog", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlogUndefined: Self = StObject.set(x, "blog", js.undefined)
    
    @scala.inline
    def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    @scala.inline
    def setCustomMetaData(value: String): Self = StObject.set(x, "customMetaData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomMetaDataUndefined: Self = StObject.set(x, "customMetaData", js.undefined)
    
    @scala.inline
    def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setImages(value: js.Array[Url]): Self = StObject.set(x, "images", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImagesUndefined: Self = StObject.set(x, "images", js.undefined)
    
    @scala.inline
    def setImagesVarargs(value: Url*): Self = StObject.set(x, "images", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setLabels(value: js.Array[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    @scala.inline
    def setLabelsVarargs(value: String*): Self = StObject.set(x, "labels", js.Array(value :_*))
    
    @scala.inline
    def setLocation(value: Lat): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    @scala.inline
    def setPublished(value: String): Self = StObject.set(x, "published", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublishedUndefined: Self = StObject.set(x, "published", js.undefined)
    
    @scala.inline
    def setReaderComments(value: String): Self = StObject.set(x, "readerComments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReaderCommentsUndefined: Self = StObject.set(x, "readerComments", js.undefined)
    
    @scala.inline
    def setReplies(value: TotalItems): Self = StObject.set(x, "replies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepliesUndefined: Self = StObject.set(x, "replies", js.undefined)
    
    @scala.inline
    def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleLink(value: String): Self = StObject.set(x, "titleLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleLinkUndefined: Self = StObject.set(x, "titleLink", js.undefined)
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setUpdated(value: String): Self = StObject.set(x, "updated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatedUndefined: Self = StObject.set(x, "updated", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
