package typings.kendoUi.kendo.mobile.ui

import typings.kendoUi.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModalView
  extends typings.kendoUi.kendo.ui.Widget {
  
  def close(): Unit = js.native
  
  def open(): Unit = js.native
  def open(target: JQuery): Unit = js.native
  
  @JSName("options")
  var options_ModalView: ModalViewOptions = js.native
  
  var wrapper: JQuery = js.native
}
