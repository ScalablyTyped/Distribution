package typings
package hexoLib.hexoMod.HexoNs.LocalsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Post extends Page {
  var categories: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var published: js.UndefOr[scala.Boolean] = js.undefined
  var tags: js.Array[java.lang.String]
}

object Post {
  @scala.inline
  def apply(
    comments: scala.Boolean,
    content: java.lang.String,
    date: momentLib.momentMod.momentNs.Moment,
    full_source: java.lang.String,
    layout: java.lang.String,
    path: java.lang.String,
    permalink: java.lang.String,
    source: java.lang.String,
    tags: js.Array[java.lang.String],
    title: java.lang.String,
    categories: js.Array[java.lang.String] = null,
    excerpt: java.lang.String = null,
    link: java.lang.String = null,
    more: java.lang.String = null,
    next: Page = null,
    photos: js.Array[java.lang.String] = null,
    prev: Page = null,
    published: js.UndefOr[scala.Boolean] = js.undefined,
    raw: java.lang.String = null,
    updated: momentLib.momentMod.momentNs.Moment = null
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

