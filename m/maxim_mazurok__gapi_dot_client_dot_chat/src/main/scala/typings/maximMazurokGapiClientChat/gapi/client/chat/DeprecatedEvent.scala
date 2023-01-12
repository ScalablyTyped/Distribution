package typings.maximMazurokGapiClientChat.gapi.client.chat

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeprecatedEvent extends StObject {
  
  /**
    * The form action data associated with an interactive card that was clicked. Only populated for CARD_CLICKED events. See the [Interactive Cards guide](/chat/how-tos/cards-onclick) for
    * more information.
    */
  var action: js.UndefOr[FormAction] = js.undefined
  
  /**
    * Represents information about the user's client, such as locale, host app, and platform. For Chat apps, `CommonEventObject` includes information submitted by users interacting with
    * [dialogs](https://developers.google.com/chat/how-tos/dialogs), like data entered on a card.
    */
  var common: js.UndefOr[CommonEventObject] = js.undefined
  
  /**
    * The URL the Chat app should redirect the user to after they have completed an authorization or configuration flow outside of Google Chat. See the [Authorizing access to 3p services
    * guide](/chat/how-tos/auth-3p) for more information.
    */
  var configCompleteRedirectUrl: js.UndefOr[String] = js.undefined
  
  /** The type of [dialog](https://developers.google.com/chat/how-tos/dialogs) event received. */
  var dialogEventType: js.UndefOr[String] = js.undefined
  
  /** The timestamp indicating when the event occurred. */
  var eventTime: js.UndefOr[String] = js.undefined
  
  /** True when the event is related to [dialogs](https://developers.google.com/chat/how-tos/dialogs). */
  var isDialogEvent: js.UndefOr[Boolean] = js.undefined
  
  /** The message that triggered the event, if applicable. */
  var message: js.UndefOr[Message] = js.undefined
  
  /** The space in which the event occurred. */
  var space: js.UndefOr[Space] = js.undefined
  
  /** The Chat app-defined key for the thread related to the event. See the thread_key field of the `spaces.message.create` request for more information. */
  var threadKey: js.UndefOr[String] = js.undefined
  
  /**
    * A secret value that legacy Chat apps can use to verify if a request is from Google. Google randomly generates the token, and its value remains static. You can obtain, revoke, or
    * regenerate the token from the [Chat API configuration page](https://console.cloud.google.com/apis/api/chat.googleapis.com/hangouts-chat) in the Google Cloud Console. Modern Chat
    * apps don't use this field. It is absent from API responses and the [Chat API configuration page](https://console.cloud.google.com/apis/api/chat.googleapis.com/hangouts-chat).
    */
  var token: js.UndefOr[String] = js.undefined
  
  /** The type of the event. */
  var `type`: js.UndefOr[String] = js.undefined
  
  /** The user that triggered the event. */
  var user: js.UndefOr[User] = js.undefined
}
object DeprecatedEvent {
  
  inline def apply(): DeprecatedEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeprecatedEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeprecatedEvent] (val x: Self) extends AnyVal {
    
    inline def setAction(value: FormAction): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def setCommon(value: CommonEventObject): Self = StObject.set(x, "common", value.asInstanceOf[js.Any])
    
    inline def setCommonUndefined: Self = StObject.set(x, "common", js.undefined)
    
    inline def setConfigCompleteRedirectUrl(value: String): Self = StObject.set(x, "configCompleteRedirectUrl", value.asInstanceOf[js.Any])
    
    inline def setConfigCompleteRedirectUrlUndefined: Self = StObject.set(x, "configCompleteRedirectUrl", js.undefined)
    
    inline def setDialogEventType(value: String): Self = StObject.set(x, "dialogEventType", value.asInstanceOf[js.Any])
    
    inline def setDialogEventTypeUndefined: Self = StObject.set(x, "dialogEventType", js.undefined)
    
    inline def setEventTime(value: String): Self = StObject.set(x, "eventTime", value.asInstanceOf[js.Any])
    
    inline def setEventTimeUndefined: Self = StObject.set(x, "eventTime", js.undefined)
    
    inline def setIsDialogEvent(value: Boolean): Self = StObject.set(x, "isDialogEvent", value.asInstanceOf[js.Any])
    
    inline def setIsDialogEventUndefined: Self = StObject.set(x, "isDialogEvent", js.undefined)
    
    inline def setMessage(value: Message): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setSpace(value: Space): Self = StObject.set(x, "space", value.asInstanceOf[js.Any])
    
    inline def setSpaceUndefined: Self = StObject.set(x, "space", js.undefined)
    
    inline def setThreadKey(value: String): Self = StObject.set(x, "threadKey", value.asInstanceOf[js.Any])
    
    inline def setThreadKeyUndefined: Self = StObject.set(x, "threadKey", js.undefined)
    
    inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    
    inline def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUser(value: User): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    inline def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
  }
}
