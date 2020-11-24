package typings.imagemagickNative.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IConvertOptions extends js.Object {
  
  var blur: js.UndefOr[Double] = js.native
  
  var debug: js.UndefOr[Boolean] = js.native
  
  var density: js.UndefOr[Double] = js.native
  
  var filter: js.UndefOr[String] = js.native
  
  var flip: js.UndefOr[Boolean] = js.native
  
  var format: js.UndefOr[String] = js.native
  
  var gravity: js.UndefOr[String] = js.native
  
  var height: js.UndefOr[Double] = js.native
  
  var ignoreWarnings: js.UndefOr[Boolean] = js.native
  
  var quality: js.UndefOr[Double] = js.native
  
  var resizeStyle: js.UndefOr[String] = js.native
  
  var rotate: js.UndefOr[Double] = js.native
  
  var srcData: Buffer = js.native
  
  var srcFormat: js.UndefOr[String] = js.native
  
  var strip: js.UndefOr[Boolean] = js.native
  
  var trim: js.UndefOr[Boolean] = js.native
  
  var trimFuzz: js.UndefOr[Double] = js.native
  
  var width: js.UndefOr[Double] = js.native
}
object IConvertOptions {
  
  @scala.inline
  def apply(srcData: Buffer): IConvertOptions = {
    val __obj = js.Dynamic.literal(srcData = srcData.asInstanceOf[js.Any])
    __obj.asInstanceOf[IConvertOptions]
  }
  
  @scala.inline
  implicit class IConvertOptionsOps[Self <: IConvertOptions] (val x: Self) extends AnyVal {
    
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
    def setSrcData(value: Buffer): Self = this.set("srcData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlur(value: Double): Self = this.set("blur", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlur: Self = this.set("blur", js.undefined)
    
    @scala.inline
    def setDebug(value: Boolean): Self = this.set("debug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDebug: Self = this.set("debug", js.undefined)
    
    @scala.inline
    def setDensity(value: Double): Self = this.set("density", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDensity: Self = this.set("density", js.undefined)
    
    @scala.inline
    def setFilter(value: String): Self = this.set("filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    
    @scala.inline
    def setFlip(value: Boolean): Self = this.set("flip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlip: Self = this.set("flip", js.undefined)
    
    @scala.inline
    def setFormat(value: String): Self = this.set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    
    @scala.inline
    def setGravity(value: String): Self = this.set("gravity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGravity: Self = this.set("gravity", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setIgnoreWarnings(value: Boolean): Self = this.set("ignoreWarnings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreWarnings: Self = this.set("ignoreWarnings", js.undefined)
    
    @scala.inline
    def setQuality(value: Double): Self = this.set("quality", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuality: Self = this.set("quality", js.undefined)
    
    @scala.inline
    def setResizeStyle(value: String): Self = this.set("resizeStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResizeStyle: Self = this.set("resizeStyle", js.undefined)
    
    @scala.inline
    def setRotate(value: Double): Self = this.set("rotate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRotate: Self = this.set("rotate", js.undefined)
    
    @scala.inline
    def setSrcFormat(value: String): Self = this.set("srcFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSrcFormat: Self = this.set("srcFormat", js.undefined)
    
    @scala.inline
    def setStrip(value: Boolean): Self = this.set("strip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrip: Self = this.set("strip", js.undefined)
    
    @scala.inline
    def setTrim(value: Boolean): Self = this.set("trim", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrim: Self = this.set("trim", js.undefined)
    
    @scala.inline
    def setTrimFuzz(value: Double): Self = this.set("trimFuzz", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrimFuzz: Self = this.set("trimFuzz", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
