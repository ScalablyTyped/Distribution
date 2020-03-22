package typings.matrixAppserviceBridge

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonData extends js.Object {
  var data: js.UndefOr[js.Object] = js.undefined
  var id: js.UndefOr[String] = js.undefined
}

object AnonData {
  @scala.inline
  def apply(data: js.Object = null, id: String = null): AnonData = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonData]
  }
}

