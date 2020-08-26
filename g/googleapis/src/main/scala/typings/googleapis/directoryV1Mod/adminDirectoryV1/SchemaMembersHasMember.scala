package typings.googleapis.directoryV1Mod.adminDirectoryV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON template for Has Member response in Directory API.
  */
@js.native
trait SchemaMembersHasMember extends js.Object {
  /**
    * Identifies whether the given user is a member of the group. Membership
    * can be direct or nested.
    */
  var isMember: js.UndefOr[Boolean] = js.native
}

object SchemaMembersHasMember {
  @scala.inline
  def apply(): SchemaMembersHasMember = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMembersHasMember]
  }
  @scala.inline
  implicit class SchemaMembersHasMemberOps[Self <: SchemaMembersHasMember] (val x: Self) extends AnyVal {
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
    def setIsMember(value: Boolean): Self = this.set("isMember", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsMember: Self = this.set("isMember", js.undefined)
  }
  
}

