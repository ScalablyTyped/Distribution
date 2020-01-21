package typings.googleapis.plusV1Mod.plusV1

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
    * The list of access entries.
    */
  var items: js.UndefOr[js.Array[SchemaPlusAclentryResource]] = js.native
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
    items: js.Array[SchemaPlusAclentryResource] = null,
    kind: String = null
  ): SchemaAcl = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAcl]
  }
}

