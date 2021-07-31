package typings.mailparser

import org.scalablytyped.runtime.StringDictionary
import typings.mailparser.anon.Key
import typings.mailparser.mailparserBooleans.`false`
import typings.mailparser.mailparserStrings.attachment
import typings.mailparser.mailparserStrings.data
import typings.mailparser.mailparserStrings.headers
import typings.mailparser.mailparserStrings.high
import typings.mailparser.mailparserStrings.low
import typings.mailparser.mailparserStrings.normal
import typings.mailparser.mailparserStrings.readable
import typings.mailparser.mailparserStrings.text
import typings.node.Buffer
import typings.node.streamMod.Stream
import typings.node.streamMod.Transform
import typings.node.streamMod.TransformOptions
import typings.std.Date
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("mailparser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("mailparser", "MailParser")
  @js.native
  class MailParser () extends Transform {
    def this(options: TransformOptions) = this()
    
    @JSName("on")
    def on_data(event: data, callback: js.Function1[/* data */ AttachmentStream | MessageText, Unit]): this.type = js.native
    @JSName("on")
    def on_headers(event: headers, callback: js.Function1[/* headers */ Headers, Unit]): this.type = js.native
    @JSName("on")
    def on_readable(event: readable, callback: js.Function1[/* data */ AttachmentStream | MessageText, Unit]): this.type = js.native
  }
  
  @scala.inline
  def simpleParser(source: Source): js.Promise[ParsedMail] = ^.asInstanceOf[js.Dynamic].applyDynamic("simpleParser")(source.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ParsedMail]]
  @scala.inline
  def simpleParser(source: Source, callback: js.Function2[/* err */ js.Any, /* mail */ ParsedMail, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("simpleParser")(source.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def simpleParser(source: Source, options: SimpleParserOptions): js.Promise[ParsedMail] = (^.asInstanceOf[js.Dynamic].applyDynamic("simpleParser")(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ParsedMail]]
  @scala.inline
  def simpleParser(
    source: Source,
    options: SimpleParserOptions,
    callback: js.Function2[/* err */ js.Any, /* mail */ ParsedMail, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("simpleParser")(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait AddressObject
    extends StObject
       with _HeaderValue {
    
    /**
      * A formatted address string for HTML context.
      */
    var html: String
    
    /**
      * A formatted address string for plaintext context.
      */
    var text: String
    
    /**
      * An array with address details.
      */
    var value: js.Array[EmailAddress]
  }
  object AddressObject {
    
    @scala.inline
    def apply(html: String, text: String, value: js.Array[EmailAddress]): AddressObject = {
      val __obj = js.Dynamic.literal(html = html.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[AddressObject]
    }
    
    @scala.inline
    implicit class AddressObjectMutableBuilder[Self <: AddressObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHtml(value: String): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: js.Array[EmailAddress]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueVarargs(value: EmailAddress*): Self = StObject.set(x, "value", js.Array(value :_*))
    }
  }
  
  trait Attachment
    extends StObject
       with AttachmentCommon {
    
    /**
      * A Buffer that contains the attachment contents.
      */
    @JSName("content")
    var content_Attachment: Buffer
    
    /**
      * If true then this attachment should not be offered for download
      * (at least not in the main attachments list).
      */
    @JSName("related")
    var related_Attachment: Boolean
  }
  object Attachment {
    
    @scala.inline
    def apply(
      checksum: String,
      content: Buffer,
      contentDisposition: String,
      contentType: String,
      headerLines: HeaderLines,
      headers: Headers,
      related: Boolean,
      size: Double
    ): Attachment = {
      val __obj = js.Dynamic.literal(checksum = checksum.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], contentDisposition = contentDisposition.asInstanceOf[js.Any], contentType = contentType.asInstanceOf[js.Any], headerLines = headerLines.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], related = related.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("attachment")
      __obj.asInstanceOf[Attachment]
    }
    
    @scala.inline
    implicit class AttachmentMutableBuilder[Self <: Attachment] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContent(value: Buffer): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRelated(value: Boolean): Self = StObject.set(x, "related", value.asInstanceOf[js.Any])
    }
  }
  
  trait AttachmentCommon extends StObject {
    
    /**
      * A MD5 hash of the message content.
      */
    var checksum: String
    
    /**
      * `contentId` without `<` and `>`.
      */
    var cid: js.UndefOr[String] = js.undefined
    
    /**
      * Attachment contents.
      */
    var content: js.Any
    
    /**
      * Content disposition type for the attachment,
      * most probably `'attachment'`.
      */
    var contentDisposition: String
    
    /**
      * The header value from `Content-ID`.
      */
    var contentId: js.UndefOr[String] = js.undefined
    
    /**
      * MIME type of the message.
      */
    var contentType: String
    
    /**
      * File name of the attachment.
      */
    var filename: js.UndefOr[String] = js.undefined
    
    /**
      * An array of raw header lines for the attachment node.
      */
    var headerLines: HeaderLines
    
    /**
      * A Map value that holds MIME headers for the attachment node.
      */
    var headers: Headers
    
    // e.g. '5.1321281380971@localhost'
    /**
      * If true then this attachment should not be offered for download
      * (at least not in the main attachments list).
      */
    var related: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Message size in bytes.
      */
    var size: Double
    
    /**
      * Message type.
      */
    var `type`: attachment
  }
  object AttachmentCommon {
    
    @scala.inline
    def apply(
      checksum: String,
      content: js.Any,
      contentDisposition: String,
      contentType: String,
      headerLines: HeaderLines,
      headers: Headers,
      size: Double
    ): AttachmentCommon = {
      val __obj = js.Dynamic.literal(checksum = checksum.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], contentDisposition = contentDisposition.asInstanceOf[js.Any], contentType = contentType.asInstanceOf[js.Any], headerLines = headerLines.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("attachment")
      __obj.asInstanceOf[AttachmentCommon]
    }
    
    @scala.inline
    implicit class AttachmentCommonMutableBuilder[Self <: AttachmentCommon] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChecksum(value: String): Self = StObject.set(x, "checksum", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCid(value: String): Self = StObject.set(x, "cid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCidUndefined: Self = StObject.set(x, "cid", js.undefined)
      
      @scala.inline
      def setContent(value: js.Any): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentDisposition(value: String): Self = StObject.set(x, "contentDisposition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentId(value: String): Self = StObject.set(x, "contentId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentIdUndefined: Self = StObject.set(x, "contentId", js.undefined)
      
      @scala.inline
      def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
      
      @scala.inline
      def setHeaderLines(value: HeaderLines): Self = StObject.set(x, "headerLines", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderLinesVarargs(value: Key*): Self = StObject.set(x, "headerLines", js.Array(value :_*))
      
      @scala.inline
      def setHeaders(value: Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRelated(value: Boolean): Self = StObject.set(x, "related", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRelatedUndefined: Self = StObject.set(x, "related", js.undefined)
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: attachment): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait AttachmentStream
    extends StObject
       with AttachmentCommon {
    
    /**
      * A Buffer that contains the attachment contents.
      */
    @JSName("content")
    var content_AttachmentStream: Stream
    
    /**
      * Method must be called once you have processed the attachment.
      */
    def release(): Unit
  }
  object AttachmentStream {
    
    @scala.inline
    def apply(
      checksum: String,
      content: Stream,
      contentDisposition: String,
      contentType: String,
      headerLines: HeaderLines,
      headers: Headers,
      release: () => Unit,
      size: Double
    ): AttachmentStream = {
      val __obj = js.Dynamic.literal(checksum = checksum.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], contentDisposition = contentDisposition.asInstanceOf[js.Any], contentType = contentType.asInstanceOf[js.Any], headerLines = headerLines.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], release = js.Any.fromFunction0(release), size = size.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("attachment")
      __obj.asInstanceOf[AttachmentStream]
    }
    
    @scala.inline
    implicit class AttachmentStreamMutableBuilder[Self <: AttachmentStream] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContent(value: Stream): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRelease(value: () => Unit): Self = StObject.set(x, "release", js.Any.fromFunction0(value))
    }
  }
  
  trait EmailAddress extends StObject {
    
    /**
      * The email address.
      */
    var address: js.UndefOr[String] = js.undefined
    
    /**
      * An array of grouped addresses.
      */
    var group: js.UndefOr[js.Array[EmailAddress]] = js.undefined
    
    /**
      * The name part of the email/group.
      */
    var name: String
  }
  object EmailAddress {
    
    @scala.inline
    def apply(name: String): EmailAddress = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[EmailAddress]
    }
    
    @scala.inline
    implicit class EmailAddressMutableBuilder[Self <: EmailAddress] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
      
      @scala.inline
      def setGroup(value: js.Array[EmailAddress]): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
      
      @scala.inline
      def setGroupVarargs(value: EmailAddress*): Self = StObject.set(x, "group", js.Array(value :_*))
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  type HeaderLines = js.Array[Key]
  
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - js.Array[java.lang.String]
    - typings.mailparser.mod.AddressObject
    - typings.std.Date
    - typings.mailparser.mod.StructuredHeader
  */
  type HeaderValue = _HeaderValue | js.Array[String] | String | Date
  
  type Headers = Map[String, HeaderValue]
  
  trait MessageText extends StObject {
    
    /**
      * Includes the HTML version of the message.
      *
      * Is set if the message has at least one `text/html` node.
      */
    var html: js.UndefOr[String | Boolean] = js.undefined
    
    /**
      * Includes the plaintext version of the message.
      *
      * Is set if the message has at least one `text/plain` node.
      */
    var text: js.UndefOr[String] = js.undefined
    
    /**
      * Includes the plaintext version of the message in HTML format.
      *
      * Is set if the message has at least one `text/plain` node.
      */
    var textAsHtml: js.UndefOr[String] = js.undefined
    
    /**
      * Message type.
      */
    var `type`: text
  }
  object MessageText {
    
    @scala.inline
    def apply(): MessageText = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("text")
      __obj.asInstanceOf[MessageText]
    }
    
    @scala.inline
    implicit class MessageTextMutableBuilder[Self <: MessageText] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHtml(value: String | Boolean): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHtmlUndefined: Self = StObject.set(x, "html", js.undefined)
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextAsHtml(value: String): Self = StObject.set(x, "textAsHtml", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextAsHtmlUndefined: Self = StObject.set(x, "textAsHtml", js.undefined)
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      @scala.inline
      def setType(value: text): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait ParsedMail extends StObject {
    
    /**
      * An array of attachments.
      */
    var attachments: js.Array[Attachment]
    
    /**
      * An address object for the `Bcc:` header (usually not present).
      */
    var bcc: js.UndefOr[AddressObject] = js.undefined
    
    /**
      * An address object for the `Cc:` header.
      */
    var cc: js.UndefOr[AddressObject] = js.undefined
    
    /**
      * A Date object for the `Date:` header.
      */
    var date: js.UndefOr[Date] = js.undefined
    
    /**
      * An address object for the `From:` header.
      */
    var from: js.UndefOr[AddressObject] = js.undefined
    
    /**
      * An array of raw header lines
      */
    var headerLines: HeaderLines
    
    /**
      * A Map object with lowercase header keys.
      *
      * - All address headers are converted into address objects.
      * - `references` is a string if only a single reference-id exists or an
      *    array if multiple ids exist.
      * - `date` value is a Date object.
      */
    var headers: Headers
    
    /**
      * The HTML body of the message.
      *
      * Sets to `false` when there is no HTML body.
      *
      * If the message included embedded images as cid: urls then these are all
      * replaced with base64 formatted data: URIs.
      */
    var html: String | `false`
    
    /**
      * The In-Reply-To value string.
      */
    var inReplyTo: js.UndefOr[String] = js.undefined
    
    /**
      * The Message-ID value string.
      */
    var messageId: js.UndefOr[String] = js.undefined
    
    /**
      * Priority of the e-mail.
      */
    var priority: js.UndefOr[normal | low | high] = js.undefined
    
    /**
      * An array of referenced Message-ID values.
      *
      * Not set if no reference values present.
      */
    var references: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * An address object for the `Reply-To:` header.
      */
    var replyTo: js.UndefOr[AddressObject] = js.undefined
    
    /**
      * The subject line.
      */
    var subject: js.UndefOr[String] = js.undefined
    
    /**
      * The plaintext body of the message.
      */
    var text: js.UndefOr[String] = js.undefined
    
    /**
      * The plaintext body of the message formatted as HTML.
      */
    var textAsHtml: js.UndefOr[String] = js.undefined
    
    /**
      * An address object for the `To:` header.
      */
    var to: js.UndefOr[AddressObject] = js.undefined
  }
  object ParsedMail {
    
    @scala.inline
    def apply(
      attachments: js.Array[Attachment],
      headerLines: HeaderLines,
      headers: Headers,
      html: String | `false`
    ): ParsedMail = {
      val __obj = js.Dynamic.literal(attachments = attachments.asInstanceOf[js.Any], headerLines = headerLines.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParsedMail]
    }
    
    @scala.inline
    implicit class ParsedMailMutableBuilder[Self <: ParsedMail] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttachments(value: js.Array[Attachment]): Self = StObject.set(x, "attachments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttachmentsVarargs(value: Attachment*): Self = StObject.set(x, "attachments", js.Array(value :_*))
      
      @scala.inline
      def setBcc(value: AddressObject): Self = StObject.set(x, "bcc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBccUndefined: Self = StObject.set(x, "bcc", js.undefined)
      
      @scala.inline
      def setCc(value: AddressObject): Self = StObject.set(x, "cc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCcUndefined: Self = StObject.set(x, "cc", js.undefined)
      
      @scala.inline
      def setDate(value: Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
      
      @scala.inline
      def setFrom(value: AddressObject): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
      
      @scala.inline
      def setHeaderLines(value: HeaderLines): Self = StObject.set(x, "headerLines", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderLinesVarargs(value: Key*): Self = StObject.set(x, "headerLines", js.Array(value :_*))
      
      @scala.inline
      def setHeaders(value: Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHtml(value: String | `false`): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInReplyTo(value: String): Self = StObject.set(x, "inReplyTo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInReplyToUndefined: Self = StObject.set(x, "inReplyTo", js.undefined)
      
      @scala.inline
      def setMessageId(value: String): Self = StObject.set(x, "messageId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageIdUndefined: Self = StObject.set(x, "messageId", js.undefined)
      
      @scala.inline
      def setPriority(value: normal | low | high): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
      
      @scala.inline
      def setReferences(value: js.Array[String]): Self = StObject.set(x, "references", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReferencesUndefined: Self = StObject.set(x, "references", js.undefined)
      
      @scala.inline
      def setReferencesVarargs(value: String*): Self = StObject.set(x, "references", js.Array(value :_*))
      
      @scala.inline
      def setReplyTo(value: AddressObject): Self = StObject.set(x, "replyTo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReplyToUndefined: Self = StObject.set(x, "replyTo", js.undefined)
      
      @scala.inline
      def setSubject(value: String): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextAsHtml(value: String): Self = StObject.set(x, "textAsHtml", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextAsHtmlUndefined: Self = StObject.set(x, "textAsHtml", js.undefined)
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      @scala.inline
      def setTo(value: AddressObject): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToUndefined: Self = StObject.set(x, "to", js.undefined)
    }
  }
  
  trait SimpleParserOptions
    extends StObject
       with TransformOptions {
    
    var keepCidLinks: js.UndefOr[Boolean] = js.undefined
  }
  object SimpleParserOptions {
    
    @scala.inline
    def apply(): SimpleParserOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SimpleParserOptions]
    }
    
    @scala.inline
    implicit class SimpleParserOptionsMutableBuilder[Self <: SimpleParserOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKeepCidLinks(value: Boolean): Self = StObject.set(x, "keepCidLinks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeepCidLinksUndefined: Self = StObject.set(x, "keepCidLinks", js.undefined)
    }
  }
  
  type Source = Buffer | Stream | String
  
  trait StructuredHeader
    extends StObject
       with _HeaderValue {
    
    /**
      * Additional arguments.
      */
    var params: StringDictionary[String]
    
    /**
      * The main value.
      */
    var value: String
  }
  object StructuredHeader {
    
    @scala.inline
    def apply(params: StringDictionary[String], value: String): StructuredHeader = {
      val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[StructuredHeader]
    }
    
    @scala.inline
    implicit class StructuredHeaderMutableBuilder[Self <: StructuredHeader] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setParams(value: StringDictionary[String]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait _HeaderValue extends StObject
  object _HeaderValue {
    
    @scala.inline
    def AddressObject(html: String, text: String, value: js.Array[EmailAddress]): typings.mailparser.mod.AddressObject = {
      val __obj = js.Dynamic.literal(html = html.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.mailparser.mod.AddressObject]
    }
    
    @scala.inline
    def StructuredHeader(params: StringDictionary[String], value: String): typings.mailparser.mod.StructuredHeader = {
      val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.mailparser.mod.StructuredHeader]
    }
  }
}
