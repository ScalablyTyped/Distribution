package typings.mapboxMapboxSdk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Start extends js.Object {
  var ownerId: js.UndefOr[String] = js.undefined
  var start: js.UndefOr[String] = js.undefined
}

object Start {
  @scala.inline
  def apply(ownerId: String = null, start: String = null): Start = {
    val __obj = js.Dynamic.literal()
    if (ownerId != null) __obj.updateDynamic("ownerId")(ownerId.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    __obj.asInstanceOf[Start]
  }
}

