package typings.kendoUi.kendo.dataviz.map

import typings.kendoUi.kendo.Class
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.dataviz.map.Extent")
@js.native
class Extent protected () extends Class {
  def this(nw: js.Any, se: js.Any) = this()
  def this(nw: js.Any, se: Location) = this()
  def this(nw: Location, se: js.Any) = this()
  def this(nw: Location, se: Location) = this()
  var nw: Location = js.native
  var options: ExtentOptions = js.native
  var se: Location = js.native
  def center(): Location = js.native
  def contains(location: Location): Boolean = js.native
  def containsAny(locations: js.Any): Boolean = js.native
  def edges(): js.Any = js.native
  def include(location: Location): Unit = js.native
  def includeAll(locations: js.Any): Unit = js.native
  def overlaps(extent: Extent): Boolean = js.native
  def toArray(): js.Any = js.native
}

/* static members */
@JSGlobal("kendo.dataviz.map.Extent")
@js.native
object Extent extends js.Object {
  def create(a: js.Any): Extent = js.native
  def create(a: js.Any, b: js.Any): Extent = js.native
  def create(a: js.Any, b: Location): Extent = js.native
  def create(a: Location): Extent = js.native
  def create(a: Location, b: js.Any): Extent = js.native
  def create(a: Location, b: Location): Extent = js.native
}

