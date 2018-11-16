package typings
package jqueryDotElangLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IELangBase extends js.Object {
  var defaults: IELangBaseDefaults = js.native
  var delegates: js.Any = js.native
  var description: java.lang.String = js.native
  var element: jqueryLib.JQuery[stdLib.HTMLElement] = js.native
  var events: js.Any = js.native
  var name: java.lang.String = js.native
  var options: js.Any = js.native
  def appendAsLastChild(node: jqueryLib.JQuery[stdLib.HTMLElement], element: jqueryLib.JQuery[stdLib.HTMLElement]): jqueryLib.JQuery[stdLib.HTMLElement] = js.native
  def createContent(): scala.Unit = js.native
  def createRadioGroup(
    node: jqueryLib.JQuery[stdLib.HTMLElement],
    isMethodAppend: scala.Boolean,
    buttonNumber: scala.Double,
    defaultButton: scala.Double,
    btnLabels: js.Array[java.lang.String],
    clickHandler: js.Function
  ): scala.Unit = js.native
  def createRadioGroup(
    node: jqueryLib.JQuery[stdLib.HTMLElement],
    isMethodAppend: scala.Boolean,
    buttonNumber: scala.Double,
    defaultButton: scala.Double,
    btnLabels: js.Array[java.lang.String],
    clickHandler: js.Function,
    btnTooltips: js.Array[java.lang.String]
  ): scala.Unit = js.native
  def getLastChild(node: jqueryLib.JQuery[stdLib.HTMLElement]): jqueryLib.JQuery[stdLib.HTMLElement] = js.native
  def initialize(target: stdLib.HTMLElement, options: js.Any): scala.Unit = js.native
  def isRdoChecked(eSrc: stdLib.HTMLElement, rdoId: java.lang.String): scala.Boolean = js.native
  def processCommand(command: java.lang.String): jqueryLib.JQuery[stdLib.HTMLElement] = js.native
  def setOptions(options: js.Any): scala.Unit = js.native
}

