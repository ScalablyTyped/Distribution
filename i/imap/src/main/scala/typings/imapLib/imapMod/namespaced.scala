package typings
package imapLib.imapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("imap", JSImport.Namespace)
@js.native
class namespaced protected () extends Connection {
  /** @constructor */
  def this(config: imapLib.imapMod.ConnectionNs.Config) = this()
  /** Adds flag(s) to message(s). */
  /* CompleteClass */
  override def addFlags(source: js.Any, flags: js.Any, callback: js.Function1[/* error */ nodeLib.Error, scala.Unit]): scala.Unit = js.native
  /** Adds keyword(s) to message(s). keywords is either a single keyword or an array of keywords. */
  /* CompleteClass */
  override def addKeywords(source: js.Any, keywords: js.Any, callback: js.Function1[/* error */ nodeLib.Error, scala.Unit]): scala.Unit = js.native
  /** Copies message(s) in the currently open mailbox to another mailbox. */
  /* CompleteClass */
  override def copy(
    source: js.Any,
    mailboxName: java.lang.String,
    callback: js.Function1[/* error */ nodeLib.Error, scala.Unit]
  ): scala.Unit = js.native
  /** Removes flag(s) from message(s). */
  /* CompleteClass */
  override def delFlags(source: js.Any, flags: js.Any, callback: js.Function1[/* error */ nodeLib.Error, scala.Unit]): scala.Unit = js.native
  /** Removes keyword(s) from message(s). keywords is either a single keyword or an array of keywords. */
  /* CompleteClass */
  override def delKeywords(source: js.Any, keywords: js.Any, callback: js.Function1[/* error */ nodeLib.Error, scala.Unit]): scala.Unit = js.native
  /** Fetches message(s) in the currently open mailbox; source can be a single message identifier, a message identifier range (e.g. '2504:2507' or '*' or '2504:*'), an array of message identifiers, or an array of message identifier ranges. */
  /* CompleteClass */
  override def fetch(source: js.Any, options: imapLib.imapMod.ConnectionNs.FetchOptions): imapLib.imapMod.ConnectionNs.ImapFetch = js.native
  /** Moves message(s) in the currently open mailbox to another mailbox. Note: The message(s) in the destination mailbox will have a new message UID. */
  /* CompleteClass */
  override def move(
    source: js.Any,
    mailboxName: java.lang.String,
    callback: js.Function1[/* error */ nodeLib.Error, scala.Unit]
  ): scala.Unit = js.native
  /** Searches the currently open mailbox for messages using given criteria. criteria is a list describing what you want to find. For criteria types that require arguments, use an array instead of just the string criteria type name (e.g. ['FROM', 'foo@bar.com']). Prefix criteria types with an "!" to negate.
    The following message flags are valid types that do not have arguments:
    ALL:            void;    // All messages.
    ANSWERED:       void;    // Messages with the Answered flag set.
    DELETED:        void;    // Messages with the Deleted flag set.
    DRAFT:          void;    // Messages with the Draft flag set.
    FLAGGED:        void;    // Messages with the Flagged flag set.
    NEW:            void;    // Messages that have the Recent flag set but not the Seen flag.
    SEEN:           void;    // Messages that have the Seen flag set.
    RECENT:         void;    // Messages that have the Recent flag set.
    OLD:            void;    // Messages that do not have the Recent flag set. This is functionally equivalent to "!RECENT" (as opposed to "!NEW").
    UNANSWERED:     void;    // Messages that do not have the Answered flag set.
    UNDELETED:      void;    // Messages that do not have the Deleted flag set.
    UNDRAFT:        void;    // Messages that do not have the Draft flag set.
    UNFLAGGED:      void;    // Messages that do not have the Flagged flag set.
    UNSEEN:         void;    // Messages that do not have the Seen flag set.
    The following are valid types that require string value(s):
    BCC:            any;    // Messages that contain the specified string in the BCC field.
    CC:             any;    // Messages that contain the specified string in the CC field.
    FROM:           any;    // Messages that contain the specified string in the FROM field.
    SUBJECT:        any;    // Messages that contain the specified string in the SUBJECT field.
    TO:             any;    // Messages that contain the specified string in the TO field.
    BODY:           any;    // Messages that contain the specified string in the message body.
    TEXT:           any;    // Messages that contain the specified string in the header OR the message body.
    KEYWORD:        any;    // Messages with the specified keyword set.
    HEADER:         any;    // Requires two string values, with the first being the header name and the second being the value to search for. If this second string is empty, all messages that contain the given header name will be returned.
    The following are valid types that require a string parseable by JavaScripts Date object OR a Date instance:
    BEFORE:         any;    // Messages whose internal date (disregarding time and timezone) is earlier than the specified date.
    ON:             any;    // Messages whose internal date (disregarding time and timezone) is within the specified date.
    SINCE:          any;    // Messages whose internal date (disregarding time and timezone) is within or later than the specified date.
    SENTBEFORE:     any;    // Messages whose Date header (disregarding time and timezone) is earlier than the specified date.
    SENTON:         any;    // Messages whose Date header (disregarding time and timezone) is within the specified date.
    SENTSINCE:      any;    // Messages whose Date header (disregarding time and timezone) is within or later than the specified date.
    The following are valid types that require one Integer value:
    LARGER:         number;    // Messages with a size larger than the specified number of bytes.
    SMALLER:        number;    // Messages with a size smaller than the specified number of bytes.
    The following are valid criterion that require one or more Integer values:
    UID:            any;    // Messages with UIDs corresponding to the specified UID set. Ranges are permitted (e.g. '2504:2507' or '*' or '2504:*').
    */
  /* CompleteClass */
  override def search(
    criteria: js.Array[_],
    callback: js.Function2[/* error */ nodeLib.Error, /* uids */ js.Array[scala.Double], scala.Unit]
  ): scala.Unit = js.native
  /** Checks if the server supports the specified capability. */
  /* CompleteClass */
  override def serverSupports(capability: java.lang.String): scala.Boolean = js.native
  /** Sets the flag(s) for message(s). */
  /* CompleteClass */
  override def setFlags(source: js.Any, flags: js.Any, callback: js.Function1[/* error */ nodeLib.Error, scala.Unit]): scala.Unit = js.native
  /** Sets keyword(s) for message(s). keywords is either a single keyword or an array of keywords. */
  /* CompleteClass */
  override def setKeywords(source: js.Any, keywords: js.Any, callback: js.Function1[/* error */ nodeLib.Error, scala.Unit]): scala.Unit = js.native
}

@JSImport("imap", JSImport.Namespace)
@js.native
object namespaced extends js.Object {
  /** Parses a raw header and returns an object keyed on header fields and the values are Arrays of header field values. Set disableAutoDecode to true to disable automatic decoding of MIME encoded-words that may exist in header field values. */
  def parseHeader(rawHeader: java.lang.String): org.scalablytyped.runtime.StringDictionary[js.Array[java.lang.String]] = js.native
  def parseHeader(rawHeader: java.lang.String, disableAutoDecode: scala.Boolean): org.scalablytyped.runtime.StringDictionary[js.Array[java.lang.String]] = js.native
}

