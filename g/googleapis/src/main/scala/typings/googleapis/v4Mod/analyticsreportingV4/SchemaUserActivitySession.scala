package typings.googleapis.v4Mod.analyticsreportingV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaUserActivitySession extends StObject {
  
  /**
    * Represents a detailed view into each of the activity in this session.
    */
  var activities: js.UndefOr[js.Array[SchemaActivity]] = js.undefined
  
  /**
    * The data source of a hit. By default, hits sent from analytics.js are reported as "web" and hits sent from the mobile SDKs are reported as "app". These values can be overridden in the Measurement Protocol.
    */
  var dataSource: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The type of device used: "mobile", "tablet" etc.
    */
  var deviceCategory: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Platform on which the activity happened: "android", "ios" etc.
    */
  var platform: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Date of this session in ISO-8601 format.
    */
  var sessionDate: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Unique ID of the session.
    */
  var sessionId: js.UndefOr[String | Null] = js.undefined
}
object SchemaUserActivitySession {
  
  inline def apply(): SchemaUserActivitySession = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUserActivitySession]
  }
  
  extension [Self <: SchemaUserActivitySession](x: Self) {
    
    inline def setActivities(value: js.Array[SchemaActivity]): Self = StObject.set(x, "activities", value.asInstanceOf[js.Any])
    
    inline def setActivitiesUndefined: Self = StObject.set(x, "activities", js.undefined)
    
    inline def setActivitiesVarargs(value: SchemaActivity*): Self = StObject.set(x, "activities", js.Array(value*))
    
    inline def setDataSource(value: String): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
    
    inline def setDataSourceNull: Self = StObject.set(x, "dataSource", null)
    
    inline def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
    
    inline def setDeviceCategory(value: String): Self = StObject.set(x, "deviceCategory", value.asInstanceOf[js.Any])
    
    inline def setDeviceCategoryNull: Self = StObject.set(x, "deviceCategory", null)
    
    inline def setDeviceCategoryUndefined: Self = StObject.set(x, "deviceCategory", js.undefined)
    
    inline def setPlatform(value: String): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    
    inline def setPlatformNull: Self = StObject.set(x, "platform", null)
    
    inline def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
    
    inline def setSessionDate(value: String): Self = StObject.set(x, "sessionDate", value.asInstanceOf[js.Any])
    
    inline def setSessionDateNull: Self = StObject.set(x, "sessionDate", null)
    
    inline def setSessionDateUndefined: Self = StObject.set(x, "sessionDate", js.undefined)
    
    inline def setSessionId(value: String): Self = StObject.set(x, "sessionId", value.asInstanceOf[js.Any])
    
    inline def setSessionIdNull: Self = StObject.set(x, "sessionId", null)
    
    inline def setSessionIdUndefined: Self = StObject.set(x, "sessionId", js.undefined)
  }
}
