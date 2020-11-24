package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StringDictionary
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
trait SchemaWorkerLifecycleEvent extends js.Object {
  
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
  implicit class SchemaWorkerLifecycleEventOps[Self <: SchemaWorkerLifecycleEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setContainerStartTime(value: String): Self = this.set("containerStartTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainerStartTime: Self = this.set("containerStartTime", js.undefined)
    
    @scala.inline
    def setEvent(value: String): Self = this.set("event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEvent: Self = this.set("event", js.undefined)
    
    @scala.inline
    def setMetadata(value: StringDictionary[String]): Self = this.set("metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
  }
}
