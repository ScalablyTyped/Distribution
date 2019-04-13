package typings
package kdbushLib.kdbushMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("kdbush", "KDBush")
@js.native
class KDBush[T] () extends js.Object {
  var coords: js.Array[scala.Double] = js.native
  var ids: js.Array[scala.Double] = js.native
  var nodeSize: scala.Double = js.native
  var points: js.Array[T] = js.native
  def range(minX: scala.Double, minY: scala.Double, maxX: scala.Double, maxY: scala.Double): js.Array[scala.Double] = js.native
  def within(x: scala.Double, y: scala.Double, r: scala.Double): js.Array[scala.Double] = js.native
}

