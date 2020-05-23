package typings.kendoUi.kendo.mobile.ui

import typings.kendoUi.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TabStrip
  extends typings.kendoUi.kendo.ui.Widget {
  @JSName("options")
  var options_TabStrip: TabStripOptions = js.native
  var wrapper: JQuery = js.native
  def badge(tab: String, value: String): String = js.native
  def badge(tab: String, value: Boolean): String = js.native
  def badge(tab: Double, value: String): String = js.native
  def badge(tab: Double, value: Boolean): String = js.native
  def clear(): Unit = js.native
  def currentItem(): JQuery = js.native
  def switchByFullUrl(url: String): Unit = js.native
  def switchTo(url: String): Unit = js.native
  def switchTo(url: Double): Unit = js.native
}

