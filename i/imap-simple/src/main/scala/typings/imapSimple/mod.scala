package typings.imapSimple

import typings.imap.mod.AppendOptions
import typings.imap.mod.Config
import typings.imap.mod.FetchOptions
import typings.imap.mod.ImapMessageAttributes
import typings.imap.mod.ImapMessageBodyInfo
import typings.imap.mod.MailBoxes
import typings.node.eventsMod.EventEmitter
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("imap-simple", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("imap-simple", "ImapSimple")
  @js.native
  open class ImapSimple protected () extends EventEmitter {
    def this(imap: typings.imap.mod.^) = this()
    
    def addBox(boxName: String): js.Promise[String] = js.native
    /** Create a mailbox, calling the provided callback with signature (err, boxName), or resolves the returned promise with boxName. */
    def addBox(boxName: String, callback: js.Function2[/* err */ js.Error, /* boxName */ String, Unit]): Unit = js.native
    
    def addFlags(source: js.Array[Double], flag: String): js.Promise[Unit] = js.native
    def addFlags(source: js.Array[Double], flag: String, callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
    def addFlags(source: js.Array[Double], flag: js.Array[String]): js.Promise[Unit] = js.native
    def addFlags(source: js.Array[Double], flag: js.Array[String], callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
    def addFlags(source: Double, flag: String): js.Promise[Unit] = js.native
    /** Adds the provided flag(s) to the specified message(s). uid is the uid of the message you want to add the flag to or an array of uids. flag is either a string or array of strings indicating the flags to add. */
    def addFlags(source: Double, flag: String, callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
    def addFlags(source: Double, flag: js.Array[String]): js.Promise[Unit] = js.native
    def addFlags(source: Double, flag: js.Array[String], callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
    
    def addMessageLabel(source: String, label: String): js.Promise[Unit] = js.native
    /** Adds the provided label(s) to the specified message(s). source corresponds to a node-imap MessageSource which specifies the messages to be moved. label is either a string or array of strings indicating the labels to add. When completed, either calls the provided callback with signature (err), or resolves the returned promise. */
    def addMessageLabel(source: String, label: String, callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
    def addMessageLabel(source: String, label: js.Array[String]): js.Promise[Unit] = js.native
    def addMessageLabel(source: String, label: js.Array[String], callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
    def addMessageLabel(source: js.Array[String], label: String): js.Promise[Unit] = js.native
    def addMessageLabel(source: js.Array[String], label: String, callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
    def addMessageLabel(source: js.Array[String], label: js.Array[String]): js.Promise[Unit] = js.native
    def addMessageLabel(
      source: js.Array[String],
      label: js.Array[String],
      callback: js.Function1[/* err */ js.Error, Unit]
    ): Unit = js.native
    
    def append(message: Any, options: AppendOptions): js.Promise[Unit] = js.native
    /** Appends the argument message to the currently open mailbox or another mailbox. Message is a RFC-822 compatible MIME message. Valid options are mailbox, flags and date. When completed, either calls the provided callback with signature (err), or resolves the returned promise. */
    def append(message: Any, options: AppendOptions, callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
    
    def closeBox(autoExpunge: Boolean): js.Promise[Unit] = js.native
    /** Close a mailbox, calling the provided callback with signature (err), or resolves the returned promise. If autoExpunge is true, any messages marked as Deleted in the currently open mailbox will be removed. */
    def closeBox(autoExpunge: Boolean, callBack: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
    
    def delBox(boxName: String): js.Promise[String] = js.native
    /** Delete a mailbox, calling the provided callback with signature (err, boxName), or resolves the returned promise with boxName. */
    def delBox(boxName: String, callback: js.Function2[/* err */ js.Error, /* boxName */ String, Unit]): Unit = js.native
    
    def delFlags(uid: js.Array[Double], flag: String): js.Promise[Unit] = js.native
    def delFlags(uid: js.Array[Double], flag: String, callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
    def delFlags(uid: js.Array[Double], flag: js.Array[String]): js.Promise[Unit] = js.native
    def delFlags(uid: js.Array[Double], flag: js.Array[String], callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
    def delFlags(uid: Double, flag: String): js.Promise[Unit] = js.native
    /** Removes the provided flag(s) from the specified message(s). uid is the uid of the message you want to remove the flag from or an array of uids. flag is either a string or array of strings indicating the flags to remove. */
    def delFlags(uid: Double, flag: String, callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
    def delFlags(uid: Double, flag: js.Array[String]): js.Promise[Unit] = js.native
    def delFlags(uid: Double, flag: js.Array[String], callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
    
    def deleteMessage(uid: js.Array[Double]): js.Promise[Unit] = js.native
    def deleteMessage(uid: js.Array[Double], callBack: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
    def deleteMessage(uid: Double): js.Promise[Unit] = js.native
    /** Deletes the specified message(s). uid is the uid of the message you want to add the flag to or an array of uids. */
    def deleteMessage(uid: Double, callBack: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
    
    /** Close the connection to the imap server. */
    def end(): Unit = js.native
    
    def getBoxes(): js.Promise[MailBoxes] = js.native
    /** Returns the full list of mailboxes (folders). Upon success, either the provided callback will be called with signature (err, boxes), or the returned promise will be resolved with boxes. Boxes is the exact object returned from the node-imap getBoxes() result. */
    def getBoxes(callback: js.Function2[/* err */ js.Error, /* boxes */ MailBoxes, Unit]): Unit = js.native
    
    def getPartData(message: Message, part: Any): js.Promise[Any] = js.native
    /** Downloads part data (which is either part of the message body, or an attachment). Upon success, either the provided callback will be called with signature (err, data), or the returned promise will be resolved with data. The data will be automatically decoded based on its encoding. If the encoding of the part is not supported, an error will occur. */
    def getPartData(message: Message, part: Any, callback: js.Function2[/* err */ js.Error, /* data */ Any, Unit]): Unit = js.native
    
    def moveMessage(source: String, boxName: String): js.Promise[Unit] = js.native
    /** Moves the specified message(s) in the currently open mailbox to another mailbox. source corresponds to a node-imap MessageSource which specifies the messages to be moved. When completed, either calls the provided callback with signature (err), or resolves the returned promise. */
    def moveMessage(source: String, boxName: String, callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
    def moveMessage(source: js.Array[String], boxName: String): js.Promise[Unit] = js.native
    def moveMessage(source: js.Array[String], boxName: String, callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
    
    def openBox(boxName: String): js.Promise[String] = js.native
    /** Open a mailbox, calling the provided callback with signature (err, boxName), or resolves the returned promise with boxName. */
    def openBox(boxName: String, callback: js.Function2[/* err */ js.Error, /* boxName */ String, Unit]): Unit = js.native
    
    def search(searchCriteria: js.Array[Any], fetchOptions: FetchOptions): js.Promise[js.Array[Message]] = js.native
    /** Search for and retrieve mail in the currently open mailbox. */
    def search(
      searchCriteria: js.Array[Any],
      fetchOptions: FetchOptions,
      callback: js.Function2[/* err */ js.Error, /* messages */ js.Array[Message], Unit]
    ): Unit = js.native
  }
  
  inline def connect(options: ImapSimpleOptions): js.Promise[ImapSimple] = ^.asInstanceOf[js.Dynamic].applyDynamic("connect")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ImapSimple]]
  inline def connect(
    options: ImapSimpleOptions,
    callback: js.Function2[/* err */ js.Error, /* connection */ ImapSimple, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  object errors {
    
    @JSImport("imap-simple", "errors.ConnectionTimeoutError")
    @js.native
    open class ConnectionTimeoutError protected ()
      extends StObject
         with Error {
      def this(timeout: Double) = this()
      
      /* standard es5 */
      /* CompleteClass */
      var message: String = js.native
      
      /* standard es5 */
      /* CompleteClass */
      var name: String = js.native
      
      var timeout: Double = js.native
    }
  }
  
  inline def getParts(struct: js.Array[Any]): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("getParts")(struct.asInstanceOf[js.Any]).asInstanceOf[js.Array[Any]]
  
  trait ImapSimpleOptions extends StObject {
    
    /** Time in milliseconds to wait before giving up on a connection attempt. (Deprecated: please use options.imap.authTimeout instead) */
    var connectTimeout: js.UndefOr[Double] = js.undefined
    
    /** Options to pass to node-imap constructor. */
    var imap: Config
    
    /** Server event emitted when a message was expunged externally. seqno is the sequence number (instead of the unique UID) of the message that was expunged. If you are caching sequence numbers, all sequence numbers higher than this value MUST be decremented by 1 in order to stay synchronized with the server and to keep correct continuity. */
    var onexpunge: js.UndefOr[js.Function1[/* seqno */ Double, Unit]] = js.undefined
    
    /** Server event emitted when new mail arrives in the currently open mailbox. */
    var onmail: js.UndefOr[js.Function1[/* numNewMail */ Double, Unit]] = js.undefined
    
    /** Server event emitted when message metadata (e.g. flags) changes externally. */
    var onupdate: js.UndefOr[js.Function2[/* seqno */ Double, /* info */ Any, Unit]] = js.undefined
  }
  object ImapSimpleOptions {
    
    inline def apply(imap: Config): ImapSimpleOptions = {
      val __obj = js.Dynamic.literal(imap = imap.asInstanceOf[js.Any])
      __obj.asInstanceOf[ImapSimpleOptions]
    }
    
    extension [Self <: ImapSimpleOptions](x: Self) {
      
      inline def setConnectTimeout(value: Double): Self = StObject.set(x, "connectTimeout", value.asInstanceOf[js.Any])
      
      inline def setConnectTimeoutUndefined: Self = StObject.set(x, "connectTimeout", js.undefined)
      
      inline def setImap(value: Config): Self = StObject.set(x, "imap", value.asInstanceOf[js.Any])
      
      inline def setOnexpunge(value: /* seqno */ Double => Unit): Self = StObject.set(x, "onexpunge", js.Any.fromFunction1(value))
      
      inline def setOnexpungeUndefined: Self = StObject.set(x, "onexpunge", js.undefined)
      
      inline def setOnmail(value: /* numNewMail */ Double => Unit): Self = StObject.set(x, "onmail", js.Any.fromFunction1(value))
      
      inline def setOnmailUndefined: Self = StObject.set(x, "onmail", js.undefined)
      
      inline def setOnupdate(value: (/* seqno */ Double, /* info */ Any) => Unit): Self = StObject.set(x, "onupdate", js.Any.fromFunction2(value))
      
      inline def setOnupdateUndefined: Self = StObject.set(x, "onupdate", js.undefined)
    }
  }
  
  trait Message extends StObject {
    
    var attributes: ImapMessageAttributes
    
    var parts: js.Array[MessageBodyPart]
    
    var seqno: Double
  }
  object Message {
    
    inline def apply(attributes: ImapMessageAttributes, parts: js.Array[MessageBodyPart], seqno: Double): Message = {
      val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], parts = parts.asInstanceOf[js.Any], seqno = seqno.asInstanceOf[js.Any])
      __obj.asInstanceOf[Message]
    }
    
    extension [Self <: Message](x: Self) {
      
      inline def setAttributes(value: ImapMessageAttributes): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      inline def setParts(value: js.Array[MessageBodyPart]): Self = StObject.set(x, "parts", value.asInstanceOf[js.Any])
      
      inline def setPartsVarargs(value: MessageBodyPart*): Self = StObject.set(x, "parts", js.Array(value*))
      
      inline def setSeqno(value: Double): Self = StObject.set(x, "seqno", value.asInstanceOf[js.Any])
    }
  }
  
  trait MessageBodyPart
    extends StObject
       with ImapMessageBodyInfo {
    
    /** string type where which=='TEXT', complex Object where which=='HEADER' */
    var body: Any
  }
  object MessageBodyPart {
    
    inline def apply(body: Any, size: Double, which: String): MessageBodyPart = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], which = which.asInstanceOf[js.Any])
      __obj.asInstanceOf[MessageBodyPart]
    }
    
    extension [Self <: MessageBodyPart](x: Self) {
      
      inline def setBody(value: Any): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    }
  }
}
