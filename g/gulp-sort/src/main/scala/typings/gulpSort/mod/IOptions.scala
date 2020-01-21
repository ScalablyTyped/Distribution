package typings.gulpSort.mod

import typings.vinyl.mod.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOptions extends js.Object {
  /** Whether to sort in ascending order, default is true */
  var asc: js.UndefOr[Boolean] = js.undefined
  /**
    * A function to compare two files.
    * Returns:
    * -1 if file1 should be before file2,
    * 0 if file1 is equivalent to file2, and
    * 1 if file1 should be after file2
    */
  var comparator: js.UndefOr[IComparatorFunction] = js.undefined
}

object IOptions {
  @scala.inline
  def apply(
    asc: js.UndefOr[Boolean] = js.undefined,
    comparator: (/* file1 */ File, /* file2 */ File) => Double = null
  ): IOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(asc)) __obj.updateDynamic("asc")(asc.asInstanceOf[js.Any])
    if (comparator != null) __obj.updateDynamic("comparator")(js.Any.fromFunction2(comparator))
    __obj.asInstanceOf[IOptions]
  }
}

