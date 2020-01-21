package typings.googleapis.gmailV1Mod.gmailV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaListSmimeInfoResponse extends js.Object {
  /**
    * List of SmimeInfo.
    */
  var smimeInfo: js.UndefOr[js.Array[SchemaSmimeInfo]] = js.native
}

object SchemaListSmimeInfoResponse {
  @scala.inline
  def apply(smimeInfo: js.Array[SchemaSmimeInfo] = null): SchemaListSmimeInfoResponse = {
    val __obj = js.Dynamic.literal()
    if (smimeInfo != null) __obj.updateDynamic("smimeInfo")(smimeInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaListSmimeInfoResponse]
  }
}

