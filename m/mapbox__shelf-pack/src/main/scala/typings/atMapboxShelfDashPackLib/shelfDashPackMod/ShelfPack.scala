package typings
package atMapboxShelfDashPackLib.shelfDashPackMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShelfPack extends js.Object {
  var h: scala.Double = js.native
  var w: scala.Double = js.native
  def clear(): scala.Unit = js.native
  def getBin(id: atMapboxShelfDashPackLib.shelfDashPackMod.ShelfPackNs.ID): atMapboxShelfDashPackLib.shelfDashPackMod.ShelfPackNs.Bin = js.native
  def pack(
    bins: js.Array[
      atMapboxShelfDashPackLib.shelfDashPackMod.ShelfPackNs.RequestShort | atMapboxShelfDashPackLib.shelfDashPackMod.ShelfPackNs.RequestLong
    ]
  ): js.Array[atMapboxShelfDashPackLib.shelfDashPackMod.ShelfPackNs.Bin] = js.native
  def pack(
    bins: js.Array[
      atMapboxShelfDashPackLib.shelfDashPackMod.ShelfPackNs.RequestShort | atMapboxShelfDashPackLib.shelfDashPackMod.ShelfPackNs.RequestLong
    ],
    options: atMapboxShelfDashPackLib.shelfDashPackMod.ShelfPackNs.PackOption
  ): js.Array[atMapboxShelfDashPackLib.shelfDashPackMod.ShelfPackNs.Bin] = js.native
  def packOne(w: scala.Double, h: scala.Double): atMapboxShelfDashPackLib.shelfDashPackMod.ShelfPackNs.Bin = js.native
  def packOne(w: scala.Double, h: scala.Double, id: atMapboxShelfDashPackLib.shelfDashPackMod.ShelfPackNs.ID): atMapboxShelfDashPackLib.shelfDashPackMod.ShelfPackNs.Bin = js.native
  def ref(bin: atMapboxShelfDashPackLib.shelfDashPackMod.ShelfPackNs.Bin): scala.Double = js.native
  def resize(w: scala.Double, h: scala.Double): scala.Boolean = js.native
  def unref(bin: atMapboxShelfDashPackLib.shelfDashPackMod.ShelfPackNs.Bin): scala.Double = js.native
}

