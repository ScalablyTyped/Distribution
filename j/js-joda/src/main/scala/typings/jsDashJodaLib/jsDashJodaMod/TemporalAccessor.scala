package typings
package jsDashJodaLib.jsDashJodaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("js-joda", "TemporalAccessor")
@js.native
abstract class TemporalAccessor () extends js.Object {
  def get(field: TemporalField): scala.Double = js.native
  def query(query: TemporalQuery): js.Any = js.native
  def range(field: TemporalField): ValueRange = js.native
}

