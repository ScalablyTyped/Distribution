package typings.googleapis.fcmV1Mod.fcmV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAndroidConfig extends StObject {
  
  /**
    * An identifier of a group of messages that can be collapsed, so that only the last message gets sent when delivery can be resumed. A maximum of 4 different collapse keys is allowed at any given time.
    */
  var collapseKey: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Arbitrary key/value payload. If present, it will override google.firebase.fcm.v1.Message.data.
    */
  var data: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * If set to true, messages will be allowed to be delivered to the app while the device is in direct boot mode. See [Support Direct Boot mode](https://developer.android.com/training/articles/direct-boot).
    */
  var directBootOk: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Options for features provided by the FCM SDK for Android.
    */
  var fcmOptions: js.UndefOr[SchemaAndroidFcmOptions] = js.undefined
  
  /**
    * Notification to send to android devices.
    */
  var notification: js.UndefOr[SchemaAndroidNotification] = js.undefined
  
  /**
    * Message priority. Can take "normal" and "high" values. For more information, see [Setting the priority of a message](https://goo.gl/GjONJv).
    */
  var priority: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Package name of the application where the registration token must match in order to receive the message.
    */
  var restrictedPackageName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * How long (in seconds) the message should be kept in FCM storage if the device is offline. The maximum time to live supported is 4 weeks, and the default value is 4 weeks if not set. Set it to 0 if want to send the message immediately. In JSON format, the Duration type is encoded as a string rather than an object, where the string ends in the suffix "s" (indicating seconds) and is preceded by the number of seconds, with nanoseconds expressed as fractional seconds. For example, 3 seconds with 0 nanoseconds should be encoded in JSON format as "3s", while 3 seconds and 1 nanosecond should be expressed in JSON format as "3.000000001s". The ttl will be rounded down to the nearest second.
    */
  var ttl: js.UndefOr[String | Null] = js.undefined
}
object SchemaAndroidConfig {
  
  inline def apply(): SchemaAndroidConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAndroidConfig]
  }
  
  extension [Self <: SchemaAndroidConfig](x: Self) {
    
    inline def setCollapseKey(value: String): Self = StObject.set(x, "collapseKey", value.asInstanceOf[js.Any])
    
    inline def setCollapseKeyNull: Self = StObject.set(x, "collapseKey", null)
    
    inline def setCollapseKeyUndefined: Self = StObject.set(x, "collapseKey", js.undefined)
    
    inline def setData(value: StringDictionary[String]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataNull: Self = StObject.set(x, "data", null)
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setDirectBootOk(value: Boolean): Self = StObject.set(x, "directBootOk", value.asInstanceOf[js.Any])
    
    inline def setDirectBootOkNull: Self = StObject.set(x, "directBootOk", null)
    
    inline def setDirectBootOkUndefined: Self = StObject.set(x, "directBootOk", js.undefined)
    
    inline def setFcmOptions(value: SchemaAndroidFcmOptions): Self = StObject.set(x, "fcmOptions", value.asInstanceOf[js.Any])
    
    inline def setFcmOptionsUndefined: Self = StObject.set(x, "fcmOptions", js.undefined)
    
    inline def setNotification(value: SchemaAndroidNotification): Self = StObject.set(x, "notification", value.asInstanceOf[js.Any])
    
    inline def setNotificationUndefined: Self = StObject.set(x, "notification", js.undefined)
    
    inline def setPriority(value: String): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    inline def setPriorityNull: Self = StObject.set(x, "priority", null)
    
    inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    
    inline def setRestrictedPackageName(value: String): Self = StObject.set(x, "restrictedPackageName", value.asInstanceOf[js.Any])
    
    inline def setRestrictedPackageNameNull: Self = StObject.set(x, "restrictedPackageName", null)
    
    inline def setRestrictedPackageNameUndefined: Self = StObject.set(x, "restrictedPackageName", js.undefined)
    
    inline def setTtl(value: String): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
    
    inline def setTtlNull: Self = StObject.set(x, "ttl", null)
    
    inline def setTtlUndefined: Self = StObject.set(x, "ttl", js.undefined)
  }
}
