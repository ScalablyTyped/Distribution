package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaWorkerShutdownNotice extends StObject {
  
  /**
    * The reason for the worker shutdown. Current possible values are: "UNKNOWN": shutdown reason is unknown. "PREEMPTION": shutdown reason is preemption. Other possible reasons may be added in the future.
    */
  var reason: js.UndefOr[String | Null] = js.undefined
}
object SchemaWorkerShutdownNotice {
  
  inline def apply(): SchemaWorkerShutdownNotice = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaWorkerShutdownNotice]
  }
  
  extension [Self <: SchemaWorkerShutdownNotice](x: Self) {
    
    inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setReasonNull: Self = StObject.set(x, "reason", null)
    
    inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
  }
}
