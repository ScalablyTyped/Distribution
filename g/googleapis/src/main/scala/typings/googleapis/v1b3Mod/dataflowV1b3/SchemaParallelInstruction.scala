package typings.googleapis.v1b3Mod.dataflowV1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Describes a particular operation comprising a MapTask.
  */
@js.native
trait SchemaParallelInstruction extends js.Object {
  /**
    * Additional information for Flatten instructions.
    */
  var flatten: js.UndefOr[SchemaFlattenInstruction] = js.native
  /**
    * User-provided name of this operation.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * System-defined name for the operation in the original workflow graph.
    */
  var originalName: js.UndefOr[String] = js.native
  /**
    * Describes the outputs of the instruction.
    */
  var outputs: js.UndefOr[js.Array[SchemaInstructionOutput]] = js.native
  /**
    * Additional information for ParDo instructions.
    */
  var parDo: js.UndefOr[SchemaParDoInstruction] = js.native
  /**
    * Additional information for PartialGroupByKey instructions.
    */
  var partialGroupByKey: js.UndefOr[SchemaPartialGroupByKeyInstruction] = js.native
  /**
    * Additional information for Read instructions.
    */
  var read: js.UndefOr[SchemaReadInstruction] = js.native
  /**
    * System-defined name of this operation. Unique across the workflow.
    */
  var systemName: js.UndefOr[String] = js.native
  /**
    * Additional information for Write instructions.
    */
  var write: js.UndefOr[SchemaWriteInstruction] = js.native
}

object SchemaParallelInstruction {
  @scala.inline
  def apply(
    flatten: SchemaFlattenInstruction = null,
    name: String = null,
    originalName: String = null,
    outputs: js.Array[SchemaInstructionOutput] = null,
    parDo: SchemaParDoInstruction = null,
    partialGroupByKey: SchemaPartialGroupByKeyInstruction = null,
    read: SchemaReadInstruction = null,
    systemName: String = null,
    write: SchemaWriteInstruction = null
  ): SchemaParallelInstruction = {
    val __obj = js.Dynamic.literal()
    if (flatten != null) __obj.updateDynamic("flatten")(flatten.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (originalName != null) __obj.updateDynamic("originalName")(originalName.asInstanceOf[js.Any])
    if (outputs != null) __obj.updateDynamic("outputs")(outputs.asInstanceOf[js.Any])
    if (parDo != null) __obj.updateDynamic("parDo")(parDo.asInstanceOf[js.Any])
    if (partialGroupByKey != null) __obj.updateDynamic("partialGroupByKey")(partialGroupByKey.asInstanceOf[js.Any])
    if (read != null) __obj.updateDynamic("read")(read.asInstanceOf[js.Any])
    if (systemName != null) __obj.updateDynamic("systemName")(systemName.asInstanceOf[js.Any])
    if (write != null) __obj.updateDynamic("write")(write.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaParallelInstruction]
  }
}

