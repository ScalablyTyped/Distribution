package typings.imagemagickNative.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IQuantizeColorsOptions extends js.Object {
  
  var colors: Double = js.native
  
  var debug: js.UndefOr[Boolean] = js.native
  
  var ignoreWarnings: js.UndefOr[Boolean] = js.native
  
  var srcData: Buffer = js.native
}
object IQuantizeColorsOptions {
  
  @scala.inline
  def apply(colors: Double, srcData: Buffer): IQuantizeColorsOptions = {
    val __obj = js.Dynamic.literal(colors = colors.asInstanceOf[js.Any], srcData = srcData.asInstanceOf[js.Any])
    __obj.asInstanceOf[IQuantizeColorsOptions]
  }
  
  @scala.inline
  implicit class IQuantizeColorsOptionsOps[Self <: IQuantizeColorsOptions] (val x: Self) extends AnyVal {
    
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
    def setColors(value: Double): Self = this.set("colors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSrcData(value: Buffer): Self = this.set("srcData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDebug(value: Boolean): Self = this.set("debug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDebug: Self = this.set("debug", js.undefined)
    
    @scala.inline
    def setIgnoreWarnings(value: Boolean): Self = this.set("ignoreWarnings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreWarnings: Self = this.set("ignoreWarnings", js.undefined)
  }
}
