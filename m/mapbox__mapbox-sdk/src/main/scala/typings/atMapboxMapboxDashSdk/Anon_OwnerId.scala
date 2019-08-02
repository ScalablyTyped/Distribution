package typings.atMapboxMapboxDashSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_OwnerId extends js.Object {
  var ownerId: js.UndefOr[String] = js.undefined
  var styleId: String
}

object Anon_OwnerId {
  @scala.inline
  def apply(styleId: String, ownerId: String = null): Anon_OwnerId = {
    val __obj = js.Dynamic.literal(styleId = styleId)
    if (ownerId != null) __obj.updateDynamic("ownerId")(ownerId)
    __obj.asInstanceOf[Anon_OwnerId]
  }
}

