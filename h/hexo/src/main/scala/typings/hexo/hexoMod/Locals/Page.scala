package typings.hexo.hexoMod.Locals

import org.scalablytyped.runtime.StringDictionary
import typings.moment.momentMod.Moment
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
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    excerpt: String = null,
    link: String = null,
    more: String = null,
    next: Page = null,
    photos: js.Array[String] = null,
    prev: Page = null,
    raw: String = null,
    updated: Moment = null
  ): Page = {
    val __obj = js.Dynamic.literal(comments = comments, content = content, date = date, full_source = full_source, layout = layout, path = path, permalink = permalink, source = source, title = title)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (excerpt != null) __obj.updateDynamic("excerpt")(excerpt)
    if (link != null) __obj.updateDynamic("link")(link)
    if (more != null) __obj.updateDynamic("more")(more)
    if (next != null) __obj.updateDynamic("next")(next)
    if (photos != null) __obj.updateDynamic("photos")(photos)
    if (prev != null) __obj.updateDynamic("prev")(prev)
    if (raw != null) __obj.updateDynamic("raw")(raw)
    if (updated != null) __obj.updateDynamic("updated")(updated)
    __obj.asInstanceOf[Page]
  }
}

