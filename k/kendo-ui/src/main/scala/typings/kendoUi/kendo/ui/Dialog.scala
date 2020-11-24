package typings.kendoUi.kendo.ui

import typings.kendoUi.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Dialog extends Widget {
  
  def close(): Dialog = js.native
  
  def content(): String = js.native
  def content(content: String): Dialog = js.native
  def content(content: JQuery): Dialog = js.native
  @JSName("content")
  def content_Dialog(): Dialog = js.native
  
  def open(): Dialog = js.native
  
  def title(): String = js.native
  def title(text: String): Dialog = js.native
  @JSName("title")
  def title_Dialog(): Dialog = js.native
  
  def toFront(): Dialog = js.native
  
  var wrapper: JQuery = js.native
}
