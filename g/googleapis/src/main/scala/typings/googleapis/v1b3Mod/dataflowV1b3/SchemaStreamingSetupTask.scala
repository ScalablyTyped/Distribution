package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A task which initializes part of a streaming Dataflow job.
  */
trait SchemaStreamingSetupTask extends StObject {
  
  /**
    * The user has requested drain.
    */
  var drain: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The TCP port on which the worker should listen for messages from other
    * streaming computation workers.
    */
  var receiveWorkPort: js.UndefOr[Double] = js.undefined
  
  /**
    * Configures streaming appliance snapshot.
    */
  var snapshotConfig: js.UndefOr[SchemaStreamingApplianceSnapshotConfig] = js.undefined
  
  /**
    * The global topology of the streaming Dataflow job.
    */
  var streamingComputationTopology: js.UndefOr[SchemaTopologyConfig] = js.undefined
  
  /**
    * The TCP port used by the worker to communicate with the Dataflow worker
    * harness.
    */
  var workerHarnessPort: js.UndefOr[Double] = js.undefined
}
object SchemaStreamingSetupTask {
  
  inline def apply(): SchemaStreamingSetupTask = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaStreamingSetupTask]
  }
  
  extension [Self <: SchemaStreamingSetupTask](x: Self) {
    
    inline def setDrain(value: Boolean): Self = StObject.set(x, "drain", value.asInstanceOf[js.Any])
    
    inline def setDrainUndefined: Self = StObject.set(x, "drain", js.undefined)
    
    inline def setReceiveWorkPort(value: Double): Self = StObject.set(x, "receiveWorkPort", value.asInstanceOf[js.Any])
    
    inline def setReceiveWorkPortUndefined: Self = StObject.set(x, "receiveWorkPort", js.undefined)
    
    inline def setSnapshotConfig(value: SchemaStreamingApplianceSnapshotConfig): Self = StObject.set(x, "snapshotConfig", value.asInstanceOf[js.Any])
    
    inline def setSnapshotConfigUndefined: Self = StObject.set(x, "snapshotConfig", js.undefined)
    
    inline def setStreamingComputationTopology(value: SchemaTopologyConfig): Self = StObject.set(x, "streamingComputationTopology", value.asInstanceOf[js.Any])
    
    inline def setStreamingComputationTopologyUndefined: Self = StObject.set(x, "streamingComputationTopology", js.undefined)
    
    inline def setWorkerHarnessPort(value: Double): Self = StObject.set(x, "workerHarnessPort", value.asInstanceOf[js.Any])
    
    inline def setWorkerHarnessPortUndefined: Self = StObject.set(x, "workerHarnessPort", js.undefined)
  }
}
