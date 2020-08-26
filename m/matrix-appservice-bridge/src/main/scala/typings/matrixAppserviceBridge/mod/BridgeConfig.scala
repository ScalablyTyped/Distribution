package typings.matrixAppserviceBridge.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BridgeConfig extends js.Object {
  var schema: String = js.native
}

object BridgeConfig {
  @scala.inline
  def apply(schema: String): BridgeConfig = {
    val __obj = js.Dynamic.literal(schema = schema.asInstanceOf[js.Any])
    __obj.asInstanceOf[BridgeConfig]
  }
  @scala.inline
  implicit class BridgeConfigOps[Self <: BridgeConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setSchema(value: String): Self = this.set("schema", value.asInstanceOf[js.Any])
  }
  
}

