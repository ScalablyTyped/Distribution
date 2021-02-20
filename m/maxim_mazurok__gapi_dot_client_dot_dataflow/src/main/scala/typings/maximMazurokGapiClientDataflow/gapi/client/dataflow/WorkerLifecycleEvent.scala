package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkerLifecycleEvent extends StObject {
  
  /** The start time of this container. All events will report this so that events can be grouped together across container/VM restarts. */
  var containerStartTime: js.UndefOr[String] = js.native
  
  /** The event being reported. */
  var event: js.UndefOr[String] = js.native
  
  /** Other stats that can accompany an event. E.g. { "downloaded_bytes" : "123456" } */
  var metadata: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientDataflow.maximMazurokGapiClientDataflowStrings.WorkerLifecycleEvent with TopLevel[js.Any]
  ] = js.native
}
object WorkerLifecycleEvent {
  
  @scala.inline
  def apply(): WorkerLifecycleEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkerLifecycleEvent]
  }
  
  @scala.inline
  implicit class WorkerLifecycleEventMutableBuilder[Self <: WorkerLifecycleEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContainerStartTime(value: String): Self = StObject.set(x, "containerStartTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerStartTimeUndefined: Self = StObject.set(x, "containerStartTime", js.undefined)
    
    @scala.inline
    def setEvent(value: String): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
    
    @scala.inline
    def setMetadata(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientDataflow.maximMazurokGapiClientDataflowStrings.WorkerLifecycleEvent with TopLevel[js.Any]
    ): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
  }
}
