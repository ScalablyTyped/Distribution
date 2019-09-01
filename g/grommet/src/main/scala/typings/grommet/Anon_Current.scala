package typings.grommet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Current extends js.Object {
  var current: js.Any
  var next: js.Any
  var previous: js.Any
}

object Anon_Current {
  @scala.inline
  def apply(current: js.Any, next: js.Any, previous: js.Any): Anon_Current = {
    val __obj = js.Dynamic.literal(current = current, next = next, previous = previous)
  
    __obj.asInstanceOf[Anon_Current]
  }
}

