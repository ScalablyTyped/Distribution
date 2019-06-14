package typings
package kafkajsLib.kafkajsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeConfigResponse extends js.Object {
  var resources: js.Array[kafkajsLib.Anon_ConfigEntries]
  var throttleTime: scala.Double
}

object DescribeConfigResponse {
  @scala.inline
  def apply(resources: js.Array[kafkajsLib.Anon_ConfigEntries], throttleTime: scala.Double): DescribeConfigResponse = {
    val __obj = js.Dynamic.literal(resources = resources, throttleTime = throttleTime)
  
    __obj.asInstanceOf[DescribeConfigResponse]
  }
}

