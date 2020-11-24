package typings.imageminOptipng.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  var bitDepthReduction: js.UndefOr[Boolean] = js.native
  
  var colorTypeReduction: js.UndefOr[Boolean] = js.native
  
  var optimizationLevel: js.UndefOr[Double] = js.native
  
  var paletteReduction: js.UndefOr[Boolean] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setBitDepthReduction(value: Boolean): Self = this.set("bitDepthReduction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBitDepthReduction: Self = this.set("bitDepthReduction", js.undefined)
    
    @scala.inline
    def setColorTypeReduction(value: Boolean): Self = this.set("colorTypeReduction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColorTypeReduction: Self = this.set("colorTypeReduction", js.undefined)
    
    @scala.inline
    def setOptimizationLevel(value: Double): Self = this.set("optimizationLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptimizationLevel: Self = this.set("optimizationLevel", js.undefined)
    
    @scala.inline
    def setPaletteReduction(value: Boolean): Self = this.set("paletteReduction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaletteReduction: Self = this.set("paletteReduction", js.undefined)
  }
}
