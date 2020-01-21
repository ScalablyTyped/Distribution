package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An instruction that does a ParDo operation. Takes one main input and zero
  * or more side inputs, and produces zero or more outputs. Runs user code.
  */
@js.native
trait SchemaParDoInstruction extends js.Object {
  /**
    * The input.
    */
  var input: js.UndefOr[SchemaInstructionInput] = js.native
  /**
    * Information about each of the outputs, if user_fn is a  MultiDoFn.
    */
  var multiOutputInfos: js.UndefOr[js.Array[SchemaMultiOutputInfo]] = js.native
  /**
    * The number of outputs.
    */
  var numOutputs: js.UndefOr[Double] = js.native
  /**
    * Zero or more side inputs.
    */
  var sideInputs: js.UndefOr[js.Array[SchemaSideInputInfo]] = js.native
  /**
    * The user function to invoke.
    */
  var userFn: js.UndefOr[StringDictionary[js.Any]] = js.native
}

object SchemaParDoInstruction {
  @scala.inline
  def apply(
    input: SchemaInstructionInput = null,
    multiOutputInfos: js.Array[SchemaMultiOutputInfo] = null,
    numOutputs: Int | Double = null,
    sideInputs: js.Array[SchemaSideInputInfo] = null,
    userFn: StringDictionary[js.Any] = null
  ): SchemaParDoInstruction = {
    val __obj = js.Dynamic.literal()
    if (input != null) __obj.updateDynamic("input")(input.asInstanceOf[js.Any])
    if (multiOutputInfos != null) __obj.updateDynamic("multiOutputInfos")(multiOutputInfos.asInstanceOf[js.Any])
    if (numOutputs != null) __obj.updateDynamic("numOutputs")(numOutputs.asInstanceOf[js.Any])
    if (sideInputs != null) __obj.updateDynamic("sideInputs")(sideInputs.asInstanceOf[js.Any])
    if (userFn != null) __obj.updateDynamic("userFn")(userFn.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaParDoInstruction]
  }
}

