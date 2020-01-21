package typings.kendoUi.kendo

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.Route")
@js.native
class Route () extends Class {
  var route: RegExp = js.native
  def callback(url: String): Unit = js.native
  def worksWith(url: String): Unit = js.native
}

