package typings.atMapboxMapboxDashSdk

import typings.atMapboxMapboxDashSdk.servicesStylesMod.Style
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_OwnerIdStyle extends js.Object {
  var ownerId: js.UndefOr[String] = js.undefined
  var style: Style
}

object Anon_OwnerIdStyle {
  @scala.inline
  def apply(style: Style, ownerId: String = null): Anon_OwnerIdStyle = {
    val __obj = js.Dynamic.literal(style = style)
    if (ownerId != null) __obj.updateDynamic("ownerId")(ownerId)
    __obj.asInstanceOf[Anon_OwnerIdStyle]
  }
}

