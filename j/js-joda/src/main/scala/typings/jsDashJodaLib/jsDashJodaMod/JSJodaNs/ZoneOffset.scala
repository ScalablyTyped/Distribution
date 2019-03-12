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

object ZoneOffset {
  @scala.inline
  def apply(
    adjustInto: Temporal => Temporal,
    compareTo: ZoneOffset => scala.Double,
    equals: js.Any => scala.Boolean,
    get: TemporalField => scala.Double,
    getLong: TemporalField => scala.Double,
    hashCode: () => scala.Double,
    id: () => java.lang.String,
    normalized: () => ZoneId,
    query: TemporalQuery => js.Any,
    rules: () => ZoneRules,
    toString: () => java.lang.String,
    totalSeconds: () => scala.Double
  ): ZoneOffset = {
    val __obj = js.Dynamic.literal(adjustInto = js.Any.fromFunction1(adjustInto), compareTo = js.Any.fromFunction1(compareTo), equals = js.Any.fromFunction1(equals), get = js.Any.fromFunction1(get), getLong = js.Any.fromFunction1(getLong), hashCode = js.Any.fromFunction0(hashCode), id = js.Any.fromFunction0(id), normalized = js.Any.fromFunction0(normalized), query = js.Any.fromFunction1(query), rules = js.Any.fromFunction0(rules), toString = js.Any.fromFunction0(toString), totalSeconds = js.Any.fromFunction0(totalSeconds))
  
    __obj.asInstanceOf[ZoneOffset]
  }
}

