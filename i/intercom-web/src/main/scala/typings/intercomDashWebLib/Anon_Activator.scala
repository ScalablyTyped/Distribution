package typings
package intercomDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Activator extends js.Object {
  var activator: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Activator {
  @scala.inline
  def apply(activator: java.lang.String = null): Anon_Activator = {
    val __obj = js.Dynamic.literal()
    if (activator != null) __obj.updateDynamic("activator")(activator)
    __obj.asInstanceOf[Anon_Activator]
  }
}

