package typings.hexo.hexoMod

import org.scalablytyped.runtime.StringDictionary
import typings.hexo.hexoMod.LocalsNs.Category
import typings.hexo.hexoMod.LocalsNs.Page
import typings.hexo.hexoMod.LocalsNs.Tag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Site extends js.Object {
  var categories: Model[Category]
  var data: StringDictionary[js.Any]
  var pages: Model[Page]
  var posts: Model[typings.hexo.hexoMod.LocalsNs.Post]
  var tags: Model[Tag]
}

object Site {
  @scala.inline
  def apply(
    categories: Model[Category],
    data: StringDictionary[js.Any],
    pages: Model[Page],
    posts: Model[typings.hexo.hexoMod.LocalsNs.Post],
    tags: Model[Tag]
  ): Site = {
    val __obj = js.Dynamic.literal(categories = categories, data = data, pages = pages, posts = posts, tags = tags)
  
    __obj.asInstanceOf[Site]
  }
}

