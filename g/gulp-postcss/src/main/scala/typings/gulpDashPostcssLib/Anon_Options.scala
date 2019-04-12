package typings
package gulpDashPostcssLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Options extends js.Object {
  var options: js.UndefOr[gulpDashPostcssLib.gulpDashPostcssMod.GulpPostCssNs.Options] = js.undefined
  var plugins: js.UndefOr[js.Array[_]] = js.undefined
}

object Anon_Options {
  @scala.inline
  def apply(
    options: gulpDashPostcssLib.gulpDashPostcssMod.GulpPostCssNs.Options = null,
    plugins: js.Array[_] = null
  ): Anon_Options = {
    val __obj = js.Dynamic.literal()
    if (options != null) __obj.updateDynamic("options")(options)
    if (plugins != null) __obj.updateDynamic("plugins")(plugins)
    __obj.asInstanceOf[Anon_Options]
  }
}

