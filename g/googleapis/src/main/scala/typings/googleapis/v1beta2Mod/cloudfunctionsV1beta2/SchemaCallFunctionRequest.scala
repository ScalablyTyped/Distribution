package typings.googleapis.v1beta2Mod.cloudfunctionsV1beta2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request for the `CallFunction` method.
  */
@js.native
trait SchemaCallFunctionRequest extends js.Object {
  /**
    * Input to be passed to the function.
    */
  var data: js.UndefOr[String] = js.native
}

object SchemaCallFunctionRequest {
  @scala.inline
  def apply(data: String = null): SchemaCallFunctionRequest = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaCallFunctionRequest]
  }
}

