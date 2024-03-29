package typings.hexo.mod

import org.scalablytyped.runtime.StringDictionary
import typings.hexo.mod.Locals.Category
import typings.hexo.mod.Locals.Page
import typings.hexo.mod.Locals.Tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Site extends StObject {
  
  var categories: Model[Category]
  
  var data: StringDictionary[Any]
  
  var pages: Model[Page]
  
  var posts: Model[typings.hexo.mod.Locals.Post]
  
  var tags: Model[Tag]
}
object Site {
  
  inline def apply(
    categories: Model[Category],
    data: StringDictionary[Any],
    pages: Model[Page],
    posts: Model[typings.hexo.mod.Locals.Post],
    tags: Model[Tag]
  ): Site = {
    val __obj = js.Dynamic.literal(categories = categories.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], pages = pages.asInstanceOf[js.Any], posts = posts.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[Site]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Site] (val x: Self) extends AnyVal {
    
    inline def setCategories(value: Model[Category]): Self = StObject.set(x, "categories", value.asInstanceOf[js.Any])
    
    inline def setData(value: StringDictionary[Any]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setPages(value: Model[Page]): Self = StObject.set(x, "pages", value.asInstanceOf[js.Any])
    
    inline def setPosts(value: Model[typings.hexo.mod.Locals.Post]): Self = StObject.set(x, "posts", value.asInstanceOf[js.Any])
    
    inline def setTags(value: Model[Tag]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
  }
}
