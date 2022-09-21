package typings.kendoUi.kendo.data

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OrgChartDataSource
  extends StObject
     with TreeListDataSource {
  
  def groupedItemsTree(): js.Array[Any] = js.native
  def groupedItemsTree(field: String): js.Array[Any] = js.native
  
  def itemChildren(): js.Array[OrgChartModel] = js.native
  def itemChildren(item: OrgChartModel): js.Array[OrgChartModel] = js.native
  
  def itemsTree(): js.Array[OrgChartModel] = js.native
  def itemsTree(item: Unit, fromView: Boolean): js.Array[OrgChartModel] = js.native
  def itemsTree(item: OrgChartModel): js.Array[OrgChartModel] = js.native
  def itemsTree(item: OrgChartModel, fromView: Boolean): js.Array[OrgChartModel] = js.native
  
  def prospectParents(item: OrgChartModel): js.Array[OrgChartModel] = js.native
  
  def toggleChildren(item: OrgChartModel): Unit = js.native
}
