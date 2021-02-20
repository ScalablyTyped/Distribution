package typings.maximMazurokGapiClientBlogger.gapi.client.blogger

import typings.maximMazurokGapiClientBlogger.anon.Country
import typings.maximMazurokGapiClientBlogger.anon.Items
import typings.maximMazurokGapiClientBlogger.anon.SelfLink
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Blog extends StObject {
  
  /** The JSON custom meta-data for the Blog. */
  var customMetaData: js.UndefOr[String] = js.native
  
  /** The description of this blog. This is displayed underneath the title. */
  var description: js.UndefOr[String] = js.native
  
  /** The identifier for this resource. */
  var id: js.UndefOr[String] = js.native
  
  /** The kind of this entry. Always blogger#blog. */
  var kind: js.UndefOr[String] = js.native
  
  /** The locale this Blog is set to. */
  var locale: js.UndefOr[Country] = js.native
  
  /** The name of this blog. This is displayed as the title. */
  var name: js.UndefOr[String] = js.native
  
  /** The container of pages in this blog. */
  var pages: js.UndefOr[SelfLink] = js.native
  
  /** The container of posts in this blog. */
  var posts: js.UndefOr[Items] = js.native
  
  /** RFC 3339 date-time when this blog was published. */
  var published: js.UndefOr[String] = js.native
  
  /** The API REST URL to fetch this resource from. */
  var selfLink: js.UndefOr[String] = js.native
  
  /** The status of the blog. */
  var status: js.UndefOr[String] = js.native
  
  /** RFC 3339 date-time when this blog was last updated. */
  var updated: js.UndefOr[String] = js.native
  
  /** The URL where this blog is published. */
  var url: js.UndefOr[String] = js.native
}
object Blog {
  
  @scala.inline
  def apply(): Blog = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Blog]
  }
  
  @scala.inline
  implicit class BlogMutableBuilder[Self <: Blog] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCustomMetaData(value: String): Self = StObject.set(x, "customMetaData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomMetaDataUndefined: Self = StObject.set(x, "customMetaData", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setLocale(value: Country): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPages(value: SelfLink): Self = StObject.set(x, "pages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPagesUndefined: Self = StObject.set(x, "pages", js.undefined)
    
    @scala.inline
    def setPosts(value: Items): Self = StObject.set(x, "posts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostsUndefined: Self = StObject.set(x, "posts", js.undefined)
    
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
    def setUpdated(value: String): Self = StObject.set(x, "updated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatedUndefined: Self = StObject.set(x, "updated", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
