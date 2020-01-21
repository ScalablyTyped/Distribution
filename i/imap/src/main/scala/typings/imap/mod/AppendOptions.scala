package typings.imap.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppendOptions extends js.Object {
    /* string|string[] */ /** What to use for message arrival date/time. Default: (current date/time) */
  var date: js.UndefOr[Date] = js.undefined
  /** A single flag (e.g. 'Seen') or an array of flags (e.g. ['Seen', 'Flagged']) to append to the message. Default: (no flags) */
  var flags: js.UndefOr[js.Any] = js.undefined
  /** The name of the mailbox to append the message to. Default: the currently open mailbox */
  var mailbox: js.UndefOr[String] = js.undefined
}

object AppendOptions {
  @scala.inline
  def apply(date: Date = null, flags: js.Any = null, mailbox: String = null): AppendOptions = {
    val __obj = js.Dynamic.literal()
    if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (flags != null) __obj.updateDynamic("flags")(flags.asInstanceOf[js.Any])
    if (mailbox != null) __obj.updateDynamic("mailbox")(mailbox.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppendOptions]
  }
}

