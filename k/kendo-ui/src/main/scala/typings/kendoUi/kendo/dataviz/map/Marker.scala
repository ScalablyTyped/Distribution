package typings.kendoUi.kendo.dataviz.map

import typings.kendoUi.kendo.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Marker extends Observable {
  var options: MarkerOptions = js.native
  def location(): Location = js.native
  def location(location: js.Any): Unit = js.native
  def location(location: Location): Unit = js.native
}

