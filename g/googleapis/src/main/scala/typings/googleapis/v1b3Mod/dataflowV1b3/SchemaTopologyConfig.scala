package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Global topology of the streaming Dataflow job, including all computations
  * and their sharded locations.
  */
@js.native
trait SchemaTopologyConfig extends js.Object {
  /**
    * The computations associated with a streaming Dataflow job.
    */
  var computations: js.UndefOr[js.Array[SchemaComputationTopology]] = js.native
  /**
    * The disks assigned to a streaming Dataflow job.
    */
  var dataDiskAssignments: js.UndefOr[js.Array[SchemaDataDiskAssignment]] = js.native
  /**
    * The size (in bits) of keys that will be assigned to source messages.
    */
  var forwardingKeyBits: js.UndefOr[Double] = js.native
  /**
    * Version number for persistent state.
    */
  var persistentStateVersion: js.UndefOr[Double] = js.native
  /**
    * Maps user stage names to stable computation names.
    */
  var userStageToComputationNameMap: js.UndefOr[StringDictionary[String]] = js.native
}

object SchemaTopologyConfig {
  @scala.inline
  def apply(): SchemaTopologyConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTopologyConfig]
  }
  @scala.inline
  implicit class SchemaTopologyConfigOps[Self <: SchemaTopologyConfig] (val x: Self) extends AnyVal {
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
    def setComputationsVarargs(value: SchemaComputationTopology*): Self = this.set("computations", js.Array(value :_*))
    @scala.inline
    def setComputations(value: js.Array[SchemaComputationTopology]): Self = this.set("computations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComputations: Self = this.set("computations", js.undefined)
    @scala.inline
    def setDataDiskAssignmentsVarargs(value: SchemaDataDiskAssignment*): Self = this.set("dataDiskAssignments", js.Array(value :_*))
    @scala.inline
    def setDataDiskAssignments(value: js.Array[SchemaDataDiskAssignment]): Self = this.set("dataDiskAssignments", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataDiskAssignments: Self = this.set("dataDiskAssignments", js.undefined)
    @scala.inline
    def setForwardingKeyBits(value: Double): Self = this.set("forwardingKeyBits", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForwardingKeyBits: Self = this.set("forwardingKeyBits", js.undefined)
    @scala.inline
    def setPersistentStateVersion(value: Double): Self = this.set("persistentStateVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePersistentStateVersion: Self = this.set("persistentStateVersion", js.undefined)
    @scala.inline
    def setUserStageToComputationNameMap(value: StringDictionary[String]): Self = this.set("userStageToComputationNameMap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserStageToComputationNameMap: Self = this.set("userStageToComputationNameMap", js.undefined)
  }
  
}

