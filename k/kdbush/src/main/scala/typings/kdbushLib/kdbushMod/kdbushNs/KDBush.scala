package typings
package kdbushLib.kdbushMod.kdbushNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KDBush[T] extends js.Object {
  var coords: js.Array[scala.Double]
  var ids: js.Array[scala.Double]
  var nodeSize: scala.Double
  var points: js.Array[T]
  def range(minX: scala.Double, minY: scala.Double, maxX: scala.Double, maxY: scala.Double): js.Array[scala.Double]
  def within(x: scala.Double, y: scala.Double, r: scala.Double): js.Array[scala.Double]
}

