package typings.jsdomScreenshot

import typings.jsdomScreenshot.anon.FnCall
import typings.puppeteer.mod.LaunchOptions
import typings.puppeteer.mod.ScreenshotOptions
import typings.puppeteer.mod.Viewport
import typings.std.Document
import typings.std.Element
import typings.std.ReturnType
import typings.std.VoidFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("jsdom-screenshot", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def debug(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("debug")().asInstanceOf[Unit]
  @scala.inline
  def debug(element: Document): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("debug")(element.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def debug(element: Element): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("debug")(element.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def generateImage(): ReturnType[FnCall] = ^.asInstanceOf[js.Dynamic].applyDynamic("generateImage")().asInstanceOf[ReturnType[FnCall]]
  @scala.inline
  def generateImage(options: GenerateImageOptions): ReturnType[FnCall] = ^.asInstanceOf[js.Dynamic].applyDynamic("generateImage")(options.asInstanceOf[js.Any]).asInstanceOf[ReturnType[FnCall]]
  
  @scala.inline
  def restoreDefaultOptions(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("restoreDefaultOptions")().asInstanceOf[Unit]
  
  @scala.inline
  def setDefaultOptions(options: GenerateImageOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setDefaultOptions")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  trait GenerateImageOptions extends StObject {
    
    var debug: js.UndefOr[Boolean] = js.undefined
    
    var intercept: js.UndefOr[VoidFunction] = js.undefined
    
    var launch: js.UndefOr[LaunchOptions] = js.undefined
    
    var screenshot: js.UndefOr[ScreenshotOptions] = js.undefined
    
    var serve: js.UndefOr[js.Array[String]] = js.undefined
    
    var viewport: js.UndefOr[Viewport] = js.undefined
    
    var waitUntilNetworkIdle: js.UndefOr[Boolean] = js.undefined
  }
  object GenerateImageOptions {
    
    @scala.inline
    def apply(): GenerateImageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GenerateImageOptions]
    }
    
    @scala.inline
    implicit class GenerateImageOptionsMutableBuilder[Self <: GenerateImageOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      @scala.inline
      def setIntercept(value: () => Unit): Self = StObject.set(x, "intercept", js.Any.fromFunction0(value))
      
      @scala.inline
      def setInterceptUndefined: Self = StObject.set(x, "intercept", js.undefined)
      
      @scala.inline
      def setLaunch(value: LaunchOptions): Self = StObject.set(x, "launch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLaunchUndefined: Self = StObject.set(x, "launch", js.undefined)
      
      @scala.inline
      def setScreenshot(value: ScreenshotOptions): Self = StObject.set(x, "screenshot", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScreenshotUndefined: Self = StObject.set(x, "screenshot", js.undefined)
      
      @scala.inline
      def setServe(value: js.Array[String]): Self = StObject.set(x, "serve", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServeUndefined: Self = StObject.set(x, "serve", js.undefined)
      
      @scala.inline
      def setServeVarargs(value: String*): Self = StObject.set(x, "serve", js.Array(value :_*))
      
      @scala.inline
      def setViewport(value: Viewport): Self = StObject.set(x, "viewport", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setViewportUndefined: Self = StObject.set(x, "viewport", js.undefined)
      
      @scala.inline
      def setWaitUntilNetworkIdle(value: Boolean): Self = StObject.set(x, "waitUntilNetworkIdle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWaitUntilNetworkIdleUndefined: Self = StObject.set(x, "waitUntilNetworkIdle", js.undefined)
    }
  }
}
