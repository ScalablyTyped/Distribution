package typings.googleapis.contentV2Mod.contentV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaDatafeedsFetchNowResponse extends js.Object {
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;content#datafeedsFetchNowResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
}

object SchemaDatafeedsFetchNowResponse {
  @scala.inline
  def apply(kind: String = null): SchemaDatafeedsFetchNowResponse = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaDatafeedsFetchNowResponse]
  }
}

