package typings.mailparserMit

import org.scalablytyped.runtime.StringDictionary
import typings.mailparserMit.anon.Content
import typings.mailparserMit.anon.ContentLevel
import typings.mailparserMit.anon.Key
import typings.mailparserMit.anon.Level
import typings.mailparserMit.mailparserMitBooleans.`true`
import typings.mailparserMit.mailparserMitStrings.attachment
import typings.mailparserMit.mailparserMitStrings.end
import typings.mailparserMit.mailparserMitStrings.headers
import typings.node.NodeJS.WritableStream
import typings.node.bufferMod.global.Buffer
import typings.node.nodeColonstreamMod.Stream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("mailparser-mit", "MailParser")
  @js.native
  open class MailParser ()
    extends Stream
       with WritableStream {
    def this(options: MailParserOptions) = this()
    
    /** This is the final mail structure object that is returned to the client */
    var mailData: MailData = js.native
    
    /** The complete tree structure of the e-mail */
    var mimeTree: MimeTreeNode = js.native
    
    @JSName("on")
    def on_attachment(
      event: attachment,
      listener: js.Function2[/* attachment */ StreamAttachment, /* rootNode */ MimeTreeNode, Unit]
    ): this.type = js.native
    @JSName("on")
    def on_end(event: end, listener: js.Function1[/* email */ ParsedEmail, Unit]): this.type = js.native
    @JSName("on")
    def on_headers(event: headers, listener: js.Function1[/* headers */ Headers, Unit]): this.type = js.native
    
    var options: MailParserOptions = js.native
    
    @JSName("writable")
    var writable_MailParser: `true` = js.native
  }
  
  trait Attachment extends StObject {
    
    /** A MD5 hash of the message content. */
    var checksum: String
    
    /** Attachment contents. */
    var content: Buffer
    
    /** Content disposition type for the attachment, most probably `'attachment'`. */
    var contentDisposition: String
    
    /** The header value from `Content-ID`. */
    var contentId: String
    
    /** MIME type of the message. */
    var contentType: String
    
    var fileName: js.UndefOr[String] = js.undefined
    
    /** File name of the attachment. */
    var generatedFileName: String
    
    var length: Double
    
    var transferEncoding: String
  }
  object Attachment {
    
    inline def apply(
      checksum: String,
      content: Buffer,
      contentDisposition: String,
      contentId: String,
      contentType: String,
      generatedFileName: String,
      length: Double,
      transferEncoding: String
    ): Attachment = {
      val __obj = js.Dynamic.literal(checksum = checksum.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], contentDisposition = contentDisposition.asInstanceOf[js.Any], contentId = contentId.asInstanceOf[js.Any], contentType = contentType.asInstanceOf[js.Any], generatedFileName = generatedFileName.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], transferEncoding = transferEncoding.asInstanceOf[js.Any])
      __obj.asInstanceOf[Attachment]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Attachment] (val x: Self) extends AnyVal {
      
      inline def setChecksum(value: String): Self = StObject.set(x, "checksum", value.asInstanceOf[js.Any])
      
      inline def setContent(value: Buffer): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentDisposition(value: String): Self = StObject.set(x, "contentDisposition", value.asInstanceOf[js.Any])
      
      inline def setContentId(value: String): Self = StObject.set(x, "contentId", value.asInstanceOf[js.Any])
      
      inline def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
      
      inline def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
      
      inline def setFileNameUndefined: Self = StObject.set(x, "fileName", js.undefined)
      
      inline def setGeneratedFileName(value: String): Self = StObject.set(x, "generatedFileName", value.asInstanceOf[js.Any])
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setTransferEncoding(value: String): Self = StObject.set(x, "transferEncoding", value.asInstanceOf[js.Any])
    }
  }
  
  trait ContactInfo extends StObject {
    
    var address: String
    
    var group: js.UndefOr[String] = js.undefined
    
    var name: String
  }
  object ContactInfo {
    
    inline def apply(address: String, name: String): ContactInfo = {
      val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[ContactInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ContactInfo] (val x: Self) extends AnyVal {
      
      inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      inline def setGroup(value: String): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
      
      inline def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  type Headers = StringDictionary[String | js.Array[String]]
  
  trait MailData extends StObject {
    
    var attachments: js.Array[ContentLevel]
    
    var calendar: js.Array[Level]
    
    var html: js.Array[Content]
    
    var text: js.Array[Content]
  }
  object MailData {
    
    inline def apply(
      attachments: js.Array[ContentLevel],
      calendar: js.Array[Level],
      html: js.Array[Content],
      text: js.Array[Content]
    ): MailData = {
      val __obj = js.Dynamic.literal(attachments = attachments.asInstanceOf[js.Any], calendar = calendar.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[MailData]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MailData] (val x: Self) extends AnyVal {
      
      inline def setAttachments(value: js.Array[ContentLevel]): Self = StObject.set(x, "attachments", value.asInstanceOf[js.Any])
      
      inline def setAttachmentsVarargs(value: ContentLevel*): Self = StObject.set(x, "attachments", js.Array(value*))
      
      inline def setCalendar(value: js.Array[Level]): Self = StObject.set(x, "calendar", value.asInstanceOf[js.Any])
      
      inline def setCalendarVarargs(value: Level*): Self = StObject.set(x, "calendar", js.Array(value*))
      
      inline def setHtml(value: js.Array[Content]): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
      
      inline def setHtmlVarargs(value: Content*): Self = StObject.set(x, "html", js.Array(value*))
      
      inline def setText(value: js.Array[Content]): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextVarargs(value: Content*): Self = StObject.set(x, "text", js.Array(value*))
    }
  }
  
  trait MailParserOptions extends StObject {
    
    /** if set to true print all incoming lines to decodeq */
    var debug: js.UndefOr[Boolean] = js.undefined
    
    /** the default charset for text/plain, text/html content, if not set reverts to Latin-1 */
    var defaultCharset: js.UndefOr[String] = js.undefined
    
    /** if set to true, show inlined attachment links */
    var showAttachmentLinks: js.UndefOr[Boolean] = js.undefined
    
    /** if set to true, stream attachments instead of including them */
    var streamAttachments: js.UndefOr[Boolean] = js.undefined
    
    /** if set to true replace double dots in the beginning of the file */
    var unescapeSMTP: js.UndefOr[Boolean] = js.undefined
  }
  object MailParserOptions {
    
    inline def apply(): MailParserOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MailParserOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MailParserOptions] (val x: Self) extends AnyVal {
      
      inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      inline def setDefaultCharset(value: String): Self = StObject.set(x, "defaultCharset", value.asInstanceOf[js.Any])
      
      inline def setDefaultCharsetUndefined: Self = StObject.set(x, "defaultCharset", js.undefined)
      
      inline def setShowAttachmentLinks(value: Boolean): Self = StObject.set(x, "showAttachmentLinks", value.asInstanceOf[js.Any])
      
      inline def setShowAttachmentLinksUndefined: Self = StObject.set(x, "showAttachmentLinks", js.undefined)
      
      inline def setStreamAttachments(value: Boolean): Self = StObject.set(x, "streamAttachments", value.asInstanceOf[js.Any])
      
      inline def setStreamAttachmentsUndefined: Self = StObject.set(x, "streamAttachments", js.undefined)
      
      inline def setUnescapeSMTP(value: Boolean): Self = StObject.set(x, "unescapeSMTP", value.asInstanceOf[js.Any])
      
      inline def setUnescapeSMTPUndefined: Self = StObject.set(x, "unescapeSMTP", js.undefined)
    }
  }
  
  trait MimeTreeNode extends StObject {
    
    var attachment: js.UndefOr[Boolean] = js.undefined
    
    var childNodes: js.Array[MimeTreeNode]
    
    var content: js.UndefOr[String | Buffer] = js.undefined
    
    var from: js.UndefOr[js.Array[ContactInfo]] = js.undefined
    
    var headers: js.UndefOr[js.Array[Key]] = js.undefined
    
    var messageId: js.UndefOr[String] = js.undefined
    
    var meta: StringDictionary[Any]
    
    var parentNode: MimeTreeNode | Null
    
    var parsedHeaders: StringDictionary[String]
    
    var priority: js.UndefOr[Priority] = js.undefined
    
    var subject: js.UndefOr[String] = js.undefined
    
    var to: js.UndefOr[js.Array[ContactInfo]] = js.undefined
    
    var useMIME: js.UndefOr[Boolean] = js.undefined
  }
  object MimeTreeNode {
    
    inline def apply(
      childNodes: js.Array[MimeTreeNode],
      meta: StringDictionary[Any],
      parsedHeaders: StringDictionary[String]
    ): MimeTreeNode = {
      val __obj = js.Dynamic.literal(childNodes = childNodes.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], parsedHeaders = parsedHeaders.asInstanceOf[js.Any], parentNode = null)
      __obj.asInstanceOf[MimeTreeNode]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MimeTreeNode] (val x: Self) extends AnyVal {
      
      inline def setAttachment(value: Boolean): Self = StObject.set(x, "attachment", value.asInstanceOf[js.Any])
      
      inline def setAttachmentUndefined: Self = StObject.set(x, "attachment", js.undefined)
      
      inline def setChildNodes(value: js.Array[MimeTreeNode]): Self = StObject.set(x, "childNodes", value.asInstanceOf[js.Any])
      
      inline def setChildNodesVarargs(value: MimeTreeNode*): Self = StObject.set(x, "childNodes", js.Array(value*))
      
      inline def setContent(value: String | Buffer): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setFrom(value: js.Array[ContactInfo]): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
      
      inline def setFromVarargs(value: ContactInfo*): Self = StObject.set(x, "from", js.Array(value*))
      
      inline def setHeaders(value: js.Array[Key]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setHeadersVarargs(value: Key*): Self = StObject.set(x, "headers", js.Array(value*))
      
      inline def setMessageId(value: String): Self = StObject.set(x, "messageId", value.asInstanceOf[js.Any])
      
      inline def setMessageIdUndefined: Self = StObject.set(x, "messageId", js.undefined)
      
      inline def setMeta(value: StringDictionary[Any]): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      inline def setParentNode(value: MimeTreeNode): Self = StObject.set(x, "parentNode", value.asInstanceOf[js.Any])
      
      inline def setParentNodeNull: Self = StObject.set(x, "parentNode", null)
      
      inline def setParsedHeaders(value: StringDictionary[String]): Self = StObject.set(x, "parsedHeaders", value.asInstanceOf[js.Any])
      
      inline def setPriority(value: Priority): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
      
      inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
      
      inline def setSubject(value: String): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
      
      inline def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
      
      inline def setTo(value: js.Array[ContactInfo]): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      inline def setToUndefined: Self = StObject.set(x, "to", js.undefined)
      
      inline def setToVarargs(value: ContactInfo*): Self = StObject.set(x, "to", js.Array(value*))
      
      inline def setUseMIME(value: Boolean): Self = StObject.set(x, "useMIME", value.asInstanceOf[js.Any])
      
      inline def setUseMIMEUndefined: Self = StObject.set(x, "useMIME", js.undefined)
    }
  }
  
  trait ParsedEmail extends StObject {
    
    var alternatives: js.UndefOr[
        js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: std.Array<mailparser-mit.anon.Level>[number]['content'] */ js.Any
        ]
      ] = js.undefined
    
    var attachments: js.UndefOr[js.Array[Attachment]] = js.undefined
    
    var bcc: js.UndefOr[js.Array[ContactInfo]] = js.undefined
    
    var cc: js.UndefOr[js.Array[ContactInfo]] = js.undefined
    
    var date: js.UndefOr[js.Date] = js.undefined
    
    var from: js.UndefOr[js.Array[ContactInfo]] = js.undefined
    
    var headers: Headers
    
    var html: js.UndefOr[String] = js.undefined
    
    var inReplyTo: js.UndefOr[js.Array[String]] = js.undefined
    
    var messageId: js.UndefOr[String] = js.undefined
    
    var priority: js.UndefOr[Priority] = js.undefined
    
    var receivedDate: js.UndefOr[js.Date] = js.undefined
    
    var references: js.UndefOr[js.Array[String]] = js.undefined
    
    var replyTo: js.UndefOr[js.Array[ContactInfo]] = js.undefined
    
    var subject: js.UndefOr[String] = js.undefined
    
    var text: js.UndefOr[String] = js.undefined
    
    var to: js.UndefOr[js.Array[ContactInfo]] = js.undefined
  }
  object ParsedEmail {
    
    inline def apply(headers: Headers): ParsedEmail = {
      val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParsedEmail]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ParsedEmail] (val x: Self) extends AnyVal {
      
      inline def setAlternatives(
        value: js.Array[
              /* import warning: importer.ImportType#apply Failed type conversion: std.Array<mailparser-mit.anon.Level>[number]['content'] */ js.Any
            ]
      ): Self = StObject.set(x, "alternatives", value.asInstanceOf[js.Any])
      
      inline def setAlternativesUndefined: Self = StObject.set(x, "alternatives", js.undefined)
      
      inline def setAlternativesVarargs(
        value: (/* import warning: importer.ImportType#apply Failed type conversion: std.Array<mailparser-mit.anon.Level>[number]['content'] */ js.Any)*
      ): Self = StObject.set(x, "alternatives", js.Array(value*))
      
      inline def setAttachments(value: js.Array[Attachment]): Self = StObject.set(x, "attachments", value.asInstanceOf[js.Any])
      
      inline def setAttachmentsUndefined: Self = StObject.set(x, "attachments", js.undefined)
      
      inline def setAttachmentsVarargs(value: Attachment*): Self = StObject.set(x, "attachments", js.Array(value*))
      
      inline def setBcc(value: js.Array[ContactInfo]): Self = StObject.set(x, "bcc", value.asInstanceOf[js.Any])
      
      inline def setBccUndefined: Self = StObject.set(x, "bcc", js.undefined)
      
      inline def setBccVarargs(value: ContactInfo*): Self = StObject.set(x, "bcc", js.Array(value*))
      
      inline def setCc(value: js.Array[ContactInfo]): Self = StObject.set(x, "cc", value.asInstanceOf[js.Any])
      
      inline def setCcUndefined: Self = StObject.set(x, "cc", js.undefined)
      
      inline def setCcVarargs(value: ContactInfo*): Self = StObject.set(x, "cc", js.Array(value*))
      
      inline def setDate(value: js.Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
      
      inline def setFrom(value: js.Array[ContactInfo]): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
      
      inline def setFromVarargs(value: ContactInfo*): Self = StObject.set(x, "from", js.Array(value*))
      
      inline def setHeaders(value: Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHtml(value: String): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
      
      inline def setHtmlUndefined: Self = StObject.set(x, "html", js.undefined)
      
      inline def setInReplyTo(value: js.Array[String]): Self = StObject.set(x, "inReplyTo", value.asInstanceOf[js.Any])
      
      inline def setInReplyToUndefined: Self = StObject.set(x, "inReplyTo", js.undefined)
      
      inline def setInReplyToVarargs(value: String*): Self = StObject.set(x, "inReplyTo", js.Array(value*))
      
      inline def setMessageId(value: String): Self = StObject.set(x, "messageId", value.asInstanceOf[js.Any])
      
      inline def setMessageIdUndefined: Self = StObject.set(x, "messageId", js.undefined)
      
      inline def setPriority(value: Priority): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
      
      inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
      
      inline def setReceivedDate(value: js.Date): Self = StObject.set(x, "receivedDate", value.asInstanceOf[js.Any])
      
      inline def setReceivedDateUndefined: Self = StObject.set(x, "receivedDate", js.undefined)
      
      inline def setReferences(value: js.Array[String]): Self = StObject.set(x, "references", value.asInstanceOf[js.Any])
      
      inline def setReferencesUndefined: Self = StObject.set(x, "references", js.undefined)
      
      inline def setReferencesVarargs(value: String*): Self = StObject.set(x, "references", js.Array(value*))
      
      inline def setReplyTo(value: js.Array[ContactInfo]): Self = StObject.set(x, "replyTo", value.asInstanceOf[js.Any])
      
      inline def setReplyToUndefined: Self = StObject.set(x, "replyTo", js.undefined)
      
      inline def setReplyToVarargs(value: ContactInfo*): Self = StObject.set(x, "replyTo", js.Array(value*))
      
      inline def setSubject(value: String): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
      
      inline def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setTo(value: js.Array[ContactInfo]): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      inline def setToUndefined: Self = StObject.set(x, "to", js.undefined)
      
      inline def setToVarargs(value: ContactInfo*): Self = StObject.set(x, "to", js.Array(value*))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.mailparserMit.mailparserMitStrings.normal
    - typings.mailparserMit.mailparserMitStrings.low
    - typings.mailparserMit.mailparserMitStrings.high
  */
  trait Priority extends StObject
  object Priority {
    
    inline def high: typings.mailparserMit.mailparserMitStrings.high = "high".asInstanceOf[typings.mailparserMit.mailparserMitStrings.high]
    
    inline def low: typings.mailparserMit.mailparserMitStrings.low = "low".asInstanceOf[typings.mailparserMit.mailparserMitStrings.low]
    
    inline def normal: typings.mailparserMit.mailparserMitStrings.normal = "normal".asInstanceOf[typings.mailparserMit.mailparserMitStrings.normal]
  }
  
  /* Inlined parent std.Omit<mailparser-mit.mailparser-mit.Attachment, 'content'> */
  trait StreamAttachment extends StObject {
    
    var checksum: String
    
    var contentDisposition: String
    
    var contentId: String
    
    var contentType: String
    
    var fileName: js.UndefOr[String] = js.undefined
    
    var generatedFileName: String
    
    var length: Double
    
    var stream: Stream
    
    var transferEncoding: String
  }
  object StreamAttachment {
    
    inline def apply(
      checksum: String,
      contentDisposition: String,
      contentId: String,
      contentType: String,
      generatedFileName: String,
      length: Double,
      stream: Stream,
      transferEncoding: String
    ): StreamAttachment = {
      val __obj = js.Dynamic.literal(checksum = checksum.asInstanceOf[js.Any], contentDisposition = contentDisposition.asInstanceOf[js.Any], contentId = contentId.asInstanceOf[js.Any], contentType = contentType.asInstanceOf[js.Any], generatedFileName = generatedFileName.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], stream = stream.asInstanceOf[js.Any], transferEncoding = transferEncoding.asInstanceOf[js.Any])
      __obj.asInstanceOf[StreamAttachment]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StreamAttachment] (val x: Self) extends AnyVal {
      
      inline def setChecksum(value: String): Self = StObject.set(x, "checksum", value.asInstanceOf[js.Any])
      
      inline def setContentDisposition(value: String): Self = StObject.set(x, "contentDisposition", value.asInstanceOf[js.Any])
      
      inline def setContentId(value: String): Self = StObject.set(x, "contentId", value.asInstanceOf[js.Any])
      
      inline def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
      
      inline def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
      
      inline def setFileNameUndefined: Self = StObject.set(x, "fileName", js.undefined)
      
      inline def setGeneratedFileName(value: String): Self = StObject.set(x, "generatedFileName", value.asInstanceOf[js.Any])
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setStream(value: Stream): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
      
      inline def setTransferEncoding(value: String): Self = StObject.set(x, "transferEncoding", value.asInstanceOf[js.Any])
    }
  }
}
