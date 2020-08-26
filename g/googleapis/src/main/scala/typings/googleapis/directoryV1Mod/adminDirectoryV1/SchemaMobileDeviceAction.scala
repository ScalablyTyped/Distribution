package typings.googleapis.directoryV1Mod.adminDirectoryV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON request template for firing commands on Mobile Device in Directory
  * Devices API.
  */
@js.native
trait SchemaMobileDeviceAction extends js.Object {
  /**
    * Action to be taken on the Mobile Device
    */
  var action: js.UndefOr[String] = js.native
}

object SchemaMobileDeviceAction {
  @scala.inline
  def apply(): SchemaMobileDeviceAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMobileDeviceAction]
  }
  @scala.inline
  implicit class SchemaMobileDeviceActionOps[Self <: SchemaMobileDeviceAction] (val x: Self) extends AnyVal {
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
    def setAction(value: String): Self = this.set("action", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAction: Self = this.set("action", js.undefined)
  }
  
}

