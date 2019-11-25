package typings.jasmine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Random extends js.Object {
  var random: Boolean
  var seed: String
}

object Anon_Random {
  @scala.inline
  def apply(random: Boolean, seed: String): Anon_Random = {
    val __obj = js.Dynamic.literal(random = random.asInstanceOf[js.Any], seed = seed.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Random]
  }
}

