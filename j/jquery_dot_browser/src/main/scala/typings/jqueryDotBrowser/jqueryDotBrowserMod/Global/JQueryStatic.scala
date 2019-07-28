package typings.jqueryDotBrowser.jqueryDotBrowserMod.Global

import typings.jqueryDotBrowser.jqueryDotBrowserMod.Matchs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JQueryStatic extends js.Object {
  var browser: Matchs
}

object JQueryStatic {
  @scala.inline
  def apply(browser: Matchs): JQueryStatic = {
    val __obj = js.Dynamic.literal(browser = browser)
  
    __obj.asInstanceOf[JQueryStatic]
  }
}

