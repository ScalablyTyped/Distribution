package typings.maximMazurokGapiClientBigquery.gapi.client.bigquery

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExplainQueryStage extends StObject {
  
  /** Number of parallel input segments completed. */
  var completedParallelInputs: js.UndefOr[String] = js.native
  
  /** Milliseconds the average shard spent on CPU-bound tasks. */
  var computeMsAvg: js.UndefOr[String] = js.native
  
  /** Milliseconds the slowest shard spent on CPU-bound tasks. */
  var computeMsMax: js.UndefOr[String] = js.native
  
  /** Relative amount of time the average shard spent on CPU-bound tasks. */
  var computeRatioAvg: js.UndefOr[Double] = js.native
  
  /** Relative amount of time the slowest shard spent on CPU-bound tasks. */
  var computeRatioMax: js.UndefOr[Double] = js.native
  
  /** Stage end time represented as milliseconds since epoch. */
  var endMs: js.UndefOr[String] = js.native
  
  /** Unique ID for stage within plan. */
  var id: js.UndefOr[String] = js.native
  
  /** IDs for stages that are inputs to this stage. */
  var inputStages: js.UndefOr[js.Array[String]] = js.native
  
  /** Human-readable name for stage. */
  var name: js.UndefOr[String] = js.native
  
  /** Number of parallel input segments to be processed. */
  var parallelInputs: js.UndefOr[String] = js.native
  
  /** Milliseconds the average shard spent reading input. */
  var readMsAvg: js.UndefOr[String] = js.native
  
  /** Milliseconds the slowest shard spent reading input. */
  var readMsMax: js.UndefOr[String] = js.native
  
  /** Relative amount of time the average shard spent reading input. */
  var readRatioAvg: js.UndefOr[Double] = js.native
  
  /** Relative amount of time the slowest shard spent reading input. */
  var readRatioMax: js.UndefOr[Double] = js.native
  
  /** Number of records read into the stage. */
  var recordsRead: js.UndefOr[String] = js.native
  
  /** Number of records written by the stage. */
  var recordsWritten: js.UndefOr[String] = js.native
  
  /** Total number of bytes written to shuffle. */
  var shuffleOutputBytes: js.UndefOr[String] = js.native
  
  /** Total number of bytes written to shuffle and spilled to disk. */
  var shuffleOutputBytesSpilled: js.UndefOr[String] = js.native
  
  /** Slot-milliseconds used by the stage. */
  var slotMs: js.UndefOr[String] = js.native
  
  /** Stage start time represented as milliseconds since epoch. */
  var startMs: js.UndefOr[String] = js.native
  
  /** Current status for the stage. */
  var status: js.UndefOr[String] = js.native
  
  /** List of operations within the stage in dependency order (approximately chronological). */
  var steps: js.UndefOr[js.Array[ExplainQueryStep]] = js.native
  
  /** Milliseconds the average shard spent waiting to be scheduled. */
  var waitMsAvg: js.UndefOr[String] = js.native
  
  /** Milliseconds the slowest shard spent waiting to be scheduled. */
  var waitMsMax: js.UndefOr[String] = js.native
  
  /** Relative amount of time the average shard spent waiting to be scheduled. */
  var waitRatioAvg: js.UndefOr[Double] = js.native
  
  /** Relative amount of time the slowest shard spent waiting to be scheduled. */
  var waitRatioMax: js.UndefOr[Double] = js.native
  
  /** Milliseconds the average shard spent on writing output. */
  var writeMsAvg: js.UndefOr[String] = js.native
  
  /** Milliseconds the slowest shard spent on writing output. */
  var writeMsMax: js.UndefOr[String] = js.native
  
  /** Relative amount of time the average shard spent on writing output. */
  var writeRatioAvg: js.UndefOr[Double] = js.native
  
  /** Relative amount of time the slowest shard spent on writing output. */
  var writeRatioMax: js.UndefOr[Double] = js.native
}
object ExplainQueryStage {
  
