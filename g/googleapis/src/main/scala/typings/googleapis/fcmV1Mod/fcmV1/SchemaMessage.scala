package typings.googleapis.fcmV1Mod.fcmV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaMessage extends StObject {
  
  /**
    * Input only. Android specific options for messages sent through [FCM connection server](https://goo.gl/4GLdUl).
    */
  var android: js.UndefOr[SchemaAndroidConfig] = js.undefined
  
  /**
    * Input only. [Apple Push Notification Service](https://goo.gl/MXRTPa) specific options.
    */
  var apns: js.UndefOr[SchemaApnsConfig] = js.undefined
  
  /**
    * Condition to send a message to, e.g. "'foo' in topics && 'bar' in topics".
    */
  var condition: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Input only. Arbitrary key/value payload, which must be UTF-8 encoded. The key should not be a reserved word ("from", "message_type", or any word starting with "google" or "gcm"). When sending payloads containing only data fields to iOS devices, only normal priority (`"apns-priority": "5"`) is allowed in [`ApnsConfig`](/docs/reference/fcm/rest/v1/projects.messages#apnsconfig).
    */
  var data: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * Input only. Template for FCM SDK feature options to use across all platforms.
    */
  var fcmOptions: js.UndefOr[SchemaFcmOptions] = js.undefined
  
  /**
    * Output Only. The identifier of the message sent, in the format of `projects/x/messages/{message_id\}`.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Input only. Basic notification template to use across all platforms.
    */
  var notification: js.UndefOr[SchemaNotification] = js.undefined
  
  /**
    * Registration token to send a message to.
    */
  var token: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Topic name to send a message to, e.g. "weather". Note: "/topics/" prefix should not be provided.
    */
  var topic: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Input only. [Webpush protocol](https://tools.ietf.org/html/rfc8030) options.
    */
  var webpush: js.UndefOr[SchemaWebpushConfig] = js.undefined
}
object SchemaMessage {
  
  inline def apply(): SchemaMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMessage]
  }
  
  extension [Self <: SchemaMessage](x: Self) {
    
    inline def setAndroid(value: SchemaAndroidConfig): Self = StObject.set(x, "android", value.asInstanceOf[js.Any])
    
    inline def setAndroidUndefined: Self = StObject.set(x, "android", js.undefined)
    
    inline def setApns(value: SchemaApnsConfig): Self = StObject.set(x, "apns", value.asInstanceOf[js.Any])
    
    inline def setApnsUndefined: Self = StObject.set(x, "apns", js.undefined)
    
    inline def setCondition(value: String): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
    
    inline def setConditionNull: Self = StObject.set(x, "condition", null)
    
    inline def setConditionUndefined: Self = StObject.set(x, "condition", js.undefined)
    
    inline def setData(value: StringDictionary[String]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataNull: Self = StObject.set(x, "data", null)
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setFcmOptions(value: SchemaFcmOptions): Self = StObject.set(x, "fcmOptions", value.asInstanceOf[js.Any])
    
    inline def setFcmOptionsUndefined: Self = StObject.set(x, "fcmOptions", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNotification(value: SchemaNotification): Self = StObject.set(x, "notification", value.asInstanceOf[js.Any])
    
    inline def setNotificationUndefined: Self = StObject.set(x, "notification", js.undefined)
    
    inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    
    inline def setTokenNull: Self = StObject.set(x, "token", null)
    
    inline def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
    
    inline def setTopic(value: String): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
    
    inline def setTopicNull: Self = StObject.set(x, "topic", null)
    
    inline def setTopicUndefined: Self = StObject.set(x, "topic", js.undefined)
    
    inline def setWebpush(value: SchemaWebpushConfig): Self = StObject.set(x, "webpush", value.asInstanceOf[js.Any])
    
    inline def setWebpushUndefined: Self = StObject.set(x, "webpush", js.undefined)
  }
}
