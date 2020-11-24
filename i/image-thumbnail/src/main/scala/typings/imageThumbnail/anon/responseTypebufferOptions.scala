package typings.imageThumbnail.anon

import typings.imageThumbnail.imageThumbnailStrings.buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  responseType :'buffer'} & image-thumbnail.image-thumbnail.Options */
@js.native
trait responseTypebufferOptions extends js.Object {
  
  var height: js.UndefOr[Double] = js.native
  
  var percentage: js.UndefOr[Double] = js.native
  
  var responseType: buffer with js.UndefOr[String] = js.native
  
  var width: js.UndefOr[Double] = js.native
}
object responseTypebufferOptions {
  
  @scala.inline
  def apply(responseType: buffer with js.UndefOr[String]): responseTypebufferOptions = {
    val __obj = js.Dynamic.literal(responseType = responseType.asInstanceOf[js.Any])
    __obj.asInstanceOf[responseTypebufferOptions]
  }
  
  @scala.inline
  implicit class responseTypebufferOptionsOps[Self <: responseTypebufferOptions] (val x: Self) extends AnyVal {
    
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
    def setResponseType(value: buffer with js.UndefOr[String]): Self = this.set("responseType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setPercentage(value: Double): Self = this.set("percentage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePercentage: Self = this.set("percentage", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
