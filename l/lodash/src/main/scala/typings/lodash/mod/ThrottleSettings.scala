package typings.lodash.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// throttle
@js.native
trait ThrottleSettings extends js.Object {
  /**
    * If you'd like to disable the leading-edge call, pass this as false.
    */
  var leading: js.UndefOr[Boolean] = js.native
  /**
    * If you'd like to disable the execution on the trailing-edge, pass false.
    */
  var trailing: js.UndefOr[Boolean] = js.native
}

object ThrottleSettings {
  @scala.inline
  def apply(): ThrottleSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThrottleSettings]
  }
  @scala.inline
  implicit class ThrottleSettingsOps[Self <: ThrottleSettings] (val x: Self) extends AnyVal {
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
    def setLeading(value: Boolean): Self = this.set("leading", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLeading: Self = this.set("leading", js.undefined)
    @scala.inline
    def setTrailing(value: Boolean): Self = this.set("trailing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrailing: Self = this.set("trailing", js.undefined)
  }
  
}

