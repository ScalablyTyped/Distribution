package typings.atIonicCore.distTypesComponentsVirtualDashScrollVirtualDashScrollDashUtilsMod

import typings.atIonicCore.distTypesComponentsVirtualDashScrollVirtualDashScrollDashInterfaceMod.Cell
import typings.atIonicCore.distTypesComponentsVirtualDashScrollVirtualDashScrollDashInterfaceMod.FooterHeightFn
import typings.atIonicCore.distTypesComponentsVirtualDashScrollVirtualDashScrollDashInterfaceMod.HeaderFn
import typings.atIonicCore.distTypesComponentsVirtualDashScrollVirtualDashScrollDashInterfaceMod.HeaderHeightFn
import typings.atIonicCore.distTypesComponentsVirtualDashScrollVirtualDashScrollDashInterfaceMod.ItemHeightFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/core/dist/types/components/virtual-scroll/virtual-scroll-utils", "calcCells")
@js.native
object calcCells extends js.Object {
  def apply(
    items: js.Array[_],
    itemHeight: js.UndefOr[ItemHeightFn],
    headerHeight: js.UndefOr[HeaderHeightFn],
    footerHeight: js.UndefOr[FooterHeightFn],
    headerFn: js.UndefOr[HeaderFn],
    footerFn: js.UndefOr[HeaderFn],
    approxHeaderHeight: Double,
    approxFooterHeight: Double,
    approxItemHeight: Double,
    j: Double,
    offset: Double,
    len: Double
  ): js.Array[Cell] = js.native
}

