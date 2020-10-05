package typings.materialUiCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HandleContainerOverflow extends js.Object {
  var handleContainerOverflow: js.UndefOr[Boolean] = js.native
  var hideSiblingNodes: js.UndefOr[Boolean] = js.native
}

object HandleContainerOverflow {
  @scala.inline
  def apply(): HandleContainerOverflow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HandleContainerOverflow]
  }
  @scala.inline
  implicit class HandleContainerOverflowOps[Self <: HandleContainerOverflow] (val x: Self) extends AnyVal {
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
    def setHandleContainerOverflow(value: Boolean): Self = this.set("handleContainerOverflow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHandleContainerOverflow: Self = this.set("handleContainerOverflow", js.undefined)
    @scala.inline
    def setHideSiblingNodes(value: Boolean): Self = this.set("hideSiblingNodes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHideSiblingNodes: Self = this.set("hideSiblingNodes", js.undefined)
  }
  
}

