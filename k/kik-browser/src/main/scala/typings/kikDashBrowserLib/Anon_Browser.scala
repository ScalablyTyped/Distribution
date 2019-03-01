package typings
package kikDashBrowserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Browser extends js.Object {
  var browser: Anon_Name
  var os: Anon_Name
  var version: Anon_Name
}

object Anon_Browser {
  @scala.inline
  def apply(browser: Anon_Name, os: Anon_Name, version: Anon_Name): Anon_Browser = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("browser")(browser)
    __obj.updateDynamic("os")(os)
    __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[Anon_Browser]
  }
}

