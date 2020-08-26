package typings.googleapis.tagmanagerV2Mod.tagmanagerV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Create container versions response.
  */
@js.native
trait SchemaCreateContainerVersionResponse extends js.Object {
  /**
    * Compiler errors or not.
    */
  var compilerError: js.UndefOr[Boolean] = js.native
  /**
    * The container version created.
    */
  var containerVersion: js.UndefOr[SchemaContainerVersion] = js.native
  /**
    * Auto generated workspace path created as a result of version creation.
    * This field should only be populated if the created version was not a
    * quick preview.
    */
  var newWorkspacePath: js.UndefOr[String] = js.native
  /**
    * Whether version creation failed when syncing the workspace to the latest
    * container version.
    */
  var syncStatus: js.UndefOr[SchemaSyncStatus] = js.native
}

object SchemaCreateContainerVersionResponse {
  @scala.inline
  def apply(): SchemaCreateContainerVersionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreateContainerVersionResponse]
  }
  @scala.inline
  implicit class SchemaCreateContainerVersionResponseOps[Self <: SchemaCreateContainerVersionResponse] (val x: Self) extends AnyVal {
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
    def setCompilerError(value: Boolean): Self = this.set("compilerError", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompilerError: Self = this.set("compilerError", js.undefined)
    @scala.inline
    def setContainerVersion(value: SchemaContainerVersion): Self = this.set("containerVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainerVersion: Self = this.set("containerVersion", js.undefined)
    @scala.inline
    def setNewWorkspacePath(value: String): Self = this.set("newWorkspacePath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNewWorkspacePath: Self = this.set("newWorkspacePath", js.undefined)
    @scala.inline
    def setSyncStatus(value: SchemaSyncStatus): Self = this.set("syncStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSyncStatus: Self = this.set("syncStatus", js.undefined)
  }
  
}

