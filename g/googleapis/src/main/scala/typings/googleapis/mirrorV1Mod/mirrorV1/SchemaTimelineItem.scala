package typings.googleapis.mirrorV1Mod.mirrorV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Each item in the user&#39;s timeline is represented as a TimelineItem JSON
  * structure, described below.
  */
trait SchemaTimelineItem extends StObject {
  
  /**
    * A list of media attachments associated with this item. As a convenience,
    * you can refer to attachments in your HTML payloads with the attachment or
    * cid scheme. For example:   - attachment: &lt;img
    * src=&quot;attachment:attachment_index&quot;&gt; where attachment_index is
    * the 0-based index of this array.  - cid: &lt;img
    * src=&quot;cid:attachment_id&quot;&gt; where attachment_id is the ID of
    * the attachment.
    */
  var attachments: js.UndefOr[js.Array[SchemaAttachment]] = js.undefined
  
  /**
    * The bundle ID for this item. Services can specify a bundleId to group
    * many items together. They appear under a single top-level item on the
    * device.
    */
  var bundleId: js.UndefOr[String] = js.undefined
  
  /**
    * A canonical URL pointing to the canonical/high quality version of the
    * data represented by the timeline item.
    */
  var canonicalUrl: js.UndefOr[String] = js.undefined
  
  /**
    * The time at which this item was created, formatted according to RFC 3339.
    */
  var created: js.UndefOr[String] = js.undefined
  
  /**
    * The user or group that created this item.
    */
  var creator: js.UndefOr[SchemaContact] = js.undefined
  
  /**
    * The time that should be displayed when this item is viewed in the
    * timeline, formatted according to RFC 3339. This user&#39;s timeline is
    * sorted chronologically on display time, so this will also determine where
    * the item is displayed in the timeline. If not set by the service, the
    * display time defaults to the updated time.
    */
  var displayTime: js.UndefOr[String] = js.undefined
  
  /**
    * ETag for this item.
    */
  var etag: js.UndefOr[String] = js.undefined
  
  /**
    * HTML content for this item. If both text and html are provided for an
    * item, the html will be rendered in the timeline. Allowed HTML elements -
    * You can use these elements in your timeline cards.   - Headers: h1, h2,
    * h3, h4, h5, h6  - Images: img  - Lists: li, ol, ul  - HTML5 semantics:
    * article, aside, details, figure, figcaption, footer, header, nav,
    * section, summary, time  - Structural: blockquote, br, div, hr, p, span  -
    * Style: b, big, center, em, i, u, s, small, strike, strong, style, sub,
    * sup  - Tables: table, tbody, td, tfoot, th, thead, tr   Blocked HTML
    * elements: These elements and their contents are removed from HTML
    * payloads.   - Document headers: head, title  - Embeds: audio, embed,
    * object, source, video  - Frames: frame, frameset  - Scripting: applet,
    * script   Other elements: Any elements that aren&#39;t listed are removed,
    * but their contents are preserved.
    */
  var html: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the timeline item. This is unique within a user&#39;s timeline.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * If this item was generated as a reply to another item, this field will be
    * set to the ID of the item being replied to. This can be used to attach a
    * reply to the appropriate conversation or post.
    */
  var inReplyTo: js.UndefOr[String] = js.undefined
  
  /**
    * Whether this item is a bundle cover.  If an item is marked as a bundle
    * cover, it will be the entry point to the bundle of items that have the
    * same bundleId as that item. It will be shown only on the main timeline —
    * not within the opened bundle.  On the main timeline, items that are shown
    * are:   - Items that have isBundleCover set to true   - Items that do not
    * have a bundleId  In a bundle sub-timeline, items that are shown are:   -
    * Items that have the bundleId in question AND isBundleCover set to false
    */
  var isBundleCover: js.UndefOr[Boolean] = js.undefined
  
  /**
    * When true, indicates this item is deleted, and only the ID property is
    * set.
    */
  var isDeleted: js.UndefOr[Boolean] = js.undefined
  
  /**
    * When true, indicates this item is pinned, which means it&#39;s grouped
    * alongside &quot;active&quot; items like navigation and hangouts, on the
    * opposite side of the home screen from historical (non-pinned) timeline
    * items. You can allow the user to toggle the value of this property with
    * the TOGGLE_PINNED built-in menu item.
    */
  var isPinned: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The type of resource. This is always mirror#timelineItem.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * The geographic location associated with this item.
    */
  var location: js.UndefOr[SchemaLocation] = js.undefined
  
  /**
    * A list of menu items that will be presented to the user when this item is
    * selected in the timeline.
    */
  var menuItems: js.UndefOr[js.Array[SchemaMenuItem]] = js.undefined
  
  /**
    * Controls how notifications for this item are presented on the device. If
    * this is missing, no notification will be generated.
    */
  var notification: js.UndefOr[SchemaNotificationConfig] = js.undefined
  
  /**
    * For pinned items, this determines the order in which the item is
    * displayed in the timeline, with a higher score appearing closer to the
    * clock. Note: setting this field is currently not supported.
    */
  var pinScore: js.UndefOr[Double] = js.undefined
  
  /**
    * A list of users or groups that this item has been shared with.
    */
  var recipients: js.UndefOr[js.Array[SchemaContact]] = js.undefined
  
  /**
    * A URL that can be used to retrieve this item.
    */
  var selfLink: js.UndefOr[String] = js.undefined
  
  /**
    * Opaque string you can use to map a timeline item to data in your own
    * service.
    */
  var sourceItemId: js.UndefOr[String] = js.undefined
  
