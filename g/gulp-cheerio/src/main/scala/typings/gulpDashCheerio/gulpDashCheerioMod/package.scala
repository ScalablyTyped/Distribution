package typings.gulpDashCheerio

import typings.cheerio.CheerioStatic
import typings.vinyl.vinylMod.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object gulpDashCheerioMod {
  type Callback = js.Function3[/* $ */ CheerioStatic, /* file */ File, /* done */ js.UndefOr[js.Function], js.Any]
}
