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
  def apply(args: js.Array[_] = null, function: String = null): SchemaFunctionCall = {
    val __obj = js.Dynamic.literal()
    if (args != null) __obj.updateDynamic("args")(args.asInstanceOf[js.Any])
    if (function != null) __obj.updateDynamic("function")(function.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaFunctionCall]
  }
}

