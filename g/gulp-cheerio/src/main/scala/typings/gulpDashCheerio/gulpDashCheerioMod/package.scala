package typings.gulpDashCheerio

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object gulpDashCheerioMod {
  import typings.cheerio.CheerioStatic
  import typings.vinyl.vinylMod.File

  type Callback = js.Function3[/* $ */ CheerioStatic, /* file */ File, /* done */ js.UndefOr[js.Function], js.Any]
}
