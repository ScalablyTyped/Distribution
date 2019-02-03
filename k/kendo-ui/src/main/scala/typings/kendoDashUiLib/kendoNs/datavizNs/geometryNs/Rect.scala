package typings
package kendoDashUiLib.kendoNs.datavizNs.geometryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.dataviz.geometry.Rect")
@js.native
class Rect protected ()
  extends kendoDashUiLib.kendoNs.Observable {
  def this(origin: js.Any, size: js.Any) = this()
  def this(origin: js.Any, size: kendoDashUiLib.kendoNs.geometryNs.Size) = this()
  def this(origin: kendoDashUiLib.kendoNs.geometryNs.Point, size: js.Any) = this()
  def this(origin: kendoDashUiLib.kendoNs.geometryNs.Point, size: kendoDashUiLib.kendoNs.geometryNs.Size) = this()
  var options: RectOptions = js.native
  var origin: kendoDashUiLib.kendoNs.geometryNs.Point = js.native
  var size: kendoDashUiLib.kendoNs.geometryNs.Size = js.native
  def bbox(matrix: kendoDashUiLib.kendoNs.geometryNs.Matrix): kendoDashUiLib.kendoNs.geometryNs.Rect = js.native
  def bottomLeft(): kendoDashUiLib.kendoNs.geometryNs.Point = js.native
  def bottomRight(): kendoDashUiLib.kendoNs.geometryNs.Point = js.native
  def center(): kendoDashUiLib.kendoNs.geometryNs.Point = js.native
  def equals(other: kendoDashUiLib.kendoNs.geometryNs.Rect): scala.Boolean = js.native
  def getOrigin(): kendoDashUiLib.kendoNs.geometryNs.Point = js.native
  def getSize(): kendoDashUiLib.kendoNs.geometryNs.Size = js.native
  def height(): scala.Double = js.native
  def setOrigin(value: js.Any): kendoDashUiLib.kendoNs.geometryNs.Rect = js.native
  def setOrigin(value: kendoDashUiLib.kendoNs.geometryNs.Point): kendoDashUiLib.kendoNs.geometryNs.Rect = js.native
  def setSize(value: js.Any): kendoDashUiLib.kendoNs.geometryNs.Rect = js.native
  def setSize(value: kendoDashUiLib.kendoNs.geometryNs.Size): kendoDashUiLib.kendoNs.geometryNs.Rect = js.native
  def topLeft(): kendoDashUiLib.kendoNs.geometryNs.Point = js.native
  def topRight(): kendoDashUiLib.kendoNs.geometryNs.Point = js.native
  def width(): scala.Double = js.native
}

/* static members */
@JSGlobal("kendo.dataviz.geometry.Rect")
@js.native
object Rect extends js.Object {
  def fromPoints(pointA: kendoDashUiLib.kendoNs.geometryNs.Point, pointB: kendoDashUiLib.kendoNs.geometryNs.Point): kendoDashUiLib.kendoNs.geometryNs.Rect = js.native
  def union(rectA: kendoDashUiLib.kendoNs.geometryNs.Rect, rectB: kendoDashUiLib.kendoNs.geometryNs.Rect): kendoDashUiLib.kendoNs.geometryNs.Rect = js.native
}

