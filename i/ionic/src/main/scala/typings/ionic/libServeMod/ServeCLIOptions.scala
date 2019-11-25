package typings.ionic.libServeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServeCLIOptions extends js.Object {
  val address: String
  val port: Double
}

object ServeCLIOptions {
  @scala.inline
  def apply(address: String, port: Double): ServeCLIOptions = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ServeCLIOptions]
  }
}

