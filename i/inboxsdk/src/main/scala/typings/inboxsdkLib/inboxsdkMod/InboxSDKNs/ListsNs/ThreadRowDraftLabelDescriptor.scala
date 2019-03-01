package typings
package inboxsdkLib.inboxsdkMod.InboxSDKNs.ListsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThreadRowDraftLabelDescriptor extends js.Object {
  var count: js.UndefOr[java.lang.String] = js.undefined
  var text: java.lang.String
}

object ThreadRowDraftLabelDescriptor {
  @scala.inline
  def apply(text: java.lang.String, count: java.lang.String = null): ThreadRowDraftLabelDescriptor = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("text")(text)
    if (count != null) __obj.updateDynamic("count")(count)
    __obj.asInstanceOf[ThreadRowDraftLabelDescriptor]
  }
}

