package typings.mapboxShelfPack.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShelfPack extends js.Object {
  var h: Double = js.native
  var w: Double = js.native
  def clear(): Unit = js.native
  def getBin(id: ID): Bin = js.native
  def pack(bins: js.Array[RequestShort | RequestLong]): js.Array[Bin] = js.native
  def pack(bins: js.Array[RequestShort | RequestLong], options: PackOption): js.Array[Bin] = js.native
  def packOne(w: Double, h: Double): Bin = js.native
  def packOne(w: Double, h: Double, id: ID): Bin = js.native
  def ref(bin: Bin): Double = js.native
  def resize(w: Double, h: Double): Boolean = js.native
  def unref(bin: Bin): Double = js.native
}

