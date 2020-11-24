package typings.lottieWeb.mod

import typings.lottieWeb.lottieWebStrings.canvas
import typings.lottieWeb.lottieWebStrings.html
import typings.lottieWeb.lottieWebStrings.svg
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined lottie-web.lottie-web.AnimationConfig & {  animationData :any | undefined} */
@js.native
trait AnimationConfigWithData extends js.Object {
  
  var animationData: js.UndefOr[js.Any] = js.native
  
  var assetsPath: js.UndefOr[String] = js.native
  
  var autoplay: js.UndefOr[Boolean] = js.native
  
  var container: Element = js.native
  
  var initialSegment: js.UndefOr[AnimationSegment] = js.native
  
  var loop: js.UndefOr[Boolean | Double] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var renderer: js.UndefOr[svg | canvas | html] = js.native
  
  var rendererSettings: js.UndefOr[SVGRendererConfig | CanvasRendererConfig | HTMLRendererConfig] = js.native
}
object AnimationConfigWithData {
  
  @scala.inline
  def apply(container: Element): AnimationConfigWithData = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationConfigWithData]
  }
  
  @scala.inline
  implicit class AnimationConfigWithDataOps[Self <: AnimationConfigWithData] (val x: Self) extends AnyVal {
    
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
    def setContainer(value: Element): Self = this.set("container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationData(value: js.Any): Self = this.set("animationData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimationData: Self = this.set("animationData", js.undefined)
    
    @scala.inline
    def setAssetsPath(value: String): Self = this.set("assetsPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAssetsPath: Self = this.set("assetsPath", js.undefined)
    
    @scala.inline
    def setAutoplay(value: Boolean): Self = this.set("autoplay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoplay: Self = this.set("autoplay", js.undefined)
    
    @scala.inline
    def setInitialSegment(value: AnimationSegment): Self = this.set("initialSegment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitialSegment: Self = this.set("initialSegment", js.undefined)
    
    @scala.inline
    def setLoop(value: Boolean | Double): Self = this.set("loop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoop: Self = this.set("loop", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setRenderer(value: svg | canvas | html): Self = this.set("renderer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRenderer: Self = this.set("renderer", js.undefined)
    
    @scala.inline
    def setRendererSettings(value: SVGRendererConfig | CanvasRendererConfig | HTMLRendererConfig): Self = this.set("rendererSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRendererSettings: Self = this.set("rendererSettings", js.undefined)
  }
}
