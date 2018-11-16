package typings
package imapLib.imapMod.ConnectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Box extends js.Object {
  /** array - A list of system-defined flags applicable for this mailbox. Flags in this list but not in permFlags may be stored for the current session only. Additional server implementation-specific flags may also be available. */
  var flags: js.Array[java.lang.String]
  /** Contains various message counts for this mailbox: */
  var messages: imapLib.Anon_Unseen
  /** The name of this mailbox. */
  var name: java.lang.String
  /** True if new keywords can be added to messages in this mailbox. */
  var newKeywords: scala.Boolean
  /** A list of flags that can be permanently added/removed to/from messages in this mailbox. */
  var permFlags: js.Array[java.lang.String]
  /** Whether or not this mailbox has persistent UIDs. This should almost always be true for modern mailboxes and should only be false for legacy mail stores where supporting persistent UIDs was not technically feasible. */
  var persistentUIDs: scala.Boolean
  /** True if this mailbox was opened in read-only mode. (Only available with openBox() calls) */
  var readOnly: js.UndefOr[scala.Boolean] = js.undefined
  /** The uid that will be assigned to the next message that arrives at this mailbox. */
  var uidnext: scala.Double
  /** A 32-bit number that can be used to determine if UIDs in this mailbox have changed since the last time this mailbox was opened. */
  var uidvalidity: scala.Double
}

