package typings.graylog2.graylog2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.graylog2.graylog2Strings.optimal
  - typings.graylog2.graylog2Strings.always
  - typings.graylog2.graylog2Strings.never
*/
trait GraylogDeflate extends js.Object

object GraylogDeflate {
  @scala.inline
  def always: typings.graylog2.graylog2Strings.always = this.cast("always")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def never: typings.graylog2.graylog2Strings.never = this.cast("never")
  @scala.inline
  def optimal: typings.graylog2.graylog2Strings.optimal = this.cast("optimal")
}

