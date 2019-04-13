package typings
package gulpDashCheerioLib.gulpDashCheerioMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Option extends js.Object {
  var cheerio: js.UndefOr[cheerioLib.CheerioStatic] = js.undefined
  var parserOptions: js.UndefOr[cheerioLib.CheerioOptionsInterface] = js.undefined
  var run: js.UndefOr[Callback] = js.undefined
}

object Option {
  @scala.inline
  def apply(
    cheerio: cheerioLib.CheerioStatic = null,
    parserOptions: cheerioLib.CheerioOptionsInterface = null,
    run: Callback = null
  ): Option = {
    val __obj = js.Dynamic.literal()
    if (cheerio != null) __obj.updateDynamic("cheerio")(cheerio)
    if (parserOptions != null) __obj.updateDynamic("parserOptions")(parserOptions)
    if (run != null) __obj.updateDynamic("run")(run)
    __obj.asInstanceOf[Option]
  }
}

