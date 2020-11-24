package typings.lottieWeb.mod

import typings.std.CanvasRenderingContext2D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined lottie-web.lottie-web.BaseRendererConfig & {  clearCanvas :boolean | undefined,   context :std.CanvasRenderingContext2D | undefined,   progressiveLoad :boolean | undefined,   preserveAspectRatio :string | undefined} */
@js.native
trait CanvasRendererConfig extends js.Object {
  
  var className: js.UndefOr[String] = js.native
  
  var clearCanvas: js.UndefOr[Boolean] = js.native
  
  var context: js.UndefOr[CanvasRenderingContext2D] = js.native
  
  var imagePreserveAspectRatio: js.UndefOr[String] = js.native
  
  var preserveAspectRatio: js.UndefOr[String] = js.native
  
  var progressiveLoad: js.UndefOr[Boolean] = js.native
}
object CanvasRendererConfig {
  
  @scala.inline
  def apply(): CanvasRendererConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CanvasRendererConfig]
  }
  
  @scala.inline
  implicit class CanvasRendererConfigOps[Self <: CanvasRendererConfig] (val x: Self) extends AnyVal {
    
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
    def setClearCanvas(value: Boolean): Self = this.set("clearCanvas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClearCanvas: Self = this.set("clearCanvas", js.undefined)
    
    @scala.inline
    def setContext(value: CanvasRenderingContext2D): Self = this.set("context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContext: Self = this.set("context", js.undefined)
    
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
  }
}
