package typings.materialUiCore.createMountMod

import typings.materialUiCore.anon.FnCall
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MountOptions extends js.Object {
  var mount: FnCall = js.native
}

object MountOptions {
  @scala.inline
  def apply(mount: FnCall): MountOptions = {
    val __obj = js.Dynamic.literal(mount = mount.asInstanceOf[js.Any])
    __obj.asInstanceOf[MountOptions]
  }
  @scala.inline
  implicit class MountOptionsOps[Self <: MountOptions] (val x: Self) extends AnyVal {
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
    def setMount(value: FnCall): Self = this.set("mount", value.asInstanceOf[js.Any])
  }
  
}

