package typings
package jwplayerLib.jwplayerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Version extends js.Object {
  var major: scala.Double
  var minor: scala.Double
  var version: java.lang.String
}

object Version {
  @scala.inline
  def apply(major: scala.Double, minor: scala.Double, version: java.lang.String): Version = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("major")(major)
    __obj.updateDynamic("minor")(minor)
    __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[Version]
  }
}

