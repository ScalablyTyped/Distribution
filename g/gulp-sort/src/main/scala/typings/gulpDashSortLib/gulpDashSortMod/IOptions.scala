package typings
package gulpDashSortLib.gulpDashSortMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IOptions extends js.Object {
  /** Whether to sort in ascending order, default is true */
  var asc: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * A function to compare two files.
       * Returns:
       * -1 if file1 should be before file2,
       * 0 if file1 is equivalent to file2, and
       * 1 if file1 should be after file2
       */
  var comparator: js.UndefOr[IComparatorFunction] = js.undefined
}

