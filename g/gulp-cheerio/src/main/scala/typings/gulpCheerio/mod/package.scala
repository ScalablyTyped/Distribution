package typings.gulpCheerio

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Callback = js.Function3[
    /* $ */ typings.cheerio.CheerioStatic, 
    /* file */ typings.vinyl.mod.File, 
    /* done */ js.UndefOr[js.Function], 
    js.Any
  ]
}
