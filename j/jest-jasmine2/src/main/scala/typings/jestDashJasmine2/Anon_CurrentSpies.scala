package typings.jestDashJasmine2

import typings.jestDashJasmine2.buildTypesMod.Spy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CurrentSpies extends js.Object {
  var currentSpies: js.UndefOr[js.Function0[js.Array[Spy]]] = js.undefined
}

object Anon_CurrentSpies {
  @scala.inline
  def apply(currentSpies: () => js.Array[Spy] = null): Anon_CurrentSpies = {
    val __obj = js.Dynamic.literal()
    if (currentSpies != null) __obj.updateDynamic("currentSpies")(js.Any.fromFunction0(currentSpies))
    __obj.asInstanceOf[Anon_CurrentSpies]
  }
}

