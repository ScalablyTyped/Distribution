package typings
package kendoDashUiLib.kendoNs.datavizNs.mapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.dataviz.map.Extent")
@js.native
class Extent protected ()
  extends kendoDashUiLib.kendoNs.Class {
  def this(nw: js.Any, se: js.Any) = this()
  def this(nw: js.Any, se: Location) = this()
  def this(nw: Location, se: js.Any) = this()
  def this(nw: Location, se: Location) = this()
  var nw: Location = js.native
  var options: ExtentOptions = js.native
  var se: Location = js.native
  def center(): Location = js.native
  def contains(location: Location): scala.Boolean = js.native
  def containsAny(locations: js.Any): scala.Boolean = js.native
  def edges(): js.Any = js.native
  def include(location: Location): scala.Unit = js.native
  def includeAll(locations: js.Any): scala.Unit = js.native
  def overlaps(extent: Extent): scala.Boolean = js.native
  def toArray(): js.Any = js.native
}

@JSGlobal("kendo.dataviz.map.Extent")
@js.native
object Extent extends js.Object {
  def create(a: js.Any): kendoDashUiLib.kendoNs.datavizNs.mapNs.Extent = js.native
  def create(a: js.Any, b: js.Any): kendoDashUiLib.kendoNs.datavizNs.mapNs.Extent = js.native
  def create(a: js.Any, b: kendoDashUiLib.kendoNs.datavizNs.mapNs.Location): kendoDashUiLib.kendoNs.datavizNs.mapNs.Extent = js.native
  def create(a: kendoDashUiLib.kendoNs.datavizNs.mapNs.Location): kendoDashUiLib.kendoNs.datavizNs.mapNs.Extent = js.native
  def create(a: kendoDashUiLib.kendoNs.datavizNs.mapNs.Location, b: js.Any): kendoDashUiLib.kendoNs.datavizNs.mapNs.Extent = js.native
  def create(
    a: kendoDashUiLib.kendoNs.datavizNs.mapNs.Location,
    b: kendoDashUiLib.kendoNs.datavizNs.mapNs.Location
  ): kendoDashUiLib.kendoNs.datavizNs.mapNs.Extent = js.native
}