  /**
    * The speakable version of the content of this item. Along with the
    * READ_ALOUD menu item, use this field to provide text that would be
    * clearer when read aloud, or to provide extended information to what is
    * displayed visually on Glass.  Glassware should also specify the
    * speakableType field, which will be spoken before this text in cases where
    * the additional context is useful, for example when the user requests that
    * the item be read aloud following a notification.
    */
  var speakableText: js.UndefOr[String] = js.undefined
  
  /**
    * A speakable description of the type of this item. This will be announced
    * to the user prior to reading the content of the item in cases where the
    * additional context is useful, for example when the user requests that the
    * item be read aloud following a notification.  This should be a short,
    * simple noun phrase such as &quot;Email&quot;, &quot;Text message&quot;,
    * or &quot;Daily Planet News Update&quot;.  Glassware are encouraged to
    * populate this field for every timeline item, even if the item does not
    * contain speakableText or text so that the user can learn the type of the
    * item without looking at the screen.
    */
  var speakableType: js.UndefOr[String] = js.undefined
  
  /**
    * Text content of this item.
    */
  var text: js.UndefOr[String] = js.undefined
  
  /**
    * The title of this item.
    */
  var title: js.UndefOr[String] = js.undefined
  
  /**
    * The time at which this item was last modified, formatted according to RFC
    * 3339.
    */
  var updated: js.UndefOr[String] = js.undefined
}
object SchemaTimelineItem {
  
  @scala.inline
  def apply(): SchemaTimelineItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTimelineItem]
  }
  
  @scala.inline
  implicit class SchemaTimelineItemMutableBuilder[Self <: SchemaTimelineItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttachments(value: js.Array[SchemaAttachment]): Self = StObject.set(x, "attachments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttachmentsUndefined: Self = StObject.set(x, "attachments", js.undefined)
    
    @scala.inline
    def setAttachmentsVarargs(value: SchemaAttachment*): Self = StObject.set(x, "attachments", js.Array(value :_*))
    
    @scala.inline
    def setBundleId(value: String): Self = StObject.set(x, "bundleId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBundleIdUndefined: Self = StObject.set(x, "bundleId", js.undefined)
    
    @scala.inline
    def setCanonicalUrl(value: String): Self = StObject.set(x, "canonicalUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanonicalUrlUndefined: Self = StObject.set(x, "canonicalUrl", js.undefined)
    
    @scala.inline
    def setCreated(value: String): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedUndefined: Self = StObject.set(x, "created", js.undefined)
    
    @scala.inline
    def setCreator(value: SchemaContact): Self = StObject.set(x, "creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatorUndefined: Self = StObject.set(x, "creator", js.undefined)
    
    @scala.inline
    def setDisplayTime(value: String): Self = StObject.set(x, "displayTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayTimeUndefined: Self = StObject.set(x, "displayTime", js.undefined)
    
    @scala.inline
    def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    @scala.inline
    def setHtml(value: String): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHtmlUndefined: Self = StObject.set(x, "html", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setInReplyTo(value: String): Self = StObject.set(x, "inReplyTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInReplyToUndefined: Self = StObject.set(x, "inReplyTo", js.undefined)
    
    @scala.inline
    def setIsBundleCover(value: Boolean): Self = StObject.set(x, "isBundleCover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsBundleCoverUndefined: Self = StObject.set(x, "isBundleCover", js.undefined)
    
    @scala.inline
    def setIsDeleted(value: Boolean): Self = StObject.set(x, "isDeleted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsDeletedUndefined: Self = StObject.set(x, "isDeleted", js.undefined)
    
    @scala.inline
    def setIsPinned(value: Boolean): Self = StObject.set(x, "isPinned", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsPinnedUndefined: Self = StObject.set(x, "isPinned", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setLocation(value: SchemaLocation): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    @scala.inline
    def setMenuItems(value: js.Array[SchemaMenuItem]): Self = StObject.set(x, "menuItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMenuItemsUndefined: Self = StObject.set(x, "menuItems", js.undefined)
    
    @scala.inline
    def setMenuItemsVarargs(value: SchemaMenuItem*): Self = StObject.set(x, "menuItems", js.Array(value :_*))
    
    @scala.inline
    def setNotification(value: SchemaNotificationConfig): Self = StObject.set(x, "notification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotificationUndefined: Self = StObject.set(x, "notification", js.undefined)
    
    @scala.inline
    def setPinScore(value: Double): Self = StObject.set(x, "pinScore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPinScoreUndefined: Self = StObject.set(x, "pinScore", js.undefined)
    
    @scala.inline
    def setRecipients(value: js.Array[SchemaContact]): Self = StObject.set(x, "recipients", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecipientsUndefined: Self = StObject.set(x, "recipients", js.undefined)
    
    @scala.inline
    def setRecipientsVarargs(value: SchemaContact*): Self = StObject.set(x, "recipients", js.Array(value :_*))
    
    @scala.inline
    def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
    
    @scala.inline
    def setSourceItemId(value: String): Self = StObject.set(x, "sourceItemId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceItemIdUndefined: Self = StObject.set(x, "sourceItemId", js.undefined)
    
    @scala.inline
    def setSpeakableText(value: String): Self = StObject.set(x, "speakableText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpeakableTextUndefined: Self = StObject.set(x, "speakableText", js.undefined)
    
    @scala.inline
    def setSpeakableType(value: String): Self = StObject.set(x, "speakableType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpeakableTypeUndefined: Self = StObject.set(x, "speakableType", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setUpdated(value: String): Self = StObject.set(x, "updated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatedUndefined: Self = StObject.set(x, "updated", js.undefined)
  }
}
