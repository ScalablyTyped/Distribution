package typings.ionicCore.virtualScrollUtilsMod

import typings.ionicCore.virtualScrollInterfaceMod.Cell
import typings.ionicCore.virtualScrollInterfaceMod.ItemRenderFn
import typings.ionicCore.virtualScrollInterfaceMod.VirtualNode
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
