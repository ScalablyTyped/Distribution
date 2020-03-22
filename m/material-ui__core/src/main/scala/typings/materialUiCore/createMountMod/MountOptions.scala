package typings.materialUiCore.createMountMod

import typings.materialUiCore.FnCall
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
}

