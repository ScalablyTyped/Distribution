package typings.ionicCore.virtualScrollUtilsMod

import typings.ionicCore.virtualScrollInterfaceMod.Cell
import typings.ionicCore.virtualScrollInterfaceMod.FooterHeightFn
import typings.ionicCore.virtualScrollInterfaceMod.HeaderFn
import typings.ionicCore.virtualScrollInterfaceMod.HeaderHeightFn
import typings.ionicCore.virtualScrollInterfaceMod.ItemHeightFn
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

