package typings.markdownIt.rendererMod

import org.scalablytyped.runtime.StringDictionary
import typings.markdownIt.libMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenderRuleRecord
  extends /* type */ StringDictionary[js.UndefOr[RenderRule]] {
  var code_block: js.UndefOr[RenderRule] = js.undefined
  var code_inline: js.UndefOr[RenderRule] = js.undefined
  var fence: js.UndefOr[RenderRule] = js.undefined
  var hardbreak: js.UndefOr[RenderRule] = js.undefined
  var html_block: js.UndefOr[RenderRule] = js.undefined
  var html_inline: js.UndefOr[RenderRule] = js.undefined
  var image: js.UndefOr[RenderRule] = js.undefined
  var softbreak: js.UndefOr[RenderRule] = js.undefined
  var text: js.UndefOr[RenderRule] = js.undefined
}

object RenderRuleRecord {
  @scala.inline
  def apply(
    StringDictionary: /* type */ StringDictionary[js.UndefOr[RenderRule]] = null,
    code_block: (/* tokens */ js.Array[typings.markdownIt.tokenMod.^], /* idx */ Double, /* options */ Options, /* env */ js.Any, /* self */ Renderer) => String = null,
    code_inline: (/* tokens */ js.Array[typings.markdownIt.tokenMod.^], /* idx */ Double, /* options */ Options, /* env */ js.Any, /* self */ Renderer) => String = null,
    fence: (/* tokens */ js.Array[typings.markdownIt.tokenMod.^], /* idx */ Double, /* options */ Options, /* env */ js.Any, /* self */ Renderer) => String = null,
    hardbreak: (/* tokens */ js.Array[typings.markdownIt.tokenMod.^], /* idx */ Double, /* options */ Options, /* env */ js.Any, /* self */ Renderer) => String = null,
    html_block: (/* tokens */ js.Array[typings.markdownIt.tokenMod.^], /* idx */ Double, /* options */ Options, /* env */ js.Any, /* self */ Renderer) => String = null,
    html_inline: (/* tokens */ js.Array[typings.markdownIt.tokenMod.^], /* idx */ Double, /* options */ Options, /* env */ js.Any, /* self */ Renderer) => String = null,
    image: (/* tokens */ js.Array[typings.markdownIt.tokenMod.^], /* idx */ Double, /* options */ Options, /* env */ js.Any, /* self */ Renderer) => String = null,
    softbreak: (/* tokens */ js.Array[typings.markdownIt.tokenMod.^], /* idx */ Double, /* options */ Options, /* env */ js.Any, /* self */ Renderer) => String = null,
    text: (/* tokens */ js.Array[typings.markdownIt.tokenMod.^], /* idx */ Double, /* options */ Options, /* env */ js.Any, /* self */ Renderer) => String = null
  ): RenderRuleRecord = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (code_block != null) __obj.updateDynamic("code_block")(js.Any.fromFunction5(code_block))
    if (code_inline != null) __obj.updateDynamic("code_inline")(js.Any.fromFunction5(code_inline))
    if (fence != null) __obj.updateDynamic("fence")(js.Any.fromFunction5(fence))
    if (hardbreak != null) __obj.updateDynamic("hardbreak")(js.Any.fromFunction5(hardbreak))
    if (html_block != null) __obj.updateDynamic("html_block")(js.Any.fromFunction5(html_block))
    if (html_inline != null) __obj.updateDynamic("html_inline")(js.Any.fromFunction5(html_inline))
    if (image != null) __obj.updateDynamic("image")(js.Any.fromFunction5(image))
    if (softbreak != null) __obj.updateDynamic("softbreak")(js.Any.fromFunction5(softbreak))
    if (text != null) __obj.updateDynamic("text")(js.Any.fromFunction5(text))
    __obj.asInstanceOf[RenderRuleRecord]
  }
}

