package typings.kafkajs.kafkajsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdminConfigDescription extends js.Object {
  var resources: js.Array[AdminConfigDescriptionResource]
  var throttleTime: Double
}

object AdminConfigDescription {
  @scala.inline
  def apply(resources: js.Array[AdminConfigDescriptionResource], throttleTime: Double): AdminConfigDescription = {
    val __obj = js.Dynamic.literal(resources = resources, throttleTime = throttleTime)
  
    __obj.asInstanceOf[AdminConfigDescription]
  }
}

