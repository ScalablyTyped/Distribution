package typings.jestDashEnvironmentDashPuppeteer.jestDashEnvironmentDashPuppeteerMod

import typings.node.vmMod.Context
import typings.puppeteer.puppeteerMod.Browser
import typings.puppeteer.puppeteerMod.BrowserContext
import typings.puppeteer.puppeteerMod.Page
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: QualifyReferences.resolveTypeRef many Couldn't qualify GlobalType.Global * / any */ trait Global extends js.Object {
  var browser: Browser
  var context: Context
  var jestPuppeteer: JestPuppeteer
  var page: Page
}

@JSGlobalScope
@js.native
object Global extends js.Object {
  val browser: Browser = js.native
  val context: BrowserContext = js.native
  val jestPuppeteer: JestPuppeteer = js.native
  val page: Page = js.native
}

