package typings
package imapLib.imapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Connection
  extends nodeLib.NodeJSNs.EventEmitter
     with MessageFunctions {
  /** The (top-level) mailbox hierarchy delimiter. If the server does not support mailbox hierarchies and only a flat list, this value will be falsey. */
  var delimiter: java.lang.String = js.native
  /** Contains information about each namespace type (if supported by the server) with the following properties: */
  var namespaces: imapLib.Anon_Other = js.native
  /**
    seq exposes the search() ... serverSupports() set of commands, but returns sequence number(s) instead of UIDs.
    */
  var seq: MessageFunctions = js.native
  /** The current state of the connection (e.g. 'disconnected', 'connected', 'authenticated'). */
  var state: java.lang.String = js.native
  /** Creates a new mailbox on the server. mailboxName should include any necessary prefix/path. */
  def addBox(mailboxName: java.lang.String, callback: js.Function1[/* error */ stdLib.Error, scala.Unit]): scala.Unit = js.native
  // from NodeJS.EventEmitter
  def addListener(event: java.lang.String, listener: js.Function): this.type = js.native
  /** Appends a message to selected mailbox. msgData is a string or Buffer containing an RFC-822 compatible MIME message. Valid options properties are: */
  def append(msgData: js.Any, callback: js.Function1[/* error */ stdLib.Error, scala.Unit]): scala.Unit = js.native
  def append(
    msgData: js.Any,
    options: AppendOptions,
    callback: js.Function1[/* error */ stdLib.Error, scala.Unit]
  ): scala.Unit = js.native
  def closeBox(autoExpunge: scala.Boolean, callback: js.Function1[/* error */ stdLib.Error, scala.Unit]): scala.Unit = js.native
  /** Closes the currently open mailbox. If autoExpunge is true, any messages marked as Deleted in the currently open mailbox will be removed if the mailbox was NOT opened in read-only mode. If autoExpunge is false, you disconnect, or you open another mailbox, messages marked as Deleted will NOT be removed from the currently open mailbox. */
  def closeBox(callback: js.Function1[/* error */ stdLib.Error, scala.Unit]): scala.Unit = js.native
  /** Attempts to connect and authenticate with the IMAP server. */
  def connect(): scala.Unit = js.native
  /** Removes a specific mailbox that exists on the server. mailboxName should including any necessary prefix/path. */
  def delBox(mailboxName: java.lang.String, callback: js.Function1[/* error */ stdLib.Error, scala.Unit]): scala.Unit = js.native
  /** Immediately destroys the connection to the server. */
  def destroy(): scala.Unit = js.native
  /** Closes the connection to the server after all requests in the queue have been sent. */
  def end(): scala.Unit = js.native
  /** Permanently removes all messages flagged as Deleted in the currently open mailbox. If the server supports the 'UIDPLUS' capability, uids can be supplied to only remove messages that both have their uid in uids and have the \Deleted flag set. Note: At least on Gmail, performing this operation with any currently open mailbox that is not the Spam or Trash mailbox will merely archive any messages marked as Deleted (by moving them to the 'All Mail' mailbox). */
  def expunge(callback: js.Function1[/* error */ stdLib.Error, scala.Unit]): scala.Unit = js.native
  def expunge(uids: js.Any, callback: js.Function1[/* error */ stdLib.Error, scala.Unit]): scala.Unit = js.native
  /** Obtains the full list of mailboxes. If nsPrefix is not specified, the main personal namespace is used. */
  def getBoxes(callback: js.Function2[/* error */ stdLib.Error, /* mailboxes */ MailBoxes, scala.Unit]): scala.Unit = js.native
  def getBoxes(
    nsPrefix: java.lang.String,
    callback: js.Function2[/* error */ stdLib.Error, /* mailboxes */ MailBoxes, scala.Unit]
  ): scala.Unit = js.native
  /** Obtains the full list of subscribed mailboxes. If nsPrefix is not specified, the main personal namespace is used. */
  def getSubscribedBoxes(callback: js.Function2[/* error */ stdLib.Error, /* mailboxes */ MailBoxes, scala.Unit]): scala.Unit = js.native
  def getSubscribedBoxes(
    nsPrefix: java.lang.String,
    callback: js.Function2[/* error */ stdLib.Error, /* mailboxes */ MailBoxes, scala.Unit]
  ): scala.Unit = js.native
  def on(event: java.lang.String, listener: js.Function): this.type = js.native
  def once(event: java.lang.String, listener: js.Function): this.type = js.native
  /** Opens a specific mailbox that exists on the server. mailboxName should include any necessary prefix/path. modifiers is used by IMAP extensions. */
  def openBox(
    mailboxName: java.lang.String,
    callback: js.Function2[/* error */ stdLib.Error, /* mailbox */ Box, scala.Unit]
  ): scala.Unit = js.native
  def openBox(
    mailboxName: java.lang.String,
    openReadOnly: scala.Boolean,
    callback: js.Function2[/* error */ stdLib.Error, /* mailbox */ Box, scala.Unit]
  ): scala.Unit = js.native
  def openBox(
    mailboxName: java.lang.String,
    openReadOnly: scala.Boolean,
    modifiers: js.Object,
    callback: js.Function2[/* error */ stdLib.Error, /* mailbox */ Box, scala.Unit]
  ): scala.Unit = js.native
  def removeListener(event: java.lang.String, listener: js.Function): this.type = js.native
  /** Renames a specific mailbox that exists on the server. Both oldMailboxName and newMailboxName should include any necessary prefix/path. Note: Renaming the 'INBOX' mailbox will instead cause all messages in 'INBOX' to be moved to the new mailbox. */
  def renameBox(
    oldMailboxName: java.lang.String,
    newMailboxName: java.lang.String,
    callback: js.Function2[/* error */ stdLib.Error, /* mailbox */ Box, scala.Unit]
  ): scala.Unit = js.native
  /** Fetches information about a mailbox other than the one currently open. Note: There is no guarantee that this will be a fast operation on the server. Also, do not call this on the currently open mailbox. */
  def status(
    mailboxName: java.lang.String,
    callback: js.Function2[/* error */ stdLib.Error, /* mailbox */ Box, scala.Unit]
  ): scala.Unit = js.native
  /** Subscribes to a specific mailbox that exists on the server. mailboxName should include any necessary prefix/path. */
  def subscribeBox(mailboxName: java.lang.String, callback: js.Function1[/* error */ stdLib.Error, scala.Unit]): scala.Unit = js.native
  /** Unsubscribes from a specific mailbox that exists on the server. mailboxName should include any necessary prefix/path. */
  def unsubscribeBox(mailboxName: java.lang.String, callback: js.Function1[/* error */ stdLib.Error, scala.Unit]): scala.Unit = js.native
}

