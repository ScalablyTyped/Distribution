package typings.karmaJsdomLauncher.mod

import typings.jsdom.mod.ConstructorOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JsdomLauncherOptions extends js.Object {
  /**
    * You can pass options directly to jsdom as shown below.
    * See jsdom's own documentation for all supported options.
    */
  var jsdom: ConstructorOptions
}

object JsdomLauncherOptions {
  @scala.inline
  def apply(jsdom: ConstructorOptions): JsdomLauncherOptions = {
    val __obj = js.Dynamic.literal(jsdom = jsdom.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[JsdomLauncherOptions]
  }
}

