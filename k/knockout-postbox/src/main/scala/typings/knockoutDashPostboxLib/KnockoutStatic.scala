package typings
package knockoutDashPostboxLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KnockoutStatic extends js.Object {
  var postbox: KnockoutPostBox
}

object KnockoutStatic {
  @scala.inline
  def apply(postbox: KnockoutPostBox): KnockoutStatic = {
    val __obj = js.Dynamic.literal(postbox = postbox)
  
    __obj.asInstanceOf[KnockoutStatic]
  }
}

