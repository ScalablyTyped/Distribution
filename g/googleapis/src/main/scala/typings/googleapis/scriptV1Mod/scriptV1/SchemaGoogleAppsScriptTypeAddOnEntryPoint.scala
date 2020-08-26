package typings.googleapis.scriptV1Mod.scriptV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An add-on entry point.
  */
@js.native
trait SchemaGoogleAppsScriptTypeAddOnEntryPoint extends js.Object {
  /**
    * The add-on&#39;s required list of supported container types.
    */
  var addOnType: js.UndefOr[String] = js.native
  /**
    * The add-on&#39;s optional description.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * The add-on&#39;s optional help URL.
    */
  var helpUrl: js.UndefOr[String] = js.native
  /**
    * The add-on&#39;s required post install tip URL.
    */
  var postInstallTipUrl: js.UndefOr[String] = js.native
  /**
    * The add-on&#39;s optional report issue URL.
    */
  var reportIssueUrl: js.UndefOr[String] = js.native
  /**
    * The add-on&#39;s required title.
    */
  var title: js.UndefOr[String] = js.native
}

object SchemaGoogleAppsScriptTypeAddOnEntryPoint {
  @scala.inline
  def apply(): SchemaGoogleAppsScriptTypeAddOnEntryPoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleAppsScriptTypeAddOnEntryPoint]
  }
  @scala.inline
  implicit class SchemaGoogleAppsScriptTypeAddOnEntryPointOps[Self <: SchemaGoogleAppsScriptTypeAddOnEntryPoint] (val x: Self) extends AnyVal {
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
    def setAddOnType(value: String): Self = this.set("addOnType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddOnType: Self = this.set("addOnType", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setHelpUrl(value: String): Self = this.set("helpUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHelpUrl: Self = this.set("helpUrl", js.undefined)
    @scala.inline
    def setPostInstallTipUrl(value: String): Self = this.set("postInstallTipUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePostInstallTipUrl: Self = this.set("postInstallTipUrl", js.undefined)
    @scala.inline
    def setReportIssueUrl(value: String): Self = this.set("reportIssueUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReportIssueUrl: Self = this.set("reportIssueUrl", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
  
}

