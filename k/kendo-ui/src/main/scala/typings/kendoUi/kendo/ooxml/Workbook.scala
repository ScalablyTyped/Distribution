package typings.kendoUi.kendo.ooxml

import typings.kendoUi.JQueryPromise
import typings.kendoUi.kendo.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Workbook extends Observable {
  var options: WorkbookOptions = js.native
  var sheets: js.Array[WorkbookSheet] = js.native
  def toDataURL(): String = js.native
  def toDataURLAsync(): JQueryPromise[_] = js.native
}

