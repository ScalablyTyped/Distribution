package typings.googleapis.v1b3Mod.dataflowV1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An instruction that copies its inputs (zero or more) to its (single)
  * output.
  */
@js.native
trait SchemaFlattenInstruction extends js.Object {
  /**
    * Describes the inputs to the flatten instruction.
    */
  var inputs: js.UndefOr[js.Array[SchemaInstructionInput]] = js.native
}

object SchemaFlattenInstruction {
  @scala.inline
  def apply(inputs: js.Array[SchemaInstructionInput] = null): SchemaFlattenInstruction = {
    val __obj = js.Dynamic.literal()
    if (inputs != null) __obj.updateDynamic("inputs")(inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaFlattenInstruction]
  }
}

