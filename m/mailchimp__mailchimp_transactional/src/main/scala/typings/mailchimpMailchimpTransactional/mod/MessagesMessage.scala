package typings.mailchimpMailchimpTransactional.mod

import typings.mailchimpMailchimpTransactional.anon.MessageMetadatawebsitestr
import typings.mailchimpMailchimpTransactional.mailchimpMailchimpTransactionalStrings.handlebars
import typings.mailchimpMailchimpTransactional.mailchimpMailchimpTransactionalStrings.mailchimp
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MessagesMessage extends StObject {
  
  /** Supported attachments to add to the message. */
  var attachments: js.UndefOr[js.Array[MessageAttachment]] = js.undefined
  
  /** Whether or not to automatically generate an HTML part for messages that are not given HTML. */
  var auto_html: js.UndefOr[Boolean] = js.undefined
  
  /** Whether or not to automatically generate a text part for messages that are not given text. */
  var auto_text: js.UndefOr[Boolean] = js.undefined
  
  /** An optional address to receive an exact copy of each recipient's email. */
  var bcc_address: js.UndefOr[String] = js.undefined
  
  /** The sender email address. */
  var from_email: js.UndefOr[String] = js.undefined
  
  /** Optional from name to be used. */
  var from_name: js.UndefOr[String] = js.undefined
  
  /** Global merge variables to use for all recipients. You can override these per recipient. */
  var global_merge_vars: js.UndefOr[js.Array[MergeVar]] = js.undefined
  
  /**
    * Optional string indicating the value to set for the utm_campaign tracking parameter.
    * If this isn't provided the emails from address will be used instead.
    */
  var google_analytics_campaign: js.UndefOr[String] = js.undefined
  
  /**
    * An array of strings indicating for which any matching URLs will automatically have
    * Google Analytics parameters appended to their query string automatically.
    */
  var google_analytics_domains: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Optional extra headers to add to the message (most headers are allowed). */
  var headers: js.UndefOr[Record[String, String]] = js.undefined
  
  /** The full HTML content to be sent. */
  var html: js.UndefOr[String] = js.undefined
  
  /** Embedded images to add to the message. */
  var images: js.UndefOr[js.Array[MessageImage]] = js.undefined
  
  /** Whether or not this message is important, and should be delivered ahead of non-important messages. */
  var important: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether or not to automatically inline all CSS styles provided in the message HTML -
    * only for HTML documents less than 256KB in size.
    */
  var inline_css: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether to evaluate merge tags in the message. Will automatically be set to `true`
    * if either `merge_vars` or `global_merge_vars` are provided.
    */
  var merge: js.UndefOr[Boolean] = js.undefined
  
  /** The merge tag language to use when evaluating merge tags. */
  var merge_language: js.UndefOr[mailchimp | handlebars] = js.undefined
  
  /** Per-recipient merge variables, which override global merge variables with the same name. */
  var merge_vars: js.UndefOr[js.Array[RecipientMergeVar]] = js.undefined
  
  /**
    * Mandrill will store this metadata and make it available for retrieval.
    * In addition, you can select up to 10 metadata fields to index and make searchable
    * using the Mandrill search api.
    */
  var metadata: js.UndefOr[MessageMetadatawebsitestr] = js.undefined
  
  /** Whether or not to expose all recipients in to "To" header for each email. */
  var preserve_recipients: js.UndefOr[Boolean] = js.undefined
  
  /** Per-recipient metadata that will override the global values specified in the `metadata` parameter. */
  var recipient_metadata: js.UndefOr[js.Array[MessageRecipientMetadata]] = js.undefined
  
  /** A custom domain to use for the messages's return-path. */
  var return_path_domain: js.UndefOr[String] = js.undefined
  
  /**
    * A custom domain to use for SPF/DKIM signing instead of mandrill
    * (for "via" or "on behalf of" in email clients).
    */
  var signing_domain: js.UndefOr[String] = js.undefined
  
  /** The unique id of a subaccount for this message - must already exist or will fail with an error. */
  var subaccount: js.UndefOr[String] = js.undefined
  
  /** The message subject. */
  var subject: js.UndefOr[String] = js.undefined
  
  /**
    * An array of string to tag the message with. Stats are accumulated using tags,
    * though we only store the first 100 we see, so this should not be unique or change frequently.
    * Tags should be 50 characters or less. Any tags starting with an underscore are reserved for
    * internal use and will cause errors.
    */
  var tags: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Optional full text content to be sent. */
  var text: js.UndefOr[String] = js.undefined
  
  /** An array of recipient information. */
  var to: js.Array[MessageRecipient]
  
  /** Whether or not to turn on click tracking for the message. */
  var track_clicks: js.UndefOr[Boolean] = js.undefined
  
  /** Whether or not to turn on open tracking for the message. */
  var track_opens: js.UndefOr[Boolean] = js.undefined
  
  /** A custom domain to use for tracking opens and clicks instead of mandrillapp.com. */
  var tracking_domain: js.UndefOr[String] = js.undefined
  
  /** Whether or not to strip the query string from URLs when aggregating tracked URL data. */
  var url_strip_qs: js.UndefOr[Boolean] = js.undefined
  
  /** Set to `false` to remove content logging for sensitive emails. */
  var view_content_link: js.UndefOr[Boolean] = js.undefined
}
object MessagesMessage {
  
