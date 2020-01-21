package typings.googleapis.v3Mod.analyticsV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON template for a linked view (profile).
  */
@js.native
trait SchemaProfileRef extends js.Object {
  /**
    * Account ID to which this view (profile) belongs.
    */
  var accountId: js.UndefOr[String] = js.native
  /**
    * Link for this view (profile).
    */
  var href: js.UndefOr[String] = js.native
  /**
    * View (Profile) ID.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Internal ID for the web property to which this view (profile) belongs.
    */
  var internalWebPropertyId: js.UndefOr[String] = js.native
  /**
    * Analytics view (profile) reference.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Name of this view (profile).
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Web property ID of the form UA-XXXXX-YY to which this view (profile)
    * belongs.
    */
  var webPropertyId: js.UndefOr[String] = js.native
}

object SchemaProfileRef {
  @scala.inline
  def apply(
    accountId: String = null,
    href: String = null,
    id: String = null,
    internalWebPropertyId: String = null,
    kind: String = null,
    name: String = null,
    webPropertyId: String = null
  ): SchemaProfileRef = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId.asInstanceOf[js.Any])
    if (href != null) __obj.updateDynamic("href")(href.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (internalWebPropertyId != null) __obj.updateDynamic("internalWebPropertyId")(internalWebPropertyId.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (webPropertyId != null) __obj.updateDynamic("webPropertyId")(webPropertyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaProfileRef]
  }
}

