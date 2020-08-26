package typings.googleapis.tagmanagerV2Mod.tagmanagerV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response to quick previewing a workspace.
  */
@js.native
trait SchemaQuickPreviewResponse extends js.Object {
  /**
    * Were there compiler errors or not.
    */
  var compilerError: js.UndefOr[Boolean] = js.native
  /**
    * The quick previewed container version.
    */
  var containerVersion: js.UndefOr[SchemaContainerVersion] = js.native
  /**
    * Whether quick previewing failed when syncing the workspace to the latest
    * container version.
    */
  var syncStatus: js.UndefOr[SchemaSyncStatus] = js.native
}

object SchemaQuickPreviewResponse {
  @scala.inline
  def apply(): SchemaQuickPreviewResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaQuickPreviewResponse]
  }
  @scala.inline
  implicit class SchemaQuickPreviewResponseOps[Self <: SchemaQuickPreviewResponse] (val x: Self) extends AnyVal {
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
    def setSyncStatus(value: SchemaSyncStatus): Self = this.set("syncStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSyncStatus: Self = this.set("syncStatus", js.undefined)
  }
  
}

