package typings.kendoDashUi.kendo.dataviz.map

import typings.kendoDashUi.kendo.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.dataviz.map.Marker")
@js.native
class Marker () extends Observable {
  def this(options: MarkerOptions) = this()
  var options: MarkerOptions = js.native
  def location(): Location = js.native
  def location(location: js.Any): Unit = js.native
  def location(location: Location): Unit = js.native
}

