package typings.googleapis.v1beta2Mod.cloudfunctionsV1beta2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response of `CallFunction` method.
  */
@js.native
trait SchemaCallFunctionResponse extends js.Object {
  /**
    * Either system or user-function generated error. Set if execution was not
    * successful.
    */
  var error: js.UndefOr[String] = js.native
  /**
    * Execution id of function invocation.
    */
  var executionId: js.UndefOr[String] = js.native
  /**
    * Result populated for successful execution of synchronous function. Will
    * not be populated if function does not return a result through context.
    */
  var result: js.UndefOr[String] = js.native
}

object SchemaCallFunctionResponse {
  @scala.inline
  def apply(): SchemaCallFunctionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCallFunctionResponse]
  }
  @scala.inline
  implicit class SchemaCallFunctionResponseOps[Self <: SchemaCallFunctionResponse] (val x: Self) extends AnyVal {
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
    def setError(value: String): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    @scala.inline
    def setExecutionId(value: String): Self = this.set("executionId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExecutionId: Self = this.set("executionId", js.undefined)
    @scala.inline
    def setResult(value: String): Self = this.set("result", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResult: Self = this.set("result", js.undefined)
  }
  
}

