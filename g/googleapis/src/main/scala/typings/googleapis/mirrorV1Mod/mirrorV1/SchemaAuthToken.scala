package typings.googleapis.mirrorV1Mod.mirrorV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaAuthToken extends js.Object {
  var authToken: js.UndefOr[String] = js.native
  var `type`: js.UndefOr[String] = js.native
}

object SchemaAuthToken {
  @scala.inline
  def apply(authToken: String = null, `type`: String = null): SchemaAuthToken = {
    val __obj = js.Dynamic.literal()
    if (authToken != null) __obj.updateDynamic("authToken")(authToken.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAuthToken]
  }
}

