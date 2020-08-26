package typings.hexo.mod.Locals

import typings.moment.mod.Moment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Post extends Page {
  var categories: js.UndefOr[js.Array[String]] = js.native
  var published: js.UndefOr[Boolean] = js.native
  var tags: js.Array[String] = js.native
}

object Post {
  @scala.inline
  def apply(
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
  ): Post = {
    val __obj = js.Dynamic.literal(comments = comments.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], full_source = full_source.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], permalink = permalink.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Post]
  }
  @scala.inline
  implicit class PostOps[Self <: Post] (val x: Self) extends AnyVal {
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
    def setTagsVarargs(value: String*): Self = this.set("tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: js.Array[String]): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def setCategoriesVarargs(value: String*): Self = this.set("categories", js.Array(value :_*))
    @scala.inline
    def setCategories(value: js.Array[String]): Self = this.set("categories", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCategories: Self = this.set("categories", js.undefined)
    @scala.inline
    def setPublished(value: Boolean): Self = this.set("published", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePublished: Self = this.set("published", js.undefined)
  }
  
}

