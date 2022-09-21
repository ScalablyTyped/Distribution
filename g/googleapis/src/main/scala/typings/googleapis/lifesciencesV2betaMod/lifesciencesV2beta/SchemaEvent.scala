package typings.googleapis.lifesciencesV2betaMod.lifesciencesV2beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaEvent extends StObject {
  
  /**
    * See google.cloud.lifesciences.v2beta.ContainerKilledEvent.
    */
  var containerKilled: js.UndefOr[SchemaContainerKilledEvent] = js.undefined
  
  /**
    * See google.cloud.lifesciences.v2beta.ContainerStartedEvent.
    */
  var containerStarted: js.UndefOr[SchemaContainerStartedEvent] = js.undefined
  
  /**
    * See google.cloud.lifesciences.v2beta.ContainerStoppedEvent.
    */
  var containerStopped: js.UndefOr[SchemaContainerStoppedEvent] = js.undefined
  
  /**
    * See google.cloud.lifesciences.v2beta.DelayedEvent.
    */
  var delayed: js.UndefOr[SchemaDelayedEvent] = js.undefined
  
  /**
    * A human-readable description of the event. Note that these strings can change at any time without notice. Any application logic must use the information in the `details` field.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * See google.cloud.lifesciences.v2beta.FailedEvent.
    */
  var failed: js.UndefOr[SchemaFailedEvent] = js.undefined
  
  /**
    * See google.cloud.lifesciences.v2beta.PullStartedEvent.
    */
  var pullStarted: js.UndefOr[SchemaPullStartedEvent] = js.undefined
  
  /**
    * See google.cloud.lifesciences.v2beta.PullStoppedEvent.
    */
  var pullStopped: js.UndefOr[SchemaPullStoppedEvent] = js.undefined
  
  /**
    * The time at which the event occurred.
    */
  var timestamp: js.UndefOr[String | Null] = js.undefined
  
  /**
    * See google.cloud.lifesciences.v2beta.UnexpectedExitStatusEvent.
    */
  var unexpectedExitStatus: js.UndefOr[SchemaUnexpectedExitStatusEvent] = js.undefined
  
  /**
    * See google.cloud.lifesciences.v2beta.WorkerAssignedEvent.
    */
  var workerAssigned: js.UndefOr[SchemaWorkerAssignedEvent] = js.undefined
  
  /**
    * See google.cloud.lifesciences.v2beta.WorkerReleasedEvent.
    */
  var workerReleased: js.UndefOr[SchemaWorkerReleasedEvent] = js.undefined
}
object SchemaEvent {
  
  inline def apply(): SchemaEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEvent]
  }
  
  extension [Self <: SchemaEvent](x: Self) {
    
    inline def setContainerKilled(value: SchemaContainerKilledEvent): Self = StObject.set(x, "containerKilled", value.asInstanceOf[js.Any])
    
    inline def setContainerKilledUndefined: Self = StObject.set(x, "containerKilled", js.undefined)
    
    inline def setContainerStarted(value: SchemaContainerStartedEvent): Self = StObject.set(x, "containerStarted", value.asInstanceOf[js.Any])
    
    inline def setContainerStartedUndefined: Self = StObject.set(x, "containerStarted", js.undefined)
    
    inline def setContainerStopped(value: SchemaContainerStoppedEvent): Self = StObject.set(x, "containerStopped", value.asInstanceOf[js.Any])
    
    inline def setContainerStoppedUndefined: Self = StObject.set(x, "containerStopped", js.undefined)
    
    inline def setDelayed(value: SchemaDelayedEvent): Self = StObject.set(x, "delayed", value.asInstanceOf[js.Any])
    
    inline def setDelayedUndefined: Self = StObject.set(x, "delayed", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setFailed(value: SchemaFailedEvent): Self = StObject.set(x, "failed", value.asInstanceOf[js.Any])
    
    inline def setFailedUndefined: Self = StObject.set(x, "failed", js.undefined)
    
    inline def setPullStarted(value: SchemaPullStartedEvent): Self = StObject.set(x, "pullStarted", value.asInstanceOf[js.Any])
    
    inline def setPullStartedUndefined: Self = StObject.set(x, "pullStarted", js.undefined)
    
    inline def setPullStopped(value: SchemaPullStoppedEvent): Self = StObject.set(x, "pullStopped", value.asInstanceOf[js.Any])
    
    inline def setPullStoppedUndefined: Self = StObject.set(x, "pullStopped", js.undefined)
    
    inline def setTimestamp(value: String): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setTimestampNull: Self = StObject.set(x, "timestamp", null)
    
    inline def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
    
    inline def setUnexpectedExitStatus(value: SchemaUnexpectedExitStatusEvent): Self = StObject.set(x, "unexpectedExitStatus", value.asInstanceOf[js.Any])
    
    inline def setUnexpectedExitStatusUndefined: Self = StObject.set(x, "unexpectedExitStatus", js.undefined)
    
    inline def setWorkerAssigned(value: SchemaWorkerAssignedEvent): Self = StObject.set(x, "workerAssigned", value.asInstanceOf[js.Any])
    
    inline def setWorkerAssignedUndefined: Self = StObject.set(x, "workerAssigned", js.undefined)
    
    inline def setWorkerReleased(value: SchemaWorkerReleasedEvent): Self = StObject.set(x, "workerReleased", value.asInstanceOf[js.Any])
    
    inline def setWorkerReleasedUndefined: Self = StObject.set(x, "workerReleased", js.undefined)
  }
}
