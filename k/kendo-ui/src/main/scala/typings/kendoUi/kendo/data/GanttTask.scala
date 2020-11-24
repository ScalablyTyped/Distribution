package typings.kendoUi.kendo.data

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GanttTask extends Model {
  
  var end: Date = js.native
  
  var expanded: Boolean = js.native
  
  var orderId: Double = js.native
  
  var parentId: Double = js.native
  
  var percentComplete: Double = js.native
  
  var plannedEnd: Date = js.native
  
  var plannedStart: Date = js.native
  
  var start: Date = js.native
  
  var summary: Boolean = js.native
  
  var title: String = js.native
}
