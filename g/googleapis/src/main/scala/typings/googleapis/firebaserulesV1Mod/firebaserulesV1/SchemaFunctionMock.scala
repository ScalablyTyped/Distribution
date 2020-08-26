package typings.googleapis.firebaserulesV1Mod.firebaserulesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Mock function definition.  Mocks must refer to a function declared by the
  * target service. The type of the function args and result will be inferred
  * at test time. If either the arg or result values are not compatible with
  * function type declaration, the request will be considered invalid.  More
  * than one `FunctionMock` may be provided for a given function name so long
  * as the `Arg` matchers are distinct. There may be only one function for a
  * given overload where all `Arg` values are `Arg.any_value`.
  */
@js.native
trait SchemaFunctionMock extends js.Object {
  /**
    * The list of `Arg` values to match. The order in which the arguments are
    * provided is the order in which they must appear in the function
    * invocation.
    */
  var args: js.UndefOr[js.Array[SchemaArg]] = js.native
  /**
    * The name of the function.  The function name must match one provided by a
    * service declaration.
    */
  var function: js.UndefOr[String] = js.native
  /**
    * The mock result of the function call.
    */
  var result: js.UndefOr[SchemaResult] = js.native
}

object SchemaFunctionMock {
  @scala.inline
  def apply(): SchemaFunctionMock = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFunctionMock]
  }
  @scala.inline
  implicit class SchemaFunctionMockOps[Self <: SchemaFunctionMock] (val x: Self) extends AnyVal {
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
    def setArgsVarargs(value: SchemaArg*): Self = this.set("args", js.Array(value :_*))
    @scala.inline
    def setArgs(value: js.Array[SchemaArg]): Self = this.set("args", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArgs: Self = this.set("args", js.undefined)
    @scala.inline
    def setFunction(value: String): Self = this.set("function", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFunction: Self = this.set("function", js.undefined)
    @scala.inline
    def setResult(value: SchemaResult): Self = this.set("result", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResult: Self = this.set("result", js.undefined)
  }
  
}

