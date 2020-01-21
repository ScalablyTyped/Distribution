package typings.kikBrowser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBrowser extends js.Object {
  var browser: AnonName
  var os: AnonName
  var version: AnonName
}

object AnonBrowser {
  @scala.inline
  def apply(browser: AnonName, os: AnonName, version: AnonName): AnonBrowser = {
    val __obj = js.Dynamic.literal(browser = browser.asInstanceOf[js.Any], os = os.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonBrowser]
  }
}

