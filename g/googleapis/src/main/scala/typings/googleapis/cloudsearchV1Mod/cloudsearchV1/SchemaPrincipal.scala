package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Reference to a user, group, or domain.
  */
@js.native
trait SchemaPrincipal extends js.Object {
  /**
    * This principal is a group identified using an external identity. The name
    * field must specify the group resource name with this format:
    * identitysources/{source_id}/groups/{ID}
    */
  var groupResourceName: js.UndefOr[String] = js.native
  /**
    * This principal is a GSuite user, group or domain.
    */
  var gsuitePrincipal: js.UndefOr[SchemaGSuitePrincipal] = js.native
  /**
    * This principal is a user identified using an external identity. The name
    * field must specify the user resource name with this format:
    * identitysources/{source_id}/users/{ID}
    */
  var userResourceName: js.UndefOr[String] = js.native
}

object SchemaPrincipal {
  @scala.inline
  def apply(
    groupResourceName: String = null,
    gsuitePrincipal: SchemaGSuitePrincipal = null,
    userResourceName: String = null
  ): SchemaPrincipal = {
    val __obj = js.Dynamic.literal()
    if (groupResourceName != null) __obj.updateDynamic("groupResourceName")(groupResourceName.asInstanceOf[js.Any])
    if (gsuitePrincipal != null) __obj.updateDynamic("gsuitePrincipal")(gsuitePrincipal.asInstanceOf[js.Any])
    if (userResourceName != null) __obj.updateDynamic("userResourceName")(userResourceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaPrincipal]
  }
}

