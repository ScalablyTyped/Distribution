package typings.hoxy.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.hoxy.hoxyStrings.replace
  - typings.hoxy.hoxyStrings.overlay
  - typings.hoxy.hoxyStrings.mirror
*/
trait ServeStrategy extends js.Object

object ServeStrategy {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def mirror: typings.hoxy.hoxyStrings.mirror = this.cast("mirror")
  @scala.inline
  def overlay: typings.hoxy.hoxyStrings.overlay = this.cast("overlay")
  @scala.inline
  def replace: typings.hoxy.hoxyStrings.replace = this.cast("replace")
}

