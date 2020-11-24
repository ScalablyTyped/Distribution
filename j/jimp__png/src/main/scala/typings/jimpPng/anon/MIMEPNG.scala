package typings.jimpPng.anon

import typings.jimpPng.jimpPngNumbers.`-1`
import typings.jimpPng.jimpPngNumbers.`1`
import typings.jimpPng.jimpPngNumbers.`2`
import typings.jimpPng.jimpPngNumbers.`3`
import typings.jimpPng.jimpPngNumbers.`4`
import typings.jimpPng.jimpPngStrings.imageSlashpng
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MIMEPNG extends js.Object {
  
  var MIME_PNG: imageSlashpng = js.native
  
  // PNG filter types
  var PNG_FILTER_AUTO: `-1` = js.native
  
  var PNG_FILTER_AVERAGE: `3` = js.native
  
  var PNG_FILTER_NONE: typings.jimpPng.jimpPngNumbers.`0` = js.native
  
  var PNG_FILTER_PATH: `4` = js.native
  
  var PNG_FILTER_SUB: `1` = js.native
  
  var PNG_FILTER_UP: `2` = js.native
}
object MIMEPNG {
  
  @scala.inline
  def apply(
    MIME_PNG: imageSlashpng,
    PNG_FILTER_AUTO: `-1`,
    PNG_FILTER_AVERAGE: `3`,
    PNG_FILTER_NONE: typings.jimpPng.jimpPngNumbers.`0`,
    PNG_FILTER_PATH: `4`,
    PNG_FILTER_SUB: `1`,
    PNG_FILTER_UP: `2`
  ): MIMEPNG = {
    val __obj = js.Dynamic.literal(MIME_PNG = MIME_PNG.asInstanceOf[js.Any], PNG_FILTER_AUTO = PNG_FILTER_AUTO.asInstanceOf[js.Any], PNG_FILTER_AVERAGE = PNG_FILTER_AVERAGE.asInstanceOf[js.Any], PNG_FILTER_NONE = PNG_FILTER_NONE.asInstanceOf[js.Any], PNG_FILTER_PATH = PNG_FILTER_PATH.asInstanceOf[js.Any], PNG_FILTER_SUB = PNG_FILTER_SUB.asInstanceOf[js.Any], PNG_FILTER_UP = PNG_FILTER_UP.asInstanceOf[js.Any])
    __obj.asInstanceOf[MIMEPNG]
  }
  
  @scala.inline
  implicit class MIMEPNGOps[Self <: MIMEPNG] (val x: Self) extends AnyVal {
    
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
    def setMIME_PNG(value: imageSlashpng): Self = this.set("MIME_PNG", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPNG_FILTER_AUTO(value: `-1`): Self = this.set("PNG_FILTER_AUTO", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPNG_FILTER_AVERAGE(value: `3`): Self = this.set("PNG_FILTER_AVERAGE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPNG_FILTER_NONE(value: typings.jimpPng.jimpPngNumbers.`0`): Self = this.set("PNG_FILTER_NONE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPNG_FILTER_PATH(value: `4`): Self = this.set("PNG_FILTER_PATH", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPNG_FILTER_SUB(value: `1`): Self = this.set("PNG_FILTER_SUB", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPNG_FILTER_UP(value: `2`): Self = this.set("PNG_FILTER_UP", value.asInstanceOf[js.Any])
  }
}
