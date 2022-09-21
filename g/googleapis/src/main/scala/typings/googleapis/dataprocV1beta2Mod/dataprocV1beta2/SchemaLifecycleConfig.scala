package typings.googleapis.dataprocV1beta2Mod.dataprocV1beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaLifecycleConfig extends StObject {
  
  /**
    * Optional. The time when cluster will be auto-deleted. (see JSON representation of Timestamp (https://developers.google.com/protocol-buffers/docs/proto3#json)).
    */
  var autoDeleteTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. The lifetime duration of cluster. The cluster will be auto-deleted at the end of this period. Minimum value is 10 minutes; maximum value is 14 days (see JSON representation of Duration (https://developers.google.com/protocol-buffers/docs/proto3#json)).
    */
  var autoDeleteTtl: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. The duration to keep the cluster alive while idling (when no jobs are running). Passing this threshold will cause the cluster to be deleted. Minimum value is 5 minutes; maximum value is 14 days (see JSON representation of Duration (https://developers.google.com/protocol-buffers/docs/proto3#json)).
    */
  var idleDeleteTtl: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The time when cluster became idle (most recent job finished) and became eligible for deletion due to idleness (see JSON representation of Timestamp (https://developers.google.com/protocol-buffers/docs/proto3#json)).
    */
  var idleStartTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaLifecycleConfig {
  
  inline def apply(): SchemaLifecycleConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLifecycleConfig]
  }
  
  extension [Self <: SchemaLifecycleConfig](x: Self) {
    
    inline def setAutoDeleteTime(value: String): Self = StObject.set(x, "autoDeleteTime", value.asInstanceOf[js.Any])
    
    inline def setAutoDeleteTimeNull: Self = StObject.set(x, "autoDeleteTime", null)
    
    inline def setAutoDeleteTimeUndefined: Self = StObject.set(x, "autoDeleteTime", js.undefined)
    
    inline def setAutoDeleteTtl(value: String): Self = StObject.set(x, "autoDeleteTtl", value.asInstanceOf[js.Any])
    
    inline def setAutoDeleteTtlNull: Self = StObject.set(x, "autoDeleteTtl", null)
    
    inline def setAutoDeleteTtlUndefined: Self = StObject.set(x, "autoDeleteTtl", js.undefined)
    
    inline def setIdleDeleteTtl(value: String): Self = StObject.set(x, "idleDeleteTtl", value.asInstanceOf[js.Any])
    
    inline def setIdleDeleteTtlNull: Self = StObject.set(x, "idleDeleteTtl", null)
    
    inline def setIdleDeleteTtlUndefined: Self = StObject.set(x, "idleDeleteTtl", js.undefined)
    
    inline def setIdleStartTime(value: String): Self = StObject.set(x, "idleStartTime", value.asInstanceOf[js.Any])
    
    inline def setIdleStartTimeNull: Self = StObject.set(x, "idleStartTime", null)
    
    inline def setIdleStartTimeUndefined: Self = StObject.set(x, "idleStartTime", js.undefined)
  }
}
