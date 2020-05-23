package typings.hapiAuthJwt2.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExtraInfo extends js.Object {
  var extraInfo: js.UndefOr[typings.hapiAuthJwt2.mod.ExtraInfo] = js.undefined
  var key: String | js.Array[String]
}

object ExtraInfo {
  @scala.inline
  def apply(key: String | js.Array[String], extraInfo: typings.hapiAuthJwt2.mod.ExtraInfo = null): ExtraInfo = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    if (extraInfo != null) __obj.updateDynamic("extraInfo")(extraInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtraInfo]
  }
}

