package typings.googleapis.fcmV1Mod.fcmV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaApnsFcmOptions extends StObject {
  
  /**
    * Label associated with the message's analytics data.
    */
  var analyticsLabel: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Contains the URL of an image that is going to be displayed in a notification. If present, it will override google.firebase.fcm.v1.Notification.image.
    */
  var image: js.UndefOr[String | Null] = js.undefined
}
object SchemaApnsFcmOptions {
  
  inline def apply(): SchemaApnsFcmOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaApnsFcmOptions]
  }
  
  extension [Self <: SchemaApnsFcmOptions](x: Self) {
    
    inline def setAnalyticsLabel(value: String): Self = StObject.set(x, "analyticsLabel", value.asInstanceOf[js.Any])
    
    inline def setAnalyticsLabelNull: Self = StObject.set(x, "analyticsLabel", null)
    
    inline def setAnalyticsLabelUndefined: Self = StObject.set(x, "analyticsLabel", js.undefined)
    
    inline def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setImageNull: Self = StObject.set(x, "image", null)
    
    inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
  }
}
