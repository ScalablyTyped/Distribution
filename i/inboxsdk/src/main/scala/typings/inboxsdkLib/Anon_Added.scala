package typings
package inboxsdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Added extends js.Object {
  var added: js.Array[inboxsdkLib.inboxsdkMod.InboxSDKNs.CommonNs.Contact]
  var removed: js.Array[inboxsdkLib.inboxsdkMod.InboxSDKNs.CommonNs.Contact]
}

object Anon_Added {
  @scala.inline
  def apply(
    added: js.Array[inboxsdkLib.inboxsdkMod.InboxSDKNs.CommonNs.Contact],
    removed: js.Array[inboxsdkLib.inboxsdkMod.InboxSDKNs.CommonNs.Contact]
  ): Anon_Added = {
    val __obj = js.Dynamic.literal(added = added, removed = removed)
  
    __obj.asInstanceOf[Anon_Added]
  }
}

