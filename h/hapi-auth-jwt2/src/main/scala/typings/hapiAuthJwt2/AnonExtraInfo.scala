package typings.hapiAuthJwt2

import typings.hapiAuthJwt2.mod.ExtraInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonExtraInfo extends js.Object {
  var extraInfo: js.UndefOr[ExtraInfo] = js.undefined
  var key: String | js.Array[String]
}

object AnonExtraInfo {
  @scala.inline
  def apply(key: String | js.Array[String], extraInfo: ExtraInfo = null): AnonExtraInfo = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    if (extraInfo != null) __obj.updateDynamic("extraInfo")(extraInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonExtraInfo]
  }
}

