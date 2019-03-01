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

object TemporalAccessor {
  @scala.inline
  def apply(
    get: js.Function1[TemporalField, scala.Double],
    query: js.Function1[TemporalQuery, js.Any],
    range: js.Function1[TemporalField, ValueRange]
  ): TemporalAccessor = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(get)
    __obj.updateDynamic("query")(query)
    __obj.updateDynamic("range")(range)
    __obj.asInstanceOf[TemporalAccessor]
  }
}

