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
  def apply(): SchemaEnvFromSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEnvFromSource]
  }
  @scala.inline
  implicit class SchemaEnvFromSourceOps[Self <: SchemaEnvFromSource] (val x: Self) extends AnyVal {
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
    def setConfigMapRef(value: SchemaConfigMapEnvSource): Self = this.set("configMapRef", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfigMapRef: Self = this.set("configMapRef", js.undefined)
    @scala.inline
    def setPrefix(value: String): Self = this.set("prefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrefix: Self = this.set("prefix", js.undefined)
    @scala.inline
    def setSecretRef(value: SchemaSecretEnvSource): Self = this.set("secretRef", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecretRef: Self = this.set("secretRef", js.undefined)
  }
  
}

