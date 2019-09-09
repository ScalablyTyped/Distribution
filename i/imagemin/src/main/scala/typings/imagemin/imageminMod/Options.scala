package typings.imagemin.imageminMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var destination: js.UndefOr[String] = js.undefined
  var glob: js.UndefOr[Boolean] = js.undefined
  var plugins: js.Array[Plugin]
}

object Options {
  @scala.inline
  def apply(plugins: js.Array[Plugin], destination: String = null, glob: js.UndefOr[Boolean] = js.undefined): Options = {
    val __obj = js.Dynamic.literal(plugins = plugins)
    if (destination != null) __obj.updateDynamic("destination")(destination)
    if (!js.isUndefined(glob)) __obj.updateDynamic("glob")(glob)
    __obj.asInstanceOf[Options]
  }
}

