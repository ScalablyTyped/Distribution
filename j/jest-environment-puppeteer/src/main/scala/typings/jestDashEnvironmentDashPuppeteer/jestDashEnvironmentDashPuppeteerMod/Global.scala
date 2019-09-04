package typings.jestDashEnvironmentDashPuppeteer.jestDashEnvironmentDashPuppeteerMod

import typings.node.vmMod.Context
import typings.puppeteer.puppeteerMod.Browser
import typings.puppeteer.puppeteerMod.BrowserContext
import typings.puppeteer.puppeteerMod.Page
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Global
  extends typings.atJestTypes.buildGlobalMod.Global {
  var browser: Browser = js.native
  var context: Context = js.native
  var jestPuppeteer: JestPuppeteer = js.native
  var page: Page = js.native
}

@JSGlobalScope
@js.native
object Global extends js.Object {
  val browser: Browser = js.native
  val context: BrowserContext = js.native
  val jestPuppeteer: JestPuppeteer = js.native
  val page: Page = js.native
}

