package typings.googleapis.scriptV1Mod.scriptV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A configuration that defines how a deployment is accessed externally.
  */
@js.native
trait SchemaEntryPoint extends js.Object {
  /**
    * Add-on properties.
    */
  var addOn: js.UndefOr[SchemaGoogleAppsScriptTypeAddOnEntryPoint] = js.native
  /**
    * The type of the entry point.
    */
  var entryPointType: js.UndefOr[String] = js.native
  /**
    * An entry point specification for Apps Script API execution calls.
    */
  var executionApi: js.UndefOr[SchemaGoogleAppsScriptTypeExecutionApiEntryPoint] = js.native
  /**
    * An entry point specification for web apps.
    */
  var webApp: js.UndefOr[SchemaGoogleAppsScriptTypeWebAppEntryPoint] = js.native
}

object SchemaEntryPoint {
  @scala.inline
  def apply(
    addOn: SchemaGoogleAppsScriptTypeAddOnEntryPoint = null,
    entryPointType: String = null,
    executionApi: SchemaGoogleAppsScriptTypeExecutionApiEntryPoint = null,
    webApp: SchemaGoogleAppsScriptTypeWebAppEntryPoint = null
  ): SchemaEntryPoint = {
    val __obj = js.Dynamic.literal()
    if (addOn != null) __obj.updateDynamic("addOn")(addOn.asInstanceOf[js.Any])
    if (entryPointType != null) __obj.updateDynamic("entryPointType")(entryPointType.asInstanceOf[js.Any])
    if (executionApi != null) __obj.updateDynamic("executionApi")(executionApi.asInstanceOf[js.Any])
    if (webApp != null) __obj.updateDynamic("webApp")(webApp.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaEntryPoint]
  }
}

