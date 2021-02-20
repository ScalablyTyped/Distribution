package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A report of an event in a worker&#39;s lifecycle. The proto contains one
  * event, because the worker is expected to asynchronously send each message
  * immediately after the event. Due to this asynchrony, messages may arrive
  * out of order (or missing), and it is up to the consumer to interpret. The
  * timestamp of the event is in the enclosing WorkerMessage proto.
  */
@js.native
trait SchemaWorkerLifecycleEvent extends StObject {
  
  /**
    * The start time of this container. All events will report this so that
    * events can be grouped together across container/VM restarts.
    */
  var containerStartTime: js.UndefOr[String] = js.native
  
  /**
    * The event being reported.
    */
  var event: js.UndefOr[String] = js.native
  
  /**
    * Other stats that can accompany an event. E.g. {
    * &quot;downloaded_bytes&quot; : &quot;123456&quot; }
    */
  var metadata: js.UndefOr[StringDictionary[String]] = js.native
}
object SchemaWorkerLifecycleEvent {
  
  @scala.inline
  def apply(): SchemaWorkerLifecycleEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaWorkerLifecycleEvent]
  }
  
  @scala.inline
  implicit class SchemaWorkerLifecycleEventMutableBuilder[Self <: SchemaWorkerLifecycleEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContainerStartTime(value: String): Self = StObject.set(x, "containerStartTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerStartTimeUndefined: Self = StObject.set(x, "containerStartTime", js.undefined)
    
    @scala.inline
    def setEvent(value: String): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
    
    @scala.inline
    def setMetadata(value: StringDictionary[String]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
  }
}
