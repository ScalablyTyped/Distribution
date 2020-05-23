package typings.jqueryNoty

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Noty extends js.Object {
  var closed: Boolean = js.native
  var shown: Boolean = js.native
  def apply(notyOptions: NotyOptions): js.Any = js.native
  def close(): js.Any = js.native
  def setText(text: String): js.Any = js.native
  def setTimeout(timeout: Double): js.Any = js.native
  def setType(`type`: String): js.Any = js.native
  def show(): js.Any = js.native
}

