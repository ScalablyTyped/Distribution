package typings.ionicCore

import typings.ionicCore.virtualScrollInterfaceMod.Cell
import typings.ionicCore.virtualScrollInterfaceMod.FooterHeightFn
import typings.ionicCore.virtualScrollInterfaceMod.HeaderFn
import typings.ionicCore.virtualScrollInterfaceMod.HeaderHeightFn
import typings.ionicCore.virtualScrollInterfaceMod.ItemHeightFn
import typings.ionicCore.virtualScrollInterfaceMod.ItemRenderFn
import typings.ionicCore.virtualScrollInterfaceMod.VirtualNode
import typings.std.HTMLElement
import typings.std.Uint32Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object virtualScrollUtilsMod {
  
  @JSImport("@ionic/core/dist/types/components/virtual-scroll/virtual-scroll-utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def calcCells(
    items: js.Array[js.Any],
    itemHeight: Unit,
    headerHeight: Unit,
    footerHeight: Unit,
    headerFn: Unit,
    footerFn: Unit,
    approxHeaderHeight: Double,
    approxFooterHeight: Double,
    approxItemHeight: Double,
    j: Double,
    offset: Double,
    len: Double
  ): js.Array[Cell] = (^.asInstanceOf[js.Dynamic].applyDynamic("calcCells")(items.asInstanceOf[js.Any], itemHeight.asInstanceOf[js.Any], headerHeight.asInstanceOf[js.Any], footerHeight.asInstanceOf[js.Any], headerFn.asInstanceOf[js.Any], footerFn.asInstanceOf[js.Any], approxHeaderHeight.asInstanceOf[js.Any], approxFooterHeight.asInstanceOf[js.Any], approxItemHeight.asInstanceOf[js.Any], j.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], len.asInstanceOf[js.Any])).asInstanceOf[js.Array[Cell]]
  inline def calcCells(
    items: js.Array[js.Any],
    itemHeight: Unit,
    headerHeight: Unit,
    footerHeight: Unit,
    headerFn: Unit,
    footerFn: HeaderFn,
    approxHeaderHeight: Double,
    approxFooterHeight: Double,
    approxItemHeight: Double,
    j: Double,
    offset: Double,
    len: Double
  ): js.Array[Cell] = (^.asInstanceOf[js.Dynamic].applyDynamic("calcCells")(items.asInstanceOf[js.Any], itemHeight.asInstanceOf[js.Any], headerHeight.asInstanceOf[js.Any], footerHeight.asInstanceOf[js.Any], headerFn.asInstanceOf[js.Any], footerFn.asInstanceOf[js.Any], approxHeaderHeight.asInstanceOf[js.Any], approxFooterHeight.asInstanceOf[js.Any], approxItemHeight.asInstanceOf[js.Any], j.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], len.asInstanceOf[js.Any])).asInstanceOf[js.Array[Cell]]
  inline def calcCells(
    items: js.Array[js.Any],
    itemHeight: Unit,
    headerHeight: Unit,
    footerHeight: Unit,
    headerFn: HeaderFn,
    footerFn: Unit,
    approxHeaderHeight: Double,
    approxFooterHeight: Double,
    approxItemHeight: Double,
    j: Double,
    offset: Double,
    len: Double
  ): js.Array[Cell] = (^.asInstanceOf[js.Dynamic].applyDynamic("calcCells")(items.asInstanceOf[js.Any], itemHeight.asInstanceOf[js.Any], headerHeight.asInstanceOf[js.Any], footerHeight.asInstanceOf[js.Any], headerFn.asInstanceOf[js.Any], footerFn.asInstanceOf[js.Any], approxHeaderHeight.asInstanceOf[js.Any], approxFooterHeight.asInstanceOf[js.Any], approxItemHeight.asInstanceOf[js.Any], j.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], len.asInstanceOf[js.Any])).asInstanceOf[js.Array[Cell]]
  inline def calcCells(
    items: js.Array[js.Any],
    itemHeight: Unit,
    headerHeight: Unit,
    footerHeight: Unit,
    headerFn: HeaderFn,
    footerFn: HeaderFn,
    approxHeaderHeight: Double,
    approxFooterHeight: Double,
    approxItemHeight: Double,
    j: Double,
    offset: Double,
    len: Double
  ): js.Array[Cell] = (^.asInstanceOf[js.Dynamic].applyDynamic("calcCells")(items.asInstanceOf[js.Any], itemHeight.asInstanceOf[js.Any], headerHeight.asInstanceOf[js.Any], footerHeight.asInstanceOf[js.Any], headerFn.asInstanceOf[js.Any], footerFn.asInstanceOf[js.Any], approxHeaderHeight.asInstanceOf[js.Any], approxFooterHeight.asInstanceOf[js.Any], approxItemHeight.asInstanceOf[js.Any], j.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], len.asInstanceOf[js.Any])).asInstanceOf[js.Array[Cell]]
  inline def calcCells(
    items: js.Array[js.Any],
    itemHeight: Unit,
    headerHeight: Unit,
    footerHeight: FooterHeightFn,
    headerFn: Unit,
    footerFn: Unit,
    approxHeaderHeight: Double,
    approxFooterHeight: Double,
    approxItemHeight: Double,
    j: Double,
    offset: Double,
    len: Double
  ): js.Array[Cell] = (^.asInstanceOf[js.Dynamic].applyDynamic("calcCells")(items.asInstanceOf[js.Any], itemHeight.asInstanceOf[js.Any], headerHeight.asInstanceOf[js.Any], footerHeight.asInstanceOf[js.Any], headerFn.asInstanceOf[js.Any], footerFn.asInstanceOf[js.Any], approxHeaderHeight.asInstanceOf[js.Any], approxFooterHeight.asInstanceOf[js.Any], approxItemHeight.asInstanceOf[js.Any], j.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], len.asInstanceOf[js.Any])).asInstanceOf[js.Array[Cell]]
  inline def calcCells(
    items: js.Array[js.Any],
    itemHeight: Unit,
    headerHeight: Unit,
    footerHeight: FooterHeightFn,
    headerFn: Unit,
    footerFn: HeaderFn,
    approxHeaderHeight: Double,
    approxFooterHeight: Double,
    approxItemHeight: Double,
    j: Double,
    offset: Double,
    len: Double
  ): js.Array[Cell] = (^.asInstanceOf[js.Dynamic].applyDynamic("calcCells")(items.asInstanceOf[js.Any], itemHeight.asInstanceOf[js.Any], headerHeight.asInstanceOf[js.Any], footerHeight.asInstanceOf[js.Any], headerFn.asInstanceOf[js.Any], footerFn.asInstanceOf[js.Any], approxHeaderHeight.asInstanceOf[js.Any], approxFooterHeight.asInstanceOf[js.Any], approxItemHeight.asInstanceOf[js.Any], j.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], len.asInstanceOf[js.Any])).asInstanceOf[js.Array[Cell]]
  inline def calcCells(
    items: js.Array[js.Any],
    itemHeight: Unit,
    headerHeight: Unit,
    footerHeight: FooterHeightFn,
    headerFn: HeaderFn,
    footerFn: Unit,
    approxHeaderHeight: Double,
    approxFooterHeight: Double,
    approxItemHeight: Double,
    j: Double,
    offset: Double,
    len: Double
  ): js.Array[Cell] = (^.asInstanceOf[js.Dynamic].applyDynamic("calcCells")(items.asInstanceOf[js.Any], itemHeight.asInstanceOf[js.Any], headerHeight.asInstanceOf[js.Any], footerHeight.asInstanceOf[js.Any], headerFn.asInstanceOf[js.Any], footerFn.asInstanceOf[js.Any], approxHeaderHeight.asInstanceOf[js.Any], approxFooterHeight.asInstanceOf[js.Any], approxItemHeight.asInstanceOf[js.Any], j.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], len.asInstanceOf[js.Any])).asInstanceOf[js.Array[Cell]]
  inline def calcCells(
    items: js.Array[js.Any],
    itemHeight: Unit,
    headerHeight: Unit,
    footerHeight: FooterHeightFn,
    headerFn: HeaderFn,
    footerFn: HeaderFn,
    approxHeaderHeight: Double,
    approxFooterHeight: Double,
    approxItemHeight: Double,
    j: Double,
    offset: Double,
    len: Double
  ): js.Array[Cell] = (^.asInstanceOf[js.Dynamic].applyDynamic("calcCells")(items.asInstanceOf[js.Any], itemHeight.asInstanceOf[js.Any], headerHeight.asInstanceOf[js.Any], footerHeight.asInstanceOf[js.Any], headerFn.asInstanceOf[js.Any], footerFn.asInstanceOf[js.Any], approxHeaderHeight.asInstanceOf[js.Any], approxFooterHeight.asInstanceOf[js.Any], approxItemHeight.asInstanceOf[js.Any], j.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], len.asInstanceOf[js.Any])).asInstanceOf[js.Array[Cell]]
  inline def calcCells(
    items: js.Array[js.Any],
    itemHeight: Unit,
    headerHeight: HeaderHeightFn,
    footerHeight: Unit,
    headerFn: Unit,
    footerFn: Unit,
    approxHeaderHeight: Double,
    approxFooterHeight: Double,
    approxItemHeight: Double,
    j: Double,
    offset: Double,
    len: Double
  ): js.Array[Cell] = (^.asInstanceOf[js.Dynamic].applyDynamic("calcCells")(items.asInstanceOf[js.Any], itemHeight.asInstanceOf[js.Any], headerHeight.asInstanceOf[js.Any], footerHeight.asInstanceOf[js.Any], headerFn.asInstanceOf[js.Any], footerFn.asInstanceOf[js.Any], approxHeaderHeight.asInstanceOf[js.Any], approxFooterHeight.asInstanceOf[js.Any], approxItemHeight.asInstanceOf[js.Any], j.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], len.asInstanceOf[js.Any])).asInstanceOf[js.Array[Cell]]
  inline def calcCells(
    items: js.Array[js.Any],
    itemHeight: Unit,
    headerHeight: HeaderHeightFn,
    footerHeight: Unit,
    headerFn: Unit,
    footerFn: HeaderFn,
    approxHeaderHeight: Double,
    approxFooterHeight: Double,
    approxItemHeight: Double,
    j: Double,
    offset: Double,
    len: Double
  ): js.Array[Cell] = (^.asInstanceOf[js.Dynamic].applyDynamic("calcCells")(items.asInstanceOf[js.Any], itemHeight.asInstanceOf[js.Any], headerHeight.asInstanceOf[js.Any], footerHeight.asInstanceOf[js.Any], headerFn.asInstanceOf[js.Any], footerFn.asInstanceOf[js.Any], approxHeaderHeight.asInstanceOf[js.Any], approxFooterHeight.asInstanceOf[js.Any], approxItemHeight.asInstanceOf[js.Any], j.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], len.asInstanceOf[js.Any])).asInstanceOf[js.Array[Cell]]
  inline def calcCells(
    items: js.Array[js.Any],
    itemHeight: Unit,
    headerHeight: HeaderHeightFn,
    footerHeight: Unit,
    headerFn: HeaderFn,
    footerFn: Unit,
    approxHeaderHeight: Double,
    approxFooterHeight: Double,
    approxItemHeight: Double,
    j: Double,
    offset: Double,
    len: Double
  ): js.Array[Cell] = (^.asInstanceOf[js.Dynamic].applyDynamic("calcCells")(items.asInstanceOf[js.Any], itemHeight.asInstanceOf[js.Any], headerHeight.asInstanceOf[js.Any], footerHeight.asInstanceOf[js.Any], headerFn.asInstanceOf[js.Any], footerFn.asInstanceOf[js.Any], approxHeaderHeight.asInstanceOf[js.Any], approxFooterHeight.asInstanceOf[js.Any], approxItemHeight.asInstanceOf[js.Any], j.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], len.asInstanceOf[js.Any])).asInstanceOf[js.Array[Cell]]
  inline def calcCells(
    items: js.Array[js.Any],
    itemHeight: Unit,
    headerHeight: HeaderHeightFn,
    footerHeight: Unit,
    headerFn: HeaderFn,
    footerFn: HeaderFn,
    approxHeaderHeight: Double,
    approxFooterHeight: Double,
    approxItemHeight: Double,
    j: Double,
    offset: Double,
    len: Double
  ): js.Array[Cell] = (^.asInstanceOf[js.Dynamic].applyDynamic("calcCells")(items.asInstanceOf[js.Any], itemHeight.asInstanceOf[js.Any], headerHeight.asInstanceOf[js.Any], footerHeight.asInstanceOf[js.Any], headerFn.asInstanceOf[js.Any], footerFn.asInstanceOf[js.Any], approxHeaderHeight.asInstanceOf[js.Any], approxFooterHeight.asInstanceOf[js.Any], approxItemHeight.asInstanceOf[js.Any], j.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], len.asInstanceOf[js.Any])).asInstanceOf[js.Array[Cell]]
  inline def calcCells(
    items: js.Array[js.Any],
    itemHeight: Unit,
    headerHeight: HeaderHeightFn,
    footerHeight: FooterHeightFn,
    headerFn: Unit,
    footerFn: Unit,
    approxHeaderHeight: Double,
    approxFooterHeight: Double,
    approxItemHeight: Double,
    j: Double,
    offset: Double,
    len: Double
  ): js.Array[Cell] = (^.asInstanceOf[js.Dynamic].applyDynamic("calcCells")(items.asInstanceOf[js.Any], itemHeight.asInstanceOf[js.Any], headerHeight.asInstanceOf[js.Any], footerHeight.asInstanceOf[js.Any], headerFn.asInstanceOf[js.Any], footerFn.asInstanceOf[js.Any], approxHeaderHeight.asInstanceOf[js.Any], approxFooterHeight.asInstanceOf[js.Any], approxItemHeight.asInstanceOf[js.Any], j.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], len.asInstanceOf[js.Any])).asInstanceOf[js.Array[Cell]]
  inline def calcCells(
    items: js.Array[js.Any],
    itemHeight: Unit,
    headerHeight: HeaderHeightFn,
    footerHeight: FooterHeightFn,
    headerFn: Unit,
    footerFn: HeaderFn,
    approxHeaderHeight: Double,
    approxFooterHeight: Double,
    approxItemHeight: Double,
    j: Double,
    offset: Double,
    len: Double
  ): js.Array[Cell] = (^.asInstanceOf[js.Dynamic].applyDynamic("calcCells")(items.asInstanceOf[js.Any], itemHeight.asInstanceOf[js.Any], headerHeight.asInstanceOf[js.Any], footerHeight.asInstanceOf[js.Any], headerFn.asInstanceOf[js.Any], footerFn.asInstanceOf[js.Any], approxHeaderHeight.asInstanceOf[js.Any], approxFooterHeight.asInstanceOf[js.Any], approxItemHeight.asInstanceOf[js.Any], j.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], len.asInstanceOf[js.Any])).asInstanceOf[js.Array[Cell]]
  inline def calcCells(
    items: js.Array[js.Any],
    itemHeight: Unit,
    headerHeight: HeaderHeightFn,
    footerHeight: FooterHeightFn,
    headerFn: HeaderFn,
    footerFn: Unit,
    approxHeaderHeight: Double,
    approxFooterHeight: Double,
    approxItemHeight: Double,
    j: Double,
    offset: Double,
    len: Double
  ): js.Array[Cell] = (^.asInstanceOf[js.Dynamic].applyDynamic("calcCells")(items.asInstanceOf[js.Any], itemHeight.asInstanceOf[js.Any], headerHeight.asInstanceOf[js.Any], footerHeight.asInstanceOf[js.Any], headerFn.asInstanceOf[js.Any], footerFn.asInstanceOf[js.Any], approxHeaderHeight.asInstanceOf[js.Any], approxFooterHeight.asInstanceOf[js.Any], approxItemHeight.asInstanceOf[js.Any], j.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], len.asInstanceOf[js.Any])).asInstanceOf[js.Array[Cell]]
  inline def calcCells(
    items: js.Array[js.Any],
    itemHeight: Unit,
    headerHeight: HeaderHeightFn,
    footerHeight: FooterHeightFn,
    headerFn: HeaderFn,
    footerFn: HeaderFn,
    approxHeaderHeight: Double,
    approxFooterHeight: Double,
    approxItemHeight: Double,
    j: Double,
    offset: Double,
    len: Double
  ): js.Array[Cell] = (^.asInstanceOf[js.Dynamic].applyDynamic("calcCells")(items.asInstanceOf[js.Any], itemHeight.asInstanceOf[js.Any], headerHeight.asInstanceOf[js.Any], footerHeight.asInstanceOf[js.Any], headerFn.asInstanceOf[js.Any], footerFn.asInstanceOf[js.Any], approxHeaderHeight.asInstanceOf[js.Any], approxFooterHeight.asInstanceOf[js.Any], approxItemHeight.asInstanceOf[js.Any], j.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], len.asInstanceOf[js.Any])).asInstanceOf[js.Array[Cell]]
  inline def calcCells(
    items: js.Array[js.Any],
    itemHeight: ItemHeightFn,
    headerHeight: Unit,
    footerHeight: Unit,
    headerFn: Unit,
    footerFn: Unit,
    approxHeaderHeight: Double,
    approxFooterHeight: Double,
    approxItemHeight: Double,
    j: Double,
    offset: Double,
    len: Double
  ): js.Array[Cell] = (^.asInstanceOf[js.Dynamic].applyDynamic("calcCells")(items.asInstanceOf[js.Any], itemHeight.asInstanceOf[js.Any], headerHeight.asInstanceOf[js.Any], footerHeight.asInstanceOf[js.Any], headerFn.asInstanceOf[js.Any], footerFn.asInstanceOf[js.Any], approxHeaderHeight.asInstanceOf[js.Any], approxFooterHeight.asInstanceOf[js.Any], approxItemHeight.asInstanceOf[js.Any], j.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], len.asInstanceOf[js.Any])).asInstanceOf[js.Array[Cell]]
  inline def calcCells(
    items: js.Array[js.Any],
    itemHeight: ItemHeightFn,
    headerHeight: Unit,
    footerHeight: Unit,
    headerFn: Unit,
    footerFn: HeaderFn,
    approxHeaderHeight: Double,
    approxFooterHeight: Double,
    approxItemHeight: Double,
    j: Double,
    offset: Double,
    len: Double
  ): js.Array[Cell] = (^.asInstanceOf[js.Dynamic].applyDynamic("calcCells")(items.asInstanceOf[js.Any], itemHeight.asInstanceOf[js.Any], headerHeight.asInstanceOf[js.Any], footerHeight.asInstanceOf[js.Any], headerFn.asInstanceOf[js.Any], footerFn.asInstanceOf[js.Any], approxHeaderHeight.asInstanceOf[js.Any], approxFooterHeight.asInstanceOf[js.Any], approxItemHeight.asInstanceOf[js.Any], j.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], len.asInstanceOf[js.Any])).asInstanceOf[js.Array[Cell]]
  inline def calcCells(
    items: js.Array[js.Any],
    itemHeight: ItemHeightFn,
    headerHeight: Unit,
    footerHeight: Unit,
    headerFn: HeaderFn,
    footerFn: Unit,
    approxHeaderHeight: Double,
    approxFooterHeight: Double,
    approxItemHeight: Double,
    j: Double,
    offset: Double,
    len: Double
  ): js.Array[Cell] = (^.asInstanceOf[js.Dynamic].applyDynamic("calcCells")(items.asInstanceOf[js.Any], itemHeight.asInstanceOf[js.Any], headerHeight.asInstanceOf[js.Any], footerHeight.asInstanceOf[js.Any], headerFn.asInstanceOf[js.Any], footerFn.asInstanceOf[js.Any], approxHeaderHeight.asInstanceOf[js.Any], approxFooterHeight.asInstanceOf[js.Any], approxItemHeight.asInstanceOf[js.Any], j.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], len.asInstanceOf[js.Any])).asInstanceOf[js.Array[Cell]]
  inline def calcCells(
    items: js.Array[js.Any],
    itemHeight: ItemHeightFn,
    headerHeight: Unit,
    footerHeight: Unit,
    headerFn: HeaderFn,
    footerFn: HeaderFn,
    approxHeaderHeight: Double,
    approxFooterHeight: Double,
    approxItemHeight: Double,
    j: Double,
    offset: Double,
    len: Double
  ): js.Array[Cell] = (^.asInstanceOf[js.Dynamic].applyDynamic("calcCells")(items.asInstanceOf[js.Any], itemHeight.asInstanceOf[js.Any], headerHeight.asInstanceOf[js.Any], footerHeight.asInstanceOf[js.Any], headerFn.asInstanceOf[js.Any], footerFn.asInstanceOf[js.Any], approxHeaderHeight.asInstanceOf[js.Any], approxFooterHeight.asInstanceOf[js.Any], approxItemHeight.asInstanceOf[js.Any], j.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], len.asInstanceOf[js.Any])).asInstanceOf[js.Array[Cell]]
  inline def calcCells(
    items: js.Array[js.Any],
    itemHeight: ItemHeightFn,
    headerHeight: Unit,
    footerHeight: FooterHeightFn,
    headerFn: Unit,
    footerFn: Unit,
    approxHeaderHeight: Double,
    approxFooterHeight: Double,
    approxItemHeight: Double,
    j: Double,
    offset: Double,
    len: Double
  ): js.Array[Cell] = (^.asInstanceOf[js.Dynamic].applyDynamic("calcCells")(items.asInstanceOf[js.Any], itemHeight.asInstanceOf[js.Any], headerHeight.asInstanceOf[js.Any], footerHeight.asInstanceOf[js.Any], headerFn.asInstanceOf[js.Any], footerFn.asInstanceOf[js.Any], approxHeaderHeight.asInstanceOf[js.Any], approxFooterHeight.asInstanceOf[js.Any], approxItemHeight.asInstanceOf[js.Any], j.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], len.asInstanceOf[js.Any])).asInstanceOf[js.Array[Cell]]
  inline def calcCells(
    items: js.Array[js.Any],
    itemHeight: ItemHeightFn,
    headerHeight: Unit,
    footerHeight: FooterHeightFn,
    headerFn: Unit,
    footerFn: HeaderFn,
    approxHeaderHeight: Double,
    approxFooterHeight: Double,
    approxItemHeight: Double,
    j: Double,
    offset: Double,
    len: Double
  ): js.Array[Cell] = (^.asInstanceOf[js.Dynamic].applyDynamic("calcCells")(items.asInstanceOf[js.Any], itemHeight.asInstanceOf[js.Any], headerHeight.asInstanceOf[js.Any], footerHeight.asInstanceOf[js.Any], headerFn.asInstanceOf[js.Any], footerFn.asInstanceOf[js.Any], approxHeaderHeight.asInstanceOf[js.Any], approxFooterHeight.asInstanceOf[js.Any], approxItemHeight.asInstanceOf[js.Any], j.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], len.asInstanceOf[js.Any])).asInstanceOf[js.Array[Cell]]
  inline def calcCells(
    items: js.Array[js.Any],
    itemHeight: ItemHeightFn,
    headerHeight: Unit,
    footerHeight: FooterHeightFn,
    headerFn: HeaderFn,
    footerFn: Unit,
    approxHeaderHeight: Double,
    approxFooterHeight: Double,
    approxItemHeight: Double,
    j: Double,
    offset: Double,
    len: Double
  ): js.Array[Cell] = (^.asInstanceOf[js.Dynamic].applyDynamic("calcCells")(items.asInstanceOf[js.Any], itemHeight.asInstanceOf[js.Any], headerHeight.asInstanceOf[js.Any], footerHeight.asInstanceOf[js.Any], headerFn.asInstanceOf[js.Any], footerFn.asInstanceOf[js.Any], approxHeaderHeight.asInstanceOf[js.Any], approxFooterHeight.asInstanceOf[js.Any], approxItemHeight.asInstanceOf[js.Any], j.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], len.asInstanceOf[js.Any])).asInstanceOf[js.Array[Cell]]
  inline def calcCells(
    items: js.Array[js.Any],
    itemHeight: ItemHeightFn,
    headerHeight: Unit,
    footerHeight: FooterHeightFn,
    headerFn: HeaderFn,
    footerFn: HeaderFn,
    approxHeaderHeight: Double,
    approxFooterHeight: Double,
    approxItemHeight: Double,
    j: Double,
    offset: Double,
    len: Double
  ): js.Array[Cell] = (^.asInstanceOf[js.Dynamic].applyDynamic("calcCells")(items.asInstanceOf[js.Any], itemHeight.asInstanceOf[js.Any], headerHeight.asInstanceOf[js.Any], footerHeight.asInstanceOf[js.Any], headerFn.asInstanceOf[js.Any], footerFn.asInstanceOf[js.Any], approxHeaderHeight.asInstanceOf[js.Any], approxFooterHeight.asInstanceOf[js.Any], approxItemHeight.asInstanceOf[js.Any], j.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], len.asInstanceOf[js.Any])).asInstanceOf[js.Array[Cell]]
  inline def calcCells(
    items: js.Array[js.Any],
    itemHeight: ItemHeightFn,
    headerHeight: HeaderHeightFn,
    footerHeight: Unit,
    headerFn: Unit,
    footerFn: Unit,
    approxHeaderHeight: Double,
    approxFooterHeight: Double,
    approxItemHeight: Double,
    j: Double,
    offset: Double,
    len: Double
  ): js.Array[Cell] = (^.asInstanceOf[js.Dynamic].applyDynamic("calcCells")(items.asInstanceOf[js.Any], itemHeight.asInstanceOf[js.Any], headerHeight.asInstanceOf[js.Any], footerHeight.asInstanceOf[js.Any], headerFn.asInstanceOf[js.Any], footerFn.asInstanceOf[js.Any], approxHeaderHeight.asInstanceOf[js.Any], approxFooterHeight.asInstanceOf[js.Any], approxItemHeight.asInstanceOf[js.Any], j.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], len.asInstanceOf[js.Any])).asInstanceOf[js.Array[Cell]]
  inline def calcCells(
    items: js.Array[js.Any],
    itemHeight: ItemHeightFn,
    headerHeight: HeaderHeightFn,
    footerHeight: Unit,
    headerFn: Unit,
    footerFn: HeaderFn,
    approxHeaderHeight: Double,
    approxFooterHeight: Double,
    approxItemHeight: Double,
    j: Double,
    offset: Double,
    len: Double
  ): js.Array[Cell] = (^.asInstanceOf[js.Dynamic].applyDynamic("calcCells")(items.asInstanceOf[js.Any], itemHeight.asInstanceOf[js.Any], headerHeight.asInstanceOf[js.Any], footerHeight.asInstanceOf[js.Any], headerFn.asInstanceOf[js.Any], footerFn.asInstanceOf[js.Any], approxHeaderHeight.asInstanceOf[js.Any], approxFooterHeight.asInstanceOf[js.Any], approxItemHeight.asInstanceOf[js.Any], j.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], len.asInstanceOf[js.Any])).asInstanceOf[js.Array[Cell]]
  inline def calcCells(
    items: js.Array[js.Any],
    itemHeight: ItemHeightFn,
    headerHeight: HeaderHeightFn,
    footerHeight: Unit,
    headerFn: HeaderFn,
    footerFn: Unit,
    approxHeaderHeight: Double,
    approxFooterHeight: Double,
    approxItemHeight: Double,
    j: Double,
    offset: Double,
    len: Double
  ): js.Array[Cell] = (^.asInstanceOf[js.Dynamic].applyDynamic("calcCells")(items.asInstanceOf[js.Any], itemHeight.asInstanceOf[js.Any], headerHeight.asInstanceOf[js.Any], footerHeight.asInstanceOf[js.Any], headerFn.asInstanceOf[js.Any], footerFn.asInstanceOf[js.Any], approxHeaderHeight.asInstanceOf[js.Any], approxFooterHeight.asInstanceOf[js.Any], approxItemHeight.asInstanceOf[js.Any], j.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], len.asInstanceOf[js.Any])).asInstanceOf[js.Array[Cell]]
  inline def calcCells(
    items: js.Array[js.Any],
    itemHeight: ItemHeightFn,
    headerHeight: HeaderHeightFn,
    footerHeight: Unit,
    headerFn: HeaderFn,
    footerFn: HeaderFn,
    approxHeaderHeight: Double,
    approxFooterHeight: Double,
    approxItemHeight: Double,
    j: Double,
    offset: Double,
    len: Double
  ): js.Array[Cell] = (^.asInstanceOf[js.Dynamic].applyDynamic("calcCells")(items.asInstanceOf[js.Any], itemHeight.asInstanceOf[js.Any], headerHeight.asInstanceOf[js.Any], footerHeight.asInstanceOf[js.Any], headerFn.asInstanceOf[js.Any], footerFn.asInstanceOf[js.Any], approxHeaderHeight.asInstanceOf[js.Any], approxFooterHeight.asInstanceOf[js.Any], approxItemHeight.asInstanceOf[js.Any], j.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], len.asInstanceOf[js.Any])).asInstanceOf[js.Array[Cell]]
  inline def calcCells(
    items: js.Array[js.Any],
    itemHeight: ItemHeightFn,
    headerHeight: HeaderHeightFn,
    footerHeight: FooterHeightFn,
    headerFn: Unit,
    footerFn: Unit,
    approxHeaderHeight: Double,
    approxFooterHeight: Double,
    approxItemHeight: Double,
    j: Double,
    offset: Double,
    len: Double
  ): js.Array[Cell] = (^.asInstanceOf[js.Dynamic].applyDynamic("calcCells")(items.asInstanceOf[js.Any], itemHeight.asInstanceOf[js.Any], headerHeight.asInstanceOf[js.Any], footerHeight.asInstanceOf[js.Any], headerFn.asInstanceOf[js.Any], footerFn.asInstanceOf[js.Any], approxHeaderHeight.asInstanceOf[js.Any], approxFooterHeight.asInstanceOf[js.Any], approxItemHeight.asInstanceOf[js.Any], j.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], len.asInstanceOf[js.Any])).asInstanceOf[js.Array[Cell]]
  inline def calcCells(
    items: js.Array[js.Any],
    itemHeight: ItemHeightFn,
    headerHeight: HeaderHeightFn,
    footerHeight: FooterHeightFn,
    headerFn: Unit,
    footerFn: HeaderFn,
    approxHeaderHeight: Double,
    approxFooterHeight: Double,
    approxItemHeight: Double,
    j: Double,
    offset: Double,
    len: Double
  ): js.Array[Cell] = (^.asInstanceOf[js.Dynamic].applyDynamic("calcCells")(items.asInstanceOf[js.Any], itemHeight.asInstanceOf[js.Any], headerHeight.asInstanceOf[js.Any], footerHeight.asInstanceOf[js.Any], headerFn.asInstanceOf[js.Any], footerFn.asInstanceOf[js.Any], approxHeaderHeight.asInstanceOf[js.Any], approxFooterHeight.asInstanceOf[js.Any], approxItemHeight.asInstanceOf[js.Any], j.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], len.asInstanceOf[js.Any])).asInstanceOf[js.Array[Cell]]
  inline def calcCells(
    items: js.Array[js.Any],
    itemHeight: ItemHeightFn,
    headerHeight: HeaderHeightFn,
    footerHeight: FooterHeightFn,
    headerFn: HeaderFn,
    footerFn: Unit,
    approxHeaderHeight: Double,
    approxFooterHeight: Double,
    approxItemHeight: Double,
    j: Double,
    offset: Double,
    len: Double
  ): js.Array[Cell] = (^.asInstanceOf[js.Dynamic].applyDynamic("calcCells")(items.asInstanceOf[js.Any], itemHeight.asInstanceOf[js.Any], headerHeight.asInstanceOf[js.Any], footerHeight.asInstanceOf[js.Any], headerFn.asInstanceOf[js.Any], footerFn.asInstanceOf[js.Any], approxHeaderHeight.asInstanceOf[js.Any], approxFooterHeight.asInstanceOf[js.Any], approxItemHeight.asInstanceOf[js.Any], j.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], len.asInstanceOf[js.Any])).asInstanceOf[js.Array[Cell]]
  inline def calcCells(
    items: js.Array[js.Any],
    itemHeight: ItemHeightFn,
    headerHeight: HeaderHeightFn,
    footerHeight: FooterHeightFn,
    headerFn: HeaderFn,
    footerFn: HeaderFn,
    approxHeaderHeight: Double,
    approxFooterHeight: Double,
    approxItemHeight: Double,
    j: Double,
    offset: Double,
    len: Double
  ): js.Array[Cell] = (^.asInstanceOf[js.Dynamic].applyDynamic("calcCells")(items.asInstanceOf[js.Any], itemHeight.asInstanceOf[js.Any], headerHeight.asInstanceOf[js.Any], footerHeight.asInstanceOf[js.Any], headerFn.asInstanceOf[js.Any], footerFn.asInstanceOf[js.Any], approxHeaderHeight.asInstanceOf[js.Any], approxFooterHeight.asInstanceOf[js.Any], approxItemHeight.asInstanceOf[js.Any], j.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], len.asInstanceOf[js.Any])).asInstanceOf[js.Array[Cell]]
  
  inline def calcHeightIndex(buf: Uint32Array, cells: js.Array[Cell], index: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("calcHeightIndex")(buf.asInstanceOf[js.Any], cells.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def doRender(
    el: HTMLElement,
    nodeRender: ItemRenderFn,
    dom: js.Array[VirtualNode],
    updateCellHeight: js.Function2[/* cell */ Cell, /* node */ HTMLElement, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("doRender")(el.asInstanceOf[js.Any], nodeRender.asInstanceOf[js.Any], dom.asInstanceOf[js.Any], updateCellHeight.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def findCellIndex(cells: js.Array[Cell], index: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("findCellIndex")(cells.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def getRange(heightIndex: Uint32Array, viewport: Viewport, buffer: Double): Range = (^.asInstanceOf[js.Dynamic].applyDynamic("getRange")(heightIndex.asInstanceOf[js.Any], viewport.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[Range]
  
  inline def getShouldUpdate(dirtyIndex: Double, currentRange: Range, range: Range): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("getShouldUpdate")(dirtyIndex.asInstanceOf[js.Any], currentRange.asInstanceOf[js.Any], range.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def getViewport(scrollTop: Double, vierportHeight: Double, margin: Double): Viewport = (^.asInstanceOf[js.Dynamic].applyDynamic("getViewport")(scrollTop.asInstanceOf[js.Any], vierportHeight.asInstanceOf[js.Any], margin.asInstanceOf[js.Any])).asInstanceOf[Viewport]
  
  inline def inplaceUpdate(dst: js.Array[Cell], src: js.Array[Cell], offset: Double): js.Array[Cell] = (^.asInstanceOf[js.Dynamic].applyDynamic("inplaceUpdate")(dst.asInstanceOf[js.Any], src.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[js.Array[Cell]]
  
  inline def positionForIndex(index: Double, cells: js.Array[Cell], heightIndex: Uint32Array): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("positionForIndex")(index.asInstanceOf[js.Any], cells.asInstanceOf[js.Any], heightIndex.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def resizeBuffer(buf: Unit, len: Double): Uint32Array = (^.asInstanceOf[js.Dynamic].applyDynamic("resizeBuffer")(buf.asInstanceOf[js.Any], len.asInstanceOf[js.Any])).asInstanceOf[Uint32Array]
  inline def resizeBuffer(buf: Uint32Array, len: Double): Uint32Array = (^.asInstanceOf[js.Dynamic].applyDynamic("resizeBuffer")(buf.asInstanceOf[js.Any], len.asInstanceOf[js.Any])).asInstanceOf[Uint32Array]
  
  inline def updateVDom(dom: js.Array[VirtualNode], heightIndex: Uint32Array, cells: js.Array[Cell], range: Range): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("updateVDom")(dom.asInstanceOf[js.Any], heightIndex.asInstanceOf[js.Any], cells.asInstanceOf[js.Any], range.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait Range extends StObject {
    
    var length: Double
    
    var offset: Double
  }
  object Range {
    
    inline def apply(length: Double, offset: Double): Range = {
      val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
      __obj.asInstanceOf[Range]
    }
    
    extension [Self <: Range](x: Self) {
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    }
  }
  
  trait Viewport extends StObject {
    
    var bottom: Double
    
    var top: Double
  }
  object Viewport {
    
    inline def apply(bottom: Double, top: Double): Viewport = {
      val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
      __obj.asInstanceOf[Viewport]
    }
    
    extension [Self <: Viewport](x: Self) {
      
      inline def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    }
  }
}
