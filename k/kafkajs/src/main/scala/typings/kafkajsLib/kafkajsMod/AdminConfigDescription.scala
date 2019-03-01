package typings
package kafkajsLib.kafkajsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdminConfigDescription extends js.Object {
  var resources: js.Array[AdminConfigDescriptionResource]
  var throttleTime: scala.Double
}

object AdminConfigDescription {
  @scala.inline
  def apply(resources: js.Array[AdminConfigDescriptionResource], throttleTime: scala.Double): AdminConfigDescription = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("resources")(resources)
    __obj.updateDynamic("throttleTime")(throttleTime)
    __obj.asInstanceOf[AdminConfigDescription]
  }
}

