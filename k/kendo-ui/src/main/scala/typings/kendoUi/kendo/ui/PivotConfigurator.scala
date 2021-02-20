package typings.kendoUi.kendo.ui

import typings.kendoUi.JQuery
import typings.kendoUi.kendo.data.DataSource
import typings.kendoUi.kendo.data.PivotDataSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PivotConfigurator extends Widget {
  
  var dataSource: DataSource = js.native
  
  @JSName("options")
  var options_PivotConfigurator: PivotConfiguratorOptions = js.native
  
  def refresh(): Unit = js.native
  
  def setDataSource(dataSource: PivotDataSource): Unit = js.native
  
  var wrapper: JQuery = js.native
}
