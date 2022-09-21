package typings.googleapis.fcmV1Mod.fcmV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaWebpushFcmOptions extends StObject {
  
  /**
    * Label associated with the message's analytics data.
    */
  var analyticsLabel: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The link to open when the user clicks on the notification. For all URL values, HTTPS is required.
    */
  var link: js.UndefOr[String | Null] = js.undefined
}
object SchemaWebpushFcmOptions {
  
  inline def apply(): SchemaWebpushFcmOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaWebpushFcmOptions]
  }
  
  extension [Self <: SchemaWebpushFcmOptions](x: Self) {
    
    inline def setAnalyticsLabel(value: String): Self = StObject.set(x, "analyticsLabel", value.asInstanceOf[js.Any])
    
    inline def setAnalyticsLabelNull: Self = StObject.set(x, "analyticsLabel", null)
    
    inline def setAnalyticsLabelUndefined: Self = StObject.set(x, "analyticsLabel", js.undefined)
    
    inline def setLink(value: String): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
    
    inline def setLinkNull: Self = StObject.set(x, "link", null)
    
    inline def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
  }
}
