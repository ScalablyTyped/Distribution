package typings.imagemagick.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
   //: false,
  var colorspace: js.UndefOr[js.Any] = js.native
  
   //: 0.2,
  var customArgs: js.UndefOr[js.Array[_]] = js.native
  
   //: null,
  var dstPath: js.UndefOr[String] = js.native
  
   //: true,
  var filter: js.UndefOr[String] = js.native
  
   //: 0.8,
  var format: js.UndefOr[String] = js.native
  
   //: 0,
  var height: js.UndefOr[Double] = js.native
  
   //: 'jpg',
  var progressive: js.UndefOr[Boolean] = js.native
  
   //: null,
  var quality: js.UndefOr[Double] = js.native
  
   //: 'Lagrange',
  var sharpening: js.UndefOr[Double] = js.native
  
   //: null,
  var srcData: js.UndefOr[String] = js.native
  
   //: null,
  var srcFormat: js.UndefOr[String] = js.native
  
  var srcPath: js.UndefOr[String] = js.native
  
   //: 0,
  var strip: js.UndefOr[Boolean] = js.native
  
   //: [],
  var timeout: js.UndefOr[Double] = js.native
  
   //: null,
  var width: js.UndefOr[Double] = js.native
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
    def setColorspace(value: js.Any): Self = this.set("colorspace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColorspace: Self = this.set("colorspace", js.undefined)
    
    @scala.inline
    def setCustomArgsVarargs(value: js.Any*): Self = this.set("customArgs", js.Array(value :_*))
    
    @scala.inline
    def setCustomArgs(value: js.Array[_]): Self = this.set("customArgs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomArgs: Self = this.set("customArgs", js.undefined)
    
    @scala.inline
    def setDstPath(value: String): Self = this.set("dstPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDstPath: Self = this.set("dstPath", js.undefined)
    
    @scala.inline
    def setFilter(value: String): Self = this.set("filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    
    @scala.inline
    def setFormat(value: String): Self = this.set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setProgressive(value: Boolean): Self = this.set("progressive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProgressive: Self = this.set("progressive", js.undefined)
    
    @scala.inline
    def setQuality(value: Double): Self = this.set("quality", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuality: Self = this.set("quality", js.undefined)
    
    @scala.inline
    def setSharpening(value: Double): Self = this.set("sharpening", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSharpening: Self = this.set("sharpening", js.undefined)
    
    @scala.inline
    def setSrcData(value: String): Self = this.set("srcData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSrcData: Self = this.set("srcData", js.undefined)
    
    @scala.inline
    def setSrcFormat(value: String): Self = this.set("srcFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSrcFormat: Self = this.set("srcFormat", js.undefined)
    
    @scala.inline
    def setSrcPath(value: String): Self = this.set("srcPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSrcPath: Self = this.set("srcPath", js.undefined)
    
    @scala.inline
    def setStrip(value: Boolean): Self = this.set("strip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrip: Self = this.set("strip", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
