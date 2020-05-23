package typings.kendoUi.global.kendo.dataviz.map

import typings.kendoUi.kendo.dataviz.map.ExtentOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.dataviz.map.Extent")
@js.native
class Extent protected ()
  extends typings.kendoUi.kendo.dataviz.map.Extent {
  def this(nw: js.Any, se: js.Any) = this()
  def this(nw: js.Any, se: typings.kendoUi.kendo.dataviz.map.Location) = this()
  def this(nw: typings.kendoUi.kendo.dataviz.map.Location, se: js.Any) = this()
  def this(nw: typings.kendoUi.kendo.dataviz.map.Location, se: typings.kendoUi.kendo.dataviz.map.Location) = this()
  /* CompleteClass */
  override var nw: typings.kendoUi.kendo.dataviz.map.Location = js.native
  /* CompleteClass */
  override var options: ExtentOptions = js.native
  /* CompleteClass */
  override var se: typings.kendoUi.kendo.dataviz.map.Location = js.native
  /* CompleteClass */
  override def center(): typings.kendoUi.kendo.dataviz.map.Location = js.native
  /* CompleteClass */
  override def contains(location: typings.kendoUi.kendo.dataviz.map.Location): Boolean = js.native
  /* CompleteClass */
  override def containsAny(locations: js.Any): Boolean = js.native
  /* CompleteClass */
  override def edges(): js.Any = js.native
  /* CompleteClass */
  override def include(location: typings.kendoUi.kendo.dataviz.map.Location): Unit = js.native
  /* CompleteClass */
  override def includeAll(locations: js.Any): Unit = js.native
  /* CompleteClass */
  override def overlaps(extent: typings.kendoUi.kendo.dataviz.map.Extent): Boolean = js.native
  /* CompleteClass */
  override def toArray(): js.Any = js.native
}

/* static members */
@JSGlobal("kendo.dataviz.map.Extent")
@js.native
object Extent extends js.Object {
  def create(a: js.Any): typings.kendoUi.kendo.dataviz.map.Extent = js.native
  def create(a: js.Any, b: js.Any): typings.kendoUi.kendo.dataviz.map.Extent = js.native
  def create(a: js.Any, b: typings.kendoUi.kendo.dataviz.map.Location): typings.kendoUi.kendo.dataviz.map.Extent = js.native
  def create(a: typings.kendoUi.kendo.dataviz.map.Location): typings.kendoUi.kendo.dataviz.map.Extent = js.native
  def create(a: typings.kendoUi.kendo.dataviz.map.Location, b: js.Any): typings.kendoUi.kendo.dataviz.map.Extent = js.native
  def create(a: typings.kendoUi.kendo.dataviz.map.Location, b: typings.kendoUi.kendo.dataviz.map.Location): typings.kendoUi.kendo.dataviz.map.Extent = js.native
}

