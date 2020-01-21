package typings.googleapis.runV1alpha1Mod.runV1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * EnvFromSource represents the source of a set of ConfigMaps
  */
@js.native
trait SchemaEnvFromSource extends js.Object {
  /**
    * The ConfigMap to select from +optional
    */
  var configMapRef: js.UndefOr[SchemaConfigMapEnvSource] = js.native
  /**
    * An optional identifier to prepend to each key in the ConfigMap. Must be a
    * C_IDENTIFIER. +optional
    */
  var prefix: js.UndefOr[String] = js.native
  /**
    * The Secret to select from +optional
    */
  var secretRef: js.UndefOr[SchemaSecretEnvSource] = js.native
}

object SchemaEnvFromSource {
  @scala.inline
  def apply(
    configMapRef: SchemaConfigMapEnvSource = null,
    prefix: String = null,
    secretRef: SchemaSecretEnvSource = null
  ): SchemaEnvFromSource = {
    val __obj = js.Dynamic.literal()
    if (configMapRef != null) __obj.updateDynamic("configMapRef")(configMapRef.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (secretRef != null) __obj.updateDynamic("secretRef")(secretRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaEnvFromSource]
  }
}

