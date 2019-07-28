package typings.gulpDashCheerio.gulpDashCheerioMod

import typings.cheerio.CheerioOptionsInterface
import typings.cheerio.CheerioStatic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Option extends js.Object {
  var cheerio: js.UndefOr[CheerioStatic] = js.undefined
  var parserOptions: js.UndefOr[CheerioOptionsInterface] = js.undefined
  var run: js.UndefOr[Callback] = js.undefined
}

object Option {
  @scala.inline
  def apply(cheerio: CheerioStatic = null, parserOptions: CheerioOptionsInterface = null, run: Callback = null): Option = {
    val __obj = js.Dynamic.literal()
    if (cheerio != null) __obj.updateDynamic("cheerio")(cheerio)
    if (parserOptions != null) __obj.updateDynamic("parserOptions")(parserOptions)
    if (run != null) __obj.updateDynamic("run")(run)
    __obj.asInstanceOf[Option]
  }
}

