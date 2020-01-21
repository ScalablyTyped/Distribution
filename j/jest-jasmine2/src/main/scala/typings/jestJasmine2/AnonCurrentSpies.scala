package typings.jestJasmine2

import typings.jestJasmine2.typesMod.Spy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCurrentSpies extends js.Object {
  var currentSpies: js.UndefOr[js.Function0[js.Array[Spy]]] = js.undefined
}

object AnonCurrentSpies {
  @scala.inline
  def apply(currentSpies: () => js.Array[Spy] = null): AnonCurrentSpies = {
    val __obj = js.Dynamic.literal()
    if (currentSpies != null) __obj.updateDynamic("currentSpies")(js.Any.fromFunction0(currentSpies))
    __obj.asInstanceOf[AnonCurrentSpies]
  }
}

