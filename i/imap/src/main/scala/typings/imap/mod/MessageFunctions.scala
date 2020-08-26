package typings.imap.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MessageFunctions extends js.Object {
  /** Adds flag(s) to message(s). */
  def addFlags(source: js.Any, flags: js.Any, callback: js.Function1[/* error */ Error, Unit]): Unit = js.native
  /** Adds keyword(s) to message(s). keywords is either a single keyword or an array of keywords. */
  def addKeywords(source: js.Any, keywords: js.Any, callback: js.Function1[/* error */ Error, Unit]): Unit = js.native
  /** Copies message(s) in the currently open mailbox to another mailbox. */
  def copy(source: js.Any, mailboxName: String, callback: js.Function1[/* error */ Error, Unit]): Unit = js.native
  /** Removes flag(s) from message(s). */
  def delFlags(source: js.Any, flags: js.Any, callback: js.Function1[/* error */ Error, Unit]): Unit = js.native
  /** Removes keyword(s) from message(s). keywords is either a single keyword or an array of keywords. */
  def delKeywords(source: js.Any, keywords: js.Any, callback: js.Function1[/* error */ Error, Unit]): Unit = js.native
  /** Fetches message(s) in the currently open mailbox; source can be a single message identifier, a message identifier range (e.g. '2504:2507' or '*' or '2504:*'), an array of message identifiers, or an array of message identifier ranges. */
  def fetch(source: js.Any, options: FetchOptions): ImapFetch = js.native
  /** Moves message(s) in the currently open mailbox to another mailbox. Note: The message(s) in the destination mailbox will have a new message UID. */
  def move(source: js.Any, mailboxName: String, callback: js.Function1[/* error */ Error, Unit]): Unit = js.native
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
  def search(
    criteria: js.Array[_],
    callback: js.Function2[/* error */ Error, /* uids */ js.Array[Double], Unit]
  ): Unit = js.native
  /** Checks if the server supports the specified capability. */
  def serverSupports(capability: String): Boolean = js.native
  /** Sets the flag(s) for message(s). */
  def setFlags(source: js.Any, flags: js.Any, callback: js.Function1[/* error */ Error, Unit]): Unit = js.native
  /** Sets keyword(s) for message(s). keywords is either a single keyword or an array of keywords. */
  def setKeywords(source: js.Any, keywords: js.Any, callback: js.Function1[/* error */ Error, Unit]): Unit = js.native
}

object MessageFunctions {
  @scala.inline
  def apply(
    addFlags: (js.Any, js.Any, js.Function1[/* error */ Error, Unit]) => Unit,
    addKeywords: (js.Any, js.Any, js.Function1[/* error */ Error, Unit]) => Unit,
    copy: (js.Any, String, js.Function1[/* error */ Error, Unit]) => Unit,
    delFlags: (js.Any, js.Any, js.Function1[/* error */ Error, Unit]) => Unit,
    delKeywords: (js.Any, js.Any, js.Function1[/* error */ Error, Unit]) => Unit,
    fetch: (js.Any, FetchOptions) => ImapFetch,
    move: (js.Any, String, js.Function1[/* error */ Error, Unit]) => Unit,
    search: (js.Array[_], js.Function2[/* error */ Error, /* uids */ js.Array[Double], Unit]) => Unit,
    serverSupports: String => Boolean,
    setFlags: (js.Any, js.Any, js.Function1[/* error */ Error, Unit]) => Unit,
    setKeywords: (js.Any, js.Any, js.Function1[/* error */ Error, Unit]) => Unit
  ): MessageFunctions = {
    val __obj = js.Dynamic.literal(addFlags = js.Any.fromFunction3(addFlags), addKeywords = js.Any.fromFunction3(addKeywords), copy = js.Any.fromFunction3(copy), delFlags = js.Any.fromFunction3(delFlags), delKeywords = js.Any.fromFunction3(delKeywords), fetch = js.Any.fromFunction2(fetch), move = js.Any.fromFunction3(move), search = js.Any.fromFunction2(search), serverSupports = js.Any.fromFunction1(serverSupports), setFlags = js.Any.fromFunction3(setFlags), setKeywords = js.Any.fromFunction3(setKeywords))
    __obj.asInstanceOf[MessageFunctions]
  }
  @scala.inline
  implicit class MessageFunctionsOps[Self <: MessageFunctions] (val x: Self) extends AnyVal {
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
    def setAddFlags(value: (js.Any, js.Any, js.Function1[/* error */ Error, Unit]) => Unit): Self = this.set("addFlags", js.Any.fromFunction3(value))
    @scala.inline
    def setAddKeywords(value: (js.Any, js.Any, js.Function1[/* error */ Error, Unit]) => Unit): Self = this.set("addKeywords", js.Any.fromFunction3(value))
    @scala.inline
    def setCopy(value: (js.Any, String, js.Function1[/* error */ Error, Unit]) => Unit): Self = this.set("copy", js.Any.fromFunction3(value))
    @scala.inline
    def setDelFlags(value: (js.Any, js.Any, js.Function1[/* error */ Error, Unit]) => Unit): Self = this.set("delFlags", js.Any.fromFunction3(value))
    @scala.inline
    def setDelKeywords(value: (js.Any, js.Any, js.Function1[/* error */ Error, Unit]) => Unit): Self = this.set("delKeywords", js.Any.fromFunction3(value))
    @scala.inline
    def setFetch(value: (js.Any, FetchOptions) => ImapFetch): Self = this.set("fetch", js.Any.fromFunction2(value))
    @scala.inline
    def setMove(value: (js.Any, String, js.Function1[/* error */ Error, Unit]) => Unit): Self = this.set("move", js.Any.fromFunction3(value))
    @scala.inline
    def setSearch(value: (js.Array[_], js.Function2[/* error */ Error, /* uids */ js.Array[Double], Unit]) => Unit): Self = this.set("search", js.Any.fromFunction2(value))
    @scala.inline
    def setServerSupports(value: String => Boolean): Self = this.set("serverSupports", js.Any.fromFunction1(value))
    @scala.inline
    def setSetFlags(value: (js.Any, js.Any, js.Function1[/* error */ Error, Unit]) => Unit): Self = this.set("setFlags", js.Any.fromFunction3(value))
    @scala.inline
    def setSetKeywords(value: (js.Any, js.Any, js.Function1[/* error */ Error, Unit]) => Unit): Self = this.set("setKeywords", js.Any.fromFunction3(value))
  }
  
}

