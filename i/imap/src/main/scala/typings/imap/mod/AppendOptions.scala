package typings.imap.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AppendOptions extends js.Object {
    /* string|string[] */ /** What to use for message arrival date/time. Default: (current date/time) */
  var date: js.UndefOr[Date] = js.native
  /** A single flag (e.g. 'Seen') or an array of flags (e.g. ['Seen', 'Flagged']) to append to the message. Default: (no flags) */
  var flags: js.UndefOr[js.Any] = js.native
  /** The name of the mailbox to append the message to. Default: the currently open mailbox */
  var mailbox: js.UndefOr[String] = js.native
}

object AppendOptions {
  @scala.inline
  def apply(): AppendOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppendOptions]
  }
  @scala.inline
  implicit class AppendOptionsOps[Self <: AppendOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDate(value: Date): Self = this.set("date", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDate: Self = this.set("date", js.undefined)
    @scala.inline
    def setFlags(value: js.Any): Self = this.set("flags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlags: Self = this.set("flags", js.undefined)
    @scala.inline
    def setMailbox(value: String): Self = this.set("mailbox", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMailbox: Self = this.set("mailbox", js.undefined)
  }
  
}

