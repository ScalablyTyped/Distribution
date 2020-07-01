package typings.googleapis.v1b3Mod.dataflowV1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An input of an instruction, as a reference to an output of a producer
  * instruction.
  */
@js.native
trait SchemaInstructionInput extends js.Object {
  /**
    * The output index (origin zero) within the producer.
    */
  var outputNum: js.UndefOr[Double] = js.native
  /**
    * The index (origin zero) of the parallel instruction that produces the
    * output to be consumed by this input.  This index is relative to the list
    * of instructions in this input&#39;s instruction&#39;s containing MapTask.
    */
  var producerInstructionIndex: js.UndefOr[Double] = js.native
}

object SchemaInstructionInput {
  @scala.inline
  def apply(
    outputNum: js.UndefOr[Double] = js.undefined,
    producerInstructionIndex: js.UndefOr[Double] = js.undefined
  ): SchemaInstructionInput = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(outputNum)) __obj.updateDynamic("outputNum")(outputNum.get.asInstanceOf[js.Any])
    if (!js.isUndefined(producerInstructionIndex)) __obj.updateDynamic("producerInstructionIndex")(producerInstructionIndex.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaInstructionInput]
  }
}

