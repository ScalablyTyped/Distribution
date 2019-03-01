package typings
package jqueryDotBrowserLib.jqueryDotBrowserMod.Global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JQueryStatic extends js.Object {
  var browser: jqueryDotBrowserLib.jqueryDotBrowserMod.Matchs
}

object JQueryStatic {
  @scala.inline
  def apply(browser: jqueryDotBrowserLib.jqueryDotBrowserMod.Matchs): JQueryStatic = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("browser")(browser)
    __obj.asInstanceOf[JQueryStatic]
  }
}

