package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JQueryStatic extends js.Object {
  var ig: IgniteUIStatic
}

object JQueryStatic {
  @scala.inline
  def apply(ig: IgniteUIStatic): JQueryStatic = {
    val __obj = js.Dynamic.literal(ig = ig)
  
    __obj.asInstanceOf[JQueryStatic]
  }
}

