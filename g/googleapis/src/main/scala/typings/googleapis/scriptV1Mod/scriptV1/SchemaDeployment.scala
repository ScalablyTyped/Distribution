package typings.googleapis.scriptV1Mod.scriptV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Representation of a single script deployment.
  */
@js.native
trait SchemaDeployment extends js.Object {
  /**
    * The deployment configuration.
    */
  var deploymentConfig: js.UndefOr[SchemaDeploymentConfig] = js.native
  /**
    * The deployment ID for this deployment.
    */
  var deploymentId: js.UndefOr[String] = js.native
  /**
    * The deployment&#39;s entry points.
    */
  var entryPoints: js.UndefOr[js.Array[SchemaEntryPoint]] = js.native
  /**
    * Last modified date time stamp.
    */
  var updateTime: js.UndefOr[String] = js.native
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
    def setDeploymentConfig(value: SchemaDeploymentConfig): Self = this.set("deploymentConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeploymentConfig: Self = this.set("deploymentConfig", js.undefined)
    @scala.inline
    def setDeploymentId(value: String): Self = this.set("deploymentId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeploymentId: Self = this.set("deploymentId", js.undefined)
    @scala.inline
    def setEntryPointsVarargs(value: SchemaEntryPoint*): Self = this.set("entryPoints", js.Array(value :_*))
    @scala.inline
    def setEntryPoints(value: js.Array[SchemaEntryPoint]): Self = this.set("entryPoints", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEntryPoints: Self = this.set("entryPoints", js.undefined)
    @scala.inline
    def setUpdateTime(value: String): Self = this.set("updateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdateTime: Self = this.set("updateTime", js.undefined)
  }
  
}

