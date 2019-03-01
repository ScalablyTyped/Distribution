package typings
package jqueryDashFocusableLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FindNegativeTabindex extends js.Object {
  /**
    * Find elements with tabindex equal to -1
    */
  var findNegativeTabindex: scala.Boolean
  /**
    * Find elements with tabindex greater than 0
    */
  var findPositiveTabindex: jqueryDashFocusableLib.jqueryDashFocusableLibNumbers.`true`
}

object Anon_FindNegativeTabindex {
  @scala.inline
  def apply(
    findNegativeTabindex: scala.Boolean,
    findPositiveTabindex: jqueryDashFocusableLib.jqueryDashFocusableLibNumbers.`true`
  ): Anon_FindNegativeTabindex = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("findNegativeTabindex")(findNegativeTabindex)
    __obj.updateDynamic("findPositiveTabindex")(findPositiveTabindex)
    __obj.asInstanceOf[Anon_FindNegativeTabindex]
  }
}

