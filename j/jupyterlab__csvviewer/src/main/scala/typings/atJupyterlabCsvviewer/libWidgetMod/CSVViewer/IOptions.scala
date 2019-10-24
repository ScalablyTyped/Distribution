package typings.atJupyterlabCsvviewer.libWidgetMod.CSVViewer

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
  var context: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify DocumentRegistry.Context */ js.Any
}

object IOptions {
  @scala.inline
  def apply(
    context: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify DocumentRegistry.Context */ js.Any
  ): IOptions = {
    val __obj = js.Dynamic.literal(context = context)
  
    __obj.asInstanceOf[IOptions]
  }
}

