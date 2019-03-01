package typings
package kafkajsLib.kafkajsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdminAlterConfigsOptions extends js.Object {
  var resources: js.Array[ResourceConfigQuery]
  var validateOnly: scala.Boolean
}

object AdminAlterConfigsOptions {
  @scala.inline
  def apply(resources: js.Array[ResourceConfigQuery], validateOnly: scala.Boolean): AdminAlterConfigsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("resources")(resources)
    __obj.updateDynamic("validateOnly")(validateOnly)
    __obj.asInstanceOf[AdminAlterConfigsOptions]
  }
}

