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
    equals: js.Any => scala.Boolean,
    resolveDate: (js.Any, js.Any) => js.Any,
    toString: () => java.lang.String
  ): IsoChronology = {
    val __obj = js.Dynamic.literal(equals = js.Any.fromFunction1(equals), resolveDate = js.Any.fromFunction2(resolveDate), toString = js.Any.fromFunction0(toString))
  
    __obj.asInstanceOf[IsoChronology]
  }
}

