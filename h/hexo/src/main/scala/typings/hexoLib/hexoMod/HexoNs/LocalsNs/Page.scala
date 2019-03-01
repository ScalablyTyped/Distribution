package typings
package hexoLib.hexoMod.HexoNs.LocalsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Page
  extends /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var comments: scala.Boolean
  var content: java.lang.String
  var date: momentLib.momentMod.momentNs.Moment
  var excerpt: js.UndefOr[java.lang.String] = js.undefined
  var full_source: java.lang.String
  var layout: java.lang.String
  var link: js.UndefOr[java.lang.String] = js.undefined
  var more: js.UndefOr[java.lang.String] = js.undefined
  var next: js.UndefOr[scala.Null | Page] = js.undefined
  var path: java.lang.String
  var permalink: java.lang.String
  var photos: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var prev: js.UndefOr[scala.Null | Page] = js.undefined
  var raw: js.UndefOr[java.lang.String] = js.undefined
  var source: java.lang.String
  var title: java.lang.String
  var updated: js.UndefOr[momentLib.momentMod.momentNs.Moment] = js.undefined
}

object Page {
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
    title: java.lang.String,
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    excerpt: java.lang.String = null,
    link: java.lang.String = null,
    more: java.lang.String = null,
    next: Page = null,
    photos: js.Array[java.lang.String] = null,
    prev: Page = null,
    raw: java.lang.String = null,
    updated: momentLib.momentMod.momentNs.Moment = null
  ): Page = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("comments")(comments)
    __obj.updateDynamic("content")(content)
    __obj.updateDynamic("date")(date)
    __obj.updateDynamic("full_source")(full_source)
    __obj.updateDynamic("layout")(layout)
    __obj.updateDynamic("path")(path)
    __obj.updateDynamic("permalink")(permalink)
    __obj.updateDynamic("source")(source)
    __obj.updateDynamic("title")(title)
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

