package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Shutdown notification from workers. This is to be sent by the shutdown
  * script of the worker VM so that the backend knows that the VM is being shut
  * down.
  */
@js.native
trait SchemaWorkerShutdownNotice extends StObject {
  
  /**
    * The reason for the worker shutdown. Current possible values are:
    * &quot;UNKNOWN&quot;: shutdown reason is unknown. &quot;PREEMPTION&quot;:
    * shutdown reason is preemption. Other possible reasons may be added in the
    * future.
    */
  var reason: js.UndefOr[String] = js.native
}
object SchemaWorkerShutdownNotice {
  
  @scala.inline
  def apply(): SchemaWorkerShutdownNotice = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaWorkerShutdownNotice]
  }
  
  @scala.inline
  implicit class SchemaWorkerShutdownNoticeMutableBuilder[Self <: SchemaWorkerShutdownNotice] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
  }
}
