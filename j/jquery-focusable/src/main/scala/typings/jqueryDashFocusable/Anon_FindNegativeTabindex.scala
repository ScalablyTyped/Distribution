package typings.jqueryDashFocusable

import typings.jqueryDashFocusable.jqueryDashFocusableBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FindNegativeTabindex extends js.Object {
  /**
    * Find elements with tabindex equal to -1
    */
  var findNegativeTabindex: Boolean
  /**
    * Find elements with tabindex greater than 0
    */
  var findPositiveTabindex: `true`
}

object Anon_FindNegativeTabindex {
  @scala.inline
  def apply(findNegativeTabindex: Boolean, findPositiveTabindex: `true`): Anon_FindNegativeTabindex = {
    val __obj = js.Dynamic.literal(findNegativeTabindex = findNegativeTabindex.asInstanceOf[js.Any], findPositiveTabindex = findPositiveTabindex.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_FindNegativeTabindex]
  }
}

