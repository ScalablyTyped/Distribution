package typings
package jsDashJodaLib.jsDashJodaMod.JSJodaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ZoneRules extends js.Object {
  def isFixedOffset(): scala.Boolean = js.native
  def isValidOffset(localDateTime: LocalDateTime, offset: ZoneOffset): scala.Boolean = js.native
  def offset(instantOrLocalDateTime: Instant): ZoneOffset = js.native
  def offset(instantOrLocalDateTime: LocalDateTime): ZoneOffset = js.native
  def offsetOfEpochMilli(epochMilli: scala.Double): ZoneOffset = js.native
  def offsetOfInstant(instant: Instant): ZoneOffset = js.native
  def offsetOfLocalDateTime(localDateTime: LocalDateTime): ZoneOffset = js.native
}

