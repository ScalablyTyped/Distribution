package typings.atMapboxMapboxDashSdk

import typings.atMapboxMapboxDashSdk.servicesStylesMod.Style
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_LastKnownModification extends js.Object {
  var lastKnownModification: js.UndefOr[String | Double | Date] = js.undefined
  var ownerId: js.UndefOr[String] = js.undefined
  var style: Style
  var styleId: String
}

object Anon_LastKnownModification {
  @scala.inline
  def apply(
    style: Style,
    styleId: String,
    lastKnownModification: String | Double | Date = null,
    ownerId: String = null
  ): Anon_LastKnownModification = {
    val __obj = js.Dynamic.literal(style = style, styleId = styleId)
    if (lastKnownModification != null) __obj.updateDynamic("lastKnownModification")(lastKnownModification.asInstanceOf[js.Any])
    if (ownerId != null) __obj.updateDynamic("ownerId")(ownerId)
    __obj.asInstanceOf[Anon_LastKnownModification]
  }
}

