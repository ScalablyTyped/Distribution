package typings
package highchartsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ContextButton extends js.Object {
  var contextButton: js.UndefOr[highchartsLib.highchartsMod.ExportingContextButton] = js.undefined
}

object Anon_ContextButton {
  @scala.inline
  def apply(contextButton: highchartsLib.highchartsMod.ExportingContextButton = null): Anon_ContextButton = {
    val __obj = js.Dynamic.literal()
    if (contextButton != null) __obj.updateDynamic("contextButton")(contextButton)
    __obj.asInstanceOf[Anon_ContextButton]
  }
}

