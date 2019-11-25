package typings.atMapboxMapboxDashSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IconId extends js.Object {
  var iconId: String
  var ownerId: js.UndefOr[String] = js.undefined
  var styleId: String
}

object Anon_IconId {
  @scala.inline
  def apply(iconId: String, styleId: String, ownerId: String = null): Anon_IconId = {
    val __obj = js.Dynamic.literal(iconId = iconId.asInstanceOf[js.Any], styleId = styleId.asInstanceOf[js.Any])
    if (ownerId != null) __obj.updateDynamic("ownerId")(ownerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_IconId]
  }
}

