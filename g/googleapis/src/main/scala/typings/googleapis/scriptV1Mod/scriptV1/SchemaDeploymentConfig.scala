package typings.googleapis.scriptV1Mod.scriptV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Metadata the defines how a deployment is configured.
  */
@js.native
trait SchemaDeploymentConfig extends js.Object {
  
  /**
    * The description for this deployment.
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * The manifest file name for this deployment.
    */
  var manifestFileName: js.UndefOr[String] = js.native
  
  /**
    * The script project&#39;s Drive ID.
    */
  var scriptId: js.UndefOr[String] = js.native
  
  /**
    * The version number on which this deployment is based.
    */
  var versionNumber: js.UndefOr[Double] = js.native
}
object SchemaDeploymentConfig {
  
  @scala.inline
  def apply(): SchemaDeploymentConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDeploymentConfig]
  }
  
  @scala.inline
  implicit class SchemaDeploymentConfigOps[Self <: SchemaDeploymentConfig] (val x: Self) extends AnyVal {
    
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
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setManifestFileName(value: String): Self = this.set("manifestFileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteManifestFileName: Self = this.set("manifestFileName", js.undefined)
    
    @scala.inline
    def setScriptId(value: String): Self = this.set("scriptId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScriptId: Self = this.set("scriptId", js.undefined)
    
    @scala.inline
    def setVersionNumber(value: Double): Self = this.set("versionNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersionNumber: Self = this.set("versionNumber", js.undefined)
  }
}
