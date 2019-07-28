package typings.jss.jssMod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Rule extends js.Object {
  var className: String = js.native
  var selector: String = js.native
  def applyTo(element: HTMLElement): Unit = js.native
  def prop(key: String): String = js.native
  def prop(key: String, value: js.Any): this.type = js.native
  def toJSON(): String = js.native
}

