package typings.googleapis.fitnessV1Mod.fitnessV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Sessions contain metadata, such as a user-friendly name and time interval
  * information.
  */
trait SchemaSession extends StObject {
  
  /**
    * Session active time. While start_time_millis and end_time_millis define
    * the full session time, the active time can be shorter and specified by
    * active_time_millis. If the inactive time during the session is known, it
    * should also be inserted via a com.google.activity.segment data point with
    * a STILL activity value
    */
  var activeTimeMillis: js.UndefOr[String] = js.undefined
  
  /**
    * The type of activity this session represents.
    */
  var activityType: js.UndefOr[Double] = js.undefined
  
  /**
    * The application that created the session.
    */
  var application: js.UndefOr[SchemaApplication] = js.undefined
  
  /**
    * A description for this session.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * An end time, in milliseconds since epoch, inclusive.
    */
  var endTimeMillis: js.UndefOr[String] = js.undefined
  
  /**
    * A client-generated identifier that is unique across all sessions owned by
    * this particular user.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * A timestamp that indicates when the session was last modified.
    */
  var modifiedTimeMillis: js.UndefOr[String] = js.undefined
  
  /**
    * A human readable name of the session.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * A start time, in milliseconds since epoch, inclusive.
    */
  var startTimeMillis: js.UndefOr[String] = js.undefined
}
object SchemaSession {
  
  @scala.inline
  def apply(): SchemaSession = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSession]
  }
  
  @scala.inline
  implicit class SchemaSessionMutableBuilder[Self <: SchemaSession] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActiveTimeMillis(value: String): Self = StObject.set(x, "activeTimeMillis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveTimeMillisUndefined: Self = StObject.set(x, "activeTimeMillis", js.undefined)
    
    @scala.inline
    def setActivityType(value: Double): Self = StObject.set(x, "activityType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActivityTypeUndefined: Self = StObject.set(x, "activityType", js.undefined)
    
    @scala.inline
    def setApplication(value: SchemaApplication): Self = StObject.set(x, "application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplicationUndefined: Self = StObject.set(x, "application", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setEndTimeMillis(value: String): Self = StObject.set(x, "endTimeMillis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndTimeMillisUndefined: Self = StObject.set(x, "endTimeMillis", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setModifiedTimeMillis(value: String): Self = StObject.set(x, "modifiedTimeMillis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModifiedTimeMillisUndefined: Self = StObject.set(x, "modifiedTimeMillis", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setStartTimeMillis(value: String): Self = StObject.set(x, "startTimeMillis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTimeMillisUndefined: Self = StObject.set(x, "startTimeMillis", js.undefined)
  }
}
