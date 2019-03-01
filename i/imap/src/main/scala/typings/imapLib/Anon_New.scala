package typings
package imapLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_New extends js.Object {
  /** Number of messages in this mailbox having the Recent flag (this IMAP session is the first to see these messages). */
  var `new`: scala.Double
  /** Total number of messages in this mailbox. */
  var total: scala.Double
  /** (Only available with status() calls) Number of messages in this mailbox not having the Seen flag (marked as not having been read). */
  var unseen: scala.Double
}

object Anon_New {
  @scala.inline
  def apply(`new`: scala.Double, total: scala.Double, unseen: scala.Double): Anon_New = {
    val __obj = js.Dynamic.literal(`new` = `new`)
    __obj.updateDynamic("total")(total)
    __obj.updateDynamic("unseen")(unseen)
    __obj.asInstanceOf[Anon_New]
  }
}

