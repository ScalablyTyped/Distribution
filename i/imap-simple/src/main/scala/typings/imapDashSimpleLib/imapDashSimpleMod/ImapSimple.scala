package typings
package imapDashSimpleLib.imapDashSimpleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("imap-simple", "ImapSimple")
@js.native
class ImapSimple protected ()
  extends nodeLib.NodeJSNs.EventEmitter {
  def this(imap: imapLib.imapMod.namespaced) = this()
  def addFlags(source: java.lang.String, flag: java.lang.String): stdLib.Promise[scala.Unit] = js.native
  /** Adds the provided flag(s) to the specified message(s). uid is the uid of the message you want to add the flag to or an array of uids. flag is either a string or array of strings indicating the flags to add. */
  def addFlags(
    source: java.lang.String,
    flag: java.lang.String,
    callback: js.Function1[/* err */ nodeLib.Error, scala.Unit]
  ): scala.Unit = js.native
  def addFlags(source: java.lang.String, flag: js.Array[java.lang.String]): stdLib.Promise[scala.Unit] = js.native
  /** Adds the provided flag(s) to the specified message(s). uid is the uid of the message you want to add the flag to or an array of uids. flag is either a string or array of strings indicating the flags to add. */
  def addFlags(
    source: java.lang.String,
    flag: js.Array[java.lang.String],
    callback: js.Function1[/* err */ nodeLib.Error, scala.Unit]
  ): scala.Unit = js.native
  def addFlags(source: js.Array[java.lang.String], flag: java.lang.String): stdLib.Promise[scala.Unit] = js.native
  /** Adds the provided flag(s) to the specified message(s). uid is the uid of the message you want to add the flag to or an array of uids. flag is either a string or array of strings indicating the flags to add. */
  def addFlags(
    source: js.Array[java.lang.String],
    flag: java.lang.String,
    callback: js.Function1[/* err */ nodeLib.Error, scala.Unit]
  ): scala.Unit = js.native
  def addFlags(source: js.Array[java.lang.String], flag: js.Array[java.lang.String]): stdLib.Promise[scala.Unit] = js.native
  /** Adds the provided flag(s) to the specified message(s). uid is the uid of the message you want to add the flag to or an array of uids. flag is either a string or array of strings indicating the flags to add. */
  def addFlags(
    source: js.Array[java.lang.String],
    flag: js.Array[java.lang.String],
    callback: js.Function1[/* err */ nodeLib.Error, scala.Unit]
  ): scala.Unit = js.native
  def addMessageLabel(source: java.lang.String, label: java.lang.String): stdLib.Promise[scala.Unit] = js.native
  /** Adds the provided label(s) to the specified message(s). source corresponds to a node-imap MessageSource which specifies the messages to be moved. label is either a string or array of strings indicating the labels to add. When completed, either calls the provided callback with signature (err), or resolves the returned promise. */
  def addMessageLabel(
    source: java.lang.String,
    label: java.lang.String,
    callback: js.Function1[/* err */ nodeLib.Error, scala.Unit]
  ): scala.Unit = js.native
  def addMessageLabel(source: java.lang.String, label: js.Array[java.lang.String]): stdLib.Promise[scala.Unit] = js.native
  /** Adds the provided label(s) to the specified message(s). source corresponds to a node-imap MessageSource which specifies the messages to be moved. label is either a string or array of strings indicating the labels to add. When completed, either calls the provided callback with signature (err), or resolves the returned promise. */
  def addMessageLabel(
    source: java.lang.String,
    label: js.Array[java.lang.String],
    callback: js.Function1[/* err */ nodeLib.Error, scala.Unit]
  ): scala.Unit = js.native
  def addMessageLabel(source: js.Array[java.lang.String], label: java.lang.String): stdLib.Promise[scala.Unit] = js.native
  /** Adds the provided label(s) to the specified message(s). source corresponds to a node-imap MessageSource which specifies the messages to be moved. label is either a string or array of strings indicating the labels to add. When completed, either calls the provided callback with signature (err), or resolves the returned promise. */
  def addMessageLabel(
    source: js.Array[java.lang.String],
    label: java.lang.String,
    callback: js.Function1[/* err */ nodeLib.Error, scala.Unit]
  ): scala.Unit = js.native
  def addMessageLabel(source: js.Array[java.lang.String], label: js.Array[java.lang.String]): stdLib.Promise[scala.Unit] = js.native
  /** Adds the provided label(s) to the specified message(s). source corresponds to a node-imap MessageSource which specifies the messages to be moved. label is either a string or array of strings indicating the labels to add. When completed, either calls the provided callback with signature (err), or resolves the returned promise. */
  def addMessageLabel(
    source: js.Array[java.lang.String],
    label: js.Array[java.lang.String],
    callback: js.Function1[/* err */ nodeLib.Error, scala.Unit]
  ): scala.Unit = js.native
  def delFlags(source: java.lang.String, flag: java.lang.String): stdLib.Promise[scala.Unit] = js.native
  /** Removes the provided flag(s) from the specified message(s). uid is the uid of the message you want to remove the flag from or an array of uids. flag is either a string or array of strings indicating the flags to remove. */
  def delFlags(
    source: java.lang.String,
    flag: java.lang.String,
    callback: js.Function1[/* err */ nodeLib.Error, scala.Unit]
  ): scala.Unit = js.native
  def delFlags(source: java.lang.String, flag: js.Array[java.lang.String]): stdLib.Promise[scala.Unit] = js.native
  /** Removes the provided flag(s) from the specified message(s). uid is the uid of the message you want to remove the flag from or an array of uids. flag is either a string or array of strings indicating the flags to remove. */
  def delFlags(
    source: java.lang.String,
    flag: js.Array[java.lang.String],
    callback: js.Function1[/* err */ nodeLib.Error, scala.Unit]
  ): scala.Unit = js.native
  def delFlags(source: js.Array[java.lang.String], flag: java.lang.String): stdLib.Promise[scala.Unit] = js.native
  /** Removes the provided flag(s) from the specified message(s). uid is the uid of the message you want to remove the flag from or an array of uids. flag is either a string or array of strings indicating the flags to remove. */
  def delFlags(
    source: js.Array[java.lang.String],
    flag: java.lang.String,
    callback: js.Function1[/* err */ nodeLib.Error, scala.Unit]
  ): scala.Unit = js.native
  def delFlags(source: js.Array[java.lang.String], flag: js.Array[java.lang.String]): stdLib.Promise[scala.Unit] = js.native
  /** Removes the provided flag(s) from the specified message(s). uid is the uid of the message you want to remove the flag from or an array of uids. flag is either a string or array of strings indicating the flags to remove. */
  def delFlags(
    source: js.Array[java.lang.String],
    flag: js.Array[java.lang.String],
    callback: js.Function1[/* err */ nodeLib.Error, scala.Unit]
  ): scala.Unit = js.native
  /** Close the connection to the imap server. */
  def end(): scala.Unit = js.native
  def getPartData(message: Message, part: js.Any): stdLib.Promise[_] = js.native
  /** Downloads part data (which is either part of the message body, or an attachment). Upon success, either the provided callback will be called with signature (err, data), or the returned promise will be resolved with data. The data will be automatically decoded based on its encoding. If the encoding of the part is not supported, an error will occur. */
  def getPartData(
    message: Message,
    part: js.Any,
    callback: js.Function2[/* err */ nodeLib.Error, /* data */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def moveMessage(source: java.lang.String, boxName: java.lang.String): stdLib.Promise[scala.Unit] = js.native
  /** Moves the specified message(s) in the currently open mailbox to another mailbox. source corresponds to a node-imap MessageSource which specifies the messages to be moved. When completed, either calls the provided callback with signature (err), or resolves the returned promise. */
  def moveMessage(
    source: java.lang.String,
    boxName: java.lang.String,
    callback: js.Function1[/* err */ nodeLib.Error, scala.Unit]
  ): scala.Unit = js.native
  def moveMessage(source: js.Array[java.lang.String], boxName: java.lang.String): stdLib.Promise[scala.Unit] = js.native
  /** Moves the specified message(s) in the currently open mailbox to another mailbox. source corresponds to a node-imap MessageSource which specifies the messages to be moved. When completed, either calls the provided callback with signature (err), or resolves the returned promise. */
  def moveMessage(
    source: js.Array[java.lang.String],
    boxName: java.lang.String,
    callback: js.Function1[/* err */ nodeLib.Error, scala.Unit]
  ): scala.Unit = js.native
  def openBox(boxName: java.lang.String): stdLib.Promise[java.lang.String] = js.native
  /** Open a mailbox, calling the provided callback with signature (err, boxName), or resolves the returned promise with boxName. */
  def openBox(
    boxName: java.lang.String,
    callback: js.Function2[/* err */ nodeLib.Error, /* boxName */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def search(searchCriteria: js.Array[_], fetchOptions: imapLib.imapMod.ConnectionNs.FetchOptions): stdLib.Promise[js.Array[Message]] = js.native
  /** Search for and retrieve mail in the previously opened mailbox. */
  def search(
    searchCriteria: js.Array[_],
    fetchOptions: imapLib.imapMod.ConnectionNs.FetchOptions,
    callback: js.Function2[/* err */ nodeLib.Error, /* messages */ js.Array[Message], scala.Unit]
  ): scala.Unit = js.native
}

