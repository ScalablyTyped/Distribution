package typings.jupyterlabCsvviewer.widgetMod.CSVViewer

import typings.jupyterlabDocregistry.registryMod.DocumentRegistry.Context
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
  var context: Context
}

object IOptions {
  @scala.inline
  def apply(context: Context): IOptions = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions]
  }
}

