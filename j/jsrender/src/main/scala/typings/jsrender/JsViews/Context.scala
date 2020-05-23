package typings.jsrender.JsViews

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Context
  extends /* prop */ StringDictionary[js.Any] {
  /* Ancestor tags */
  var parentTags: js.UndefOr[Hash[Tag]] = js.undefined
  /* ctx object */
  /* Root data object or array */
  var root: js.Any
  /* This tag */
  var tag: js.UndefOr[Tag] = js.undefined
  /* tagCtx object */
  var tagCtx: js.UndefOr[js.Any] = js.undefined
}

object Context {
  @scala.inline
  def apply(
    root: js.Any,
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    parentTags: Hash[Tag] = null,
    tag: Tag = null,
    tagCtx: js.Any = null
  ): Context = {
    val __obj = js.Dynamic.literal(root = root.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (parentTags != null) __obj.updateDynamic("parentTags")(parentTags.asInstanceOf[js.Any])
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    if (tagCtx != null) __obj.updateDynamic("tagCtx")(tagCtx.asInstanceOf[js.Any])
    __obj.asInstanceOf[Context]
  }
}

