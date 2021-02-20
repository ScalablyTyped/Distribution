package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A task which initializes part of a streaming Dataflow job.
  */
@js.native
trait SchemaStreamingSetupTask extends StObject {
  
  /**
    * The user has requested drain.
    */
  var drain: js.UndefOr[Boolean] = js.native
  
  /**
    * The TCP port on which the worker should listen for messages from other
    * streaming computation workers.
    */
  var receiveWorkPort: js.UndefOr[Double] = js.native
  
  /**
    * Configures streaming appliance snapshot.
    */
  var snapshotConfig: js.UndefOr[SchemaStreamingApplianceSnapshotConfig] = js.native
  
  /**
    * The global topology of the streaming Dataflow job.
    */
  var streamingComputationTopology: js.UndefOr[SchemaTopologyConfig] = js.native
  
  /**
    * The TCP port used by the worker to communicate with the Dataflow worker
    * harness.
    */
  var workerHarnessPort: js.UndefOr[Double] = js.native
}
object SchemaStreamingSetupTask {
  
  @scala.inline
  def apply(): SchemaStreamingSetupTask = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaStreamingSetupTask]
  }
  
  @scala.inline
  implicit class SchemaStreamingSetupTaskMutableBuilder[Self <: SchemaStreamingSetupTask] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDrain(value: Boolean): Self = StObject.set(x, "drain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDrainUndefined: Self = StObject.set(x, "drain", js.undefined)
    
    @scala.inline
    def setReceiveWorkPort(value: Double): Self = StObject.set(x, "receiveWorkPort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReceiveWorkPortUndefined: Self = StObject.set(x, "receiveWorkPort", js.undefined)
    
    @scala.inline
    def setSnapshotConfig(value: SchemaStreamingApplianceSnapshotConfig): Self = StObject.set(x, "snapshotConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnapshotConfigUndefined: Self = StObject.set(x, "snapshotConfig", js.undefined)
    
    @scala.inline
    def setStreamingComputationTopology(value: SchemaTopologyConfig): Self = StObject.set(x, "streamingComputationTopology", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreamingComputationTopologyUndefined: Self = StObject.set(x, "streamingComputationTopology", js.undefined)
    
    @scala.inline
    def setWorkerHarnessPort(value: Double): Self = StObject.set(x, "workerHarnessPort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkerHarnessPortUndefined: Self = StObject.set(x, "workerHarnessPort", js.undefined)
  }
}
