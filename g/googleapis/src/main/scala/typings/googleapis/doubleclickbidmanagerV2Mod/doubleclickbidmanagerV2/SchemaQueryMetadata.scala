package typings.googleapis.doubleclickbidmanagerV2Mod.doubleclickbidmanagerV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaQueryMetadata extends StObject {
  
  /**
    * Range of report data. All reports will be based on the same time zone as used by the advertiser.
    */
  var dataRange: js.UndefOr[SchemaDataRange] = js.undefined
  
  /**
    * Format of the generated report.
    */
  var format: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Whether to send an email notification when a report is ready. Defaults to false.
    */
  var sendNotification: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * List of email addresses which are sent email notifications when the report is finished. Separate from send_notification.
    */
  var shareEmailAddress: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Query title. It is used to name the reports generated from this query.
    */
  var title: js.UndefOr[String | Null] = js.undefined
}
object SchemaQueryMetadata {
  
  inline def apply(): SchemaQueryMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaQueryMetadata]
  }
  
  extension [Self <: SchemaQueryMetadata](x: Self) {
    
    inline def setDataRange(value: SchemaDataRange): Self = StObject.set(x, "dataRange", value.asInstanceOf[js.Any])
    
    inline def setDataRangeUndefined: Self = StObject.set(x, "dataRange", js.undefined)
    
    inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatNull: Self = StObject.set(x, "format", null)
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setSendNotification(value: Boolean): Self = StObject.set(x, "sendNotification", value.asInstanceOf[js.Any])
    
    inline def setSendNotificationNull: Self = StObject.set(x, "sendNotification", null)
    
    inline def setSendNotificationUndefined: Self = StObject.set(x, "sendNotification", js.undefined)
    
    inline def setShareEmailAddress(value: js.Array[String]): Self = StObject.set(x, "shareEmailAddress", value.asInstanceOf[js.Any])
    
    inline def setShareEmailAddressNull: Self = StObject.set(x, "shareEmailAddress", null)
    
    inline def setShareEmailAddressUndefined: Self = StObject.set(x, "shareEmailAddress", js.undefined)
    
    inline def setShareEmailAddressVarargs(value: String*): Self = StObject.set(x, "shareEmailAddress", js.Array(value*))
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleNull: Self = StObject.set(x, "title", null)
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
