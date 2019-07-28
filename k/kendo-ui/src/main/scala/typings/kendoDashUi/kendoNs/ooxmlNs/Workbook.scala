package typings.kendoDashUi.kendoNs.ooxmlNs

import typings.kendoDashUi.JQueryPromise
import typings.kendoDashUi.kendoNs.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.ooxml.Workbook")
@js.native
class Workbook () extends Observable {
  def this(options: WorkbookOptions) = this()
  var options: WorkbookOptions = js.native
  var sheets: js.Array[WorkbookSheet] = js.native
  def toDataURL(): String = js.native
  def toDataURLAsync(): JQueryPromise[_] = js.native
}

