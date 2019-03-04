package typings
package jsDashJodaLib.jsDashJodaMod.JSJodaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IsoChronology extends js.Object {
  def equals(other: js.Any): scala.Boolean
  def resolveDate(fieldValues: js.Any, resolverStyle: js.Any): js.Any
}

object IsoChronology {
  @scala.inline
  def apply(
    equals: js.Function1[js.Any, scala.Boolean],
    resolveDate: js.Function2[js.Any, js.Any, js.Any],
    toString: js.Function0[java.lang.String]
  ): IsoChronology = {
    val __obj = js.Dynamic.literal(equals = equals, resolveDate = resolveDate, toString = toString)
  
    __obj.asInstanceOf[IsoChronology]
  }
}

