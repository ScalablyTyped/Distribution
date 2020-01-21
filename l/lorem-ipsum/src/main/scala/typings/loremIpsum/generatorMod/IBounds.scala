package typings.loremIpsum.generatorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBounds extends js.Object {
  var max: Double
  var min: Double
}

object IBounds {
  @scala.inline
  def apply(max: Double, min: Double): IBounds = {
    val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IBounds]
  }
}

