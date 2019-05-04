package typings
package atJupyterlabCsvviewerLib.libWidgetMod.CSVViewerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Instantiation options for CSV widgets.
  */
trait IOptions extends js.Object {
  /**
    * The document context for the CSV being rendered by the widget.
    */
  var context: atJupyterlabDocregistryLib.libRegistryMod.DocumentRegistryNs.Context
}

object IOptions {
  @scala.inline
  def apply(context: atJupyterlabDocregistryLib.libRegistryMod.DocumentRegistryNs.Context): IOptions = {
    val __obj = js.Dynamic.literal(context = context)
  
    __obj.asInstanceOf[IOptions]
  }
}

