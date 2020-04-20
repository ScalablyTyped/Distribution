package typings.jupyterlabApplication

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBrowser extends js.Object {
  var browser: String
  var file: String
}

object AnonBrowser {
  @scala.inline
  def apply(browser: String, file: String): AnonBrowser = {
    val __obj = js.Dynamic.literal(browser = browser.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBrowser]
  }
}

