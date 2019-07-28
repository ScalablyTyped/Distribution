package typings.launchpad.launchpadMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Browser extends js.Object {
  var binPath: String
  var name: String
  var version: String
}

object Browser {
  @scala.inline
  def apply(binPath: String, name: String, version: String): Browser = {
    val __obj = js.Dynamic.literal(binPath = binPath, name = name, version = version)
  
    __obj.asInstanceOf[Browser]
  }
}

