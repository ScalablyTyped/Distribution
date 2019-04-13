package typings
package issueDashParserLib.issueDashParserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Result extends js.Object {
  var actions: Actions
  var allRefs: js.Array[Reference | Action]
  var mentions: js.Array[Mention]
  var refs: js.Array[Reference]
}

object Result {
  @scala.inline
  def apply(
    actions: Actions,
    allRefs: js.Array[Reference | Action],
    mentions: js.Array[Mention],
    refs: js.Array[Reference]
  ): Result = {
    val __obj = js.Dynamic.literal(actions = actions, allRefs = allRefs, mentions = mentions, refs = refs)
  
    __obj.asInstanceOf[Result]
  }
}

