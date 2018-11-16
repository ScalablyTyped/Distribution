package typings
package kendoDashUiLib.kendoNs.mobileNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.mobile.Application")
@js.native
class Application ()
  extends kendoDashUiLib.kendoNs.Observable {
  def this(element: js.Any) = this()
  def this(element: js.Any, options: ApplicationOptions) = this()
  var options: ApplicationOptions = js.native
  var pane: kendoDashUiLib.kendoNs.mobileNs.uiNs.Pane = js.native
  var router: kendoDashUiLib.kendoNs.Router = js.native
  def changeLoadingMessage(text: java.lang.String): scala.Unit = js.native
  def hideLoading(): scala.Unit = js.native
  def init(): scala.Unit = js.native
  def init(element: js.Any): scala.Unit = js.native
  def init(element: js.Any, options: ApplicationOptions): scala.Unit = js.native
  def navigate(url: java.lang.String): scala.Unit = js.native
  def navigate(url: java.lang.String, transition: java.lang.String): scala.Unit = js.native
  def replace(url: java.lang.String): scala.Unit = js.native
  def replace(url: java.lang.String, transition: java.lang.String): scala.Unit = js.native
  def scroller(): kendoDashUiLib.kendoNs.mobileNs.uiNs.Scroller = js.native
  def showLoading(): scala.Unit = js.native
  def view(): kendoDashUiLib.kendoNs.mobileNs.uiNs.View = js.native
}

