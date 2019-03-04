package typings
package knockoutDotViewmodelLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Extend ko global
trait KnockoutStatic extends js.Object {
  var viewmodel: KnockoutViewModelStatic
}

object KnockoutStatic {
  @scala.inline
  def apply(viewmodel: KnockoutViewModelStatic): KnockoutStatic = {
    val __obj = js.Dynamic.literal(viewmodel = viewmodel)
  
    __obj.asInstanceOf[KnockoutStatic]
  }
}

