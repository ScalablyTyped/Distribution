package typings.kendoUi.global.kendo

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.Route")
@js.native
class Route ()
  extends typings.kendoUi.kendo.Route {
  /* CompleteClass */
  override var route: RegExp = js.native
  /* CompleteClass */
  override def callback(url: String): Unit = js.native
  /* CompleteClass */
  override def worksWith(url: String): Unit = js.native
}

