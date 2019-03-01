package typings
package locateDashPathLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Cwd extends js.Object {
  var cwd: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Cwd {
  @scala.inline
  def apply(cwd: java.lang.String = null): Anon_Cwd = {
    val __obj = js.Dynamic.literal()
    if (cwd != null) __obj.updateDynamic("cwd")(cwd)
    __obj.asInstanceOf[Anon_Cwd]
  }
}

