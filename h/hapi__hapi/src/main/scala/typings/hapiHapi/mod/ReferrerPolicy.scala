package typings.hapiHapi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.hapiHapi.hapiHapiStrings._empty
  - typings.hapiHapi.hapiHapiStrings.`no-referrer`
  - typings.hapiHapi.hapiHapiStrings.`no-referrer-when-downgrade`
  - typings.hapiHapi.hapiHapiStrings.`unsafe-url`
  - typings.hapiHapi.hapiHapiStrings.`same-origin`
  - typings.hapiHapi.hapiHapiStrings.origin
  - typings.hapiHapi.hapiHapiStrings.`strict-origin`
  - typings.hapiHapi.hapiHapiStrings.`origin-when-cross-origin`
  - typings.hapiHapi.hapiHapiStrings.`strict-origin-when-cross-origin`
*/
trait ReferrerPolicy extends js.Object

object ReferrerPolicy {
  @scala.inline
  def _empty: typings.hapiHapi.hapiHapiStrings._empty = this.cast("")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def `no-referrer`: typings.hapiHapi.hapiHapiStrings.`no-referrer` = this.cast("no-referrer")
  @scala.inline
  def `no-referrer-when-downgrade`: typings.hapiHapi.hapiHapiStrings.`no-referrer-when-downgrade` = this.cast("no-referrer-when-downgrade")
  @scala.inline
  def origin: typings.hapiHapi.hapiHapiStrings.origin = this.cast("origin")
  @scala.inline
  def `origin-when-cross-origin`: typings.hapiHapi.hapiHapiStrings.`origin-when-cross-origin` = this.cast("origin-when-cross-origin")
  @scala.inline
  def `same-origin`: typings.hapiHapi.hapiHapiStrings.`same-origin` = this.cast("same-origin")
  @scala.inline
  def `strict-origin`: typings.hapiHapi.hapiHapiStrings.`strict-origin` = this.cast("strict-origin")
  @scala.inline
  def `strict-origin-when-cross-origin`: typings.hapiHapi.hapiHapiStrings.`strict-origin-when-cross-origin` = this.cast("strict-origin-when-cross-origin")
  @scala.inline
  def `unsafe-url`: typings.hapiHapi.hapiHapiStrings.`unsafe-url` = this.cast("unsafe-url")
}

