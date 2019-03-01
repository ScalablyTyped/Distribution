package typings
package issueDashParserLib.issueDashParserMod.issueParserNs

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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("actions")(actions)
    __obj.updateDynamic("allRefs")(allRefs)
    __obj.updateDynamic("mentions")(mentions)
    __obj.updateDynamic("refs")(refs)
    __obj.asInstanceOf[Result]
  }
}

