package typings.imageQ.commonMod

import typings.imageQ.pointContainerMod.PointContainer
import typings.imageQ.utilsPaletteMod.Palette
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IImageDitherer extends js.Object {
  
  def quantize(pointBuffer: PointContainer, palette: Palette): PointContainer = js.native
}
object IImageDitherer {
  
  @scala.inline
  def apply(quantize: (PointContainer, Palette) => PointContainer): IImageDitherer = {
    val __obj = js.Dynamic.literal(quantize = js.Any.fromFunction2(quantize))
    __obj.asInstanceOf[IImageDitherer]
  }
  
  @scala.inline
  implicit class IImageDithererOps[Self <: IImageDitherer] (val x: Self) extends AnyVal {
    
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
    def setQuantize(value: (PointContainer, Palette) => PointContainer): Self = this.set("quantize", js.Any.fromFunction2(value))
  }
}
