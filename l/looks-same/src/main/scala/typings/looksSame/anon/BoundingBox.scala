package typings.looksSame.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BoundingBox extends js.Object {
  var boundingBox: js.UndefOr[js.Any] = js.undefined
}

object BoundingBox {
  @scala.inline
  def apply(boundingBox: js.Any = null): BoundingBox = {
    val __obj = js.Dynamic.literal()
    if (boundingBox != null) __obj.updateDynamic("boundingBox")(boundingBox.asInstanceOf[js.Any])
    __obj.asInstanceOf[BoundingBox]
  }
}

