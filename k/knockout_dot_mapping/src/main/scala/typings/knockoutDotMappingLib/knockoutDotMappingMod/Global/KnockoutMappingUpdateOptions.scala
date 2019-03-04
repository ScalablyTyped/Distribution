package typings
package knockoutDotMappingLib.knockoutDotMappingMod.Global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KnockoutMappingUpdateOptions extends js.Object {
  var data: js.Any
  var observable: js.UndefOr[knockoutLib.KnockoutObservable[_]] = js.undefined
  var parent: js.Any
  var target: js.Any
}

object KnockoutMappingUpdateOptions {
  @scala.inline
  def apply(data: js.Any, parent: js.Any, target: js.Any, observable: knockoutLib.KnockoutObservable[_] = null): KnockoutMappingUpdateOptions = {
    val __obj = js.Dynamic.literal(data = data, parent = parent, target = target)
    if (observable != null) __obj.updateDynamic("observable")(observable)
    __obj.asInstanceOf[KnockoutMappingUpdateOptions]
  }
}

