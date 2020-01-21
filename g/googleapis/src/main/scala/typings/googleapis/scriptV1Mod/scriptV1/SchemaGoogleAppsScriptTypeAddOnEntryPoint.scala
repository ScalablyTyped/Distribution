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
  def apply(
    addOnType: String = null,
    description: String = null,
    helpUrl: String = null,
    postInstallTipUrl: String = null,
    reportIssueUrl: String = null,
    title: String = null
  ): SchemaGoogleAppsScriptTypeAddOnEntryPoint = {
    val __obj = js.Dynamic.literal()
    if (addOnType != null) __obj.updateDynamic("addOnType")(addOnType.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (helpUrl != null) __obj.updateDynamic("helpUrl")(helpUrl.asInstanceOf[js.Any])
    if (postInstallTipUrl != null) __obj.updateDynamic("postInstallTipUrl")(postInstallTipUrl.asInstanceOf[js.Any])
    if (reportIssueUrl != null) __obj.updateDynamic("reportIssueUrl")(reportIssueUrl.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleAppsScriptTypeAddOnEntryPoint]
  }
}

