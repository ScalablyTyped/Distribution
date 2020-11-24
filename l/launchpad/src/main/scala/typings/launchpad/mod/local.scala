package typings.launchpad.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("launchpad", "local")
@js.native
object local extends js.Object {
  
  def apply(cb: js.Function2[/* err */ js.Any, /* localBrowsers */ Launcher, Unit]): Unit = js.native
  
  @js.native
  object platform extends js.Object {
    
    var aurora: js.UndefOr[BrowserPlatformDetails] = js.native
    
    var canary: js.UndefOr[BrowserPlatformDetails] = js.native
    
    var chrome: js.UndefOr[BrowserPlatformDetails] = js.native
    
    var chromium: js.UndefOr[BrowserPlatformDetails] = js.native
    
    var edge: js.UndefOr[BrowserPlatformDetails] = js.native
    
    var firefox: js.UndefOr[BrowserPlatformDetails] = js.native
    
    var ie: js.UndefOr[BrowserPlatformDetails] = js.native
    
    var nodeWebkit: js.UndefOr[BrowserPlatformDetails] = js.native
    
    var opera: js.UndefOr[BrowserPlatformDetails] = js.native
    
    var phantom: js.UndefOr[BrowserPlatformDetails] = js.native
    
    var safari: js.UndefOr[BrowserPlatformDetails] = js.native
  }
}
