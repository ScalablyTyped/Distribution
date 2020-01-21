package typings.googleapis.tagmanagerV2Mod.tagmanagerV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Built-in variables are a special category of variables that are pre-created
  * and non-customizable. They provide common functionality like accessing
  * propeties of the gtm data layer, monitoring clicks, or accessing elements
  * of a page URL.
  */
@js.native
trait SchemaBuiltInVariable extends js.Object {
  /**
    * GTM Account ID.
    */
  var accountId: js.UndefOr[String] = js.native
  /**
    * GTM Container ID.
    */
  var containerId: js.UndefOr[String] = js.native
  /**
    * Name of the built-in variable to be used to refer to the built-in
    * variable.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * GTM BuiltInVariable&#39;s API relative path.
    */
  var path: js.UndefOr[String] = js.native
  /**
    * Type of built-in variable.
    */
  var `type`: js.UndefOr[String] = js.native
  /**
    * GTM Workspace ID.
    */
  var workspaceId: js.UndefOr[String] = js.native
}

object SchemaBuiltInVariable {
  @scala.inline
  def apply(
    accountId: String = null,
    containerId: String = null,
    name: String = null,
    path: String = null,
    `type`: String = null,
    workspaceId: String = null
  ): SchemaBuiltInVariable = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId.asInstanceOf[js.Any])
    if (containerId != null) __obj.updateDynamic("containerId")(containerId.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (workspaceId != null) __obj.updateDynamic("workspaceId")(workspaceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaBuiltInVariable]
  }
}

