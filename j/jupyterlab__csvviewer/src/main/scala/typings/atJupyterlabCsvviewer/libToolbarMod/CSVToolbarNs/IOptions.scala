package typings.atJupyterlabCsvviewer.libToolbarMod.CSVToolbarNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The instantiation options for a CSV toolbar.
  */
trait IOptions extends js.Object {
  /**
    * The initially selected delimiter.
    */
  var selected: String
}

object IOptions {
  @scala.inline
  def apply(selected: String): IOptions = {
    val __obj = js.Dynamic.literal(selected = selected)
  
    __obj.asInstanceOf[IOptions]
  }
}

