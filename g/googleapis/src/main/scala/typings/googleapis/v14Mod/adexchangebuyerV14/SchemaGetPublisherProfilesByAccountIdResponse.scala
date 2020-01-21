package typings.googleapis.v14Mod.adexchangebuyerV14

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaGetPublisherProfilesByAccountIdResponse extends js.Object {
  /**
    * Profiles for the requested publisher
    */
  var profiles: js.UndefOr[js.Array[SchemaPublisherProfileApiProto]] = js.native
}

object SchemaGetPublisherProfilesByAccountIdResponse {
  @scala.inline
  def apply(profiles: js.Array[SchemaPublisherProfileApiProto] = null): SchemaGetPublisherProfilesByAccountIdResponse = {
    val __obj = js.Dynamic.literal()
    if (profiles != null) __obj.updateDynamic("profiles")(profiles.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGetPublisherProfilesByAccountIdResponse]
  }
}

