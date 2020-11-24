package typings.kendoUi.kendo.dataviz.ui

import typings.kendoUi.JQuery
import typings.kendoUi.kendo.data.DataSource
import typings.kendoUi.kendo.ui.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TreeMap extends Widget {
  
  var dataSource: DataSource = js.native
  
  @JSName("options")
  var options_TreeMap: TreeMapOptions = js.native
  
  var wrapper: JQuery = js.native
}
