package typings
package jsDashJodaLib.jsDashJodaMod.JSJodaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ZoneOffset extends ZoneId {
  def adjustInto(temporal: Temporal): Temporal
  def compareTo(other: ZoneOffset): scala.Double
  def get(field: TemporalField): scala.Double
  def getLong(field: TemporalField): scala.Double
  def query(query: TemporalQuery): js.Any
  def totalSeconds(): scala.Double
}

