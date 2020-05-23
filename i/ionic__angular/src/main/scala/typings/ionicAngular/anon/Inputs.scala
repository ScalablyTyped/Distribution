package typings.ionicAngular.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Inputs extends js.Object {
  var inputs: js.UndefOr[js.Any] = js.undefined
  var methods: js.UndefOr[js.Any] = js.undefined
}

object Inputs {
  @scala.inline
  def apply(inputs: js.Any = null, methods: js.Any = null): Inputs = {
    val __obj = js.Dynamic.literal()
    if (inputs != null) __obj.updateDynamic("inputs")(inputs.asInstanceOf[js.Any])
    if (methods != null) __obj.updateDynamic("methods")(methods.asInstanceOf[js.Any])
    __obj.asInstanceOf[Inputs]
  }
}

