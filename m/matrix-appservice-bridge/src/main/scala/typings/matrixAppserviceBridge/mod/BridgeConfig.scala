package typings.matrixAppserviceBridge.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BridgeConfig extends js.Object {
  var schema: String
}

object BridgeConfig {
  @scala.inline
  def apply(schema: String): BridgeConfig = {
    val __obj = js.Dynamic.literal(schema = schema.asInstanceOf[js.Any])
    __obj.asInstanceOf[BridgeConfig]
  }
}

