package typings
package isemailLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ErrorLevelTrue extends js.Object {
  var errorLevel: js.UndefOr[isemailLib.isemailLibNumbers.`true` | scala.Double] = js.undefined
}

object Anon_ErrorLevelTrue {
  @scala.inline
  def apply(errorLevel: isemailLib.isemailLibNumbers.`true` | scala.Double = null): Anon_ErrorLevelTrue = {
    val __obj = js.Dynamic.literal()
    if (errorLevel != null) __obj.updateDynamic("errorLevel")(errorLevel.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ErrorLevelTrue]
  }
}

