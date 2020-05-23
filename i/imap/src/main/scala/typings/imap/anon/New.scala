package typings.imap.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait New extends js.Object {
  /** Number of messages in this mailbox having the Recent flag (this IMAP session is the first to see these messages). */
  var `new`: Double
  /** Total number of messages in this mailbox. */
  var total: Double
  /** (Only available with status() calls) Number of messages in this mailbox not having the Seen flag (marked as not having been read). */
  var unseen: Double
}

object New {
  @scala.inline
  def apply(`new`: Double, total: Double, unseen: Double): New = {
    val __obj = js.Dynamic.literal(total = total.asInstanceOf[js.Any], unseen = unseen.asInstanceOf[js.Any])
    __obj.updateDynamic("new")(`new`.asInstanceOf[js.Any])
    __obj.asInstanceOf[New]
  }
}

