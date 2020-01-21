package typings.googleapis.scriptV1Mod.scriptV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An API executable entry point.
  */
@js.native
trait SchemaGoogleAppsScriptTypeExecutionApiEntryPoint extends js.Object {
  /**
    * The entry point&#39;s configuration.
    */
  var entryPointConfig: js.UndefOr[SchemaGoogleAppsScriptTypeExecutionApiConfig] = js.native
}

object SchemaGoogleAppsScriptTypeExecutionApiEntryPoint {
  @scala.inline
  def apply(entryPointConfig: SchemaGoogleAppsScriptTypeExecutionApiConfig = null): SchemaGoogleAppsScriptTypeExecutionApiEntryPoint = {
    val __obj = js.Dynamic.literal()
    if (entryPointConfig != null) __obj.updateDynamic("entryPointConfig")(entryPointConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleAppsScriptTypeExecutionApiEntryPoint]
  }
}

