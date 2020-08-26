package typings.imapSimple.mod

import typings.imap.mod.Config
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImapSimpleOptions extends js.Object {
  /** Time in milliseconds to wait before giving up on a connection attempt. (Deprecated: please use options.imap.authTimeout instead) */
  var connectTimeout: js.UndefOr[Double] = js.native
  /** Options to pass to node-imap constructor. */
  var imap: Config = js.native
  /** Server event emitted when a message was expunged externally. seqno is the sequence number (instead of the unique UID) of the message that was expunged. If you are caching sequence numbers, all sequence numbers higher than this value MUST be decremented by 1 in order to stay synchronized with the server and to keep correct continuity. */
  var onexpunge: js.UndefOr[js.Function1[/* seqno */ Double, Unit]] = js.native
  /** Server event emitted when new mail arrives in the currently open mailbox. */
  var onmail: js.UndefOr[js.Function1[/* numNewMail */ Double, Unit]] = js.native
  /** Server event emitted when message metadata (e.g. flags) changes externally. */
  var onupdate: js.UndefOr[js.Function2[/* seqno */ Double, /* info */ js.Any, Unit]] = js.native
}

object ImapSimpleOptions {
  @scala.inline
  def apply(imap: Config): ImapSimpleOptions = {
    val __obj = js.Dynamic.literal(imap = imap.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImapSimpleOptions]
  }
  @scala.inline
  implicit class ImapSimpleOptionsOps[Self <: ImapSimpleOptions] (val x: Self) extends AnyVal {
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
    def setImap(value: Config): Self = this.set("imap", value.asInstanceOf[js.Any])
    @scala.inline
    def setConnectTimeout(value: Double): Self = this.set("connectTimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConnectTimeout: Self = this.set("connectTimeout", js.undefined)
    @scala.inline
    def setOnexpunge(value: /* seqno */ Double => Unit): Self = this.set("onexpunge", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnexpunge: Self = this.set("onexpunge", js.undefined)
    @scala.inline
    def setOnmail(value: /* numNewMail */ Double => Unit): Self = this.set("onmail", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnmail: Self = this.set("onmail", js.undefined)
    @scala.inline
    def setOnupdate(value: (/* seqno */ Double, /* info */ js.Any) => Unit): Self = this.set("onupdate", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnupdate: Self = this.set("onupdate", js.undefined)
  }
  
}

