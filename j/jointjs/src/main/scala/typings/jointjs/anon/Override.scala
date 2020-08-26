package typings.jointjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Override extends js.Object {
  var `override`: js.UndefOr[Boolean] = js.native
}

object Override {
  @scala.inline
  def apply(): Override = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Override]
  }
  @scala.inline
  implicit class OverrideOps[Self <: Override] (val x: Self) extends AnyVal {
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
    def setOverride(value: Boolean): Self = this.set("override", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverride: Self = this.set("override", js.undefined)
  }
  
}

