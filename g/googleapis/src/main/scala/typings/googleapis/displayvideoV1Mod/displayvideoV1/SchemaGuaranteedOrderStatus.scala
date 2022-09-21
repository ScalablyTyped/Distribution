package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGuaranteedOrderStatus extends StObject {
  
  /**
    * Output only. The configuration status of the guaranteed order. Acceptable values are `PENDING` and `COMPLETED`. A guaranteed order must be configured (fill in the required fields, choose creatives, and select a default campaign) before it can serve. Currently the configuration action can only be performed via UI.
    */
  var configStatus: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The user-provided reason for pausing this guaranteed order. Must be UTF-8 encoded with a maximum length of 100 bytes. Only applicable when entity_status is set to `ENTITY_STATUS_PAUSED`.
    */
  var entityPauseReason: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Whether or not the guaranteed order is servable. Acceptable values are `ENTITY_STATUS_ACTIVE`, `ENTITY_STATUS_ARCHIVED`, and `ENTITY_STATUS_PAUSED`. Default value is `ENTITY_STATUS_ACTIVE`.
    */
  var entityStatus: js.UndefOr[String | Null] = js.undefined
}
object SchemaGuaranteedOrderStatus {
  
  inline def apply(): SchemaGuaranteedOrderStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGuaranteedOrderStatus]
  }
  
  extension [Self <: SchemaGuaranteedOrderStatus](x: Self) {
    
    inline def setConfigStatus(value: String): Self = StObject.set(x, "configStatus", value.asInstanceOf[js.Any])
    
    inline def setConfigStatusNull: Self = StObject.set(x, "configStatus", null)
    
    inline def setConfigStatusUndefined: Self = StObject.set(x, "configStatus", js.undefined)
    
    inline def setEntityPauseReason(value: String): Self = StObject.set(x, "entityPauseReason", value.asInstanceOf[js.Any])
    
    inline def setEntityPauseReasonNull: Self = StObject.set(x, "entityPauseReason", null)
    
    inline def setEntityPauseReasonUndefined: Self = StObject.set(x, "entityPauseReason", js.undefined)
    
    inline def setEntityStatus(value: String): Self = StObject.set(x, "entityStatus", value.asInstanceOf[js.Any])
    
    inline def setEntityStatusNull: Self = StObject.set(x, "entityStatus", null)
    
    inline def setEntityStatusUndefined: Self = StObject.set(x, "entityStatus", js.undefined)
  }
}
