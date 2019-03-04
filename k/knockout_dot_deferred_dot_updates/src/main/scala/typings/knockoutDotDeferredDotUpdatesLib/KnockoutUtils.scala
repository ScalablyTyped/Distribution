package typings
package knockoutDotDeferredDotUpdatesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Utils
trait KnockoutUtils extends js.Object {
  def objectForEach(obj: js.Any, action: js.Function): scala.Unit
  def objectMap(source: js.Any, mapping: js.Function): js.Any
}

object KnockoutUtils {
  @scala.inline
  def apply(
    objectForEach: js.Function2[js.Any, js.Function, scala.Unit],
    objectMap: js.Function2[js.Any, js.Function, js.Any]
  ): KnockoutUtils = {
    val __obj = js.Dynamic.literal(objectForEach = objectForEach, objectMap = objectMap)
  
    __obj.asInstanceOf[KnockoutUtils]
  }
}

