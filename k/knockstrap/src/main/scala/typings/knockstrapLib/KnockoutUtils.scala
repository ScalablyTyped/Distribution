package typings
package knockstrapLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KnockoutUtils extends js.Object {
  def uniqueId(prefix: java.lang.String): java.lang.String
  def unwrapProperties(wrappedProperies: js.Any): js.Any
}

object KnockoutUtils {
  @scala.inline
  def apply(
    uniqueId: js.Function1[java.lang.String, java.lang.String],
    unwrapProperties: js.Function1[js.Any, js.Any]
  ): KnockoutUtils = {
    val __obj = js.Dynamic.literal(uniqueId = uniqueId, unwrapProperties = unwrapProperties)
  
    __obj.asInstanceOf[KnockoutUtils]
  }
}

