package typings
package jestDashEnvironmentDashPuppeteerLib.jestDashEnvironmentDashPuppeteerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def debug(): js.Promise[scala.Unit]
  /**
    * Reset global.page
    *
    * ```ts
    * beforeEach(async () => {
    *   await jestPuppeteer.resetPage()
    * })
    * ```
    */
  def resetPage(): js.Promise[scala.Unit]
}

object JestPuppeteer {
  @scala.inline
  def apply(debug: () => js.Promise[scala.Unit], resetPage: () => js.Promise[scala.Unit]): JestPuppeteer = {
    val __obj = js.Dynamic.literal(debug = js.Any.fromFunction0(debug), resetPage = js.Any.fromFunction0(resetPage))
  
    __obj.asInstanceOf[JestPuppeteer]
  }
}

