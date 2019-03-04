package typings
package imapDashSimpleLib.imapDashSimpleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImapSimpleOptions extends js.Object {
  /** Time in milliseconds to wait before giving up on a connection attempt. (Deprecated: please use options.imap.authTimeout instead) */
  var connectTimeout: js.UndefOr[scala.Double] = js.undefined
  /** Options to pass to node-imap constructor. */
  var imap: imapLib.imapMod.ConnectionNs.Config
  /** Server event emitted when a message was expunged externally. seqno is the sequence number (instead of the unique UID) of the message that was expunged. If you are caching sequence numbers, all sequence numbers higher than this value MUST be decremented by 1 in order to stay synchronized with the server and to keep correct continuity. */
  var onexpunge: js.UndefOr[js.Function1[/* seqno */ scala.Double, scala.Unit]] = js.undefined
  /** Server event emitted when new mail arrives in the currently open mailbox. */
  var onmail: js.UndefOr[js.Function1[/* numNewMail */ scala.Double, scala.Unit]] = js.undefined
  /** Server event emitted when message metadata (e.g. flags) changes externally. */
  var onupdate: js.UndefOr[js.Function2[/* seqno */ scala.Double, /* info */ js.Any, scala.Unit]] = js.undefined
}

object ImapSimpleOptions {
  @scala.inline
  def apply(
    imap: imapLib.imapMod.ConnectionNs.Config,
    connectTimeout: scala.Int | scala.Double = null,
    onexpunge: js.Function1[/* seqno */ scala.Double, scala.Unit] = null,
    onmail: js.Function1[/* numNewMail */ scala.Double, scala.Unit] = null,
    onupdate: js.Function2[/* seqno */ scala.Double, /* info */ js.Any, scala.Unit] = null
  ): ImapSimpleOptions = {
    val __obj = js.Dynamic.literal(imap = imap)
    if (connectTimeout != null) __obj.updateDynamic("connectTimeout")(connectTimeout.asInstanceOf[js.Any])
    if (onexpunge != null) __obj.updateDynamic("onexpunge")(onexpunge)
    if (onmail != null) __obj.updateDynamic("onmail")(onmail)
    if (onupdate != null) __obj.updateDynamic("onupdate")(onupdate)
    __obj.asInstanceOf[ImapSimpleOptions]
  }
}

