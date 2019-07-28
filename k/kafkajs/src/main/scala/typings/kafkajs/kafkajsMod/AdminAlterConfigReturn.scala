package typings.kafkajs.kafkajsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdminAlterConfigReturn extends js.Object {
  var resources: js.Array[AdminAlterConfigResource]
  var throttleTime: Double
}

object AdminAlterConfigReturn {
  @scala.inline
  def apply(resources: js.Array[AdminAlterConfigResource], throttleTime: Double): AdminAlterConfigReturn = {
    val __obj = js.Dynamic.literal(resources = resources, throttleTime = throttleTime)
  
    __obj.asInstanceOf[AdminAlterConfigReturn]
  }
}

