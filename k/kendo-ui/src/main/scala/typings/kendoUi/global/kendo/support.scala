package typings.kendoUi.global.kendo

import typings.kendoUi.anon.AppMode
import typings.kendoUi.anon.Edge
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.support")
@js.native
object support extends js.Object {
  var browser: Edge = js.native
  var devicePixelRatio: Double = js.native
  var hasHW3D: Boolean = js.native
  var hasNativeScrolling: Boolean = js.native
  var mobileOS: AppMode = js.native
  var placeholder: Boolean = js.native
  var pointers: Boolean = js.native
  var touch: Boolean = js.native
  var zoomLevel: Double = js.native
  def scrollbar(): Double = js.native
}

