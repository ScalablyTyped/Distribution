package typings
package lokijsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CheckIndexOptions extends js.Object {
  var randomSampling: scala.Boolean
  var randomSamplingFactor: scala.Double
  var repair: scala.Boolean
}

object CheckIndexOptions {
  @scala.inline
  def apply(randomSampling: scala.Boolean, randomSamplingFactor: scala.Double, repair: scala.Boolean): CheckIndexOptions = {
    val __obj = js.Dynamic.literal(randomSampling = randomSampling, randomSamplingFactor = randomSamplingFactor, repair = repair)
  
    __obj.asInstanceOf[CheckIndexOptions]
  }
}

