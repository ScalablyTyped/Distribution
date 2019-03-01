package typings
package launchpadLib.launchpadMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Browser extends js.Object {
  var binPath: java.lang.String
  var name: java.lang.String
  var version: java.lang.String
}

object Browser {
  @scala.inline
  def apply(binPath: java.lang.String, name: java.lang.String, version: java.lang.String): Browser = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("binPath")(binPath)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[Browser]
  }
}

