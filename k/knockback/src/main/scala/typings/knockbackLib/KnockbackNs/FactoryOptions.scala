package typings
package knockbackLib.KnockbackNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FactoryOptions extends js.Object {
  var factories: js.Any
}

object FactoryOptions {
  @scala.inline
  def apply(factories: js.Any): FactoryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("factories")(factories)
    __obj.asInstanceOf[FactoryOptions]
  }
}

