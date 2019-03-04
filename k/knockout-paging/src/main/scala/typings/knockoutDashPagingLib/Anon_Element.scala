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
  def apply(
    readValue: js.Function1[stdLib.HTMLElement, js.Any],
    writeValue: js.Function2[stdLib.HTMLElement, js.Any, scala.Unit]
  ): Anon_Element = {
    val __obj = js.Dynamic.literal(readValue = readValue, writeValue = writeValue)
  
    __obj.asInstanceOf[Anon_Element]
  }
}

