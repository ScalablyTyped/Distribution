package typings.jasmine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRandom extends js.Object {
  var random: Boolean
  var seed: String
}

object AnonRandom {
  @scala.inline
  def apply(random: Boolean, seed: String): AnonRandom = {
    val __obj = js.Dynamic.literal(random = random.asInstanceOf[js.Any], seed = seed.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRandom]
  }
}

