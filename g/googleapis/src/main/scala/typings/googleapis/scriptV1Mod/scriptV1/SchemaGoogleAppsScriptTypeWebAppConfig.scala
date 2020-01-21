package typings.googleapis.scriptV1Mod.scriptV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Web app entry point configuration.
  */
@js.native
trait SchemaGoogleAppsScriptTypeWebAppConfig extends js.Object {
  /**
    * Who has permission to run the web app.
    */
  var access: js.UndefOr[String] = js.native
  /**
    * Who to execute the web app as.
    */
  var executeAs: js.UndefOr[String] = js.native
}

object SchemaGoogleAppsScriptTypeWebAppConfig {
  @scala.inline
  def apply(access: String = null, executeAs: String = null): SchemaGoogleAppsScriptTypeWebAppConfig = {
    val __obj = js.Dynamic.literal()
    if (access != null) __obj.updateDynamic("access")(access.asInstanceOf[js.Any])
    if (executeAs != null) __obj.updateDynamic("executeAs")(executeAs.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleAppsScriptTypeWebAppConfig]
  }
}

