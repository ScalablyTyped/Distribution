package typings.jsrender.JsViews

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Context
  extends /* prop */ StringDictionary[js.Any] {
  /* Ancestor tags */
  var parentTags: js.UndefOr[Hash[Tag]] = js.native
  /* ctx object */
  /* Root data object or array */
  var root: js.Any = js.native
  /* This tag */
  var tag: js.UndefOr[Tag] = js.native
  /* tagCtx object */
  var tagCtx: js.UndefOr[js.Any] = js.native
}

object Context {
  @scala.inline
  def apply(root: js.Any): Context = {
    val __obj = js.Dynamic.literal(root = root.asInstanceOf[js.Any])
    __obj.asInstanceOf[Context]
  }
  @scala.inline
  implicit class ContextOps[Self <: Context] (val x: Self) extends AnyVal {
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
    def setRoot(value: js.Any): Self = this.set("root", value.asInstanceOf[js.Any])
    @scala.inline
    def setParentTags(value: Hash[Tag]): Self = this.set("parentTags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParentTags: Self = this.set("parentTags", js.undefined)
    @scala.inline
    def setTag(value: Tag): Self = this.set("tag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTag: Self = this.set("tag", js.undefined)
    @scala.inline
    def setTagCtx(value: js.Any): Self = this.set("tagCtx", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTagCtx: Self = this.set("tagCtx", js.undefined)
  }
  
}

