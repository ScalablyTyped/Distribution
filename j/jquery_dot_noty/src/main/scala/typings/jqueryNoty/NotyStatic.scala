package typings.jqueryNoty

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NotyStatic extends js.Object {
  var defaults: NotyOptions = js.native
  def apply(notyOptions: NotyOptions): js.Any = js.native
  def clearQueue(): js.Any = js.native
  def close(id: js.Any): js.Any = js.native
  def closeAll(): js.Any = js.native
  def get(id: js.Any): js.Any = js.native
  def setText(id: js.Any, text: String): js.Any = js.native
  def setType(id: js.Any, `type`: String): js.Any = js.native
}

