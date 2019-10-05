package typings.inboxsdk

import typings.inboxsdk.inboxsdkMod.Common.Contact
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Added extends js.Object {
  var added: js.Array[Contact]
  var removed: js.Array[Contact]
}

object Anon_Added {
  @scala.inline
  def apply(added: js.Array[Contact], removed: js.Array[Contact]): Anon_Added = {
    val __obj = js.Dynamic.literal(added = added, removed = removed)
  
    __obj.asInstanceOf[Anon_Added]
  }
}

