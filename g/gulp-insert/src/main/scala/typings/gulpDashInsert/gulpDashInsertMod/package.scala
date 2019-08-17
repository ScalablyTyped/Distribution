package typings.gulpDashInsert

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object gulpDashInsertMod {
  import typings.vinyl.vinylMod.File

  type Transformer = js.Function2[/* contents */ String, /* file */ File, String]
}
