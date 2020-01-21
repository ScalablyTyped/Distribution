package typings.googleapis.youtubeV3Mod.youtubeV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaNonprofitId extends js.Object {
  var value: js.UndefOr[String] = js.native
}

object SchemaNonprofitId {
  @scala.inline
  def apply(value: String = null): SchemaNonprofitId = {
    val __obj = js.Dynamic.literal()
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaNonprofitId]
  }
}

