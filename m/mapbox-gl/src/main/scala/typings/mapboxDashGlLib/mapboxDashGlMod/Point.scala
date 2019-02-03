package typings
package mapboxDashGlLib.mapboxDashGlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mapbox-gl", "Point")
@js.native
class Point protected ()
  extends mapboxDashGlLib.mapboxDashGlMod.mapboxglNs.Point {
  def this(x: scala.Double, y: scala.Double) = this()
  /* CompleteClass */
  override var x: scala.Double = js.native
  /* CompleteClass */
  override var y: scala.Double = js.native
  /* CompleteClass */
  override def add(p: mapboxDashGlLib.mapboxDashGlMod.mapboxglNs.Point): mapboxDashGlLib.mapboxDashGlMod.mapboxglNs.Point = js.native
  /* CompleteClass */
  override def angle(): scala.Double = js.native
  /* CompleteClass */
  override def angleTo(p: mapboxDashGlLib.mapboxDashGlMod.mapboxglNs.Point): scala.Double = js.native
  /* CompleteClass */
  override def angleWidth(p: mapboxDashGlLib.mapboxDashGlMod.mapboxglNs.Point): scala.Double = js.native
  /* CompleteClass */
  override def angleWithSep(x: scala.Double, y: scala.Double): scala.Double = js.native
  /* CompleteClass */
  override def dist(p: mapboxDashGlLib.mapboxDashGlMod.mapboxglNs.Point): scala.Double = js.native
  /* CompleteClass */
  override def distSqr(p: mapboxDashGlLib.mapboxDashGlMod.mapboxglNs.Point): scala.Double = js.native
  /* CompleteClass */
  override def div(k: scala.Double): mapboxDashGlLib.mapboxDashGlMod.mapboxglNs.Point = js.native
  /* CompleteClass */
  override def equals(p: mapboxDashGlLib.mapboxDashGlMod.mapboxglNs.Point): scala.Boolean = js.native
  /* CompleteClass */
  override def mag(): scala.Double = js.native
  /* CompleteClass */
  override def matMult(m: scala.Double): mapboxDashGlLib.mapboxDashGlMod.mapboxglNs.Point = js.native
  /* CompleteClass */
  override def mult(k: scala.Double): mapboxDashGlLib.mapboxDashGlMod.mapboxglNs.Point = js.native
  /* CompleteClass */
  override def perp(): mapboxDashGlLib.mapboxDashGlMod.mapboxglNs.Point = js.native
  /* CompleteClass */
  override def rotate(a: scala.Double): mapboxDashGlLib.mapboxDashGlMod.mapboxglNs.Point = js.native
  /* CompleteClass */
  override def round(): mapboxDashGlLib.mapboxDashGlMod.mapboxglNs.Point = js.native
  /* CompleteClass */
  override def sub(p: mapboxDashGlLib.mapboxDashGlMod.mapboxglNs.Point): mapboxDashGlLib.mapboxDashGlMod.mapboxglNs.Point = js.native
  /* CompleteClass */
  override def unit(): mapboxDashGlLib.mapboxDashGlMod.mapboxglNs.Point = js.native
}

/* static members */
@JSImport("mapbox-gl", "Point")
@js.native
object Point extends js.Object {
  def convert(a: mapboxDashGlLib.mapboxDashGlMod.mapboxglNs.PointLike): mapboxDashGlLib.mapboxDashGlMod.mapboxglNs.Point = js.native
}

