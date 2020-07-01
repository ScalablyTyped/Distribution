package typings.googleapis.plusDomainsV1Mod.plusDomainsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaAcl extends js.Object {
  /**
    * Description of the access granted, suitable for display.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * Whether access is restricted to the domain.
    */
  var domainRestricted: js.UndefOr[Boolean] = js.native
  /**
    * The list of access entries.
    */
  var items: js.UndefOr[js.Array[SchemaPlusDomainsAclentryResource]] = js.native
  /**
    * Identifies this resource as a collection of access controls. Value:
    * &quot;plus#acl&quot;.
    */
  var kind: js.UndefOr[String] = js.native
}

object SchemaAcl {
  @scala.inline
  def apply(
    description: String = null,
    domainRestricted: js.UndefOr[Boolean] = js.undefined,
    items: js.Array[SchemaPlusDomainsAclentryResource] = null,
    kind: String = null
  ): SchemaAcl = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (!js.isUndefined(domainRestricted)) __obj.updateDynamic("domainRestricted")(domainRestricted.get.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAcl]
  }
}

