package typings.hoxy.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.hoxy.hoxyStrings.$
  - typings.hoxy.hoxyStrings.json
  - typings.hoxy.hoxyStrings.params
  - typings.hoxy.hoxyStrings.buffer
  - typings.hoxy.hoxyStrings.string
*/
trait BodyParser extends js.Object

object BodyParser {
  @scala.inline
  def $: typings.hoxy.hoxyStrings.$ = this.cast("$")
  @scala.inline
  def buffer: typings.hoxy.hoxyStrings.buffer = this.cast("buffer")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def json: typings.hoxy.hoxyStrings.json = this.cast("json")
  @scala.inline
  def params: typings.hoxy.hoxyStrings.params = this.cast("params")
  @scala.inline
  def string: typings.hoxy.hoxyStrings.string = this.cast("string")
}

