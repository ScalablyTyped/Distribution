package typings.jointjs.mod.anchors

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RotateAnchorArguments extends js.Object {
  
  var rotate: js.UndefOr[Boolean] = js.native
}
object RotateAnchorArguments {
  
  @scala.inline
  def apply(): RotateAnchorArguments = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RotateAnchorArguments]
  }
  
  @scala.inline
  implicit class RotateAnchorArgumentsOps[Self <: RotateAnchorArguments] (val x: Self) extends AnyVal {
    
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
    def setRotate(value: Boolean): Self = this.set("rotate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRotate: Self = this.set("rotate", js.undefined)
  }
}
