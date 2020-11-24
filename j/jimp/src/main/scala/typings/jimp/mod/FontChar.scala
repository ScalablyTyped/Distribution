package typings.jimp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @deprecated Jimp typings for TS <3.1 are being depreciated. Please upgrade your TypeScript version
  */
@js.native
trait FontChar extends js.Object {
  
  var chnl: Double = js.native
  
  var height: Double = js.native
  
  var id: Double = js.native
  
  var page: Double = js.native
  
  var width: Double = js.native
  
  var x: Double = js.native
  
  var xadvance: Double = js.native
  
  var xoffset: Double = js.native
  
  var y: Double = js.native
  
  var yoffset: Double = js.native
}
object FontChar {
  
  @scala.inline
  def apply(
    chnl: Double,
    height: Double,
    id: Double,
    page: Double,
    width: Double,
    x: Double,
    xadvance: Double,
    xoffset: Double,
    y: Double,
    yoffset: Double
  ): FontChar = {
    val __obj = js.Dynamic.literal(chnl = chnl.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], xadvance = xadvance.asInstanceOf[js.Any], xoffset = xoffset.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], yoffset = yoffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[FontChar]
  }
  
  @scala.inline
  implicit class FontCharOps[Self <: FontChar] (val x: Self) extends AnyVal {
    
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
    def setChnl(value: Double): Self = this.set("chnl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPage(value: Double): Self = this.set("page", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXadvance(value: Double): Self = this.set("xadvance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXoffset(value: Double): Self = this.set("xoffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYoffset(value: Double): Self = this.set("yoffset", value.asInstanceOf[js.Any])
  }
}
