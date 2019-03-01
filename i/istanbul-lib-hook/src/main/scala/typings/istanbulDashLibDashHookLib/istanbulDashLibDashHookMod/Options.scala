package typings
package istanbulDashLibDashHookLib.istanbulDashLibDashHookMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var verbose: scala.Boolean
}

object Options {
  @scala.inline
  def apply(verbose: scala.Boolean): Options = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("verbose")(verbose)
    __obj.asInstanceOf[Options]
  }
}

