package typings.konva.spriteMod

import typings.konva.shapeMod.ShapeConfig
import typings.std.HTMLImageElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SpriteConfig extends ShapeConfig {
  
  var animation: String = js.native
  
  var animations: js.Any = js.native
  
  var frameIndex: js.UndefOr[Double] = js.native
  
  var frameRate: js.UndefOr[Double] = js.native
  
  var image: HTMLImageElement = js.native
}
object SpriteConfig {
  
  @scala.inline
  def apply(animation: String, animations: js.Any, image: HTMLImageElement): SpriteConfig = {
    val __obj = js.Dynamic.literal(animation = animation.asInstanceOf[js.Any], animations = animations.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpriteConfig]
  }
  
  @scala.inline
  implicit class SpriteConfigOps[Self <: SpriteConfig] (val x: Self) extends AnyVal {
    
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
    def setAnimation(value: String): Self = this.set("animation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimations(value: js.Any): Self = this.set("animations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImage(value: HTMLImageElement): Self = this.set("image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrameIndex(value: Double): Self = this.set("frameIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFrameIndex: Self = this.set("frameIndex", js.undefined)
    
    @scala.inline
    def setFrameRate(value: Double): Self = this.set("frameRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFrameRate: Self = this.set("frameRate", js.undefined)
  }
}
