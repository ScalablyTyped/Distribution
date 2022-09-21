package typings.hexo.mod

import org.scalablytyped.runtime.StringDictionary
import typings.hexo.hexoStrings.categories
import typings.hexo.hexoStrings.pages
import typings.hexo.hexoStrings.posts
import typings.hexo.hexoStrings.tags
import typings.hexo.mod.Locals.Category
import typings.hexo.mod.Locals.Page
import typings.hexo.mod.Locals.Tag
import typings.moment.mod.Moment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Locals extends StObject {
  
  /**
    * Get a Variable
    */
  def get(`type`: String): Any = js.native
  @JSName("get")
  def get_categories(`type`: categories): Model[Category] = js.native
  @JSName("get")
  def get_pages(`type`: pages): Model[Page] = js.native
  @JSName("get")
  def get_posts(`type`: posts): Model[typings.hexo.mod.Locals.Post] = js.native
  @JSName("get")
  def get_tags(`type`: tags): Model[Tag] = js.native
  
  /**
    * Invalidate the cache
    */
  def invalidate(): this.type = js.native
  
  /**
    * Remove a Variable
    */
  def remove(`type`: String): this.type = js.native
  
  /**
    * Set a Variable
    */
  def set(`type`: String, fn: js.Function0[Any]): this.type = js.native
  
  /**
    * Get All Variable
    */
  def toObject(): Any = js.native
}
object Locals {
  
  trait Category
    extends StObject
       with Tag {
    
    var parent: String
  }
  object Category {
    
    inline def apply(
      length: Double,
      name: String,
      parent: String,
      path: String,
      permalink: String,
      posts: Model[typings.hexo.mod.Locals.Post],
      slug: String
    ): Category = {
      val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], permalink = permalink.asInstanceOf[js.Any], posts = posts.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any])
      __obj.asInstanceOf[Category]
    }
    
    extension [Self <: Category](x: Self) {
      
      inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    }
  }
  
  trait Page
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    var comments: Boolean
    
    var content: String
    
    var date: Moment
    
    var excerpt: js.UndefOr[String] = js.undefined
    
    var full_source: String
    
    var layout: String
    
    var link: js.UndefOr[String] = js.undefined
    
    var more: js.UndefOr[String] = js.undefined
    
    var next: js.UndefOr[Null | Page] = js.undefined
    
    var path: String
    
    var permalink: String
    
    var photos: js.UndefOr[js.Array[String]] = js.undefined
    
    var prev: js.UndefOr[Null | Page] = js.undefined
    
    var raw: js.UndefOr[String] = js.undefined
    
    var source: String
    
    var title: String
    
    var updated: js.UndefOr[Moment] = js.undefined
  }
  object Page {
    
    inline def apply(
      comments: Boolean,
      content: String,
      date: Moment,
      full_source: String,
      layout: String,
      path: String,
      permalink: String,
      source: String,
      title: String
    ): Page = {
      val __obj = js.Dynamic.literal(comments = comments.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], full_source = full_source.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], permalink = permalink.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[Page]
    }
    
    extension [Self <: Page](x: Self) {
      
      inline def setComments(value: Boolean): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
      
      inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setDate(value: Moment): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      inline def setExcerpt(value: String): Self = StObject.set(x, "excerpt", value.asInstanceOf[js.Any])
      
      inline def setExcerptUndefined: Self = StObject.set(x, "excerpt", js.undefined)
      
      inline def setFull_source(value: String): Self = StObject.set(x, "full_source", value.asInstanceOf[js.Any])
      
      inline def setLayout(value: String): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
      
      inline def setLink(value: String): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
      
      inline def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
      
      inline def setMore(value: String): Self = StObject.set(x, "more", value.asInstanceOf[js.Any])
      
      inline def setMoreUndefined: Self = StObject.set(x, "more", js.undefined)
      
      inline def setNext(value: Page): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
      
      inline def setNextNull: Self = StObject.set(x, "next", null)
      
      inline def setNextUndefined: Self = StObject.set(x, "next", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPermalink(value: String): Self = StObject.set(x, "permalink", value.asInstanceOf[js.Any])
      
      inline def setPhotos(value: js.Array[String]): Self = StObject.set(x, "photos", value.asInstanceOf[js.Any])
      
      inline def setPhotosUndefined: Self = StObject.set(x, "photos", js.undefined)
      
      inline def setPhotosVarargs(value: String*): Self = StObject.set(x, "photos", js.Array(value*))
      
      inline def setPrev(value: Page): Self = StObject.set(x, "prev", value.asInstanceOf[js.Any])
      
      inline def setPrevNull: Self = StObject.set(x, "prev", null)
      
      inline def setPrevUndefined: Self = StObject.set(x, "prev", js.undefined)
      
      inline def setRaw(value: String): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
      
      inline def setRawUndefined: Self = StObject.set(x, "raw", js.undefined)
      
      inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setUpdated(value: Moment): Self = StObject.set(x, "updated", value.asInstanceOf[js.Any])
      
      inline def setUpdatedUndefined: Self = StObject.set(x, "updated", js.undefined)
    }
  }
  
  trait Post
    extends StObject
       with Page {
    
    var categories: js.UndefOr[js.Array[String]] = js.undefined
    
    var published: js.UndefOr[Boolean] = js.undefined
    
    var tags: js.Array[String]
  }
  object Post {
    
    inline def apply(
      comments: Boolean,
      content: String,
      date: Moment,
      full_source: String,
      layout: String,
      path: String,
      permalink: String,
      source: String,
      tags: js.Array[String],
      title: String
    ): typings.hexo.mod.Locals.Post = {
      val __obj = js.Dynamic.literal(comments = comments.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], full_source = full_source.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], permalink = permalink.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.hexo.mod.Locals.Post]
    }
    
    extension [Self <: typings.hexo.mod.Locals.Post](x: Self) {
      
      inline def setCategories(value: js.Array[String]): Self = StObject.set(x, "categories", value.asInstanceOf[js.Any])
      
      inline def setCategoriesUndefined: Self = StObject.set(x, "categories", js.undefined)
      
      inline def setCategoriesVarargs(value: String*): Self = StObject.set(x, "categories", js.Array(value*))
      
      inline def setPublished(value: Boolean): Self = StObject.set(x, "published", value.asInstanceOf[js.Any])
      
      inline def setPublishedUndefined: Self = StObject.set(x, "published", js.undefined)
      
      inline def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value*))
    }
  }
  
  trait Tag extends StObject {
    
    var length: Double
    
    var name: String
    
    var path: String
    
    var permalink: String
    
    var posts: Model[typings.hexo.mod.Locals.Post]
    
    var slug: String
  }
  object Tag {
    
    inline def apply(
      length: Double,
      name: String,
      path: String,
      permalink: String,
      posts: Model[typings.hexo.mod.Locals.Post],
      slug: String
    ): Tag = {
      val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], permalink = permalink.asInstanceOf[js.Any], posts = posts.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any])
      __obj.asInstanceOf[Tag]
    }
    
    extension [Self <: Tag](x: Self) {
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPermalink(value: String): Self = StObject.set(x, "permalink", value.asInstanceOf[js.Any])
      
      inline def setPosts(value: Model[typings.hexo.mod.Locals.Post]): Self = StObject.set(x, "posts", value.asInstanceOf[js.Any])
      
      inline def setSlug(value: String): Self = StObject.set(x, "slug", value.asInstanceOf[js.Any])
    }
  }
}
