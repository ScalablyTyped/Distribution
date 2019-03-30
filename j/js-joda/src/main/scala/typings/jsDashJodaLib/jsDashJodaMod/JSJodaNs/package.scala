package typings
package jsDashJodaLib.jsDashJodaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object JSJodaNs {
  // TODO: js-joda doesn't have Chronology yet. Methods like `LocalDate.chronology()`
  // actually return an `IsoChronology` so Chronology is an alias type of that class
  // for now. Change this if Chronology is added.
  type Chronology = IsoChronology
  type DateTimeParseException = stdLib.Error
  type Temporal = TemporalAccessor
}
