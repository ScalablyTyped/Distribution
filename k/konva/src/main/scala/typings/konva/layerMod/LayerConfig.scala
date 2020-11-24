package typings.konva.layerMod

import typings.konva.containerMod.ContainerConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LayerConfig extends ContainerConfig {
  
  var hitGraphEnabled: js.UndefOr[Boolean] = js.native
  
  var imageSmoothingEnabled: js.UndefOr[Boolean] = js.native
}
object LayerConfig {
  
  @scala.inline
  def apply(): LayerConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LayerConfig]
  }
  
  @scala.inline
  implicit class LayerConfigOps[Self <: LayerConfig] (val x: Self) extends AnyVal {
    
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
    def setHitGraphEnabled(value: Boolean): Self = this.set("hitGraphEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHitGraphEnabled: Self = this.set("hitGraphEnabled", js.undefined)
    
    @scala.inline
    def setImageSmoothingEnabled(value: Boolean): Self = this.set("imageSmoothingEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageSmoothingEnabled: Self = this.set("imageSmoothingEnabled", js.undefined)
  }
}
