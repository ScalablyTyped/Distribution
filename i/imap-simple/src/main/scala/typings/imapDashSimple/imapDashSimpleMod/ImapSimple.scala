package typings.imapDashSimple.imapDashSimpleMod

import typings.imap.imapMod.AppendOptions
import typings.imap.imapMod.FetchOptions
import typings.imap.imapMod.MailBoxes
import typings.imap.imapMod.^
import typings.node.eventsMod.EventEmitter
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("imap-simple", "ImapSimple")
@js.native
class ImapSimple protected () extends EventEmitter {
  def this(imap: ^) = this()
  def addBox(boxName: String): js.Promise[String] = js.native
  /** Create a mailbox, calling the provided callback with signature (err, boxName), or resolves the returned promise with boxName. */
  def addBox(boxName: String, callback: js.Function2[/* err */ Error, /* boxName */ String, Unit]): Unit = js.native
  def addFlags(source: String, flag: String): js.Promise[Unit] = js.native
  /** Adds the provided flag(s) to the specified message(s). uid is the uid of the message you want to add the flag to or an array of uids. flag is either a string or array of strings indicating the flags to add. */
  def addFlags(source: String, flag: String, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  def addFlags(source: String, flag: js.Array[String]): js.Promise[Unit] = js.native
  def addFlags(source: String, flag: js.Array[String], callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  def addFlags(source: js.Array[String], flag: String): js.Promise[Unit] = js.native
  def addFlags(source: js.Array[String], flag: String, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  def addFlags(source: js.Array[String], flag: js.Array[String]): js.Promise[Unit] = js.native
  def addFlags(source: js.Array[String], flag: js.Array[String], callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  def addMessageLabel(source: String, label: String): js.Promise[Unit] = js.native
  /** Adds the provided label(s) to the specified message(s). source corresponds to a node-imap MessageSource which specifies the messages to be moved. label is either a string or array of strings indicating the labels to add. When completed, either calls the provided callback with signature (err), or resolves the returned promise. */
  def addMessageLabel(source: String, label: String, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  def addMessageLabel(source: String, label: js.Array[String]): js.Promise[Unit] = js.native
  def addMessageLabel(source: String, label: js.Array[String], callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  def addMessageLabel(source: js.Array[String], label: String): js.Promise[Unit] = js.native
  def addMessageLabel(source: js.Array[String], label: String, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  def addMessageLabel(source: js.Array[String], label: js.Array[String]): js.Promise[Unit] = js.native
  def addMessageLabel(source: js.Array[String], label: js.Array[String], callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  def append(message: js.Any, options: AppendOptions): js.Promise[Unit] = js.native
  /** Appends the argument message to the currently open mailbox or another mailbox. Message is a RFC-822 compatible MIME message. Valid options are mailbox, flags and date. When completed, either calls the provided callback with signature (err), or resolves the returned promise. */
  def append(message: js.Any, options: AppendOptions, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  def delBox(boxName: String): js.Promise[String] = js.native
  /** Delete a mailbox, calling the provided callback with signature (err, boxName), or resolves the returned promise with boxName. */
  def delBox(boxName: String, callback: js.Function2[/* err */ Error, /* boxName */ String, Unit]): Unit = js.native
  def delFlags(uid: String, flag: String): js.Promise[Unit] = js.native
  /** Removes the provided flag(s) from the specified message(s). uid is the uid of the message you want to remove the flag from or an array of uids. flag is either a string or array of strings indicating the flags to remove. */
  def delFlags(uid: String, flag: String, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  def delFlags(uid: String, flag: js.Array[String]): js.Promise[Unit] = js.native
  def delFlags(uid: String, flag: js.Array[String], callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  def delFlags(uid: js.Array[String], flag: String): js.Promise[Unit] = js.native
  def delFlags(uid: js.Array[String], flag: String, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  def delFlags(uid: js.Array[String], flag: js.Array[String]): js.Promise[Unit] = js.native
  def delFlags(uid: js.Array[String], flag: js.Array[String], callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  /** Close the connection to the imap server. */
  def end(): Unit = js.native
  def getBoxes(): js.Promise[MailBoxes] = js.native
  /** Returns the full list of mailboxes (folders). Upon success, either the provided callback will be called with signature (err, boxes), or the returned promise will be resolved with boxes. Boxes is the exact object returned from the node-imap getBoxes() result. */
  def getBoxes(callback: js.Function2[/* err */ Error, /* boxes */ MailBoxes, Unit]): Unit = js.native
  def getPartData(message: Message, part: js.Any): js.Promise[_] = js.native
  /** Downloads part data (which is either part of the message body, or an attachment). Upon success, either the provided callback will be called with signature (err, data), or the returned promise will be resolved with data. The data will be automatically decoded based on its encoding. If the encoding of the part is not supported, an error will occur. */
  def getPartData(message: Message, part: js.Any, callback: js.Function2[/* err */ Error, /* data */ js.Any, Unit]): Unit = js.native
  def moveMessage(source: String, boxName: String): js.Promise[Unit] = js.native
  /** Moves the specified message(s) in the currently open mailbox to another mailbox. source corresponds to a node-imap MessageSource which specifies the messages to be moved. When completed, either calls the provided callback with signature (err), or resolves the returned promise. */
  def moveMessage(source: String, boxName: String, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  def moveMessage(source: js.Array[String], boxName: String): js.Promise[Unit] = js.native
  def moveMessage(source: js.Array[String], boxName: String, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  def openBox(boxName: String): js.Promise[String] = js.native
  /** Open a mailbox, calling the provided callback with signature (err, boxName), or resolves the returned promise with boxName. */
  def openBox(boxName: String, callback: js.Function2[/* err */ Error, /* boxName */ String, Unit]): Unit = js.native
  def search(searchCriteria: js.Array[_], fetchOptions: FetchOptions): js.Promise[js.Array[Message]] = js.native
  /** Search for and retrieve mail in the currently open mailbox. */
  def search(
    searchCriteria: js.Array[_],
    fetchOptions: FetchOptions,
    callback: js.Function2[/* err */ Error, /* messages */ js.Array[Message], Unit]
  ): Unit = js.native
}

