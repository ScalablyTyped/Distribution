package typings.googleapis.v1alphaMod.analyticsadminV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleAnalyticsAdminV1alphaDataRetentionSettings extends StObject {
  
  /**
    * The length of time that event-level data is retained.
    */
  var eventDataRetention: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Resource name for this DataRetentionSetting resource. Format: properties/{property\}/dataRetentionSettings
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * If true, reset the retention period for the user identifier with every event from that user.
    */
  var resetUserDataOnNewActivity: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaGoogleAnalyticsAdminV1alphaDataRetentionSettings {
  
  inline def apply(): SchemaGoogleAnalyticsAdminV1alphaDataRetentionSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleAnalyticsAdminV1alphaDataRetentionSettings]
  }
  
  extension [Self <: SchemaGoogleAnalyticsAdminV1alphaDataRetentionSettings](x: Self) {
    
    inline def setEventDataRetention(value: String): Self = StObject.set(x, "eventDataRetention", value.asInstanceOf[js.Any])
    
    inline def setEventDataRetentionNull: Self = StObject.set(x, "eventDataRetention", null)
    
    inline def setEventDataRetentionUndefined: Self = StObject.set(x, "eventDataRetention", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setResetUserDataOnNewActivity(value: Boolean): Self = StObject.set(x, "resetUserDataOnNewActivity", value.asInstanceOf[js.Any])
    
    inline def setResetUserDataOnNewActivityNull: Self = StObject.set(x, "resetUserDataOnNewActivity", null)
    
    inline def setResetUserDataOnNewActivityUndefined: Self = StObject.set(x, "resetUserDataOnNewActivity", js.undefined)
  }
}
