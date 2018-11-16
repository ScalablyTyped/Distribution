package typings
package kendoDashUiLib.kendoNs.ooxmlNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.ooxml.Workbook")
@js.native
class Workbook ()
  extends kendoDashUiLib.kendoNs.Observable {
  def this(options: WorkbookOptions) = this()
  var options: WorkbookOptions = js.native
  var sheets: js.Array[WorkbookSheet] = js.native
  def toDataURL(): java.lang.String = js.native
  def toDataURLAsync(): kendoDashUiLib.JQueryPromise[_] = js.native
}

