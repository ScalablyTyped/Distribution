package typings.inboxsdk.inboxsdkMod.ListsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThreadRowDraftLabelDescriptor extends js.Object {
  var count: js.UndefOr[String] = js.undefined
  var text: String
}

object ThreadRowDraftLabelDescriptor {
  @scala.inline
  def apply(text: String, count: String = null): ThreadRowDraftLabelDescriptor = {
    val __obj = js.Dynamic.literal(text = text)
    if (count != null) __obj.updateDynamic("count")(count)
    __obj.asInstanceOf[ThreadRowDraftLabelDescriptor]
  }
}

