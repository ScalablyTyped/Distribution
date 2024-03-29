package typings.googleapis.fitnessV1Mod.fitnessV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSession extends StObject {
  
  /**
    * Session active time. While start_time_millis and end_time_millis define the full session time, the active time can be shorter and specified by active_time_millis. If the inactive time during the session is known, it should also be inserted via a com.google.activity.segment data point with a STILL activity value
    */
  var activeTimeMillis: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The type of activity this session represents.
    */
  var activityType: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The application that created the session.
    */
  var application: js.UndefOr[SchemaApplication] = js.undefined
  
  /**
    * A description for this session.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * An end time, in milliseconds since epoch, inclusive.
    */
  var endTimeMillis: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A client-generated identifier that is unique across all sessions owned by this particular user.
    */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A timestamp that indicates when the session was last modified.
    */
  var modifiedTimeMillis: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A human readable name of the session.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A start time, in milliseconds since epoch, inclusive.
    */
  var startTimeMillis: js.UndefOr[String | Null] = js.undefined
}
object SchemaSession {
  
  inline def apply(): SchemaSession = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSession]
  }
  
  extension [Self <: SchemaSession](x: Self) {
    
    inline def setActiveTimeMillis(value: String): Self = StObject.set(x, "activeTimeMillis", value.asInstanceOf[js.Any])
    
    inline def setActiveTimeMillisNull: Self = StObject.set(x, "activeTimeMillis", null)
    
    inline def setActiveTimeMillisUndefined: Self = StObject.set(x, "activeTimeMillis", js.undefined)
    
    inline def setActivityType(value: Double): Self = StObject.set(x, "activityType", value.asInstanceOf[js.Any])
    
    inline def setActivityTypeNull: Self = StObject.set(x, "activityType", null)
    
    inline def setActivityTypeUndefined: Self = StObject.set(x, "activityType", js.undefined)
    
    inline def setApplication(value: SchemaApplication): Self = StObject.set(x, "application", value.asInstanceOf[js.Any])
    
    inline def setApplicationUndefined: Self = StObject.set(x, "application", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setEndTimeMillis(value: String): Self = StObject.set(x, "endTimeMillis", value.asInstanceOf[js.Any])
    
    inline def setEndTimeMillisNull: Self = StObject.set(x, "endTimeMillis", null)
    
    inline def setEndTimeMillisUndefined: Self = StObject.set(x, "endTimeMillis", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setModifiedTimeMillis(value: String): Self = StObject.set(x, "modifiedTimeMillis", value.asInstanceOf[js.Any])
    
    inline def setModifiedTimeMillisNull: Self = StObject.set(x, "modifiedTimeMillis", null)
    
    inline def setModifiedTimeMillisUndefined: Self = StObject.set(x, "modifiedTimeMillis", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setStartTimeMillis(value: String): Self = StObject.set(x, "startTimeMillis", value.asInstanceOf[js.Any])
    
    inline def setStartTimeMillisNull: Self = StObject.set(x, "startTimeMillis", null)
    
    inline def setStartTimeMillisUndefined: Self = StObject.set(x, "startTimeMillis", js.undefined)
  }
}
