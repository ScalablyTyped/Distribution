package typings.atJupyterlabCsvviewer.libWidgetMod

import typings.atJupyterlabCsvviewer.libWidgetMod.CSVDocumentWidgetNs.IOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped any */ @JSImport("@jupyterlab/csvviewer/lib/widget", "CSVDocumentWidget")
@js.native
class CSVDocumentWidget protected () extends js.Object {
  def this(options: IOptions) = this()
  /**
    * Set URI fragment identifier for rows
    */
  def setFragment(fragment: String): Unit = js.native
}

