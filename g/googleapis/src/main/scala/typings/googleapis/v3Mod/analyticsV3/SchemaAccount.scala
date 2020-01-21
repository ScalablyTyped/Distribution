package typings.googleapis.v3Mod.analyticsV3

import typings.googleapis.AnonEffective
import typings.googleapis.AnonHref
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON template for Analytics account entry.
  */
@js.native
trait SchemaAccount extends js.Object {
  /**
    * Child link for an account entry. Points to the list of web properties for
    * this account.
    */
  var childLink: js.UndefOr[AnonHref] = js.native
  /**
    * Time the account was created.
    */
  var created: js.UndefOr[String] = js.native
  /**
    * Account ID.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Resource type for Analytics account.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Account name.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Permissions the user has for this account.
    */
  var permissions: js.UndefOr[AnonEffective] = js.native
  /**
    * Link for this account.
    */
  var selfLink: js.UndefOr[String] = js.native
  /**
    * Indicates whether this account is starred or not.
    */
  var starred: js.UndefOr[Boolean] = js.native
  /**
    * Time the account was last modified.
    */
  var updated: js.UndefOr[String] = js.native
}

object SchemaAccount {
  @scala.inline
  def apply(
    childLink: AnonHref = null,
    created: String = null,
    id: String = null,
    kind: String = null,
    name: String = null,
    permissions: AnonEffective = null,
    selfLink: String = null,
    starred: js.UndefOr[Boolean] = js.undefined,
    updated: String = null
  ): SchemaAccount = {
    val __obj = js.Dynamic.literal()
    if (childLink != null) __obj.updateDynamic("childLink")(childLink.asInstanceOf[js.Any])
    if (created != null) __obj.updateDynamic("created")(created.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (permissions != null) __obj.updateDynamic("permissions")(permissions.asInstanceOf[js.Any])
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink.asInstanceOf[js.Any])
    if (!js.isUndefined(starred)) __obj.updateDynamic("starred")(starred.asInstanceOf[js.Any])
    if (updated != null) __obj.updateDynamic("updated")(updated.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAccount]
  }
}

