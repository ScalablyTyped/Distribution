package typings.googleapis.v3Mod.analyticsV3

import typings.googleapis.AnonHref
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON template for Analytics Custom Dimension.
  */
@js.native
trait SchemaCustomDimension extends js.Object {
  /**
    * Account ID.
    */
  var accountId: js.UndefOr[String] = js.native
  /**
    * Boolean indicating whether the custom dimension is active.
    */
  var active: js.UndefOr[Boolean] = js.native
  /**
    * Time the custom dimension was created.
    */
  var created: js.UndefOr[String] = js.native
  /**
    * Custom dimension ID.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Index of the custom dimension.
    */
  var index: js.UndefOr[Double] = js.native
  /**
    * Kind value for a custom dimension. Set to
    * &quot;analytics#customDimension&quot;. It is a read-only field.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Name of the custom dimension.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Parent link for the custom dimension. Points to the property to which the
    * custom dimension belongs.
    */
  var parentLink: js.UndefOr[AnonHref] = js.native
  /**
    * Scope of the custom dimension: HIT, SESSION, USER or PRODUCT.
    */
  var scope: js.UndefOr[String] = js.native
  /**
    * Link for the custom dimension
    */
  var selfLink: js.UndefOr[String] = js.native
  /**
    * Time the custom dimension was last modified.
    */
  var updated: js.UndefOr[String] = js.native
  /**
    * Property ID.
    */
  var webPropertyId: js.UndefOr[String] = js.native
}

object SchemaCustomDimension {
  @scala.inline
  def apply(
    accountId: String = null,
    active: js.UndefOr[Boolean] = js.undefined,
    created: String = null,
    id: String = null,
    index: Int | Double = null,
    kind: String = null,
    name: String = null,
    parentLink: AnonHref = null,
    scope: String = null,
    selfLink: String = null,
    updated: String = null,
    webPropertyId: String = null
  ): SchemaCustomDimension = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId.asInstanceOf[js.Any])
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    if (created != null) __obj.updateDynamic("created")(created.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (parentLink != null) __obj.updateDynamic("parentLink")(parentLink.asInstanceOf[js.Any])
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink.asInstanceOf[js.Any])
    if (updated != null) __obj.updateDynamic("updated")(updated.asInstanceOf[js.Any])
    if (webPropertyId != null) __obj.updateDynamic("webPropertyId")(webPropertyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaCustomDimension]
  }
}

