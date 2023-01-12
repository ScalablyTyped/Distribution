package typings.maximMazurokGapiClientDataproc.gapi.client.dataproc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LifecycleConfig extends StObject {
  
  /** Optional. The time when cluster will be auto-deleted (see JSON representation of Timestamp (https://developers.google.com/protocol-buffers/docs/proto3#json)). */
  var autoDeleteTime: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. The lifetime duration of cluster. The cluster will be auto-deleted at the end of this period. Minimum value is 10 minutes; maximum value is 14 days (see JSON
    * representation of Duration (https://developers.google.com/protocol-buffers/docs/proto3#json)).
    */
  var autoDeleteTtl: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. The duration to keep the cluster alive while idling (when no jobs are running). Passing this threshold will cause the cluster to be deleted. Minimum value is 5 minutes;
    * maximum value is 14 days (see JSON representation of Duration (https://developers.google.com/protocol-buffers/docs/proto3#json)).
    */
  var idleDeleteTtl: js.UndefOr[String] = js.undefined
  
  /**
    * Output only. The time when cluster became idle (most recent job finished) and became eligible for deletion due to idleness (see JSON representation of Timestamp
    * (https://developers.google.com/protocol-buffers/docs/proto3#json)).
    */
  var idleStartTime: js.UndefOr[String] = js.undefined
}
object LifecycleConfig {
  
  inline def apply(): LifecycleConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LifecycleConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LifecycleConfig] (val x: Self) extends AnyVal {
    
    inline def setAutoDeleteTime(value: String): Self = StObject.set(x, "autoDeleteTime", value.asInstanceOf[js.Any])
    
    inline def setAutoDeleteTimeUndefined: Self = StObject.set(x, "autoDeleteTime", js.undefined)
    
    inline def setAutoDeleteTtl(value: String): Self = StObject.set(x, "autoDeleteTtl", value.asInstanceOf[js.Any])
    
    inline def setAutoDeleteTtlUndefined: Self = StObject.set(x, "autoDeleteTtl", js.undefined)
    
    inline def setIdleDeleteTtl(value: String): Self = StObject.set(x, "idleDeleteTtl", value.asInstanceOf[js.Any])
    
    inline def setIdleDeleteTtlUndefined: Self = StObject.set(x, "idleDeleteTtl", js.undefined)
    
    inline def setIdleStartTime(value: String): Self = StObject.set(x, "idleStartTime", value.asInstanceOf[js.Any])
    
    inline def setIdleStartTimeUndefined: Self = StObject.set(x, "idleStartTime", js.undefined)
  }
}
