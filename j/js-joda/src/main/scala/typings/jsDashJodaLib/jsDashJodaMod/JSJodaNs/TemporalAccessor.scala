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
    get: TemporalField => scala.Double,
    query: TemporalQuery => js.Any,
    range: TemporalField => ValueRange
  ): TemporalAccessor = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), query = js.Any.fromFunction1(query), range = js.Any.fromFunction1(range))
  
    __obj.asInstanceOf[TemporalAccessor]
  }
}

