package typings.googleapis.runV1alpha1Mod.runV1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * SecretEnvSource selects a Secret to populate the environment variables
  * with.  The contents of the target Secret&#39;s Data field will represent
  * the key-value pairs as environment variables.
  */
@js.native
trait SchemaSecretEnvSource extends js.Object {
  /**
    * The Secret to select from.
    */
  var localObjectReference: js.UndefOr[SchemaLocalObjectReference] = js.native
  /**
    * Specify whether the Secret must be defined +optional
    */
  var optional: js.UndefOr[Boolean] = js.native
}

object SchemaSecretEnvSource {
  @scala.inline
  def apply(
    localObjectReference: SchemaLocalObjectReference = null,
    optional: js.UndefOr[Boolean] = js.undefined
  ): SchemaSecretEnvSource = {
    val __obj = js.Dynamic.literal()
    if (localObjectReference != null) __obj.updateDynamic("localObjectReference")(localObjectReference.asInstanceOf[js.Any])
    if (!js.isUndefined(optional)) __obj.updateDynamic("optional")(optional.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaSecretEnvSource]
  }
}

