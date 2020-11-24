package typings.imageQ.paletteCommonMod

import typings.imageQ.pointContainerMod.PointContainer
import typings.imageQ.utilsPaletteMod.Palette
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPaletteQuantizer extends js.Object {
  
  def quantize(): Palette = js.native
  
  def sample(pointBuffer: PointContainer): Unit = js.native
}
object IPaletteQuantizer {
  
  @scala.inline
  def apply(quantize: () => Palette, sample: PointContainer => Unit): IPaletteQuantizer = {
    val __obj = js.Dynamic.literal(quantize = js.Any.fromFunction0(quantize), sample = js.Any.fromFunction1(sample))
    __obj.asInstanceOf[IPaletteQuantizer]
  }
  
  @scala.inline
  implicit class IPaletteQuantizerOps[Self <: IPaletteQuantizer] (val x: Self) extends AnyVal {
    
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
    def setQuantize(value: () => Palette): Self = this.set("quantize", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSample(value: PointContainer => Unit): Self = this.set("sample", js.Any.fromFunction1(value))
  }
}
