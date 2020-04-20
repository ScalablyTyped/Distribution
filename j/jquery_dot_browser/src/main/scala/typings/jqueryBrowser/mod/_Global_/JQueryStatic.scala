package typings.jqueryBrowser.mod._Global_

import typings.jqueryBrowser.mod.Matchs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JQueryStatic extends js.Object {
  var browser: Matchs
}

object JQueryStatic {
  @scala.inline
  def apply(browser: Matchs): JQueryStatic = {
    val __obj = js.Dynamic.literal(browser = browser.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQueryStatic]
  }
}

