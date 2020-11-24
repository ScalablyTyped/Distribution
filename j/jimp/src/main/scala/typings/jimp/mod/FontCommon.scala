package typings.jimp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @deprecated Jimp typings for TS <3.1 are being depreciated. Please upgrade your TypeScript version
  */
@js.native
trait FontCommon extends js.Object {
  
  var alphaChnl: Double = js.native
  
  var base: Double = js.native
  
  var blueChnl: Double = js.native
  
  var greenChnl: Double = js.native
  
  var lineHeight: Double = js.native
  
  var packed: Double = js.native
  
  var pages: Double = js.native
  
  var redChnl: Double = js.native
  
  var scaleH: Double = js.native
  
  var scaleW: Double = js.native
}
object FontCommon {
  
  @scala.inline
  def apply(
    alphaChnl: Double,
    base: Double,
    blueChnl: Double,
    greenChnl: Double,
    lineHeight: Double,
    packed: Double,
    pages: Double,
    redChnl: Double,
    scaleH: Double,
    scaleW: Double
  ): FontCommon = {
    val __obj = js.Dynamic.literal(alphaChnl = alphaChnl.asInstanceOf[js.Any], base = base.asInstanceOf[js.Any], blueChnl = blueChnl.asInstanceOf[js.Any], greenChnl = greenChnl.asInstanceOf[js.Any], lineHeight = lineHeight.asInstanceOf[js.Any], packed = packed.asInstanceOf[js.Any], pages = pages.asInstanceOf[js.Any], redChnl = redChnl.asInstanceOf[js.Any], scaleH = scaleH.asInstanceOf[js.Any], scaleW = scaleW.asInstanceOf[js.Any])
    __obj.asInstanceOf[FontCommon]
  }
  
  @scala.inline
  implicit class FontCommonOps[Self <: FontCommon] (val x: Self) extends AnyVal {
    
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
    def setAlphaChnl(value: Double): Self = this.set("alphaChnl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBase(value: Double): Self = this.set("base", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlueChnl(value: Double): Self = this.set("blueChnl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGreenChnl(value: Double): Self = this.set("greenChnl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineHeight(value: Double): Self = this.set("lineHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPacked(value: Double): Self = this.set("packed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPages(value: Double): Self = this.set("pages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRedChnl(value: Double): Self = this.set("redChnl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleH(value: Double): Self = this.set("scaleH", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleW(value: Double): Self = this.set("scaleW", value.asInstanceOf[js.Any])
  }
}
