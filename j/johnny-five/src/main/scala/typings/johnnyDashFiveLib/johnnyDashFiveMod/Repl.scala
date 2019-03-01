package typings
package johnnyDashFiveLib.johnnyDashFiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Repl extends js.Object {
  def inject(`object`: js.Any): scala.Unit
}

object Repl {
  @scala.inline
  def apply(inject: js.Function1[js.Any, scala.Unit]): Repl = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("inject")(inject)
    __obj.asInstanceOf[Repl]
  }
}

