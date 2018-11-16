package typings
package kdbushLib.kdbushMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("kdbush", "KDBush")
@js.native
class KDBush[T] ()
  extends kdbushLib.kdbushMod.kdbushNs.KDBush[T] {
  /* CompleteClass */
  override var coords: js.Array[scala.Double] = js.native
  /* CompleteClass */
  override var ids: js.Array[scala.Double] = js.native
  /* CompleteClass */
  override var nodeSize: scala.Double = js.native
  /* CompleteClass */
  override var points: js.Array[T] = js.native
  /* CompleteClass */
  override def range(minX: scala.Double, minY: scala.Double, maxX: scala.Double, maxY: scala.Double): js.Array[scala.Double] = js.native
  /* CompleteClass */
  override def within(x: scala.Double, y: scala.Double, r: scala.Double): js.Array[scala.Double] = js.native
}

