package typings.markdownIt.rendererMod

import org.scalablytyped.runtime.StringDictionary
import typings.markdownIt.libMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RenderRuleRecord
  extends /* type */ StringDictionary[js.UndefOr[RenderRule]] {
  var code_block: js.UndefOr[RenderRule] = js.native
  var code_inline: js.UndefOr[RenderRule] = js.native
  var fence: js.UndefOr[RenderRule] = js.native
  var hardbreak: js.UndefOr[RenderRule] = js.native
  var html_block: js.UndefOr[RenderRule] = js.native
  var html_inline: js.UndefOr[RenderRule] = js.native
  var image: js.UndefOr[RenderRule] = js.native
  var softbreak: js.UndefOr[RenderRule] = js.native
  var text: js.UndefOr[RenderRule] = js.native
}

object RenderRuleRecord {
  @scala.inline
  def apply(): RenderRuleRecord = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RenderRuleRecord]
  }
  @scala.inline
  implicit class RenderRuleRecordOps[Self <: RenderRuleRecord] (val x: Self) extends AnyVal {
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
    def setCode_block(
      value: (/* tokens */ js.Array[typings.markdownIt.tokenMod.^], /* idx */ Double, /* options */ Options, /* env */ js.Any, /* self */ Renderer) => String
    ): Self = this.set("code_block", js.Any.fromFunction5(value))
    @scala.inline
    def deleteCode_block: Self = this.set("code_block", js.undefined)
    @scala.inline
    def setCode_inline(
      value: (/* tokens */ js.Array[typings.markdownIt.tokenMod.^], /* idx */ Double, /* options */ Options, /* env */ js.Any, /* self */ Renderer) => String
    ): Self = this.set("code_inline", js.Any.fromFunction5(value))
    @scala.inline
    def deleteCode_inline: Self = this.set("code_inline", js.undefined)
    @scala.inline
    def setFence(
      value: (/* tokens */ js.Array[typings.markdownIt.tokenMod.^], /* idx */ Double, /* options */ Options, /* env */ js.Any, /* self */ Renderer) => String
    ): Self = this.set("fence", js.Any.fromFunction5(value))
    @scala.inline
    def deleteFence: Self = this.set("fence", js.undefined)
    @scala.inline
    def setHardbreak(
      value: (/* tokens */ js.Array[typings.markdownIt.tokenMod.^], /* idx */ Double, /* options */ Options, /* env */ js.Any, /* self */ Renderer) => String
    ): Self = this.set("hardbreak", js.Any.fromFunction5(value))
    @scala.inline
    def deleteHardbreak: Self = this.set("hardbreak", js.undefined)
    @scala.inline
    def setHtml_block(
      value: (/* tokens */ js.Array[typings.markdownIt.tokenMod.^], /* idx */ Double, /* options */ Options, /* env */ js.Any, /* self */ Renderer) => String
    ): Self = this.set("html_block", js.Any.fromFunction5(value))
    @scala.inline
    def deleteHtml_block: Self = this.set("html_block", js.undefined)
    @scala.inline
    def setHtml_inline(
      value: (/* tokens */ js.Array[typings.markdownIt.tokenMod.^], /* idx */ Double, /* options */ Options, /* env */ js.Any, /* self */ Renderer) => String
    ): Self = this.set("html_inline", js.Any.fromFunction5(value))
    @scala.inline
    def deleteHtml_inline: Self = this.set("html_inline", js.undefined)
    @scala.inline
    def setImage(
      value: (/* tokens */ js.Array[typings.markdownIt.tokenMod.^], /* idx */ Double, /* options */ Options, /* env */ js.Any, /* self */ Renderer) => String
    ): Self = this.set("image", js.Any.fromFunction5(value))
    @scala.inline
    def deleteImage: Self = this.set("image", js.undefined)
    @scala.inline
    def setSoftbreak(
      value: (/* tokens */ js.Array[typings.markdownIt.tokenMod.^], /* idx */ Double, /* options */ Options, /* env */ js.Any, /* self */ Renderer) => String
    ): Self = this.set("softbreak", js.Any.fromFunction5(value))
    @scala.inline
    def deleteSoftbreak: Self = this.set("softbreak", js.undefined)
    @scala.inline
    def setText(
      value: (/* tokens */ js.Array[typings.markdownIt.tokenMod.^], /* idx */ Double, /* options */ Options, /* env */ js.Any, /* self */ Renderer) => String
    ): Self = this.set("text", js.Any.fromFunction5(value))
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
  }
  
}

