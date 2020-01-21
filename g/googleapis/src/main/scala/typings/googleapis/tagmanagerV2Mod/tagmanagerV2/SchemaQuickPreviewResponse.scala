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
  def apply(
    compilerError: js.UndefOr[Boolean] = js.undefined,
    containerVersion: SchemaContainerVersion = null,
    syncStatus: SchemaSyncStatus = null
  ): SchemaQuickPreviewResponse = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(compilerError)) __obj.updateDynamic("compilerError")(compilerError.asInstanceOf[js.Any])
    if (containerVersion != null) __obj.updateDynamic("containerVersion")(containerVersion.asInstanceOf[js.Any])
    if (syncStatus != null) __obj.updateDynamic("syncStatus")(syncStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaQuickPreviewResponse]
  }
}

