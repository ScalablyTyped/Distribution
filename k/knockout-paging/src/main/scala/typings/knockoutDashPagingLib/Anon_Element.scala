package typings
package knockoutDashPagingLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Element extends js.Object {
  def readValue(element: stdLib.HTMLElement): js.Any
  def writeValue(element: stdLib.HTMLElement, value: js.Any): scala.Unit
}

object Anon_Element {
  @scala.inline
  def apply(readValue: stdLib.HTMLElement => js.Any, writeValue: (stdLib.HTMLElement, js.Any) => scala.Unit): Anon_Element = {
    val __obj = js.Dynamic.literal(readValue = js.Any.fromFunction1(readValue), writeValue = js.Any.fromFunction2(writeValue))
  
    __obj.asInstanceOf[Anon_Element]
  }
}

