package typings.googleapis.v3Mod.analyticsV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON template for a user reference.
  */
@js.native
trait SchemaUserRef extends js.Object {
  /**
    * Email ID of this user.
    */
  var email: js.UndefOr[String] = js.native
  /**
    * User ID.
    */
  var id: js.UndefOr[String] = js.native
  var kind: js.UndefOr[String] = js.native
}

object SchemaUserRef {
  @scala.inline
  def apply(email: String = null, id: String = null, kind: String = null): SchemaUserRef = {
    val __obj = js.Dynamic.literal()
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaUserRef]
  }
}

