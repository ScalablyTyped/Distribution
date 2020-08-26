package typings.hexo.mod

import org.scalablytyped.runtime.StringDictionary
import typings.hexo.mod.Locals.Category
import typings.hexo.mod.Locals.Page
import typings.hexo.mod.Locals.Tag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Site extends js.Object {
  var categories: Model[Category] = js.native
  var data: StringDictionary[js.Any] = js.native
  var pages: Model[Page] = js.native
  var posts: Model[typings.hexo.mod.Locals.Post] = js.native
  var tags: Model[Tag] = js.native
}

object Site {
  @scala.inline
  def apply(
    categories: Model[Category],
    data: StringDictionary[js.Any],
    pages: Model[Page],
    posts: Model[typings.hexo.mod.Locals.Post],
    tags: Model[Tag]
  ): Site = {
    val __obj = js.Dynamic.literal(categories = categories.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], pages = pages.asInstanceOf[js.Any], posts = posts.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[Site]
  }
  @scala.inline
  implicit class SiteOps[Self <: Site] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCategories(value: Model[Category]): Self = this.set("categories", value.asInstanceOf[js.Any])
    @scala.inline
    def setData(value: StringDictionary[js.Any]): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setPages(value: Model[Page]): Self = this.set("pages", value.asInstanceOf[js.Any])
    @scala.inline
    def setPosts(value: Model[typings.hexo.mod.Locals.Post]): Self = this.set("posts", value.asInstanceOf[js.Any])
    @scala.inline
    def setTags(value: Model[Tag]): Self = this.set("tags", value.asInstanceOf[js.Any])
  }
  
}

