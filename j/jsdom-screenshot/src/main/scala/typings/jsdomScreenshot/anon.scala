package typings.jsdomScreenshot

import typings.node.bufferMod.global.Buffer
import typings.puppeteer.mod.ScreenshotOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait FnCall extends StObject {
    
    def apply(): js.Promise[Buffer | String] = js.native
    def apply(options: ScreenshotOptions): js.Promise[Buffer | String] = js.native
  }
}
