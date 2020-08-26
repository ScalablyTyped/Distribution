package typings.googleapis.containeranalysisV1alpha1Mod.containeranalysisV1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The period during which some deployable was active in a runtime.
  */
@js.native
trait SchemaDeployment extends js.Object {
  /**
    * Address of the runtime element hosting this deployment.
    */
  var address: js.UndefOr[String] = js.native
  /**
    * Configuration used to create this deployment.
    */
  var config: js.UndefOr[String] = js.native
  /**
    * Beginning of the lifetime of this deployment.
    */
  var deployTime: js.UndefOr[String] = js.native
  /**
    * Platform hosting this deployment.
    */
  var platform: js.UndefOr[String] = js.native
  /**
    * Output only. Resource URI for the artifact being deployed taken from the
    * deployable field with the same name.
    */
  var resourceUri: js.UndefOr[js.Array[String]] = js.native
  /**
    * End of the lifetime of this deployment.
    */
  var undeployTime: js.UndefOr[String] = js.native
  /**
    * Identity of the user that triggered this deployment.
    */
  var userEmail: js.UndefOr[String] = js.native
}

object SchemaDeployment {
  @scala.inline
  def apply(): SchemaDeployment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDeployment]
  }
  @scala.inline
  implicit class SchemaDeploymentOps[Self <: SchemaDeployment] (val x: Self) extends AnyVal {
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
    def setAddress(value: String): Self = this.set("address", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddress: Self = this.set("address", js.undefined)
    @scala.inline
    def setConfig(value: String): Self = this.set("config", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfig: Self = this.set("config", js.undefined)
    @scala.inline
    def setDeployTime(value: String): Self = this.set("deployTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeployTime: Self = this.set("deployTime", js.undefined)
    @scala.inline
    def setPlatform(value: String): Self = this.set("platform", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlatform: Self = this.set("platform", js.undefined)
    @scala.inline
    def setResourceUriVarargs(value: String*): Self = this.set("resourceUri", js.Array(value :_*))
    @scala.inline
    def setResourceUri(value: js.Array[String]): Self = this.set("resourceUri", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceUri: Self = this.set("resourceUri", js.undefined)
    @scala.inline
    def setUndeployTime(value: String): Self = this.set("undeployTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUndeployTime: Self = this.set("undeployTime", js.undefined)
    @scala.inline
    def setUserEmail(value: String): Self = this.set("userEmail", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserEmail: Self = this.set("userEmail", js.undefined)
  }
  
}

