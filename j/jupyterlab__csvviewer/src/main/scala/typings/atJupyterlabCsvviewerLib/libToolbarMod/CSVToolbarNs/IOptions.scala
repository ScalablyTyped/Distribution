package typings
package atJupyterlabCsvviewerLib.libToolbarMod.CSVToolbarNs

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
  var selected: java.lang.String
}

object IOptions {
  @scala.inline
  def apply(selected: java.lang.String): IOptions = {
    val __obj = js.Dynamic.literal(selected = selected)
  
    __obj.asInstanceOf[IOptions]
  }
}

