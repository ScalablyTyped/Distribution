package typings.imageThumbnail.anon

import typings.imageThumbnail.imageThumbnailStrings.base64
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  responseType :'base64'} & image-thumbnail.image-thumbnail.Options */
@js.native
trait responseTypebase64Options extends js.Object {
  
  var height: js.UndefOr[Double] = js.native
  
  var percentage: js.UndefOr[Double] = js.native
  
  var responseType: base64 with js.UndefOr[String] = js.native
  
  var width: js.UndefOr[Double] = js.native
}
object responseTypebase64Options {
  
  @scala.inline
  def apply(responseType: base64 with js.UndefOr[String]): responseTypebase64Options = {
    val __obj = js.Dynamic.literal(responseType = responseType.asInstanceOf[js.Any])
    __obj.asInstanceOf[responseTypebase64Options]
  }
  
  @scala.inline
  implicit class responseTypebase64OptionsOps[Self <: responseTypebase64Options] (val x: Self) extends AnyVal {
    
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
    def setResponseType(value: base64 with js.UndefOr[String]): Self = this.set("responseType", value.asInstanceOf[js.Any])
    
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
