package typings
package jqueryDotCleditorLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An editor is composed of a main div element used to hold a toolbar,
  * a text area and an iframe. The toolbar can hold multiple groups
  * which in turn hold multiple buttons.
  */
@js.native
trait CLEditor extends js.Object {
  @JSName("$area")
  var $area: JQuery = js.native
  @JSName("$frame")
  var $frame: JQuery = js.native
  @JSName("$main")
  var $main: JQuery = js.native
  @JSName("$toolbar")
  var $toolbar: JQuery = js.native
  var disabled: scala.Boolean = js.native
  var doc: stdLib.Document = js.native
  var options: JQueryCLEditorOptions = js.native
  def change(handler: js.Function): CLEditor = js.native
  def clear(): CLEditor = js.native
  def disable(disabled: scala.Boolean): CLEditor = js.native
  def execCommand(commands: java.lang.String, value: js.Any): CLEditor = js.native
  def execCommand(commands: java.lang.String, value: js.Any, useCSS: scala.Boolean): CLEditor = js.native
  def execCommand(commands: java.lang.String, value: js.Any, useCSS: scala.Boolean, button: js.Any): CLEditor = js.native
  def focus(): CLEditor = js.native
  def hidePopups(): CLEditor = js.native
  def refresh(): CLEditor = js.native
  def select(): CLEditor = js.native
  def selectedHTML(): java.lang.String = js.native
  def selectedText(): java.lang.String = js.native
  def showMessage(message: java.lang.String): CLEditor = js.native
  def showMessage(message: java.lang.String, button: js.Any): CLEditor = js.native
  def sourceMode(): scala.Boolean = js.native
  def updateFrame(): CLEditor = js.native
  def updateTextArea(): CLEditor = js.native
}