  inline def apply(to: js.Array[MessageRecipient]): MessagesMessage = {
    val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessagesMessage]
  }
  
  extension [Self <: MessagesMessage](x: Self) {
    
    inline def setAttachments(value: js.Array[MessageAttachment]): Self = StObject.set(x, "attachments", value.asInstanceOf[js.Any])
    
    inline def setAttachmentsUndefined: Self = StObject.set(x, "attachments", js.undefined)
    
    inline def setAttachmentsVarargs(value: MessageAttachment*): Self = StObject.set(x, "attachments", js.Array(value*))
    
    inline def setAuto_html(value: Boolean): Self = StObject.set(x, "auto_html", value.asInstanceOf[js.Any])
    
    inline def setAuto_htmlUndefined: Self = StObject.set(x, "auto_html", js.undefined)
    
    inline def setAuto_text(value: Boolean): Self = StObject.set(x, "auto_text", value.asInstanceOf[js.Any])
    
    inline def setAuto_textUndefined: Self = StObject.set(x, "auto_text", js.undefined)
    
    inline def setBcc_address(value: String): Self = StObject.set(x, "bcc_address", value.asInstanceOf[js.Any])
    
    inline def setBcc_addressUndefined: Self = StObject.set(x, "bcc_address", js.undefined)
    
    inline def setFrom_email(value: String): Self = StObject.set(x, "from_email", value.asInstanceOf[js.Any])
    
    inline def setFrom_emailUndefined: Self = StObject.set(x, "from_email", js.undefined)
    
    inline def setFrom_name(value: String): Self = StObject.set(x, "from_name", value.asInstanceOf[js.Any])
    
    inline def setFrom_nameUndefined: Self = StObject.set(x, "from_name", js.undefined)
    
    inline def setGlobal_merge_vars(value: js.Array[MergeVar]): Self = StObject.set(x, "global_merge_vars", value.asInstanceOf[js.Any])
    
    inline def setGlobal_merge_varsUndefined: Self = StObject.set(x, "global_merge_vars", js.undefined)
    
    inline def setGlobal_merge_varsVarargs(value: MergeVar*): Self = StObject.set(x, "global_merge_vars", js.Array(value*))
    
    inline def setGoogle_analytics_campaign(value: String): Self = StObject.set(x, "google_analytics_campaign", value.asInstanceOf[js.Any])
    
    inline def setGoogle_analytics_campaignUndefined: Self = StObject.set(x, "google_analytics_campaign", js.undefined)
    
    inline def setGoogle_analytics_domains(value: js.Array[String]): Self = StObject.set(x, "google_analytics_domains", value.asInstanceOf[js.Any])
    
    inline def setGoogle_analytics_domainsUndefined: Self = StObject.set(x, "google_analytics_domains", js.undefined)
    
    inline def setGoogle_analytics_domainsVarargs(value: String*): Self = StObject.set(x, "google_analytics_domains", js.Array(value*))
    
    inline def setHeaders(value: Record[String, String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setHtml(value: String): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
    
    inline def setHtmlUndefined: Self = StObject.set(x, "html", js.undefined)
    
    inline def setImages(value: js.Array[MessageImage]): Self = StObject.set(x, "images", value.asInstanceOf[js.Any])
    
    inline def setImagesUndefined: Self = StObject.set(x, "images", js.undefined)
    
    inline def setImagesVarargs(value: MessageImage*): Self = StObject.set(x, "images", js.Array(value*))
    
    inline def setImportant(value: Boolean): Self = StObject.set(x, "important", value.asInstanceOf[js.Any])
    
    inline def setImportantUndefined: Self = StObject.set(x, "important", js.undefined)
    
    inline def setInline_css(value: Boolean): Self = StObject.set(x, "inline_css", value.asInstanceOf[js.Any])
    
    inline def setInline_cssUndefined: Self = StObject.set(x, "inline_css", js.undefined)
    
    inline def setMerge(value: Boolean): Self = StObject.set(x, "merge", value.asInstanceOf[js.Any])
    
    inline def setMergeUndefined: Self = StObject.set(x, "merge", js.undefined)
    
    inline def setMerge_language(value: mailchimp | handlebars): Self = StObject.set(x, "merge_language", value.asInstanceOf[js.Any])
    
    inline def setMerge_languageUndefined: Self = StObject.set(x, "merge_language", js.undefined)
    
    inline def setMerge_vars(value: js.Array[RecipientMergeVar]): Self = StObject.set(x, "merge_vars", value.asInstanceOf[js.Any])
    
    inline def setMerge_varsUndefined: Self = StObject.set(x, "merge_vars", js.undefined)
    
    inline def setMerge_varsVarargs(value: RecipientMergeVar*): Self = StObject.set(x, "merge_vars", js.Array(value*))
    
    inline def setMetadata(value: MessageMetadatawebsitestr): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setPreserve_recipients(value: Boolean): Self = StObject.set(x, "preserve_recipients", value.asInstanceOf[js.Any])
    
    inline def setPreserve_recipientsUndefined: Self = StObject.set(x, "preserve_recipients", js.undefined)
    
    inline def setRecipient_metadata(value: js.Array[MessageRecipientMetadata]): Self = StObject.set(x, "recipient_metadata", value.asInstanceOf[js.Any])
    
    inline def setRecipient_metadataUndefined: Self = StObject.set(x, "recipient_metadata", js.undefined)
    
    inline def setRecipient_metadataVarargs(value: MessageRecipientMetadata*): Self = StObject.set(x, "recipient_metadata", js.Array(value*))
    
    inline def setReturn_path_domain(value: String): Self = StObject.set(x, "return_path_domain", value.asInstanceOf[js.Any])
    
    inline def setReturn_path_domainUndefined: Self = StObject.set(x, "return_path_domain", js.undefined)
    
    inline def setSigning_domain(value: String): Self = StObject.set(x, "signing_domain", value.asInstanceOf[js.Any])
    
    inline def setSigning_domainUndefined: Self = StObject.set(x, "signing_domain", js.undefined)
    
    inline def setSubaccount(value: String): Self = StObject.set(x, "subaccount", value.asInstanceOf[js.Any])
    
    inline def setSubaccountUndefined: Self = StObject.set(x, "subaccount", js.undefined)
    
    inline def setSubject(value: String): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    inline def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
    
    inline def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value*))
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setTo(value: js.Array[MessageRecipient]): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    
    inline def setToVarargs(value: MessageRecipient*): Self = StObject.set(x, "to", js.Array(value*))
    
    inline def setTrack_clicks(value: Boolean): Self = StObject.set(x, "track_clicks", value.asInstanceOf[js.Any])
    
    inline def setTrack_clicksUndefined: Self = StObject.set(x, "track_clicks", js.undefined)
    
    inline def setTrack_opens(value: Boolean): Self = StObject.set(x, "track_opens", value.asInstanceOf[js.Any])
    
    inline def setTrack_opensUndefined: Self = StObject.set(x, "track_opens", js.undefined)
    
    inline def setTracking_domain(value: String): Self = StObject.set(x, "tracking_domain", value.asInstanceOf[js.Any])
    
    inline def setTracking_domainUndefined: Self = StObject.set(x, "tracking_domain", js.undefined)
    
    inline def setUrl_strip_qs(value: Boolean): Self = StObject.set(x, "url_strip_qs", value.asInstanceOf[js.Any])
    
    inline def setUrl_strip_qsUndefined: Self = StObject.set(x, "url_strip_qs", js.undefined)
    
    inline def setView_content_link(value: Boolean): Self = StObject.set(x, "view_content_link", value.asInstanceOf[js.Any])
    
    inline def setView_content_linkUndefined: Self = StObject.set(x, "view_content_link", js.undefined)
  }
}
