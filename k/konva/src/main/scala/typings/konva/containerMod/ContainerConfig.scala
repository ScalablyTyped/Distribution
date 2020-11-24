package typings.konva.containerMod

import typings.konva.nodeMod.NodeConfig
import typings.std.CanvasRenderingContext2D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContainerConfig extends NodeConfig {
  
  var clearBeforeDraw: js.UndefOr[Boolean] = js.native
  
  var clipFunc: js.UndefOr[js.Function1[/* ctx */ CanvasRenderingContext2D, Unit]] = js.native
  
  var clipHeight: js.UndefOr[Double] = js.native
  
  var clipWidth: js.UndefOr[Double] = js.native
  
  var clipX: js.UndefOr[Double] = js.native
  
  var clipY: js.UndefOr[Double] = js.native
}
object ContainerConfig {
  
  @scala.inline
  def apply(): ContainerConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContainerConfig]
  }
  
  @scala.inline
  implicit class ContainerConfigOps[Self <: ContainerConfig] (val x: Self) extends AnyVal {
    
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
    def setClearBeforeDraw(value: Boolean): Self = this.set("clearBeforeDraw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClearBeforeDraw: Self = this.set("clearBeforeDraw", js.undefined)
    
    @scala.inline
    def setClipFunc(value: /* ctx */ CanvasRenderingContext2D => Unit): Self = this.set("clipFunc", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteClipFunc: Self = this.set("clipFunc", js.undefined)
    
    @scala.inline
    def setClipHeight(value: Double): Self = this.set("clipHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClipHeight: Self = this.set("clipHeight", js.undefined)
    
    @scala.inline
    def setClipWidth(value: Double): Self = this.set("clipWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClipWidth: Self = this.set("clipWidth", js.undefined)
    
    @scala.inline
    def setClipX(value: Double): Self = this.set("clipX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClipX: Self = this.set("clipX", js.undefined)
    
    @scala.inline
    def setClipY(value: Double): Self = this.set("clipY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClipY: Self = this.set("clipY", js.undefined)
  }
}
