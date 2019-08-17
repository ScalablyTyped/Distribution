package typings.gulpDashSort

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object gulpDashSortMod {
  import typings.vinyl.vinylMod.File

  type IComparatorFunction = js.Function2[/* file1 */ File, /* file2 */ File, Double]
}
