package typings.inboxsdk

import typings.inboxsdk.mod.Common.Contact
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAdded extends js.Object {
  var added: js.Array[Contact]
  var removed: js.Array[Contact]
}

object AnonAdded {
  @scala.inline
  def apply(added: js.Array[Contact], removed: js.Array[Contact]): AnonAdded = {
    val __obj = js.Dynamic.literal(added = added.asInstanceOf[js.Any], removed = removed.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAdded]
  }
}

