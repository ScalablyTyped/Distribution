package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppsDynamiteV1ApiCompatV1Attachment extends StObject {
  
  /** Array of actions (currently only buttons). */
  var actions: js.UndefOr[js.Array[AppsDynamiteV1ApiCompatV1Action]] = js.undefined
  
  /** Undocumented - used in interactive button examples. The only valid value appears to be "default". */
  var attachment_type: js.UndefOr[String] = js.undefined
  
  /** Avatar URL for the user. */
  var author_icon: js.UndefOr[String] = js.undefined
  
  /** URL that the user name should link to. */
  var author_link: js.UndefOr[String] = js.undefined
  
  /** User name to display as the author of the message. */
  var author_name: js.UndefOr[String] = js.undefined
  
  /** Unique identifier for the collection of buttons within this attachment. Will be sent back to the action handler URL when a button is clicked. */
  var callback_id: js.UndefOr[String] = js.undefined
  
  /** A color "bar" to display to the left of the attachment. */
  var color: js.UndefOr[String] = js.undefined
  
  /** Fallback plain-text string for clients that don't support attachments. */
  var fallback: js.UndefOr[String] = js.undefined
  
  /** Columns of text inside the attachment body. */
  var fields: js.UndefOr[js.Array[AppsDynamiteV1ApiCompatV1Field]] = js.undefined
  
  /** A string displayed at the bottom of the attachment. */
  var footer: js.UndefOr[String] = js.undefined
  
  /** Avatar URL displayed to the left of the footer. */
  var footer_icon: js.UndefOr[String] = js.undefined
  
  /** URL of an image to display in an image chip. */
  var image_url: js.UndefOr[String] = js.undefined
  
  /** List of fields to apply formatting to. */
  var mrkdwn_in: js.UndefOr[js.Array[String]] = js.undefined
  
  /** A string to show above the attachment. */
  var pretext: js.UndefOr[String] = js.undefined
  
  /** Main text. */
  var text: js.UndefOr[String] = js.undefined
  
  /** URL of a thumbnail image to display to the right of the attachment body. */
  var thumb_url: js.UndefOr[String] = js.undefined
  
  /** Title string of this attachment. */
  var title: js.UndefOr[String] = js.undefined
  
  /** URL that the title string should link to. */
  var title_link: js.UndefOr[String] = js.undefined
  
  /** UNIX timestamp of the attachment. */
  var ts: js.UndefOr[Double] = js.undefined
}
object AppsDynamiteV1ApiCompatV1Attachment {
  
  inline def apply(): AppsDynamiteV1ApiCompatV1Attachment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppsDynamiteV1ApiCompatV1Attachment]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AppsDynamiteV1ApiCompatV1Attachment] (val x: Self) extends AnyVal {
    
    inline def setActions(value: js.Array[AppsDynamiteV1ApiCompatV1Action]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    inline def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
    
    inline def setActionsVarargs(value: AppsDynamiteV1ApiCompatV1Action*): Self = StObject.set(x, "actions", js.Array(value*))
    
    inline def setAttachment_type(value: String): Self = StObject.set(x, "attachment_type", value.asInstanceOf[js.Any])
    
    inline def setAttachment_typeUndefined: Self = StObject.set(x, "attachment_type", js.undefined)
    
    inline def setAuthor_icon(value: String): Self = StObject.set(x, "author_icon", value.asInstanceOf[js.Any])
    
    inline def setAuthor_iconUndefined: Self = StObject.set(x, "author_icon", js.undefined)
    
    inline def setAuthor_link(value: String): Self = StObject.set(x, "author_link", value.asInstanceOf[js.Any])
    
    inline def setAuthor_linkUndefined: Self = StObject.set(x, "author_link", js.undefined)
    
    inline def setAuthor_name(value: String): Self = StObject.set(x, "author_name", value.asInstanceOf[js.Any])
    
    inline def setAuthor_nameUndefined: Self = StObject.set(x, "author_name", js.undefined)
    
    inline def setCallback_id(value: String): Self = StObject.set(x, "callback_id", value.asInstanceOf[js.Any])
    
    inline def setCallback_idUndefined: Self = StObject.set(x, "callback_id", js.undefined)
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setFallback(value: String): Self = StObject.set(x, "fallback", value.asInstanceOf[js.Any])
    
    inline def setFallbackUndefined: Self = StObject.set(x, "fallback", js.undefined)
    
    inline def setFields(value: js.Array[AppsDynamiteV1ApiCompatV1Field]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setFieldsVarargs(value: AppsDynamiteV1ApiCompatV1Field*): Self = StObject.set(x, "fields", js.Array(value*))
    
    inline def setFooter(value: String): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
    
    inline def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
    
    inline def setFooter_icon(value: String): Self = StObject.set(x, "footer_icon", value.asInstanceOf[js.Any])
    
    inline def setFooter_iconUndefined: Self = StObject.set(x, "footer_icon", js.undefined)
    
    inline def setImage_url(value: String): Self = StObject.set(x, "image_url", value.asInstanceOf[js.Any])
    
    inline def setImage_urlUndefined: Self = StObject.set(x, "image_url", js.undefined)
    
    inline def setMrkdwn_in(value: js.Array[String]): Self = StObject.set(x, "mrkdwn_in", value.asInstanceOf[js.Any])
    
    inline def setMrkdwn_inUndefined: Self = StObject.set(x, "mrkdwn_in", js.undefined)
    
    inline def setMrkdwn_inVarargs(value: String*): Self = StObject.set(x, "mrkdwn_in", js.Array(value*))
    
    inline def setPretext(value: String): Self = StObject.set(x, "pretext", value.asInstanceOf[js.Any])
    
    inline def setPretextUndefined: Self = StObject.set(x, "pretext", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setThumb_url(value: String): Self = StObject.set(x, "thumb_url", value.asInstanceOf[js.Any])
    
    inline def setThumb_urlUndefined: Self = StObject.set(x, "thumb_url", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setTitle_link(value: String): Self = StObject.set(x, "title_link", value.asInstanceOf[js.Any])
    
    inline def setTitle_linkUndefined: Self = StObject.set(x, "title_link", js.undefined)
    
    inline def setTs(value: Double): Self = StObject.set(x, "ts", value.asInstanceOf[js.Any])
    
    inline def setTsUndefined: Self = StObject.set(x, "ts", js.undefined)
  }
}
