package typings.mapboxMapboxSdk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OwnerId extends js.Object {
  var ownerId: js.UndefOr[String] = js.native
  var styleId: String = js.native
}

object OwnerId {
  @scala.inline
  def apply(styleId: String): OwnerId = {
    val __obj = js.Dynamic.literal(styleId = styleId.asInstanceOf[js.Any])
    __obj.asInstanceOf[OwnerId]
  }
  @scala.inline
  implicit class OwnerIdOps[Self <: OwnerId] (val x: Self) extends AnyVal {
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
    def setStyleId(value: String): Self = this.set("styleId", value.asInstanceOf[js.Any])
    @scala.inline
    def setOwnerId(value: String): Self = this.set("ownerId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOwnerId: Self = this.set("ownerId", js.undefined)
  }
  
}

