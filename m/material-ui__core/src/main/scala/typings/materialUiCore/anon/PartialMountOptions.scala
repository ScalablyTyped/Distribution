package typings.materialUiCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material-ui/core.@material-ui/core/test-utils/createMount.MountOptions> */
@js.native
trait PartialMountOptions extends js.Object {
  var mount: js.UndefOr[FnCallNodeOptions] = js.native
}

object PartialMountOptions {
  @scala.inline
  def apply(): PartialMountOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialMountOptions]
  }
  @scala.inline
  implicit class PartialMountOptionsOps[Self <: PartialMountOptions] (val x: Self) extends AnyVal {
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
    def setMount(value: FnCallNodeOptions): Self = this.set("mount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMount: Self = this.set("mount", js.undefined)
  }
  
}

