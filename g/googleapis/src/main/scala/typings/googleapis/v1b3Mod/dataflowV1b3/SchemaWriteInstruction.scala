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
  def apply(input: SchemaInstructionInput = null, sink: SchemaSink = null): SchemaWriteInstruction = {
    val __obj = js.Dynamic.literal()
    if (input != null) __obj.updateDynamic("input")(input.asInstanceOf[js.Any])
    if (sink != null) __obj.updateDynamic("sink")(sink.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaWriteInstruction]
  }
}

