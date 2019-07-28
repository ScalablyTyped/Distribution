package typings.jsforce.limitsDashInfoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Limit extends js.Object {
  var Max: Double
  var Remaining: Double
}

object Limit {
  @scala.inline
  def apply(Max: Double, Remaining: Double): Limit = {
    val __obj = js.Dynamic.literal(Max = Max, Remaining = Remaining)
  
    __obj.asInstanceOf[Limit]
  }
}

