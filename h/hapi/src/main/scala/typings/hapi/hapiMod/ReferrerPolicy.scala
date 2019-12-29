package typings.hapi.hapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.hapi.hapiStrings._empty
  - typings.hapi.hapiStrings.`no-referrer`
  - typings.hapi.hapiStrings.`no-referrer-when-downgrade`
  - typings.hapi.hapiStrings.`unsafe-url`
  - typings.hapi.hapiStrings.`same-origin`
  - typings.hapi.hapiStrings.origin
  - typings.hapi.hapiStrings.`strict-origin`
  - typings.hapi.hapiStrings.`origin-when-cross-origin`
  - typings.hapi.hapiStrings.`strict-origin-when-cross-origin`
*/
trait ReferrerPolicy extends js.Object

object ReferrerPolicy {
  @scala.inline
  def _empty: typings.hapi.hapiStrings._empty = this.cast("")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def `no-referrer`: typings.hapi.hapiStrings.`no-referrer` = this.cast("no-referrer")
  @scala.inline
  def `no-referrer-when-downgrade`: typings.hapi.hapiStrings.`no-referrer-when-downgrade` = this.cast("no-referrer-when-downgrade")
  @scala.inline
  def origin: typings.hapi.hapiStrings.origin = this.cast("origin")
  @scala.inline
  def `origin-when-cross-origin`: typings.hapi.hapiStrings.`origin-when-cross-origin` = this.cast("origin-when-cross-origin")
  @scala.inline
  def `same-origin`: typings.hapi.hapiStrings.`same-origin` = this.cast("same-origin")
  @scala.inline
  def `strict-origin`: typings.hapi.hapiStrings.`strict-origin` = this.cast("strict-origin")
  @scala.inline
  def `strict-origin-when-cross-origin`: typings.hapi.hapiStrings.`strict-origin-when-cross-origin` = this.cast("strict-origin-when-cross-origin")
  @scala.inline
  def `unsafe-url`: typings.hapi.hapiStrings.`unsafe-url` = this.cast("unsafe-url")
}

