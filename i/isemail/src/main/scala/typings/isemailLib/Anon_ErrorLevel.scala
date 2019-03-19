package typings
package isemailLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ErrorLevel extends js.Object {
  var errorLevel: js.UndefOr[isemailLib.isemailLibNumbers.`false`] = js.undefined
}

object Anon_ErrorLevel {
  @scala.inline
  def apply(errorLevel: isemailLib.isemailLibNumbers.`false` = null): Anon_ErrorLevel = {
    val __obj = js.Dynamic.literal()
    if (errorLevel != null) __obj.updateDynamic("errorLevel")(errorLevel)
    __obj.asInstanceOf[Anon_ErrorLevel]
  }
}

