package typings
package jqueryDashTimeentryLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITimeEntryStatic extends js.Object {
  var regionalOptions: ITimeEntryLocales
  def setDefaults(settings: ITimeEntryOptions): scala.Unit
}

object ITimeEntryStatic {
  @scala.inline
  def apply(regionalOptions: ITimeEntryLocales, setDefaults: ITimeEntryOptions => scala.Unit): ITimeEntryStatic = {
    val __obj = js.Dynamic.literal(regionalOptions = regionalOptions, setDefaults = js.Any.fromFunction1(setDefaults))
  
    __obj.asInstanceOf[ITimeEntryStatic]
  }
}

