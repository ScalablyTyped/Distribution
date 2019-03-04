package typings
package ionicLib.libServeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServeCLIOptions extends js.Object {
  val address: java.lang.String
  val port: scala.Double
}

object ServeCLIOptions {
  @scala.inline
  def apply(address: java.lang.String, port: scala.Double): ServeCLIOptions = {
    val __obj = js.Dynamic.literal(address = address, port = port)
  
    __obj.asInstanceOf[ServeCLIOptions]
  }
}

