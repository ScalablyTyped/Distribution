package typings.jupyterlabApplication.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Browser extends js.Object {
  var browser: String
  var file: String
}

object Browser {
  @scala.inline
  def apply(browser: String, file: String): Browser = {
    val __obj = js.Dynamic.literal(browser = browser.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any])
    __obj.asInstanceOf[Browser]
  }
}

