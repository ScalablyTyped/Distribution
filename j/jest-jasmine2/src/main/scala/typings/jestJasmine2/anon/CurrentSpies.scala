package typings.jestJasmine2.anon

import typings.jestJasmine2.typesMod.Spy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CurrentSpies extends js.Object {
  var currentSpies: js.UndefOr[js.Function0[js.Array[Spy]]] = js.undefined
}

object CurrentSpies {
  @scala.inline
  def apply(currentSpies: () => js.Array[Spy] = null): CurrentSpies = {
    val __obj = js.Dynamic.literal()
    if (currentSpies != null) __obj.updateDynamic("currentSpies")(js.Any.fromFunction0(currentSpies))
    __obj.asInstanceOf[CurrentSpies]
  }
}

