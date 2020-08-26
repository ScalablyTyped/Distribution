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
  def apply(): SchemaFlattenInstruction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFlattenInstruction]
  }
  @scala.inline
  implicit class SchemaFlattenInstructionOps[Self <: SchemaFlattenInstruction] (val x: Self) extends AnyVal {
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
    def setInputsVarargs(value: SchemaInstructionInput*): Self = this.set("inputs", js.Array(value :_*))
    @scala.inline
    def setInputs(value: js.Array[SchemaInstructionInput]): Self = this.set("inputs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputs: Self = this.set("inputs", js.undefined)
  }
  
}

