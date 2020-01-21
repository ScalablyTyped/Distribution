package typings.googleapis.generatorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GeneratorOptions extends js.Object {
  var debug: js.UndefOr[Boolean] = js.native
  var includePrivate: js.UndefOr[Boolean] = js.native
}

object GeneratorOptions {
  @scala.inline
  def apply(debug: js.UndefOr[Boolean] = js.undefined, includePrivate: js.UndefOr[Boolean] = js.undefined): GeneratorOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.asInstanceOf[js.Any])
    if (!js.isUndefined(includePrivate)) __obj.updateDynamic("includePrivate")(includePrivate.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeneratorOptions]
  }
}

