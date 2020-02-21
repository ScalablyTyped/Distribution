package typings.karmaMocha.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientOptions extends js.Object {
  var mocha: js.UndefOr[MochaClientOptions] = js.undefined
}

object ClientOptions {
  @scala.inline
  def apply(mocha: MochaClientOptions = null): ClientOptions = {
    val __obj = js.Dynamic.literal()
    if (mocha != null) __obj.updateDynamic("mocha")(mocha.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientOptions]
  }
}

