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
  def apply(): SchemaEntryPoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEntryPoint]
  }
  @scala.inline
  implicit class SchemaEntryPointOps[Self <: SchemaEntryPoint] (val x: Self) extends AnyVal {
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
    def setAddOn(value: SchemaGoogleAppsScriptTypeAddOnEntryPoint): Self = this.set("addOn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddOn: Self = this.set("addOn", js.undefined)
    @scala.inline
    def setEntryPointType(value: String): Self = this.set("entryPointType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEntryPointType: Self = this.set("entryPointType", js.undefined)
    @scala.inline
    def setExecutionApi(value: SchemaGoogleAppsScriptTypeExecutionApiEntryPoint): Self = this.set("executionApi", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExecutionApi: Self = this.set("executionApi", js.undefined)
    @scala.inline
    def setWebApp(value: SchemaGoogleAppsScriptTypeWebAppEntryPoint): Self = this.set("webApp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWebApp: Self = this.set("webApp", js.undefined)
  }
  
}

