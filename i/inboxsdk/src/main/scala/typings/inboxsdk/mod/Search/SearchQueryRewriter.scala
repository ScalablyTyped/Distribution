package typings.inboxsdk.mod.Search

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchQueryRewriter extends js.Object {
  var term: String = js.native
  def termReplacer(): String | js.Promise[String] = js.native
}

object SearchQueryRewriter {
  @scala.inline
  def apply(term: String, termReplacer: () => String | js.Promise[String]): SearchQueryRewriter = {
    val __obj = js.Dynamic.literal(term = term.asInstanceOf[js.Any], termReplacer = js.Any.fromFunction0(termReplacer))
    __obj.asInstanceOf[SearchQueryRewriter]
  }
  @scala.inline
  implicit class SearchQueryRewriterOps[Self <: SearchQueryRewriter] (val x: Self) extends AnyVal {
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
    def setTerm(value: String): Self = this.set("term", value.asInstanceOf[js.Any])
    @scala.inline
    def setTermReplacer(value: () => String | js.Promise[String]): Self = this.set("termReplacer", js.Any.fromFunction0(value))
  }
  
}

