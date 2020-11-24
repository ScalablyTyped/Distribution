package typings.jointjs.mod.connectors

import typings.jointjs.jointjsStrings.arc
import typings.jointjs.jointjsStrings.cubic
import typings.jointjs.jointjsStrings.gap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JumpOverConnectorArguments extends js.Object {
  
  var jump: js.UndefOr[arc | gap | cubic] = js.native
  
  var radius: js.UndefOr[Double] = js.native
  
  var raw: js.UndefOr[Boolean] = js.native
  
  var size: js.UndefOr[Double] = js.native
}
object JumpOverConnectorArguments {
  
  @scala.inline
  def apply(): JumpOverConnectorArguments = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JumpOverConnectorArguments]
  }
  
  @scala.inline
  implicit class JumpOverConnectorArgumentsOps[Self <: JumpOverConnectorArguments] (val x: Self) extends AnyVal {
    
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
    def setJump(value: arc | gap | cubic): Self = this.set("jump", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJump: Self = this.set("jump", js.undefined)
    
    @scala.inline
    def setRadius(value: Double): Self = this.set("radius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRadius: Self = this.set("radius", js.undefined)
    
    @scala.inline
    def setRaw(value: Boolean): Self = this.set("raw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRaw: Self = this.set("raw", js.undefined)
    
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
  }
}
