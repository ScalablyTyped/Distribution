package typings.jestEnvironmentPuppeteer

import typings.jestTypes.globalMod.Global
import typings.node.vmMod.Context
import typings.puppeteer.mod.Browser
import typings.puppeteer.mod.BrowserContext
import typings.puppeteer.mod.Page
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /** Note: TestEnvironment is sandboxed. Each test suite will trigger setup/teardown in their own TestEnvironment. */
  @JSImport("jest-environment-puppeteer", JSImport.Namespace)
  @js.native
  class ^ () extends PuppeteerEnvironment
  
  object global {
    
    @JSGlobal("browser")
    @js.native
    val browser: Browser = js.native
    
    @JSGlobal("context")
    @js.native
    val context: BrowserContext = js.native
    
    @JSGlobal("jestPuppeteer")
    @js.native
    val jestPuppeteer: JestPuppeteer = js.native
    
    @JSGlobal("page")
    @js.native
    val page: Page = js.native
  }
  
  @js.native
  trait Global_ extends Global {
    
    var browser: Browser = js.native
    
    var context: Context = js.native
    
    var jestPuppeteer: JestPuppeteer = js.native
    
    var page: Page = js.native
  }
  
  @js.native
  trait JestPuppeteer extends StObject {
    
    /**
      * Suspends test execution and gives you opportunity to see what's going on in the browser
      * - Jest is suspended (no timeout)
      * - A debugger instruction to Chromium, if Puppeteer has been launched with { devtools: true } it will stop
      *
      * ```ts
      * it('should put test in debug mode', async () => {
      *   await jestPuppeteer.debug()
      * })
      * ```
      */
    def debug(): js.Promise[Unit] = js.native
    
    /**
      * Reset global.browser
      *
      * ```ts
      * beforeEach(async () => {
      *   await jestPuppeteer.resetBrowser()
      * })
      * ```
      */
    def resetBrowser(): js.Promise[Unit] = js.native
    
    /**
      * Reset global.page
      *
      * ```ts
      * beforeEach(async () => {
      *   await jestPuppeteer.resetPage()
      * })
      * ```
      */
    def resetPage(): js.Promise[Unit] = js.native
  }
  object JestPuppeteer {
    
    @scala.inline
    def apply(
      debug: () => js.Promise[Unit],
      resetBrowser: () => js.Promise[Unit],
      resetPage: () => js.Promise[Unit]
    ): JestPuppeteer = {
      val __obj = js.Dynamic.literal(debug = js.Any.fromFunction0(debug), resetBrowser = js.Any.fromFunction0(resetBrowser), resetPage = js.Any.fromFunction0(resetPage))
      __obj.asInstanceOf[JestPuppeteer]
    }
    
    @scala.inline
    implicit class JestPuppeteerMutableBuilder[Self <: JestPuppeteer] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDebug(value: () => js.Promise[Unit]): Self = StObject.set(x, "debug", js.Any.fromFunction0(value))
      
      @scala.inline
      def setResetBrowser(value: () => js.Promise[Unit]): Self = StObject.set(x, "resetBrowser", js.Any.fromFunction0(value))
      
      @scala.inline
      def setResetPage(value: () => js.Promise[Unit]): Self = StObject.set(x, "resetPage", js.Any.fromFunction0(value))
    }
  }
  
  /** Note: TestEnvironment is sandboxed. Each test suite will trigger setup/teardown in their own TestEnvironment. */
  @js.native
  trait PuppeteerEnvironment
    extends typings.jestEnvironmentNode.mod.^ {
    
    @JSName("global")
    var global_PuppeteerEnvironment: Global_ = js.native
  }
}
