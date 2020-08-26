package typings.keystonejsListPlugins.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TrackingOptions extends js.Object {
  var access: js.Any = js.native
  var createdAtField: js.UndefOr[String] = js.native
   // TODO: insert fields here
  var updatedAtField: js.UndefOr[String] = js.native
}

object TrackingOptions {
  @scala.inline
  def apply(access: js.Any): TrackingOptions = {
    val __obj = js.Dynamic.literal(access = access.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrackingOptions]
  }
  @scala.inline
  implicit class TrackingOptionsOps[Self <: TrackingOptions] (val x: Self) extends AnyVal {
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
    def setAccess(value: js.Any): Self = this.set("access", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreatedAtField(value: String): Self = this.set("createdAtField", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreatedAtField: Self = this.set("createdAtField", js.undefined)
    @scala.inline
    def setUpdatedAtField(value: String): Self = this.set("updatedAtField", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdatedAtField: Self = this.set("updatedAtField", js.undefined)
  }
  
}

