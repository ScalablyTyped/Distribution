package typings.jqueryFocusable

import typings.jqueryFocusable.jqueryFocusableBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFindNegativeTabindex extends js.Object {
  /**
    * Find elements with tabindex equal to -1
    */
  var findNegativeTabindex: Boolean
  /**
    * Find elements with tabindex greater than 0
    */
  var findPositiveTabindex: `true`
}

object AnonFindNegativeTabindex {
  @scala.inline
  def apply(findNegativeTabindex: Boolean, findPositiveTabindex: `true`): AnonFindNegativeTabindex = {
    val __obj = js.Dynamic.literal(findNegativeTabindex = findNegativeTabindex.asInstanceOf[js.Any], findPositiveTabindex = findPositiveTabindex.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonFindNegativeTabindex]
  }
}

