package typings
package inversifyDashExpressDashUtilsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Args extends js.Object {
  var args: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var route: java.lang.String
}

object Anon_Args {
  @scala.inline
  def apply(route: java.lang.String, args: js.Array[java.lang.String] = null): Anon_Args = {
    val __obj = js.Dynamic.literal(route = route)
    if (args != null) __obj.updateDynamic("args")(args)
    __obj.asInstanceOf[Anon_Args]
  }
}

