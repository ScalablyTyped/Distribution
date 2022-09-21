package typings.googleapis.formsV1Mod.formsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaWatch extends StObject {
  
  /**
    * Output only. Timestamp of when this was created.
    */
  var createTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The most recent error type for an attempted delivery. To begin watching the form again a call can be made to watches.renew which also clears this error information.
    */
  var errorType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. Which event type to watch for.
    */
  var eventType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Timestamp for when this will expire. Each watches.renew call resets this to seven days in the future.
    */
  var expireTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The ID of this watch. See notes on CreateWatchRequest.watch_id.
    */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The current state of the watch. Additional details about suspended watches can be found by checking the `error_type`.
    */
  var state: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. Where to send the notification.
    */
  var target: js.UndefOr[SchemaWatchTarget] = js.undefined
}
object SchemaWatch {
  
  inline def apply(): SchemaWatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaWatch]
  }
  
  extension [Self <: SchemaWatch](x: Self) {
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setErrorType(value: String): Self = StObject.set(x, "errorType", value.asInstanceOf[js.Any])
    
    inline def setErrorTypeNull: Self = StObject.set(x, "errorType", null)
    
    inline def setErrorTypeUndefined: Self = StObject.set(x, "errorType", js.undefined)
    
    inline def setEventType(value: String): Self = StObject.set(x, "eventType", value.asInstanceOf[js.Any])
    
    inline def setEventTypeNull: Self = StObject.set(x, "eventType", null)
    
    inline def setEventTypeUndefined: Self = StObject.set(x, "eventType", js.undefined)
    
    inline def setExpireTime(value: String): Self = StObject.set(x, "expireTime", value.asInstanceOf[js.Any])
    
    inline def setExpireTimeNull: Self = StObject.set(x, "expireTime", null)
    
    inline def setExpireTimeUndefined: Self = StObject.set(x, "expireTime", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setTarget(value: SchemaWatchTarget): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
  }
}
