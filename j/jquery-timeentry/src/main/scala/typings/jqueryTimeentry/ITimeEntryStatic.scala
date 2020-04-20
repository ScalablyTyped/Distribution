package typings.jqueryTimeentry

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITimeEntryStatic extends js.Object {
  var regionalOptions: ITimeEntryLocales
  def setDefaults(settings: ITimeEntryOptions): Unit
}

object ITimeEntryStatic {
  @scala.inline
  def apply(regionalOptions: ITimeEntryLocales, setDefaults: ITimeEntryOptions => Unit): ITimeEntryStatic = {
    val __obj = js.Dynamic.literal(regionalOptions = regionalOptions.asInstanceOf[js.Any], setDefaults = js.Any.fromFunction1(setDefaults))
    __obj.asInstanceOf[ITimeEntryStatic]
  }
}

