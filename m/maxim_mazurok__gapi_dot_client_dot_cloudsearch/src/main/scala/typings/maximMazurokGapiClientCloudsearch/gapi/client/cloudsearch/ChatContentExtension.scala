package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChatContentExtension extends StObject {
  
  /** Annotations to decorate this event. */
  var annotation: js.UndefOr[js.Array[EventAnnotation]] = js.undefined
  
  /**
    * This metadata informs how the placeholder string will be localized dynamically in Hangouts. See go/localization-of-system-messages. This is only used as part of REGULAR_CHAT_MESSAGE
    * events.
    */
  var dynamitePlaceholderMetadata: js.UndefOr[DynamitePlaceholderMetadata] = js.undefined
  
  /** Is this event OnTR or OffTR? Since some events can be ON_THE_RECORD and have an expiration_timestamp (for example enterprise retention users) we need to store the otr status. */
  var eventOtrStatus: js.UndefOr[String] = js.undefined
  
  /** Group-link sharing toggle event. */
  var groupLinkSharingModificationEvent: js.UndefOr[GroupLinkSharingModificationEvent] = js.undefined
  
  /** Audio/video Hangout event. */
  var hangoutEvent: js.UndefOr[HangoutEvent] = js.undefined
  
  /** Invite accepted events. Note: this is only used ephemerally to sync to Gmail. No actual cent is stored in Papyrus. */
  var inviteAcceptedEvent: js.UndefOr[InviteAcceptedEvent] = js.undefined
  
  /** Join/leave events. */
  var membershipChangeEvent: js.UndefOr[MembershipChangeEvent] = js.undefined
  
  /** Metadata for off-the-record message. */
  var otrChatMessageEvent: js.UndefOr[OtrChatMessageEvent] = js.undefined
  
  var otrModificationEvent: js.UndefOr[OtrModificationEvent] = js.undefined
  
  var renameEvent: js.UndefOr[RenameEvent] = js.undefined
}
object ChatContentExtension {
  
  inline def apply(): ChatContentExtension = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChatContentExtension]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChatContentExtension] (val x: Self) extends AnyVal {
    
    inline def setAnnotation(value: js.Array[EventAnnotation]): Self = StObject.set(x, "annotation", value.asInstanceOf[js.Any])
    
    inline def setAnnotationUndefined: Self = StObject.set(x, "annotation", js.undefined)
    
    inline def setAnnotationVarargs(value: EventAnnotation*): Self = StObject.set(x, "annotation", js.Array(value*))
    
    inline def setDynamitePlaceholderMetadata(value: DynamitePlaceholderMetadata): Self = StObject.set(x, "dynamitePlaceholderMetadata", value.asInstanceOf[js.Any])
    
    inline def setDynamitePlaceholderMetadataUndefined: Self = StObject.set(x, "dynamitePlaceholderMetadata", js.undefined)
    
    inline def setEventOtrStatus(value: String): Self = StObject.set(x, "eventOtrStatus", value.asInstanceOf[js.Any])
    
    inline def setEventOtrStatusUndefined: Self = StObject.set(x, "eventOtrStatus", js.undefined)
    
    inline def setGroupLinkSharingModificationEvent(value: GroupLinkSharingModificationEvent): Self = StObject.set(x, "groupLinkSharingModificationEvent", value.asInstanceOf[js.Any])
    
    inline def setGroupLinkSharingModificationEventUndefined: Self = StObject.set(x, "groupLinkSharingModificationEvent", js.undefined)
    
    inline def setHangoutEvent(value: HangoutEvent): Self = StObject.set(x, "hangoutEvent", value.asInstanceOf[js.Any])
    
    inline def setHangoutEventUndefined: Self = StObject.set(x, "hangoutEvent", js.undefined)
    
    inline def setInviteAcceptedEvent(value: InviteAcceptedEvent): Self = StObject.set(x, "inviteAcceptedEvent", value.asInstanceOf[js.Any])
    
    inline def setInviteAcceptedEventUndefined: Self = StObject.set(x, "inviteAcceptedEvent", js.undefined)
    
    inline def setMembershipChangeEvent(value: MembershipChangeEvent): Self = StObject.set(x, "membershipChangeEvent", value.asInstanceOf[js.Any])
    
    inline def setMembershipChangeEventUndefined: Self = StObject.set(x, "membershipChangeEvent", js.undefined)
    
    inline def setOtrChatMessageEvent(value: OtrChatMessageEvent): Self = StObject.set(x, "otrChatMessageEvent", value.asInstanceOf[js.Any])
    
    inline def setOtrChatMessageEventUndefined: Self = StObject.set(x, "otrChatMessageEvent", js.undefined)
    
    inline def setOtrModificationEvent(value: OtrModificationEvent): Self = StObject.set(x, "otrModificationEvent", value.asInstanceOf[js.Any])
    
    inline def setOtrModificationEventUndefined: Self = StObject.set(x, "otrModificationEvent", js.undefined)
    
    inline def setRenameEvent(value: RenameEvent): Self = StObject.set(x, "renameEvent", value.asInstanceOf[js.Any])
    
    inline def setRenameEventUndefined: Self = StObject.set(x, "renameEvent", js.undefined)
  }
}
