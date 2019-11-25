package typings.gulpDashCheerio.gulpDashCheerioMod

import typings.cheerio.CheerioOptionsInterface
import typings.cheerio.CheerioStatic
import typings.vinyl.vinylMod.File
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
  def apply(
    cheerio: CheerioStatic = null,
    parserOptions: CheerioOptionsInterface = null,
    run: (/* $ */ CheerioStatic, /* file */ File, /* done */ js.UndefOr[js.Function]) => js.Any = null
  ): Option = {
    val __obj = js.Dynamic.literal()
    if (cheerio != null) __obj.updateDynamic("cheerio")(cheerio.asInstanceOf[js.Any])
    if (parserOptions != null) __obj.updateDynamic("parserOptions")(parserOptions.asInstanceOf[js.Any])
    if (run != null) __obj.updateDynamic("run")(js.Any.fromFunction3(run))
    __obj.asInstanceOf[Option]
  }
}

