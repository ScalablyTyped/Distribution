package typings.lottieWeb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined lottie-web.lottie-web.BaseRendererConfig & {  title :string | undefined,   description :string | undefined,   preserveAspectRatio :string | undefined,   progressiveLoad :boolean | undefined,   hideOnTransparent :boolean | undefined,   viewBoxOnly :boolean | undefined,   viewBoxSize :string | undefined,   focusable :boolean | undefined,   filterSize :lottie-web.lottie-web.FilterSizeConfig | undefined} */
@js.native
trait SVGRendererConfig extends js.Object {
  
  var className: js.UndefOr[String] = js.native
  
  var description: js.UndefOr[String] = js.native
  
  var filterSize: js.UndefOr[FilterSizeConfig] = js.native
  
  var focusable: js.UndefOr[Boolean] = js.native
  
  var hideOnTransparent: js.UndefOr[Boolean] = js.native
  
  var imagePreserveAspectRatio: js.UndefOr[String] = js.native
  
  var preserveAspectRatio: js.UndefOr[String] = js.native
  
  var progressiveLoad: js.UndefOr[Boolean] = js.native
  
  var title: js.UndefOr[String] = js.native
  
  var viewBoxOnly: js.UndefOr[Boolean] = js.native
  
  var viewBoxSize: js.UndefOr[String] = js.native
}
object SVGRendererConfig {
  
  @scala.inline
  def apply(): SVGRendererConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SVGRendererConfig]
  }
  
  @scala.inline
  implicit class SVGRendererConfigOps[Self <: SVGRendererConfig] (val x: Self) extends AnyVal {
    
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
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setFilterSize(value: FilterSizeConfig): Self = this.set("filterSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilterSize: Self = this.set("filterSize", js.undefined)
    
    @scala.inline
    def setFocusable(value: Boolean): Self = this.set("focusable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFocusable: Self = this.set("focusable", js.undefined)
    
    @scala.inline
    def setHideOnTransparent(value: Boolean): Self = this.set("hideOnTransparent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHideOnTransparent: Self = this.set("hideOnTransparent", js.undefined)
    
    @scala.inline
    def setImagePreserveAspectRatio(value: String): Self = this.set("imagePreserveAspectRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImagePreserveAspectRatio: Self = this.set("imagePreserveAspectRatio", js.undefined)
    
    @scala.inline
    def setPreserveAspectRatio(value: String): Self = this.set("preserveAspectRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreserveAspectRatio: Self = this.set("preserveAspectRatio", js.undefined)
    
    @scala.inline
    def setProgressiveLoad(value: Boolean): Self = this.set("progressiveLoad", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProgressiveLoad: Self = this.set("progressiveLoad", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setViewBoxOnly(value: Boolean): Self = this.set("viewBoxOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteViewBoxOnly: Self = this.set("viewBoxOnly", js.undefined)
    
    @scala.inline
    def setViewBoxSize(value: String): Self = this.set("viewBoxSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteViewBoxSize: Self = this.set("viewBoxSize", js.undefined)
  }
}
