package typings
package jsforceLib.limitsDashInfoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Limit extends js.Object {
  var Max: scala.Double
  var Remaining: scala.Double
}

object Limit {
  @scala.inline
  def apply(Max: scala.Double, Remaining: scala.Double): Limit = {
    val __obj = js.Dynamic.literal(Max = Max, Remaining = Remaining)
  
    __obj.asInstanceOf[Limit]
  }
}

