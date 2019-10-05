package typings.jwplayer.jwplayer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Version extends js.Object {
  var major: Double
  var minor: Double
  var version: String
}

object Version {
  @scala.inline
  def apply(major: Double, minor: Double, version: String): Version = {
    val __obj = js.Dynamic.literal(major = major, minor = minor, version = version)
  
    __obj.asInstanceOf[Version]
  }
}

