package typings.knockoutDashPaging

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Element extends js.Object {
  def readValue(element: HTMLElement): js.Any
  def writeValue(element: HTMLElement, value: js.Any): Unit
}

object Anon_Element {
  @scala.inline
  def apply(readValue: HTMLElement => js.Any, writeValue: (HTMLElement, js.Any) => Unit): Anon_Element = {
    val __obj = js.Dynamic.literal(readValue = js.Any.fromFunction1(readValue), writeValue = js.Any.fromFunction2(writeValue))
  
    __obj.asInstanceOf[Anon_Element]
  }
}

