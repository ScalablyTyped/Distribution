package typings.gulpDashSort

import typings.vinyl.vinylMod.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object gulpDashSortMod {
  type IComparatorFunction = js.Function2[/* file1 */ File, /* file2 */ File, Double]
}
