package typings.jsdomScreenshot

import typings.node.Buffer
import typings.puppeteer.mod.Base64ScreenShotOptions
import typings.puppeteer.mod.BinaryScreenShotOptions
import typings.puppeteer.mod.ScreenshotOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait FnCall extends StObject {
    
    def apply(): js.Promise[String] = js.native
    def apply(options: Base64ScreenShotOptions): js.Promise[String] = js.native
    def apply(options: BinaryScreenShotOptions): js.Promise[Buffer] = js.native
    def apply(options: ScreenshotOptions): js.Promise[String | Buffer] = js.native
  }
}
