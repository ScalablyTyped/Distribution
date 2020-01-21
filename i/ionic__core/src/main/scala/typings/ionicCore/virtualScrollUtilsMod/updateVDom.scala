package typings.ionicCore.virtualScrollUtilsMod

import typings.ionicCore.virtualScrollInterfaceMod.Cell
import typings.ionicCore.virtualScrollInterfaceMod.VirtualNode
import typings.std.Uint32Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/core/dist/types/components/virtual-scroll/virtual-scroll-utils", "updateVDom")
@js.native
object updateVDom extends js.Object {
  def apply(dom: js.Array[VirtualNode], heightIndex: Uint32Array, cells: js.Array[Cell], range: Range): Unit = js.native
}

