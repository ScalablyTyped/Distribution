package typings
package kafkajsLib.kafkajsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdminAlterConfigReturn extends js.Object {
  var resources: js.Array[AdminAlterConfigResource]
  var throttleTime: scala.Double
}

object AdminAlterConfigReturn {
  @scala.inline
  def apply(resources: js.Array[AdminAlterConfigResource], throttleTime: scala.Double): AdminAlterConfigReturn = {
    val __obj = js.Dynamic.literal(resources = resources, throttleTime = throttleTime)
  
    __obj.asInstanceOf[AdminAlterConfigReturn]
  }
}

