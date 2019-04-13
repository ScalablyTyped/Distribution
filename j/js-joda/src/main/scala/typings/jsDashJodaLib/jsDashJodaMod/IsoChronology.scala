package typings
package jsDashJodaLib.jsDashJodaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("js-joda", "IsoChronology")
@js.native
abstract class IsoChronology protected () extends js.Object {
  def equals(other: js.Any): scala.Boolean = js.native
  def resolveDate(fieldValues: js.Any, resolverStyle: js.Any): js.Any = js.native
}

/* static members */
@JSImport("js-joda", "IsoChronology")
@js.native
object IsoChronology extends js.Object {
  def isLeapYear(prolepticYear: scala.Double): scala.Boolean = js.native
}

