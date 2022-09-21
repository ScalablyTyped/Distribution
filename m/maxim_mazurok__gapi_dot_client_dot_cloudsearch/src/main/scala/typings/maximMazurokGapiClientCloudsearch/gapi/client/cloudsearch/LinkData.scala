package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LinkData extends StObject {
  
  /**
    * An Attachment represents the structured entity to which we are linking. It contains an Embed (apps/tacotown/proto/embeds/embed_client.proto) with fields specific to the appropriate
    * type of linked entity. For example, if we are linking to a photo album, the Embed may include the album ID and gaia ID of the creator. Clients that understand the Embed type within
    * the Attachment may construct and/or decorate their link appropriately e.g. to make use of type-specific functionality or first-party integrations. The link_target and (if
    * appropriate) display_url fields must still be set even when an Attachment is present, so that clients who do not know how to interpret the Attachment can fall back to those fields,
    * and render the Segment as an ordinary web link. N.B. Even when an Attachment is present, the intention of a "LINK" Segment is for the Segment to be presented inline with the rest of
    * the text of a post or comment, with a clickable link or other UI suitable for inlining (though the client may modify the UI based on Attachment data, e.g. to add appropriate hovers,
    * icons, etc.). When an entity is intended to be rendered separately from the main body of the post/comment, a separate Attachment proto can be added outside the set of Segments. N.B.
    * Within the Attachment, fields of EmbedClientItem have their own visibility annotations, which should be enforced separately from Segment visibility annotations. See:
    * apps/tacotown/proto/embeds/embed_annotations.proto
    */
  var attachment: js.UndefOr[Attachment] = js.undefined
  
  /** The hint to use when rendering the associated attachment. Ignored if there is no associated attachment. */
  var attachmentRenderHint: js.UndefOr[String] = js.undefined
  
  /**
    * If we wish to show the user a different (e.g. shortened) version of the URL for display purposes, then that version should be set here. If this field isn't set, link_target will be
    * used for both purposes.
    */
  var displayUrl: js.UndefOr[String] = js.undefined
  
  /** link_target is the URL to navigate to when clicked. This could be the original URL, or a URL signed by the GWS URL signing service. */
  var linkTarget: js.UndefOr[String] = js.undefined
  
  /**
    * LinkType is an optional field that provides additional information regarding link target. For example, link type can be identified as the SELF_LINK when the request was executed
    * from the same link as the link target.
    */
  var linkType: js.UndefOr[String] = js.undefined
  
  /**
    * Title is an optional field that provides a short string that describes the link or its destination. User interfaces often use title as a tooltip or for accessibility purposes.
    * However, they are of course free to present this data in any form. This field is plain text.
    */
  var title: js.UndefOr[String] = js.undefined
}
object LinkData {
  
  inline def apply(): LinkData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LinkData]
  }
  
  extension [Self <: LinkData](x: Self) {
    
    inline def setAttachment(value: Attachment): Self = StObject.set(x, "attachment", value.asInstanceOf[js.Any])
    
    inline def setAttachmentRenderHint(value: String): Self = StObject.set(x, "attachmentRenderHint", value.asInstanceOf[js.Any])
    
    inline def setAttachmentRenderHintUndefined: Self = StObject.set(x, "attachmentRenderHint", js.undefined)
    
    inline def setAttachmentUndefined: Self = StObject.set(x, "attachment", js.undefined)
    
    inline def setDisplayUrl(value: String): Self = StObject.set(x, "displayUrl", value.asInstanceOf[js.Any])
    
    inline def setDisplayUrlUndefined: Self = StObject.set(x, "displayUrl", js.undefined)
    
    inline def setLinkTarget(value: String): Self = StObject.set(x, "linkTarget", value.asInstanceOf[js.Any])
    
    inline def setLinkTargetUndefined: Self = StObject.set(x, "linkTarget", js.undefined)
    
    inline def setLinkType(value: String): Self = StObject.set(x, "linkType", value.asInstanceOf[js.Any])
    
    inline def setLinkTypeUndefined: Self = StObject.set(x, "linkType", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
