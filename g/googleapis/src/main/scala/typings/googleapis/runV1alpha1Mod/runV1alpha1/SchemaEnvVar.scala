package typings.googleapis.runV1alpha1Mod.runV1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * EnvVar represents an environment variable present in a Container.
  */
@js.native
trait SchemaEnvVar extends js.Object {
  /**
    * Name of the environment variable. Must be a C_IDENTIFIER.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Variable references $(VAR_NAME) are expanded using the previous defined
    * environment variables in the container and any route environment
    * variables. If a variable cannot be resolved, the reference in the input
    * string will be unchanged. The $(VAR_NAME) syntax can be escaped with a
    * double $$, ie: $$(VAR_NAME). Escaped references will never be expanded,
    * regardless of whether the variable exists or not. Defaults to
    * &quot;&quot;. +optional
    */
  var value: js.UndefOr[String] = js.native
}

object SchemaEnvVar {
  @scala.inline
  def apply(name: String = null, value: String = null): SchemaEnvVar = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaEnvVar]
  }
}

