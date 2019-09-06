package typings.hashring.hashringMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServerConfig extends js.Object {
  var vnodes: Double
  var weight: Double
}

object ServerConfig {
  @scala.inline
  def apply(vnodes: Double, weight: Double): ServerConfig = {
    val __obj = js.Dynamic.literal(vnodes = vnodes, weight = weight)
  
    __obj.asInstanceOf[ServerConfig]
  }
}

