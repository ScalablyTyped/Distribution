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
  def apply(isMember: js.UndefOr[Boolean] = js.undefined): SchemaMembersHasMember = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(isMember)) __obj.updateDynamic("isMember")(isMember.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaMembersHasMember]
  }
}

