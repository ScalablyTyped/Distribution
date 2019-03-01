package typings
package jasmineLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Random extends js.Object {
  var random: scala.Boolean
  var seed: java.lang.String
}

object Anon_Random {
  @scala.inline
  def apply(random: scala.Boolean, seed: java.lang.String): Anon_Random = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("random")(random)
    __obj.updateDynamic("seed")(seed)
    __obj.asInstanceOf[Anon_Random]
  }
}

