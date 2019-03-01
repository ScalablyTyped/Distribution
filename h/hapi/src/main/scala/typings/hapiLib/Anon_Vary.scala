package typings
package hapiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Vary extends js.Object {
  var vary: scala.Boolean
  var weak: scala.Boolean
}

object Anon_Vary {
  @scala.inline
  def apply(vary: scala.Boolean, weak: scala.Boolean): Anon_Vary = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("vary")(vary)
    __obj.updateDynamic("weak")(weak)
    __obj.asInstanceOf[Anon_Vary]
  }
}

