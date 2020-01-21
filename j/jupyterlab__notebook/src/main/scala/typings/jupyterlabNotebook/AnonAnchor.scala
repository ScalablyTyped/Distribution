package typings.jupyterlabNotebook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAnchor extends js.Object {
  var anchor: Double | Null
  var head: Double | Null
}

object AnonAnchor {
  @scala.inline
  def apply(anchor: Int | Double = null, head: Int | Double = null): AnonAnchor = {
    val __obj = js.Dynamic.literal()
    if (anchor != null) __obj.updateDynamic("anchor")(anchor.asInstanceOf[js.Any])
    if (head != null) __obj.updateDynamic("head")(head.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAnchor]
  }
}

