package typings.hexo.hexoMod.Locals

import typings.moment.momentMod.Moment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Post extends Page {
  var categories: js.UndefOr[js.Array[String]] = js.undefined
  var published: js.UndefOr[Boolean] = js.undefined
  var tags: js.Array[String]
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
    title: String,
    categories: js.Array[String] = null,
    excerpt: String = null,
    link: String = null,
    more: String = null,
    next: Page = null,
    photos: js.Array[String] = null,
    prev: Page = null,
    published: js.UndefOr[Boolean] = js.undefined,
    raw: String = null,
    updated: Moment = null
  ): Post = {
    val __obj = js.Dynamic.literal(comments = comments, content = content, date = date, full_source = full_source, layout = layout, path = path, permalink = permalink, source = source, tags = tags, title = title)
    if (categories != null) __obj.updateDynamic("categories")(categories)
    if (excerpt != null) __obj.updateDynamic("excerpt")(excerpt)
    if (link != null) __obj.updateDynamic("link")(link)
    if (more != null) __obj.updateDynamic("more")(more)
    if (next != null) __obj.updateDynamic("next")(next)
    if (photos != null) __obj.updateDynamic("photos")(photos)
    if (prev != null) __obj.updateDynamic("prev")(prev)
    if (!js.isUndefined(published)) __obj.updateDynamic("published")(published)
    if (raw != null) __obj.updateDynamic("raw")(raw)
    if (updated != null) __obj.updateDynamic("updated")(updated)
    __obj.asInstanceOf[Post]
  }
}

