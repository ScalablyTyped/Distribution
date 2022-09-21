package typings.googleapis.dataplexV1Mod.dataplexV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDataplexV1SessionEvent extends StObject {
  
  /**
    * The status of the event.
    */
  var eventSucceeded: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The log message.
    */
  var message: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The execution details of the query.
    */
  var query: js.UndefOr[SchemaGoogleCloudDataplexV1SessionEventQueryDetail] = js.undefined
  
  /**
    * Unique identifier for the session.
    */
  var sessionId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The type of the event.
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The idle duration of a warm pooled session before it is assigned to user.
    */
  var unassignedDuration: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The information about the user that created the session. It will be the email address of the user.
    */
  var userId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * If the session is a warm pooled session.
    */
  var warmPoolEnabled: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaGoogleCloudDataplexV1SessionEvent {
  
  inline def apply(): SchemaGoogleCloudDataplexV1SessionEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDataplexV1SessionEvent]
  }
  
  extension [Self <: SchemaGoogleCloudDataplexV1SessionEvent](x: Self) {
    
    inline def setEventSucceeded(value: Boolean): Self = StObject.set(x, "eventSucceeded", value.asInstanceOf[js.Any])
    
    inline def setEventSucceededNull: Self = StObject.set(x, "eventSucceeded", null)
    
    inline def setEventSucceededUndefined: Self = StObject.set(x, "eventSucceeded", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageNull: Self = StObject.set(x, "message", null)
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setQuery(value: SchemaGoogleCloudDataplexV1SessionEventQueryDetail): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    
    inline def setSessionId(value: String): Self = StObject.set(x, "sessionId", value.asInstanceOf[js.Any])
    
    inline def setSessionIdNull: Self = StObject.set(x, "sessionId", null)
    
    inline def setSessionIdUndefined: Self = StObject.set(x, "sessionId", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUnassignedDuration(value: String): Self = StObject.set(x, "unassignedDuration", value.asInstanceOf[js.Any])
    
    inline def setUnassignedDurationNull: Self = StObject.set(x, "unassignedDuration", null)
    
    inline def setUnassignedDurationUndefined: Self = StObject.set(x, "unassignedDuration", js.undefined)
    
    inline def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    
    inline def setUserIdNull: Self = StObject.set(x, "userId", null)
    
    inline def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
    
    inline def setWarmPoolEnabled(value: Boolean): Self = StObject.set(x, "warmPoolEnabled", value.asInstanceOf[js.Any])
    
    inline def setWarmPoolEnabledNull: Self = StObject.set(x, "warmPoolEnabled", null)
    
    inline def setWarmPoolEnabledUndefined: Self = StObject.set(x, "warmPoolEnabled", js.undefined)
  }
}
