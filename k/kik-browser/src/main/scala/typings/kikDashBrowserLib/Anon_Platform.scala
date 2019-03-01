package typings
package kikDashBrowserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Platform extends js.Object {
  var platform: Anon_Browser
}

object Anon_Platform {
  @scala.inline
  def apply(platform: Anon_Browser): Anon_Platform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("platform")(platform)
    __obj.asInstanceOf[Anon_Platform]
  }
}

