package typings.googleapis.firebaserulesV1Mod.firebaserulesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a service-defined function call that was invoked during test
  * execution.
  */
@js.native
trait SchemaFunctionCall extends js.Object {
  /**
    * The arguments that were provided to the function.
    */
  var args: js.UndefOr[js.Array[_]] = js.native
  /**
    * Name of the function invoked.
    */
  var function: js.UndefOr[String] = js.native
}

object SchemaFunctionCall {
  @scala.inline
  def apply(): SchemaFunctionCall = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFunctionCall]
  }
  @scala.inline
  implicit class SchemaFunctionCallOps[Self <: SchemaFunctionCall] (val x: Self) extends AnyVal {
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
    def setArgsVarargs(value: js.Any*): Self = this.set("args", js.Array(value :_*))
    @scala.inline
    def setArgs(value: js.Array[_]): Self = this.set("args", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArgs: Self = this.set("args", js.undefined)
    @scala.inline
    def setFunction(value: String): Self = this.set("function", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFunction: Self = this.set("function", js.undefined)
  }
  
}

