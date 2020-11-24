package typings.kendoUi.kendo.mobile.ui

import typings.kendoUi.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActionSheet
  extends typings.kendoUi.kendo.ui.Widget {
  
  def close(): Unit = js.native
  
  def open(target: JQuery, context: js.Any): Unit = js.native
  
  @JSName("options")
  var options_ActionSheet: ActionSheetOptions = js.native
  
  var wrapper: JQuery = js.native
}
