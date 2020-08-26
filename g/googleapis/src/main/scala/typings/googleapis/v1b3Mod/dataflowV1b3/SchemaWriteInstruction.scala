package typings.googleapis.v1b3Mod.dataflowV1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An instruction that writes records. Takes one input, produces no outputs.
  */
@js.native
trait SchemaWriteInstruction extends js.Object {
  /**
    * The input.
    */
  var input: js.UndefOr[SchemaInstructionInput] = js.native
  /**
    * The sink to write to.
    */
  var sink: js.UndefOr[SchemaSink] = js.native
}

object SchemaWriteInstruction {
  @scala.inline
  def apply(): SchemaWriteInstruction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaWriteInstruction]
  }
  @scala.inline
  implicit class SchemaWriteInstructionOps[Self <: SchemaWriteInstruction] (val x: Self) extends AnyVal {
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
    def setInput(value: SchemaInstructionInput): Self = this.set("input", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInput: Self = this.set("input", js.undefined)
    @scala.inline
    def setSink(value: SchemaSink): Self = this.set("sink", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSink: Self = this.set("sink", js.undefined)
  }
  
}

