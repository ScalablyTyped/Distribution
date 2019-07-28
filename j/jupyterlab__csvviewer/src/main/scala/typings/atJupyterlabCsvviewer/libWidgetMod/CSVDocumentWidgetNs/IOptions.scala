package typings.atJupyterlabCsvviewer.libWidgetMod.CSVDocumentWidgetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped any */ trait IOptions extends js.Object {
  var delimiter: js.UndefOr[String] = js.undefined
}

object IOptions {
  @scala.inline
  def apply(delimiter: String = null): IOptions = {
    val __obj = js.Dynamic.literal()
    if (delimiter != null) __obj.updateDynamic("delimiter")(delimiter)
    __obj.asInstanceOf[IOptions]
  }
}

