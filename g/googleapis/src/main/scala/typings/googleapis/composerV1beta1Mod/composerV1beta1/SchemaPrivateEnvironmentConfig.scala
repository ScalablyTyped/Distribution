package typings.googleapis.composerV1beta1Mod.composerV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The configuration information for configuring a Private IP Cloud Composer
  * environment.
  */
@js.native
trait SchemaPrivateEnvironmentConfig extends js.Object {
  /**
    * Optional. If `true`, a Private IP Cloud Composer environment is created.
    * If this field is true, `use_ip_aliases` must be true.
    */
  var enablePrivateEnvironment: js.UndefOr[Boolean] = js.native
  /**
    * Optional. Configuration for the private GKE cluster for a Private IP
    * Cloud Composer environment.
    */
  var privateClusterConfig: js.UndefOr[SchemaPrivateClusterConfig] = js.native
}

object SchemaPrivateEnvironmentConfig {
  @scala.inline
  def apply(): SchemaPrivateEnvironmentConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPrivateEnvironmentConfig]
  }
  @scala.inline
  implicit class SchemaPrivateEnvironmentConfigOps[Self <: SchemaPrivateEnvironmentConfig] (val x: Self) extends AnyVal {
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
    def setEnablePrivateEnvironment(value: Boolean): Self = this.set("enablePrivateEnvironment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnablePrivateEnvironment: Self = this.set("enablePrivateEnvironment", js.undefined)
    @scala.inline
    def setPrivateClusterConfig(value: SchemaPrivateClusterConfig): Self = this.set("privateClusterConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrivateClusterConfig: Self = this.set("privateClusterConfig", js.undefined)
  }
  
}

