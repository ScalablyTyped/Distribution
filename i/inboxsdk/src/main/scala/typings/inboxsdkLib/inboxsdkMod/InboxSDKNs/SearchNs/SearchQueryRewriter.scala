package typings
package inboxsdkLib.inboxsdkMod.InboxSDKNs.SearchNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchQueryRewriter extends js.Object {
  var term: java.lang.String
  def termReplacer(): java.lang.String | js.Promise[java.lang.String]
}

object SearchQueryRewriter {
  @scala.inline
  def apply(
    term: java.lang.String,
    termReplacer: js.Function0[java.lang.String | js.Promise[java.lang.String]]
  ): SearchQueryRewriter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("term")(term)
    __obj.updateDynamic("termReplacer")(termReplacer)
    __obj.asInstanceOf[SearchQueryRewriter]
  }
}

