package typings.googleapis.scriptV1Mod.scriptV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * API executable entry point configuration.
  */
@js.native
trait SchemaGoogleAppsScriptTypeExecutionApiConfig extends js.Object {
  /**
    * Who has permission to run the API executable.
    */
  var access: js.UndefOr[String] = js.native
}

object SchemaGoogleAppsScriptTypeExecutionApiConfig {
  @scala.inline
  def apply(access: String = null): SchemaGoogleAppsScriptTypeExecutionApiConfig = {
    val __obj = js.Dynamic.literal()
    if (access != null) __obj.updateDynamic("access")(access.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleAppsScriptTypeExecutionApiConfig]
  }
}

