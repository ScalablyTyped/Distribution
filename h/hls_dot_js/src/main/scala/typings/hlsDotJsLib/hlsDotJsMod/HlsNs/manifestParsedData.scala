package typings
package hlsDotJsLib.hlsDotJsMod.HlsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait manifestParsedData extends js.Object {
  var firstLevel: scala.Double
  var levels: js.Array[scala.Double]
}

object manifestParsedData {
  @scala.inline
  def apply(firstLevel: scala.Double, levels: js.Array[scala.Double]): manifestParsedData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("firstLevel")(firstLevel)
    __obj.updateDynamic("levels")(levels)
    __obj.asInstanceOf[manifestParsedData]
  }
}

