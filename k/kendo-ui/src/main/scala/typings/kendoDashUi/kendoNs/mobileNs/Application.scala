package typings.kendoDashUi.kendoNs.mobileNs

import typings.kendoDashUi.kendoNs.Observable
import typings.kendoDashUi.kendoNs.Router
import typings.kendoDashUi.kendoNs.mobileNs.uiNs.Pane
import typings.kendoDashUi.kendoNs.mobileNs.uiNs.Scroller
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.mobile.Application")
@js.native
class Application () extends Observable {
  def this(element: js.Any) = this()
  def this(element: js.Any, options: ApplicationOptions) = this()
  var options: ApplicationOptions = js.native
  var pane: Pane = js.native
  var router: Router = js.native
  def changeLoadingMessage(text: String): Unit = js.native
  def hideLoading(): Unit = js.native
  def init(): Unit = js.native
  def init(element: js.Any): Unit = js.native
  def init(element: js.Any, options: ApplicationOptions): Unit = js.native
  def navigate(url: String): Unit = js.native
  def navigate(url: String, transition: String): Unit = js.native
  def replace(url: String): Unit = js.native
  def replace(url: String, transition: String): Unit = js.native
  def scroller(): Scroller = js.native
  def showLoading(): Unit = js.native
  def view(): typings.kendoDashUi.kendoNs.mobileNs.uiNs.View = js.native
}

