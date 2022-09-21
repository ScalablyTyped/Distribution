package typings.kendoUi.kendo.ui

import typings.kendoUi.JQuery
import typings.kendoUi.kendo.data.DataSource
import typings.kendoUi.kendo.data.PivotDataSourceV2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PivotConfiguratorV2
  extends StObject
     with Widget {
  
  var dataSource: DataSource = js.native
  
  @JSName("options")
  var options_PivotConfiguratorV2: PivotConfiguratorV2Options = js.native
  
  def refresh(): Unit = js.native
  
  def setDataSource(dataSource: PivotDataSourceV2): Unit = js.native
  
  var wrapper: JQuery = js.native
}
