package typings
package ionicLib.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaginatorState extends js.Object {
  var done: scala.Boolean
  var loaded: scala.Double
}

object PaginatorState {
  @scala.inline
  def apply(done: scala.Boolean, loaded: scala.Double): PaginatorState = {
    val __obj = js.Dynamic.literal(done = done, loaded = loaded)
  
    __obj.asInstanceOf[PaginatorState]
  }
}

