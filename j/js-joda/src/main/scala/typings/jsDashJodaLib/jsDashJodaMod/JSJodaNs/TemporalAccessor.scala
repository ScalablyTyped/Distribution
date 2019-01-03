package typings
package jsDashJodaLib.jsDashJodaMod.JSJodaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TemporalAccessor extends js.Object {
  def get(field: TemporalField): scala.Double
  def query(query: TemporalQuery): js.Any
  def range(field: TemporalField): ValueRange
}

