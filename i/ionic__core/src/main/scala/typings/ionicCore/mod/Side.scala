package typings.ionicCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.ionicCore.ionicCoreStrings.start
  - typings.ionicCore.ionicCoreStrings.end
*/
trait Side extends js.Object

object Side {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def end: typings.ionicCore.ionicCoreStrings.end = this.cast("end")
  @scala.inline
  def start: typings.ionicCore.ionicCoreStrings.start = this.cast("start")
}

