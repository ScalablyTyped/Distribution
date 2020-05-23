package typings.knockout.anon

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReadValue extends js.Object {
  def readValue(element: HTMLElement): js.Any = js.native
  def writeValue(element: HTMLElement, value: js.Any): Unit = js.native
  def writeValue(element: HTMLElement, value: js.Any, allowUnset: Boolean): Unit = js.native
}

