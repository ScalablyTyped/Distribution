package typings.jointjs.anon

import typings.jointjs.mod.highlighters.HighlighterJSON
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Highlighter extends js.Object {
  var highlighter: js.UndefOr[HighlighterJSON] = js.native
}

object Highlighter {
  @scala.inline
  def apply(): Highlighter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Highlighter]
  }
  @scala.inline
  implicit class HighlighterOps[Self <: Highlighter] (val x: Self) extends AnyVal {
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
    def setHighlighter(value: HighlighterJSON): Self = this.set("highlighter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHighlighter: Self = this.set("highlighter", js.undefined)
  }
  
}

