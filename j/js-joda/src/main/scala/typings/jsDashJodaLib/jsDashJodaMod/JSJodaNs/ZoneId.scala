package typings
package jsDashJodaLib.jsDashJodaMod.JSJodaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ZoneId extends js.Object {
  def equals(other: js.Any): scala.Boolean
  def id(): java.lang.String
  def normalized(): ZoneId
  def rules(): ZoneRules
}

object ZoneId {
  @scala.inline
  def apply(
    equals: js.Function1[js.Any, scala.Boolean],
    hashCode: js.Function0[scala.Double],
    id: js.Function0[java.lang.String],
    normalized: js.Function0[ZoneId],
    rules: js.Function0[ZoneRules],
    toString: js.Function0[java.lang.String]
  ): ZoneId = {
    val __obj = js.Dynamic.literal(equals = equals, hashCode = hashCode, id = id, normalized = normalized, rules = rules, toString = toString)
  
    __obj.asInstanceOf[ZoneId]
  }
}

