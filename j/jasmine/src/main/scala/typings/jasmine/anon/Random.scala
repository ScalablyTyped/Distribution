package typings.jasmine.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Random extends js.Object {
  var random: Boolean
  var seed: String
}

object Random {
  @scala.inline
  def apply(random: Boolean, seed: String): Random = {
    val __obj = js.Dynamic.literal(random = random.asInstanceOf[js.Any], seed = seed.asInstanceOf[js.Any])
    __obj.asInstanceOf[Random]
  }
}

