package typings.googleapis.scriptV1Mod.scriptV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A web application entry point.
  */
@js.native
trait SchemaGoogleAppsScriptTypeWebAppEntryPoint extends js.Object {
  /**
    * The entry point&#39;s configuration.
    */
  var entryPointConfig: js.UndefOr[SchemaGoogleAppsScriptTypeWebAppConfig] = js.native
  /**
    * The URL for the web application.
    */
  var url: js.UndefOr[String] = js.native
}

object SchemaGoogleAppsScriptTypeWebAppEntryPoint {
  @scala.inline
  def apply(entryPointConfig: SchemaGoogleAppsScriptTypeWebAppConfig = null, url: String = null): SchemaGoogleAppsScriptTypeWebAppEntryPoint = {
    val __obj = js.Dynamic.literal()
    if (entryPointConfig != null) __obj.updateDynamic("entryPointConfig")(entryPointConfig.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleAppsScriptTypeWebAppEntryPoint]
  }
}

