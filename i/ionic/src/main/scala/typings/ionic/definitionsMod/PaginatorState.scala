package typings.ionic.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaginatorState extends js.Object {
  var done: Boolean
  var loaded: Double
}

object PaginatorState {
  @scala.inline
  def apply(done: Boolean, loaded: Double): PaginatorState = {
    val __obj = js.Dynamic.literal(done = done.asInstanceOf[js.Any], loaded = loaded.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PaginatorState]
  }
}

