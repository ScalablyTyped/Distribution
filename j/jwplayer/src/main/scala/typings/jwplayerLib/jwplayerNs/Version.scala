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
    val __obj = js.Dynamic.literal(major = major, minor = minor, version = version)
  
    __obj.asInstanceOf[Version]
  }
}

