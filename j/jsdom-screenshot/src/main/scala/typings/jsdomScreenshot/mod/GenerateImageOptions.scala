package typings.jsdomScreenshot.mod

import typings.puppeteer.mod.LaunchOptions
import typings.puppeteer.mod.ScreenshotOptions
import typings.puppeteer.mod.Viewport
import typings.std.VoidFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GenerateImageOptions extends js.Object {
  
  var debug: js.UndefOr[Boolean] = js.native
  
  var intercept: js.UndefOr[VoidFunction] = js.native
  
  var launch: js.UndefOr[LaunchOptions] = js.native
  
  var screenshot: js.UndefOr[ScreenshotOptions] = js.native
  
  var serve: js.UndefOr[js.Array[String]] = js.native
  
  var viewport: js.UndefOr[Viewport] = js.native
  
  var waitUntilNetworkIdle: js.UndefOr[Boolean] = js.native
}
object GenerateImageOptions {
  
  @scala.inline
  def apply(): GenerateImageOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GenerateImageOptions]
  }
  
  @scala.inline
  implicit class GenerateImageOptionsOps[Self <: GenerateImageOptions] (val x: Self) extends AnyVal {
    
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
    def setDebug(value: Boolean): Self = this.set("debug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDebug: Self = this.set("debug", js.undefined)
    
    @scala.inline
    def setIntercept(value: () => Unit): Self = this.set("intercept", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteIntercept: Self = this.set("intercept", js.undefined)
    
    @scala.inline
    def setLaunch(value: LaunchOptions): Self = this.set("launch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLaunch: Self = this.set("launch", js.undefined)
    
    @scala.inline
    def setScreenshot(value: ScreenshotOptions): Self = this.set("screenshot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScreenshot: Self = this.set("screenshot", js.undefined)
    
    @scala.inline
    def setServeVarargs(value: String*): Self = this.set("serve", js.Array(value :_*))
    
    @scala.inline
    def setServe(value: js.Array[String]): Self = this.set("serve", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServe: Self = this.set("serve", js.undefined)
    
    @scala.inline
    def setViewport(value: Viewport): Self = this.set("viewport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteViewport: Self = this.set("viewport", js.undefined)
    
    @scala.inline
    def setWaitUntilNetworkIdle(value: Boolean): Self = this.set("waitUntilNetworkIdle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWaitUntilNetworkIdle: Self = this.set("waitUntilNetworkIdle", js.undefined)
  }
}
