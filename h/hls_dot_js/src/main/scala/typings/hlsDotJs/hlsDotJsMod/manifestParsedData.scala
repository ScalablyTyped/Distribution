package typings.hlsDotJs.hlsDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait manifestParsedData extends js.Object {
  var firstLevel: Double
  var levels: js.Array[Double]
}

object manifestParsedData {
  @scala.inline
  def apply(firstLevel: Double, levels: js.Array[Double]): manifestParsedData = {
    val __obj = js.Dynamic.literal(firstLevel = firstLevel.asInstanceOf[js.Any], levels = levels.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[manifestParsedData]
  }
}

