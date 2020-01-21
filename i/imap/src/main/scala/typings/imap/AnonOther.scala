package typings.imap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOther extends js.Object {
  /** Mailboxes that belong to other users that the logged in user has access to. */
  var other: js.Array[_]
  /** Mailboxes that belong to the logged in user. */
  var personal: js.Array[_]
  /** Mailboxes that are accessible by any logged in user. */
  var shared: js.Array[_]
}

object AnonOther {
  @scala.inline
  def apply(other: js.Array[_], personal: js.Array[_], shared: js.Array[_]): AnonOther = {
    val __obj = js.Dynamic.literal(other = other.asInstanceOf[js.Any], personal = personal.asInstanceOf[js.Any], shared = shared.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonOther]
  }
}

