package typings
package atMapboxShelfDashPackLib.atMapboxShelfDashPackMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShelfPack extends js.Object {
  var h: scala.Double = js.native
  var w: scala.Double = js.native
  def clear(): scala.Unit = js.native
  def getBin(id: ID): Bin = js.native
  def pack(bins: js.Array[RequestShort | RequestLong]): js.Array[Bin] = js.native
  def pack(bins: js.Array[RequestShort | RequestLong], options: PackOption): js.Array[Bin] = js.native
  def packOne(w: scala.Double, h: scala.Double): Bin = js.native
  def packOne(w: scala.Double, h: scala.Double, id: ID): Bin = js.native
  def ref(bin: Bin): scala.Double = js.native
  def resize(w: scala.Double, h: scala.Double): scala.Boolean = js.native
  def unref(bin: Bin): scala.Double = js.native
}

