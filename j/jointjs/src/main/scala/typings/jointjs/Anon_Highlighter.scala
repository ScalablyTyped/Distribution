package typings.jointjs

import typings.jointjs.jointjsMod.highlightersNs.HighlighterJSON
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Highlighter extends js.Object {
  var highlighter: js.UndefOr[HighlighterJSON] = js.undefined
}

object Anon_Highlighter {
  @scala.inline
  def apply(highlighter: HighlighterJSON = null): Anon_Highlighter = {
    val __obj = js.Dynamic.literal()
    if (highlighter != null) __obj.updateDynamic("highlighter")(highlighter)
    __obj.asInstanceOf[Anon_Highlighter]
  }
}

