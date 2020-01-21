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
  def apply(outputNum: Int | Double = null, producerInstructionIndex: Int | Double = null): SchemaInstructionInput = {
    val __obj = js.Dynamic.literal()
    if (outputNum != null) __obj.updateDynamic("outputNum")(outputNum.asInstanceOf[js.Any])
    if (producerInstructionIndex != null) __obj.updateDynamic("producerInstructionIndex")(producerInstructionIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaInstructionInput]
  }
}

