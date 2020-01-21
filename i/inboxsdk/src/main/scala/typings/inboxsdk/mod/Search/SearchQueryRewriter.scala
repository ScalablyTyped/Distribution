package typings.inboxsdk.mod.Search

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchQueryRewriter extends js.Object {
  var term: String
  def termReplacer(): String | js.Promise[String]
}

object SearchQueryRewriter {
  @scala.inline
  def apply(term: String, termReplacer: () => String | js.Promise[String]): SearchQueryRewriter = {
    val __obj = js.Dynamic.literal(term = term.asInstanceOf[js.Any], termReplacer = js.Any.fromFunction0(termReplacer))
  
    __obj.asInstanceOf[SearchQueryRewriter]
  }
}

