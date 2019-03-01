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
    adjustInto: js.Function1[Temporal, Temporal],
    compareTo: js.Function1[ZoneOffset, scala.Double],
    equals: js.Function1[js.Any, scala.Boolean],
    get: js.Function1[TemporalField, scala.Double],
    getLong: js.Function1[TemporalField, scala.Double],
    hashCode: js.Function0[scala.Double],
    id: js.Function0[java.lang.String],
    normalized: js.Function0[ZoneId],
    query: js.Function1[TemporalQuery, js.Any],
    rules: js.Function0[ZoneRules],
    toString: js.Function0[java.lang.String],
    totalSeconds: js.Function0[scala.Double]
  ): ZoneOffset = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("adjustInto")(adjustInto)
    __obj.updateDynamic("compareTo")(compareTo)
    __obj.updateDynamic("equals")(equals)
    __obj.updateDynamic("get")(get)
    __obj.updateDynamic("getLong")(getLong)
    __obj.updateDynamic("hashCode")(hashCode)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("normalized")(normalized)
    __obj.updateDynamic("query")(query)
    __obj.updateDynamic("rules")(rules)
    __obj.updateDynamic("toString")(toString)
    __obj.updateDynamic("totalSeconds")(totalSeconds)
    __obj.asInstanceOf[ZoneOffset]
  }
}

