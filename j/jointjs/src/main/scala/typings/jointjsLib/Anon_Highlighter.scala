package typings
package jointjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Highlighter extends js.Object {
  var highlighter: js.UndefOr[jointjsLib.jointjsMod.highlightersNs.HighlighterJSON] = js.undefined
}

object Anon_Highlighter {
  @scala.inline
  def apply(highlighter: jointjsLib.jointjsMod.highlightersNs.HighlighterJSON = null): Anon_Highlighter = {
    val __obj = js.Dynamic.literal()
    if (highlighter != null) __obj.updateDynamic("highlighter")(highlighter)
    __obj.asInstanceOf[Anon_Highlighter]
  }
}

