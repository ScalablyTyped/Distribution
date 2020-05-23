package typings.hexo.mod.Locals

import org.scalablytyped.runtime.StringDictionary
import typings.moment.mod.Moment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Page
  extends /* key */ StringDictionary[js.Any] {
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
    title: String,
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    excerpt: String = null,
    link: String = null,
    more: String = null,
    next: js.UndefOr[Null | Page] = js.undefined,
    photos: js.Array[String] = null,
    prev: js.UndefOr[Null | Page] = js.undefined,
    raw: String = null,
    updated: Moment = null
  ): Page = {
    val __obj = js.Dynamic.literal(comments = comments.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], full_source = full_source.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], permalink = permalink.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (excerpt != null) __obj.updateDynamic("excerpt")(excerpt.asInstanceOf[js.Any])
    if (link != null) __obj.updateDynamic("link")(link.asInstanceOf[js.Any])
    if (more != null) __obj.updateDynamic("more")(more.asInstanceOf[js.Any])
    if (!js.isUndefined(next)) __obj.updateDynamic("next")(next.asInstanceOf[js.Any])
    if (photos != null) __obj.updateDynamic("photos")(photos.asInstanceOf[js.Any])
    if (!js.isUndefined(prev)) __obj.updateDynamic("prev")(prev.asInstanceOf[js.Any])
    if (raw != null) __obj.updateDynamic("raw")(raw.asInstanceOf[js.Any])
    if (updated != null) __obj.updateDynamic("updated")(updated.asInstanceOf[js.Any])
    __obj.asInstanceOf[Page]
  }
}

