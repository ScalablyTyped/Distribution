package typings.jestEnvironmentPuppeteer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JestPuppeteer extends js.Object {
  
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
  implicit class JestPuppeteerOps[Self <: JestPuppeteer] (val x: Self) extends AnyVal {
    
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
    def setDebug(value: () => js.Promise[Unit]): Self = this.set("debug", js.Any.fromFunction0(value))
    
    @scala.inline
    def setResetBrowser(value: () => js.Promise[Unit]): Self = this.set("resetBrowser", js.Any.fromFunction0(value))
    
    @scala.inline
    def setResetPage(value: () => js.Promise[Unit]): Self = this.set("resetPage", js.Any.fromFunction0(value))
  }
}
