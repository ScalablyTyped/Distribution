package typings
package gulpDashCoffeeifyLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Base extends js.Object {
  var base: js.UndefOr[java.lang.String] = js.undefined
  var cwd: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Base {
  @scala.inline
  def apply(base: java.lang.String = null, cwd: java.lang.String = null): Anon_Base = {
    val __obj = js.Dynamic.literal()
    if (base != null) __obj.updateDynamic("base")(base)
    if (cwd != null) __obj.updateDynamic("cwd")(cwd)
    __obj.asInstanceOf[Anon_Base]
  }
}

