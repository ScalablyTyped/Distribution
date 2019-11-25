package typings.hexo.hexoMod

import org.scalablytyped.runtime.StringDictionary
import typings.hexo.hexoMod.Locals.Category
import typings.hexo.hexoMod.Locals.Page
import typings.hexo.hexoMod.Locals.Tag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Site extends js.Object {
  var categories: Model[Category]
  var data: StringDictionary[js.Any]
  var pages: Model[Page]
  var posts: Model[typings.hexo.hexoMod.Locals.Post]
  var tags: Model[Tag]
}

object Site {
  @scala.inline
  def apply(
    categories: Model[Category],
    data: StringDictionary[js.Any],
    pages: Model[Page],
    posts: Model[typings.hexo.hexoMod.Locals.Post],
    tags: Model[Tag]
  ): Site = {
    val __obj = js.Dynamic.literal(categories = categories.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], pages = pages.asInstanceOf[js.Any], posts = posts.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Site]
  }
}

