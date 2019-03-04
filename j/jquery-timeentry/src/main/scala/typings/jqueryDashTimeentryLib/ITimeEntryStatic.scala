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
  def apply(regionalOptions: ITimeEntryLocales, setDefaults: js.Function1[ITimeEntryOptions, scala.Unit]): ITimeEntryStatic = {
    val __obj = js.Dynamic.literal(regionalOptions = regionalOptions, setDefaults = setDefaults)
  
    __obj.asInstanceOf[ITimeEntryStatic]
  }
}

