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
  def getBin(id: atMapboxShelfDashPackLib.atMapboxShelfDashPackMod.ShelfPackNs.ID): atMapboxShelfDashPackLib.atMapboxShelfDashPackMod.ShelfPackNs.Bin = js.native
  def pack(
    bins: js.Array[
      atMapboxShelfDashPackLib.atMapboxShelfDashPackMod.ShelfPackNs.RequestShort | atMapboxShelfDashPackLib.atMapboxShelfDashPackMod.ShelfPackNs.RequestLong
    ]
  ): js.Array[atMapboxShelfDashPackLib.atMapboxShelfDashPackMod.ShelfPackNs.Bin] = js.native
  def pack(
    bins: js.Array[
      atMapboxShelfDashPackLib.atMapboxShelfDashPackMod.ShelfPackNs.RequestShort | atMapboxShelfDashPackLib.atMapboxShelfDashPackMod.ShelfPackNs.RequestLong
    ],
    options: atMapboxShelfDashPackLib.atMapboxShelfDashPackMod.ShelfPackNs.PackOption
  ): js.Array[atMapboxShelfDashPackLib.atMapboxShelfDashPackMod.ShelfPackNs.Bin] = js.native
  def packOne(w: scala.Double, h: scala.Double): atMapboxShelfDashPackLib.atMapboxShelfDashPackMod.ShelfPackNs.Bin = js.native
  def packOne(
    w: scala.Double,
    h: scala.Double,
    id: atMapboxShelfDashPackLib.atMapboxShelfDashPackMod.ShelfPackNs.ID
  ): atMapboxShelfDashPackLib.atMapboxShelfDashPackMod.ShelfPackNs.Bin = js.native
  def ref(bin: atMapboxShelfDashPackLib.atMapboxShelfDashPackMod.ShelfPackNs.Bin): scala.Double = js.native
  def resize(w: scala.Double, h: scala.Double): scala.Boolean = js.native
  def unref(bin: atMapboxShelfDashPackLib.atMapboxShelfDashPackMod.ShelfPackNs.Bin): scala.Double = js.native
}

