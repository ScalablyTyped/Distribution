package typings.maximMazurokGapiClientBlogger.gapi.client.blogger

import typings.maximMazurokGapiClientBlogger.anon.DisplayName
import typings.maximMazurokGapiClientBlogger.anon.Id
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Page extends StObject {
  
  /** The author of this Page. */
  var author: js.UndefOr[DisplayName] = js.undefined
  
  /** Data about the blog containing this Page. */
  var blog: js.UndefOr[Id] = js.undefined
  
  /** The body content of this Page, in HTML. */
  var content: js.UndefOr[String] = js.undefined
  
  /** Etag of the resource. */
  var etag: js.UndefOr[String] = js.undefined
  
  /** The identifier for this resource. */
  var id: js.UndefOr[String] = js.undefined
  
  /** The kind of this entity. Always blogger#page. */
  var kind: js.UndefOr[String] = js.undefined
  
  /** RFC 3339 date-time when this Page was published. */
  var published: js.UndefOr[String] = js.undefined
  
  /** The API REST URL to fetch this resource from. */
  var selfLink: js.UndefOr[String] = js.undefined
  
  /** The status of the page for admin resources (either LIVE or DRAFT). */
  var status: js.UndefOr[String] = js.undefined
  
  /** The title of this entity. This is the name displayed in the Admin user interface. */
  var title: js.UndefOr[String] = js.undefined
  
  /** RFC 3339 date-time when this Page was last updated. */
  var updated: js.UndefOr[String] = js.undefined
  
  /** The URL that this Page is displayed at. */
  var url: js.UndefOr[String] = js.undefined
}
object Page {
  
  @scala.inline
  def apply(): Page = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Page]
  }
  
  @scala.inline
  implicit class PageMutableBuilder[Self <: Page] (val x: Self) extends AnyVal {
    
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
    def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setPublished(value: String): Self = StObject.set(x, "published", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublishedUndefined: Self = StObject.set(x, "published", js.undefined)
    
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
