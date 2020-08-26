package typings.mapboxMapboxSdk.anon

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LastKnownModification extends js.Object {
  var lastKnownModification: js.UndefOr[String | Double | Date] = js.native
  var ownerId: js.UndefOr[String] = js.native
  var style: typings.mapboxMapboxSdk.stylesMod.Style = js.native
  var styleId: String = js.native
}

object LastKnownModification {
  @scala.inline
  def apply(style: typings.mapboxMapboxSdk.stylesMod.Style, styleId: String): LastKnownModification = {
    val __obj = js.Dynamic.literal(style = style.asInstanceOf[js.Any], styleId = styleId.asInstanceOf[js.Any])
    __obj.asInstanceOf[LastKnownModification]
  }
  @scala.inline
  implicit class LastKnownModificationOps[Self <: LastKnownModification] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setStyle(value: typings.mapboxMapboxSdk.stylesMod.Style): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def setStyleId(value: String): Self = this.set("styleId", value.asInstanceOf[js.Any])
    @scala.inline
    def setLastKnownModification(value: String | Double | Date): Self = this.set("lastKnownModification", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastKnownModification: Self = this.set("lastKnownModification", js.undefined)
    @scala.inline
    def setOwnerId(value: String): Self = this.set("ownerId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOwnerId: Self = this.set("ownerId", js.undefined)
  }
  
}

