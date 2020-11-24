package typings.maximMazurokGapiClientBigquery.gapi.client.bigquery

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExplainQueryStage extends js.Object {
  
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
  implicit class ExplainQueryStageOps[Self <: ExplainQueryStage] (val x: Self) extends AnyVal {
    
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
    def setCompletedParallelInputs(value: String): Self = this.set("completedParallelInputs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompletedParallelInputs: Self = this.set("completedParallelInputs", js.undefined)
    
    @scala.inline
    def setComputeMsAvg(value: String): Self = this.set("computeMsAvg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComputeMsAvg: Self = this.set("computeMsAvg", js.undefined)
    
    @scala.inline
    def setComputeMsMax(value: String): Self = this.set("computeMsMax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComputeMsMax: Self = this.set("computeMsMax", js.undefined)
    
    @scala.inline
    def setComputeRatioAvg(value: Double): Self = this.set("computeRatioAvg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComputeRatioAvg: Self = this.set("computeRatioAvg", js.undefined)
    
    @scala.inline
    def setComputeRatioMax(value: Double): Self = this.set("computeRatioMax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComputeRatioMax: Self = this.set("computeRatioMax", js.undefined)
    
    @scala.inline
    def setEndMs(value: String): Self = this.set("endMs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndMs: Self = this.set("endMs", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setInputStagesVarargs(value: String*): Self = this.set("inputStages", js.Array(value :_*))
    
    @scala.inline
    def setInputStages(value: js.Array[String]): Self = this.set("inputStages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputStages: Self = this.set("inputStages", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setParallelInputs(value: String): Self = this.set("parallelInputs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParallelInputs: Self = this.set("parallelInputs", js.undefined)
    
    @scala.inline
    def setReadMsAvg(value: String): Self = this.set("readMsAvg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReadMsAvg: Self = this.set("readMsAvg", js.undefined)
    
    @scala.inline
    def setReadMsMax(value: String): Self = this.set("readMsMax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReadMsMax: Self = this.set("readMsMax", js.undefined)
    
    @scala.inline
    def setReadRatioAvg(value: Double): Self = this.set("readRatioAvg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReadRatioAvg: Self = this.set("readRatioAvg", js.undefined)
    
    @scala.inline
    def setReadRatioMax(value: Double): Self = this.set("readRatioMax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReadRatioMax: Self = this.set("readRatioMax", js.undefined)
    
    @scala.inline
    def setRecordsRead(value: String): Self = this.set("recordsRead", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecordsRead: Self = this.set("recordsRead", js.undefined)
    
    @scala.inline
    def setRecordsWritten(value: String): Self = this.set("recordsWritten", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecordsWritten: Self = this.set("recordsWritten", js.undefined)
    
    @scala.inline
    def setShuffleOutputBytes(value: String): Self = this.set("shuffleOutputBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShuffleOutputBytes: Self = this.set("shuffleOutputBytes", js.undefined)
    
    @scala.inline
    def setShuffleOutputBytesSpilled(value: String): Self = this.set("shuffleOutputBytesSpilled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShuffleOutputBytesSpilled: Self = this.set("shuffleOutputBytesSpilled", js.undefined)
    
    @scala.inline
    def setSlotMs(value: String): Self = this.set("slotMs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSlotMs: Self = this.set("slotMs", js.undefined)
    
    @scala.inline
    def setStartMs(value: String): Self = this.set("startMs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartMs: Self = this.set("startMs", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
    @scala.inline
    def setStepsVarargs(value: ExplainQueryStep*): Self = this.set("steps", js.Array(value :_*))
    
    @scala.inline
    def setSteps(value: js.Array[ExplainQueryStep]): Self = this.set("steps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSteps: Self = this.set("steps", js.undefined)
    
    @scala.inline
    def setWaitMsAvg(value: String): Self = this.set("waitMsAvg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWaitMsAvg: Self = this.set("waitMsAvg", js.undefined)
    
    @scala.inline
    def setWaitMsMax(value: String): Self = this.set("waitMsMax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWaitMsMax: Self = this.set("waitMsMax", js.undefined)
    
    @scala.inline
    def setWaitRatioAvg(value: Double): Self = this.set("waitRatioAvg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWaitRatioAvg: Self = this.set("waitRatioAvg", js.undefined)
    
    @scala.inline
    def setWaitRatioMax(value: Double): Self = this.set("waitRatioMax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWaitRatioMax: Self = this.set("waitRatioMax", js.undefined)
    
    @scala.inline
    def setWriteMsAvg(value: String): Self = this.set("writeMsAvg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWriteMsAvg: Self = this.set("writeMsAvg", js.undefined)
    
    @scala.inline
    def setWriteMsMax(value: String): Self = this.set("writeMsMax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWriteMsMax: Self = this.set("writeMsMax", js.undefined)
    
    @scala.inline
    def setWriteRatioAvg(value: Double): Self = this.set("writeRatioAvg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWriteRatioAvg: Self = this.set("writeRatioAvg", js.undefined)
    
    @scala.inline
    def setWriteRatioMax(value: Double): Self = this.set("writeRatioMax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWriteRatioMax: Self = this.set("writeRatioMax", js.undefined)
  }
}
