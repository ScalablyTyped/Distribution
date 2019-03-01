package typings
package knockoutDashPreDashRenderedLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ElementReadValue extends js.Object {
  def readValue(element: stdLib.HTMLElement): js.Any
  def writeValue(element: stdLib.HTMLElement, value: js.Any): scala.Unit
}

object Anon_ElementReadValue {
  @scala.inline
  def apply(
    readValue: js.Function1[stdLib.HTMLElement, js.Any],
    writeValue: js.Function2[stdLib.HTMLElement, js.Any, scala.Unit]
  ): Anon_ElementReadValue = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("readValue")(readValue)
    __obj.updateDynamic("writeValue")(writeValue)
    __obj.asInstanceOf[Anon_ElementReadValue]
  }
}