  @scala.inline
  def apply(): ExplainQueryStage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExplainQueryStage]
  }
  
  @scala.inline
  implicit class ExplainQueryStageMutableBuilder[Self <: ExplainQueryStage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCompletedParallelInputs(value: String): Self = StObject.set(x, "completedParallelInputs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompletedParallelInputsUndefined: Self = StObject.set(x, "completedParallelInputs", js.undefined)
    
    @scala.inline
    def setComputeMsAvg(value: String): Self = StObject.set(x, "computeMsAvg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComputeMsAvgUndefined: Self = StObject.set(x, "computeMsAvg", js.undefined)
    
    @scala.inline
    def setComputeMsMax(value: String): Self = StObject.set(x, "computeMsMax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComputeMsMaxUndefined: Self = StObject.set(x, "computeMsMax", js.undefined)
    
    @scala.inline
    def setComputeRatioAvg(value: Double): Self = StObject.set(x, "computeRatioAvg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComputeRatioAvgUndefined: Self = StObject.set(x, "computeRatioAvg", js.undefined)
    
    @scala.inline
    def setComputeRatioMax(value: Double): Self = StObject.set(x, "computeRatioMax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComputeRatioMaxUndefined: Self = StObject.set(x, "computeRatioMax", js.undefined)
    
    @scala.inline
    def setEndMs(value: String): Self = StObject.set(x, "endMs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndMsUndefined: Self = StObject.set(x, "endMs", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setInputStages(value: js.Array[String]): Self = StObject.set(x, "inputStages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputStagesUndefined: Self = StObject.set(x, "inputStages", js.undefined)
    
    @scala.inline
    def setInputStagesVarargs(value: String*): Self = StObject.set(x, "inputStages", js.Array(value :_*))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setParallelInputs(value: String): Self = StObject.set(x, "parallelInputs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParallelInputsUndefined: Self = StObject.set(x, "parallelInputs", js.undefined)
    
    @scala.inline
    def setReadMsAvg(value: String): Self = StObject.set(x, "readMsAvg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadMsAvgUndefined: Self = StObject.set(x, "readMsAvg", js.undefined)
    
    @scala.inline
    def setReadMsMax(value: String): Self = StObject.set(x, "readMsMax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadMsMaxUndefined: Self = StObject.set(x, "readMsMax", js.undefined)
    
    @scala.inline
    def setReadRatioAvg(value: Double): Self = StObject.set(x, "readRatioAvg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadRatioAvgUndefined: Self = StObject.set(x, "readRatioAvg", js.undefined)
    
    @scala.inline
    def setReadRatioMax(value: Double): Self = StObject.set(x, "readRatioMax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadRatioMaxUndefined: Self = StObject.set(x, "readRatioMax", js.undefined)
    
    @scala.inline
    def setRecordsRead(value: String): Self = StObject.set(x, "recordsRead", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecordsReadUndefined: Self = StObject.set(x, "recordsRead", js.undefined)
    
    @scala.inline
    def setRecordsWritten(value: String): Self = StObject.set(x, "recordsWritten", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecordsWrittenUndefined: Self = StObject.set(x, "recordsWritten", js.undefined)
    
    @scala.inline
    def setShuffleOutputBytes(value: String): Self = StObject.set(x, "shuffleOutputBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShuffleOutputBytesSpilled(value: String): Self = StObject.set(x, "shuffleOutputBytesSpilled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShuffleOutputBytesSpilledUndefined: Self = StObject.set(x, "shuffleOutputBytesSpilled", js.undefined)
    
    @scala.inline
    def setShuffleOutputBytesUndefined: Self = StObject.set(x, "shuffleOutputBytes", js.undefined)
    
    @scala.inline
    def setSlotMs(value: String): Self = StObject.set(x, "slotMs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlotMsUndefined: Self = StObject.set(x, "slotMs", js.undefined)
    
    @scala.inline
    def setStartMs(value: String): Self = StObject.set(x, "startMs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartMsUndefined: Self = StObject.set(x, "startMs", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setSteps(value: js.Array[ExplainQueryStep]): Self = StObject.set(x, "steps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepsUndefined: Self = StObject.set(x, "steps", js.undefined)
    
    @scala.inline
    def setStepsVarargs(value: ExplainQueryStep*): Self = StObject.set(x, "steps", js.Array(value :_*))
    
    @scala.inline
    def setWaitMsAvg(value: String): Self = StObject.set(x, "waitMsAvg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWaitMsAvgUndefined: Self = StObject.set(x, "waitMsAvg", js.undefined)
    
    @scala.inline
    def setWaitMsMax(value: String): Self = StObject.set(x, "waitMsMax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWaitMsMaxUndefined: Self = StObject.set(x, "waitMsMax", js.undefined)
    
    @scala.inline
    def setWaitRatioAvg(value: Double): Self = StObject.set(x, "waitRatioAvg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWaitRatioAvgUndefined: Self = StObject.set(x, "waitRatioAvg", js.undefined)
    
    @scala.inline
    def setWaitRatioMax(value: Double): Self = StObject.set(x, "waitRatioMax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWaitRatioMaxUndefined: Self = StObject.set(x, "waitRatioMax", js.undefined)
    
    @scala.inline
    def setWriteMsAvg(value: String): Self = StObject.set(x, "writeMsAvg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWriteMsAvgUndefined: Self = StObject.set(x, "writeMsAvg", js.undefined)
    
    @scala.inline
    def setWriteMsMax(value: String): Self = StObject.set(x, "writeMsMax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWriteMsMaxUndefined: Self = StObject.set(x, "writeMsMax", js.undefined)
    
    @scala.inline
    def setWriteRatioAvg(value: Double): Self = StObject.set(x, "writeRatioAvg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWriteRatioAvgUndefined: Self = StObject.set(x, "writeRatioAvg", js.undefined)
    
    @scala.inline
    def setWriteRatioMax(value: Double): Self = StObject.set(x, "writeRatioMax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWriteRatioMaxUndefined: Self = StObject.set(x, "writeRatioMax", js.undefined)
  }
}
