package typings.kafkajs.kafkajsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdminDescribeConfigsOptions extends js.Object {
  var resources: js.Array[ResourceConfigQuery]
}

object AdminDescribeConfigsOptions {
  @scala.inline
  def apply(resources: js.Array[ResourceConfigQuery]): AdminDescribeConfigsOptions = {
    val __obj = js.Dynamic.literal(resources = resources)
  
    __obj.asInstanceOf[AdminDescribeConfigsOptions]
  }
}

