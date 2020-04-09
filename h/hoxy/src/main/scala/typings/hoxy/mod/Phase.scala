package typings.hoxy.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.hoxy.hoxyStrings.request
  - typings.hoxy.hoxyStrings.`request-sent`
  - typings.hoxy.hoxyStrings.response
  - typings.hoxy.hoxyStrings.`response-sent`
*/
trait Phase extends js.Object

object Phase {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def request: typings.hoxy.hoxyStrings.request = this.cast("request")
  @scala.inline
  def `request-sent`: typings.hoxy.hoxyStrings.`request-sent` = this.cast("request-sent")
  @scala.inline
  def response: typings.hoxy.hoxyStrings.response = this.cast("response")
  @scala.inline
  def `response-sent`: typings.hoxy.hoxyStrings.`response-sent` = this.cast("response-sent")
}

