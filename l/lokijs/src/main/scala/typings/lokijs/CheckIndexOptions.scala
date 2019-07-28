package typings.lokijs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CheckIndexOptions extends js.Object {
  var randomSampling: Boolean
  var randomSamplingFactor: Double
  var repair: Boolean
}

object CheckIndexOptions {
  @scala.inline
  def apply(randomSampling: Boolean, randomSamplingFactor: Double, repair: Boolean): CheckIndexOptions = {
    val __obj = js.Dynamic.literal(randomSampling = randomSampling, randomSamplingFactor = randomSamplingFactor, repair = repair)
  
    __obj.asInstanceOf[CheckIndexOptions]
  }
}

