package typings.lottieWeb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined lottie-web.lottie-web.BaseRendererConfig & {  hideOnTransparent :boolean | undefined} */
@js.native
trait HTMLRendererConfig extends js.Object {
  
  var className: js.UndefOr[String] = js.native
  
  var hideOnTransparent: js.UndefOr[Boolean] = js.native
  
  var imagePreserveAspectRatio: js.UndefOr[String] = js.native
}
object HTMLRendererConfig {
  
  @scala.inline
  def apply(): HTMLRendererConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HTMLRendererConfig]
  }
  
  @scala.inline
  implicit class HTMLRendererConfigOps[Self <: HTMLRendererConfig] (val x: Self) extends AnyVal {
    
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
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setHideOnTransparent(value: Boolean): Self = this.set("hideOnTransparent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHideOnTransparent: Self = this.set("hideOnTransparent", js.undefined)
    
    @scala.inline
    def setImagePreserveAspectRatio(value: String): Self = this.set("imagePreserveAspectRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImagePreserveAspectRatio: Self = this.set("imagePreserveAspectRatio", js.undefined)
  }
}
