package typings.atIonicCore.distTypesComponentsVirtualDashScrollVirtualDashScrollDashUtilsMod

import typings.atIonicCore.distTypesComponentsVirtualDashScrollVirtualDashScrollDashInterfaceMod.Cell
import typings.atIonicCore.distTypesComponentsVirtualDashScrollVirtualDashScrollDashInterfaceMod.ItemRenderFn
import typings.atIonicCore.distTypesComponentsVirtualDashScrollVirtualDashScrollDashInterfaceMod.VirtualNode
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/core/dist/types/components/virtual-scroll/virtual-scroll-utils", "doRender")
@js.native
object doRender extends js.Object {
  def apply(
    el: HTMLElement,
    nodeRender: ItemRenderFn,
    dom: js.Array[VirtualNode],
    updateCellHeight: js.Function2[/* cell */ Cell, /* node */ HTMLElement, Unit]
  ): Unit = js.native
}

