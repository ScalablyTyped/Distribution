package typings.jqueryDotElang

import typings.jquery.JQuery
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IELangBase extends js.Object {
  var defaults: IELangBaseDefaults = js.native
  var delegates: js.Any = js.native
  var description: String = js.native
  var element: JQuery[HTMLElement] = js.native
  var events: js.Any = js.native
  var name: String = js.native
  var options: js.Any = js.native
  def appendAsLastChild(node: JQuery[HTMLElement], element: JQuery[HTMLElement]): JQuery[HTMLElement] = js.native
  def createContent(): Unit = js.native
  def createRadioGroup(
    node: JQuery[HTMLElement],
    isMethodAppend: Boolean,
    buttonNumber: Double,
    defaultButton: Double,
    btnLabels: js.Array[String],
    clickHandler: js.Function
  ): Unit = js.native
  def createRadioGroup(
    node: JQuery[HTMLElement],
    isMethodAppend: Boolean,
    buttonNumber: Double,
    defaultButton: Double,
    btnLabels: js.Array[String],
    clickHandler: js.Function,
    btnTooltips: js.Array[String]
  ): Unit = js.native
  def getLastChild(node: JQuery[HTMLElement]): JQuery[HTMLElement] = js.native
  def initialize(target: HTMLElement, options: js.Any): Unit = js.native
  def isRdoChecked(eSrc: HTMLElement, rdoId: String): Boolean = js.native
  def processCommand(command: String): JQuery[HTMLElement] = js.native
  def setOptions(options: js.Any): Unit = js.native
}

