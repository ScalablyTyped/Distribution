package typings.googleapis.fcmV1Mod.fcmV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaWebpushConfig extends StObject {
  
  /**
    * Arbitrary key/value payload. If present, it will override google.firebase.fcm.v1.Message.data.
    */
  var data: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * Options for features provided by the FCM SDK for Web.
    */
  var fcmOptions: js.UndefOr[SchemaWebpushFcmOptions] = js.undefined
  
  /**
    * HTTP headers defined in webpush protocol. Refer to [Webpush protocol](https://tools.ietf.org/html/rfc8030#section-5) for supported headers, e.g. "TTL": "15".
    */
  var headers: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * Web Notification options as a JSON object. Supports Notification instance properties as defined in [Web Notification API](https://developer.mozilla.org/en-US/docs/Web/API/Notification). If present, "title" and "body" fields override [google.firebase.fcm.v1.Notification.title] and [google.firebase.fcm.v1.Notification.body].
    */
  var notification: js.UndefOr[StringDictionary[Any] | Null] = js.undefined
}
object SchemaWebpushConfig {
  
  inline def apply(): SchemaWebpushConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaWebpushConfig]
  }
  
  extension [Self <: SchemaWebpushConfig](x: Self) {
    
    inline def setData(value: StringDictionary[String]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataNull: Self = StObject.set(x, "data", null)
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setFcmOptions(value: SchemaWebpushFcmOptions): Self = StObject.set(x, "fcmOptions", value.asInstanceOf[js.Any])
    
    inline def setFcmOptionsUndefined: Self = StObject.set(x, "fcmOptions", js.undefined)
    
    inline def setHeaders(value: StringDictionary[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersNull: Self = StObject.set(x, "headers", null)
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setNotification(value: StringDictionary[Any]): Self = StObject.set(x, "notification", value.asInstanceOf[js.Any])
    
    inline def setNotificationNull: Self = StObject.set(x, "notification", null)
    
    inline def setNotificationUndefined: Self = StObject.set(x, "notification", js.undefined)
  }
}
