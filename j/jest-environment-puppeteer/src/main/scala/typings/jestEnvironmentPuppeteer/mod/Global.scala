package typings.jestEnvironmentPuppeteer.mod

import typings.node.vmMod.Context
import typings.puppeteer.mod.Browser
import typings.puppeteer.mod.Page
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Global
  extends typings.jestTypes.globalMod.Global {
  var browser: Browser = js.native
  var context: Context = js.native
  var jestPuppeteer: JestPuppeteer = js.native
  var page: Page = js.native
}

