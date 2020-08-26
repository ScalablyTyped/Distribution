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
  def apply(): SchemaParDoInstruction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaParDoInstruction]
  }
  @scala.inline
  implicit class SchemaParDoInstructionOps[Self <: SchemaParDoInstruction] (val x: Self) extends AnyVal {
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
    def setMultiOutputInfosVarargs(value: SchemaMultiOutputInfo*): Self = this.set("multiOutputInfos", js.Array(value :_*))
    @scala.inline
    def setMultiOutputInfos(value: js.Array[SchemaMultiOutputInfo]): Self = this.set("multiOutputInfos", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMultiOutputInfos: Self = this.set("multiOutputInfos", js.undefined)
    @scala.inline
    def setNumOutputs(value: Double): Self = this.set("numOutputs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumOutputs: Self = this.set("numOutputs", js.undefined)
    @scala.inline
    def setSideInputsVarargs(value: SchemaSideInputInfo*): Self = this.set("sideInputs", js.Array(value :_*))
    @scala.inline
    def setSideInputs(value: js.Array[SchemaSideInputInfo]): Self = this.set("sideInputs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSideInputs: Self = this.set("sideInputs", js.undefined)
    @scala.inline
    def setUserFn(value: StringDictionary[js.Any]): Self = this.set("userFn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserFn: Self = this.set("userFn", js.undefined)
  }
  
}

