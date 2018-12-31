package typings
package imapLib.imapMod.ConnectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppendOptions extends js.Object {
    /* string|string[] */ /** What to use for message arrival date/time. Default: (current date/time) */
  var date: js.UndefOr[stdLib.Date] = js.undefined
  /** A single flag (e.g. 'Seen') or an array of flags (e.g. ['Seen', 'Flagged']) to append to the message. Default: (no flags) */
  var flags: js.UndefOr[js.Any] = js.undefined
  /** The name of the mailbox to append the message to. Default: the currently open mailbox */
  var mailbox: js.UndefOr[java.lang.String] = js.undefined
}

