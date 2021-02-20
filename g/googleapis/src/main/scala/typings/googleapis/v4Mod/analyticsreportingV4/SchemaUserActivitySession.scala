package typings.googleapis.v4Mod.analyticsreportingV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This represents a user session performed on a specific device at a certain
  * time over a period of time.
  */
@js.native
trait SchemaUserActivitySession extends StObject {
  
  /**
    * Represents a detailed view into each of the activity in this session.
    */
  var activities: js.UndefOr[js.Array[SchemaActivity]] = js.native
  
  /**
    * The data source of a hit. By default, hits sent from analytics.js are
    * reported as &quot;web&quot; and hits sent from the mobile SDKs are
    * reported as &quot;app&quot;. These values can be overridden in the
    * Measurement Protocol.
    */
  var dataSource: js.UndefOr[String] = js.native
  
  /**
    * The type of device used: &quot;mobile&quot;, &quot;tablet&quot; etc.
    */
  var deviceCategory: js.UndefOr[String] = js.native
  
  /**
    * Platform on which the activity happened: &quot;android&quot;,
    * &quot;ios&quot; etc.
    */
  var platform: js.UndefOr[String] = js.native
  
  /**
    * Date of this session in ISO-8601 format.
    */
  var sessionDate: js.UndefOr[String] = js.native
  
  /**
    * Unique ID of the session.
    */
  var sessionId: js.UndefOr[String] = js.native
}
object SchemaUserActivitySession {
  
  @scala.inline
  def apply(): SchemaUserActivitySession = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUserActivitySession]
  }
  
  @scala.inline
  implicit class SchemaUserActivitySessionMutableBuilder[Self <: SchemaUserActivitySession] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActivities(value: js.Array[SchemaActivity]): Self = StObject.set(x, "activities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActivitiesUndefined: Self = StObject.set(x, "activities", js.undefined)
    
    @scala.inline
    def setActivitiesVarargs(value: SchemaActivity*): Self = StObject.set(x, "activities", js.Array(value :_*))
    
    @scala.inline
    def setDataSource(value: String): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
    
    @scala.inline
    def setDeviceCategory(value: String): Self = StObject.set(x, "deviceCategory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceCategoryUndefined: Self = StObject.set(x, "deviceCategory", js.undefined)
    
    @scala.inline
    def setPlatform(value: String): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
    
    @scala.inline
    def setSessionDate(value: String): Self = StObject.set(x, "sessionDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessionDateUndefined: Self = StObject.set(x, "sessionDate", js.undefined)
    
    @scala.inline
    def setSessionId(value: String): Self = StObject.set(x, "sessionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessionIdUndefined: Self = StObject.set(x, "sessionId", js.undefined)
  }
}
