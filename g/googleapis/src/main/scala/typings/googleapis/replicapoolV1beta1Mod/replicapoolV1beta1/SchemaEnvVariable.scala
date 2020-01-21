package typings.googleapis.replicapoolV1beta1Mod.replicapoolV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An environment variable to set for an action.
  */
@js.native
trait SchemaEnvVariable extends js.Object {
  /**
    * Deprecated, do not use.
    */
  var hidden: js.UndefOr[Boolean] = js.native
  /**
    * The name of the environment variable.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The value of the variable.
    */
  var value: js.UndefOr[String] = js.native
}

object SchemaEnvVariable {
  @scala.inline
  def apply(hidden: js.UndefOr[Boolean] = js.undefined, name: String = null, value: String = null): SchemaEnvVariable = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaEnvVariable]
  }
}

