package typings.mailNotifier

import org.scalablytyped.runtime.StringDictionary
import typings.mailNotifier.mailNotifierStrings.connected
import typings.mailNotifier.mailNotifierStrings.end
import typings.mailNotifier.mailNotifierStrings.error
import typings.mailNotifier.mailNotifierStrings.high
import typings.mailNotifier.mailNotifierStrings.low
import typings.mailNotifier.mailNotifierStrings.mail
import typings.mailNotifier.mailNotifierStrings.normal
import typings.node.bufferMod.global.Buffer
import typings.node.eventsMod.EventEmitter
import typings.std.Parameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Send mail event for each new email in IMAP inbox.
    *
    * Creates a new Notifier.
    *
    * @param config Options needed to establish an IMAP connection.
    * @param customDbg If set, the function will be called with args that contain some mail-notifier debug info.
    *
    * @example
    * const notifier = require('mail-notifier');
    *
    * const config: notifier.Config = {
    *   user: "yourimapuser",
    *   password: "yourimappassword",
    *   host: "imap.host.com",
    *   port: 993, // imap port
    *   tls: true,// use secure connection
    *   tlsOptions: { rejectUnauthorized: false }
    * };
    *
    * notifier(config)
    *   .on('mail', mail => console.log(mail))
    *   .start();
    *
    * // Keep it running forever:
    * const n = notifier(config)
    *   .on('end', () => n.start()) // session closed
    *   .on('mail', mail => console.log(mail.from[0].address, mail.subject))
    *   .start();
    */
  inline def apply(config: Config): Notifier = ^.asInstanceOf[js.Dynamic].apply(config.asInstanceOf[js.Any]).asInstanceOf[Notifier]
  inline def apply(config: Config, customDbg: DebugFn): Notifier = (^.asInstanceOf[js.Dynamic].apply(config.asInstanceOf[js.Any], customDbg.asInstanceOf[js.Any])).asInstanceOf[Notifier]
  
  @JSImport("mail-notifier", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Config
    extends StObject
       with typings.imap.mod.Config {
    
    /**
      * Mail box read from.
      * @default 'INBOX'
      */
    var box: js.UndefOr[String] = js.undefined
    
    /**
      * Mark mail as read.
      * @default true
      */
    var markSeen: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Search query.
      * @default ['UNSEEN']
      */
    var search: js.UndefOr[js.Array[String]] = js.undefined
  }
  object Config {
    
    inline def apply(password: String, user: String): Config = {
      val __obj = js.Dynamic.literal(password = password.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
      __obj.asInstanceOf[Config]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Config] (val x: Self) extends AnyVal {
      
      inline def setBox(value: String): Self = StObject.set(x, "box", value.asInstanceOf[js.Any])
      
      inline def setBoxUndefined: Self = StObject.set(x, "box", js.undefined)
      
      inline def setMarkSeen(value: Boolean): Self = StObject.set(x, "markSeen", value.asInstanceOf[js.Any])
      
      inline def setMarkSeenUndefined: Self = StObject.set(x, "markSeen", js.undefined)
      
      inline def setSearch(value: js.Array[String]): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
      
      inline def setSearchUndefined: Self = StObject.set(x, "search", js.undefined)
      
      inline def setSearchVarargs(value: String*): Self = StObject.set(x, "search", js.Array(value*))
    }
  }
  
  @js.native
  trait DebugFn extends StObject {
    
    def apply(args: Any*): Unit = js.native
  }
  
  trait EmailAddress extends StObject {
    
    var address: String
    
    var name: String
  }
  object EmailAddress {
    
    inline def apply(address: String, name: String): EmailAddress = {
      val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[EmailAddress]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EmailAddress] (val x: Self) extends AnyVal {
      
      inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait EmailAttachment extends StObject {
    
    var checksum: String
    
    var content: Buffer
    
    var contentDisposition: String
    
    var contentId: String
    
    var contentType: String
    
    var fileName: String
    
    var generatedFileName: String
    
    var length: Double
    
    var transferEncoding: String
  }
  object EmailAttachment {
    
    inline def apply(
      checksum: String,
      content: Buffer,
      contentDisposition: String,
      contentId: String,
      contentType: String,
      fileName: String,
      generatedFileName: String,
      length: Double,
      transferEncoding: String
    ): EmailAttachment = {
      val __obj = js.Dynamic.literal(checksum = checksum.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], contentDisposition = contentDisposition.asInstanceOf[js.Any], contentId = contentId.asInstanceOf[js.Any], contentType = contentType.asInstanceOf[js.Any], fileName = fileName.asInstanceOf[js.Any], generatedFileName = generatedFileName.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], transferEncoding = transferEncoding.asInstanceOf[js.Any])
      __obj.asInstanceOf[EmailAttachment]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EmailAttachment] (val x: Self) extends AnyVal {
      
      inline def setChecksum(value: String): Self = StObject.set(x, "checksum", value.asInstanceOf[js.Any])
      
      inline def setContent(value: Buffer): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentDisposition(value: String): Self = StObject.set(x, "contentDisposition", value.asInstanceOf[js.Any])
      
      inline def setContentId(value: String): Self = StObject.set(x, "contentId", value.asInstanceOf[js.Any])
      
      inline def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
      
      inline def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
      
      inline def setGeneratedFileName(value: String): Self = StObject.set(x, "generatedFileName", value.asInstanceOf[js.Any])
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setTransferEncoding(value: String): Self = StObject.set(x, "transferEncoding", value.asInstanceOf[js.Any])
    }
  }
  
  trait EmailContent extends StObject {
    
    var attachments: js.UndefOr[js.Array[EmailAttachment]] = js.undefined
    
    var bcc: js.UndefOr[js.Array[EmailAddress]] = js.undefined
    
    var cc: js.UndefOr[js.Array[EmailAddress]] = js.undefined
    
    /**
      * If date could not be resolved or is not found this field is not set. Check the original date string from headers.date.
      */
    var date: js.UndefOr[js.Date] = js.undefined
    
    var flags: js.Array[String]
    
    var from: js.Array[EmailAddress]
    
    var headers: EmailHeaders
    
    /**
      * Html body.
      */
    var html: String
    
    /**
      * `In-Reply-To` message id values. Not set if no `In-Reply-To values present.
      */
    var inReplyTo: js.UndefOr[js.Array[String]] = js.undefined
    
    var messageId: js.UndefOr[String] = js.undefined
    
    /**
      * Priority of the e-mail.
      */
    var priority: js.UndefOr[normal | high | low] = js.undefined
    
    /**
      * Reference message id values. Not set if no reference values present.
      */
    var references: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * The subject line.
      */
    var subject: String
    
    /**
      * Text body.
      */
    var text: String
    
    var uid: Double
  }
  object EmailContent {
    
    inline def apply(
      flags: js.Array[String],
      from: js.Array[EmailAddress],
      headers: EmailHeaders,
      html: String,
      subject: String,
      text: String,
      uid: Double
    ): EmailContent = {
      val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any])
      __obj.asInstanceOf[EmailContent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EmailContent] (val x: Self) extends AnyVal {
      
      inline def setAttachments(value: js.Array[EmailAttachment]): Self = StObject.set(x, "attachments", value.asInstanceOf[js.Any])
      
      inline def setAttachmentsUndefined: Self = StObject.set(x, "attachments", js.undefined)
      
      inline def setAttachmentsVarargs(value: EmailAttachment*): Self = StObject.set(x, "attachments", js.Array(value*))
      
      inline def setBcc(value: js.Array[EmailAddress]): Self = StObject.set(x, "bcc", value.asInstanceOf[js.Any])
      
      inline def setBccUndefined: Self = StObject.set(x, "bcc", js.undefined)
      
      inline def setBccVarargs(value: EmailAddress*): Self = StObject.set(x, "bcc", js.Array(value*))
      
      inline def setCc(value: js.Array[EmailAddress]): Self = StObject.set(x, "cc", value.asInstanceOf[js.Any])
      
      inline def setCcUndefined: Self = StObject.set(x, "cc", js.undefined)
      
      inline def setCcVarargs(value: EmailAddress*): Self = StObject.set(x, "cc", js.Array(value*))
      
      inline def setDate(value: js.Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
      
      inline def setFlags(value: js.Array[String]): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
      
      inline def setFlagsVarargs(value: String*): Self = StObject.set(x, "flags", js.Array(value*))
      
      inline def setFrom(value: js.Array[EmailAddress]): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setFromVarargs(value: EmailAddress*): Self = StObject.set(x, "from", js.Array(value*))
      
      inline def setHeaders(value: EmailHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHtml(value: String): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
      
      inline def setInReplyTo(value: js.Array[String]): Self = StObject.set(x, "inReplyTo", value.asInstanceOf[js.Any])
      
      inline def setInReplyToUndefined: Self = StObject.set(x, "inReplyTo", js.undefined)
      
      inline def setInReplyToVarargs(value: String*): Self = StObject.set(x, "inReplyTo", js.Array(value*))
      
      inline def setMessageId(value: String): Self = StObject.set(x, "messageId", value.asInstanceOf[js.Any])
      
      inline def setMessageIdUndefined: Self = StObject.set(x, "messageId", js.undefined)
      
      inline def setPriority(value: normal | high | low): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
      
      inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
      
      inline def setReferences(value: js.Array[String]): Self = StObject.set(x, "references", value.asInstanceOf[js.Any])
      
      inline def setReferencesUndefined: Self = StObject.set(x, "references", js.undefined)
      
      inline def setReferencesVarargs(value: String*): Self = StObject.set(x, "references", js.Array(value*))
      
      inline def setSubject(value: String): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setUid(value: Double): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
    }
  }
  
  trait EmailHeaders
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    var `arc-authentication-results`: js.UndefOr[String] = js.undefined
    
    var `arc-message-signature`: js.UndefOr[String] = js.undefined
    
    var `arc-seal`: js.UndefOr[String] = js.undefined
    
    var `authentication-results`: js.UndefOr[String] = js.undefined
    
    var `content-type`: js.UndefOr[String] = js.undefined
    
    var date: js.UndefOr[String] = js.undefined
    
    var `delivered-to`: js.UndefOr[String] = js.undefined
    
    var `dkim-signature`: js.UndefOr[String] = js.undefined
    
    var from: js.UndefOr[String] = js.undefined
    
    var `message-id`: js.UndefOr[String] = js.undefined
    
    var `mime-version`: js.UndefOr[String] = js.undefined
    
    var received: js.UndefOr[js.Array[String]] = js.undefined
    
    var `received-spf`: js.UndefOr[String] = js.undefined
    
    var `return-path`: js.UndefOr[String] = js.undefined
    
    var subject: js.UndefOr[String] = js.undefined
    
    var to: js.UndefOr[String] = js.undefined
    
    var `x-gm-message-state`: js.UndefOr[String] = js.undefined
    
    var `x-google-dkim-signature`: js.UndefOr[String] = js.undefined
    
    var `x-google-smtp-source`: js.UndefOr[String] = js.undefined
    
    var `x-received`: js.UndefOr[js.Array[String]] = js.undefined
  }
  object EmailHeaders {
    
    inline def apply(): EmailHeaders = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EmailHeaders]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EmailHeaders] (val x: Self) extends AnyVal {
      
      inline def `setArc-authentication-results`(value: String): Self = StObject.set(x, "arc-authentication-results", value.asInstanceOf[js.Any])
      
      inline def `setArc-authentication-resultsUndefined`: Self = StObject.set(x, "arc-authentication-results", js.undefined)
      
      inline def `setArc-message-signature`(value: String): Self = StObject.set(x, "arc-message-signature", value.asInstanceOf[js.Any])
      
      inline def `setArc-message-signatureUndefined`: Self = StObject.set(x, "arc-message-signature", js.undefined)
      
      inline def `setArc-seal`(value: String): Self = StObject.set(x, "arc-seal", value.asInstanceOf[js.Any])
      
      inline def `setArc-sealUndefined`: Self = StObject.set(x, "arc-seal", js.undefined)
      
      inline def `setAuthentication-results`(value: String): Self = StObject.set(x, "authentication-results", value.asInstanceOf[js.Any])
      
      inline def `setAuthentication-resultsUndefined`: Self = StObject.set(x, "authentication-results", js.undefined)
      
      inline def `setContent-type`(value: String): Self = StObject.set(x, "content-type", value.asInstanceOf[js.Any])
      
      inline def `setContent-typeUndefined`: Self = StObject.set(x, "content-type", js.undefined)
      
      inline def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
      
      inline def `setDelivered-to`(value: String): Self = StObject.set(x, "delivered-to", value.asInstanceOf[js.Any])
      
      inline def `setDelivered-toUndefined`: Self = StObject.set(x, "delivered-to", js.undefined)
      
      inline def `setDkim-signature`(value: String): Self = StObject.set(x, "dkim-signature", value.asInstanceOf[js.Any])
      
      inline def `setDkim-signatureUndefined`: Self = StObject.set(x, "dkim-signature", js.undefined)
      
      inline def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
      
      inline def `setMessage-id`(value: String): Self = StObject.set(x, "message-id", value.asInstanceOf[js.Any])
      
      inline def `setMessage-idUndefined`: Self = StObject.set(x, "message-id", js.undefined)
      
      inline def `setMime-version`(value: String): Self = StObject.set(x, "mime-version", value.asInstanceOf[js.Any])
      
      inline def `setMime-versionUndefined`: Self = StObject.set(x, "mime-version", js.undefined)
      
      inline def setReceived(value: js.Array[String]): Self = StObject.set(x, "received", value.asInstanceOf[js.Any])
      
      inline def `setReceived-spf`(value: String): Self = StObject.set(x, "received-spf", value.asInstanceOf[js.Any])
      
      inline def `setReceived-spfUndefined`: Self = StObject.set(x, "received-spf", js.undefined)
      
      inline def setReceivedUndefined: Self = StObject.set(x, "received", js.undefined)
      
      inline def setReceivedVarargs(value: String*): Self = StObject.set(x, "received", js.Array(value*))
      
      inline def `setReturn-path`(value: String): Self = StObject.set(x, "return-path", value.asInstanceOf[js.Any])
      
      inline def `setReturn-pathUndefined`: Self = StObject.set(x, "return-path", js.undefined)
      
      inline def setSubject(value: String): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
      
      inline def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
      
      inline def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      inline def setToUndefined: Self = StObject.set(x, "to", js.undefined)
      
      inline def `setX-gm-message-state`(value: String): Self = StObject.set(x, "x-gm-message-state", value.asInstanceOf[js.Any])
      
      inline def `setX-gm-message-stateUndefined`: Self = StObject.set(x, "x-gm-message-state", js.undefined)
      
      inline def `setX-google-dkim-signature`(value: String): Self = StObject.set(x, "x-google-dkim-signature", value.asInstanceOf[js.Any])
      
      inline def `setX-google-dkim-signatureUndefined`: Self = StObject.set(x, "x-google-dkim-signature", js.undefined)
      
      inline def `setX-google-smtp-source`(value: String): Self = StObject.set(x, "x-google-smtp-source", value.asInstanceOf[js.Any])
      
      inline def `setX-google-smtp-sourceUndefined`: Self = StObject.set(x, "x-google-smtp-source", js.undefined)
      
      inline def `setX-received`(value: js.Array[String]): Self = StObject.set(x, "x-received", value.asInstanceOf[js.Any])
      
      inline def `setX-receivedUndefined`: Self = StObject.set(x, "x-received", js.undefined)
      
      inline def `setX-receivedVarargs`(value: String*): Self = StObject.set(x, "x-received", js.Array(value*))
    }
  }
  
  @js.native
  trait Notifier extends EventEmitter {
    
    def addListener[U /* <: /* keyof mail-notifier.mail-notifier.NotifierEvents */ connected | mail | end | error */](
      event: U,
      listener: /* import warning: importer.ImportType#apply Failed type conversion: mail-notifier.mail-notifier.NotifierEvents[U] */ js.Any
    ): this.type = js.native
    
    def emit[U /* <: /* keyof mail-notifier.mail-notifier.NotifierEvents */ connected | mail | end | error */](
      event: U,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<NotifierEvents[U]> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: mail-notifier.mail-notifier.NotifierEvents[U] */ js.Any
        ]
    ): Boolean = js.native
    
    def off[U /* <: /* keyof mail-notifier.mail-notifier.NotifierEvents */ connected | mail | end | error */](
      event: U,
      listener: /* import warning: importer.ImportType#apply Failed type conversion: mail-notifier.mail-notifier.NotifierEvents[U] */ js.Any
    ): this.type = js.native
    
    def on[U /* <: /* keyof mail-notifier.mail-notifier.NotifierEvents */ connected | mail | end | error */](
      event: U,
      listener: /* import warning: importer.ImportType#apply Failed type conversion: mail-notifier.mail-notifier.NotifierEvents[U] */ js.Any
    ): this.type = js.native
    
    def once[U /* <: /* keyof mail-notifier.mail-notifier.NotifierEvents */ connected | mail | end | error */](
      event: U,
      listener: /* import warning: importer.ImportType#apply Failed type conversion: mail-notifier.mail-notifier.NotifierEvents[U] */ js.Any
    ): this.type = js.native
    
    def prependListener[U /* <: /* keyof mail-notifier.mail-notifier.NotifierEvents */ connected | mail | end | error */](
      event: U,
      listener: /* import warning: importer.ImportType#apply Failed type conversion: mail-notifier.mail-notifier.NotifierEvents[U] */ js.Any
    ): this.type = js.native
    
    def prependOnceListener[U /* <: /* keyof mail-notifier.mail-notifier.NotifierEvents */ connected | mail | end | error */](
      event: U,
      listener: /* import warning: importer.ImportType#apply Failed type conversion: mail-notifier.mail-notifier.NotifierEvents[U] */ js.Any
    ): this.type = js.native
    
    def removeListener[U /* <: /* keyof mail-notifier.mail-notifier.NotifierEvents */ connected | mail | end | error */](
      event: U,
      listener: /* import warning: importer.ImportType#apply Failed type conversion: mail-notifier.mail-notifier.NotifierEvents[U] */ js.Any
    ): this.type = js.native
    
    def scan(callback: js.Function0[Unit]): this.type = js.native
    
    /**
      * Start listening for incoming emails.
      */
    def start(): this.type = js.native
    
    /**
      * Stop listening and close IMAP connection.
      */
    def stop(): this.type = js.native
  }
  
  trait NotifierEvents extends StObject {
    
    def connected(): Unit
    
    def end(): Unit
    
    def error(error: js.Error): Unit
    
    def mail(email: EmailContent): Unit
  }
  object NotifierEvents {
    
    inline def apply(connected: () => Unit, end: () => Unit, error: js.Error => Unit, mail: EmailContent => Unit): NotifierEvents = {
      val __obj = js.Dynamic.literal(connected = js.Any.fromFunction0(connected), end = js.Any.fromFunction0(end), error = js.Any.fromFunction1(error), mail = js.Any.fromFunction1(mail))
      __obj.asInstanceOf[NotifierEvents]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NotifierEvents] (val x: Self) extends AnyVal {
      
      inline def setConnected(value: () => Unit): Self = StObject.set(x, "connected", js.Any.fromFunction0(value))
      
      inline def setEnd(value: () => Unit): Self = StObject.set(x, "end", js.Any.fromFunction0(value))
      
      inline def setError(value: js.Error => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
      
      inline def setMail(value: EmailContent => Unit): Self = StObject.set(x, "mail", js.Any.fromFunction1(value))
    }
  }
}
