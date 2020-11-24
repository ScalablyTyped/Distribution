package typings.jsdomScreenshot

import typings.node.Buffer
import typings.puppeteer.mod.Base64ScreenShotOptions
import typings.puppeteer.mod.BinaryScreenShotOptions
import typings.puppeteer.mod.ScreenshotOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object anon extends js.Object {
  
  @js.native
  trait FnCall extends js.Object {
    
    def apply(): js.Promise[String] = js.native
    def apply(options: Base64ScreenShotOptions): js.Promise[String] = js.native
    def apply(options: BinaryScreenShotOptions): js.Promise[Buffer] = js.native
    def apply(options: ScreenshotOptions): js.Promise[String | Buffer] = js.native
  }
}
