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
  def apply(): SchemaPrincipal = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPrincipal]
  }
  @scala.inline
  implicit class SchemaPrincipalOps[Self <: SchemaPrincipal] (val x: Self) extends AnyVal {
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
    def setGroupResourceName(value: String): Self = this.set("groupResourceName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroupResourceName: Self = this.set("groupResourceName", js.undefined)
    @scala.inline
    def setGsuitePrincipal(value: SchemaGSuitePrincipal): Self = this.set("gsuitePrincipal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGsuitePrincipal: Self = this.set("gsuitePrincipal", js.undefined)
    @scala.inline
    def setUserResourceName(value: String): Self = this.set("userResourceName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserResourceName: Self = this.set("userResourceName", js.undefined)
  }
  
}

